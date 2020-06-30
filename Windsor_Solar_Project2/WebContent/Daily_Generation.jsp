<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%!public int row_number=1; %>
<%@page import="com.org.plc_client"%>
<%@page import="com.org.Global_Variables"%>  
<%@ page import = "java.io.*,java.util.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="CSS/tablesheet.css">
 <link rel="stylesheet" type="text/css" href="CSS/newcss.css">
</head>
<body>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "solar_scada";
String userid = "root";
String password = "harini@1968";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>





<% Global_Variables gv = new Global_Variables();%>

<%  plc_client pc  =  new plc_client(); 
float calculated_generation; 
//pc.read_plc();
%>
 <div>
            <h2>Daily Generation Report </h2> 
        </div>
        <div>
            <table id ="D_Generation">
                <tr>
                    <th>S.No </th> 
                    <th>Date </th> 
                    <th>Actual Generation in KW </th> 
                    <th>Caclulated Generation in KW</th> 
                    <th>Pyranameter Reading </th> 
                    <th>Inveter Running Hours </th> 
                    <th> P.R </th> 
                     <th>CUF </th> 
                 </tr>
                <%
                try{

                connection = DriverManager.getConnection(connectionUrl+database, userid, password);

                statement=connection.createStatement();
                String sql ="select * from dailygeneration where sno <= '"+row_number+"'";

                resultSet = statement.executeQuery(sql);
                while(resultSet.next()){
                 %>     
                 
                 
                  <tr>
                    <td><%=resultSet.getString("sno") %></td>
                    <td><%=resultSet.getString("Actual_Generation") %></td>
                    <td><%=resultSet.getString("Calculated_Generation") %></td>
                    <td><%=resultSet.getString("Pyra_Reading") %></td>
                    <td><%=resultSet.getString("Pyra_Reading") %></td>
                    <td><%=resultSet.getString("Pyra_Reading") %></td>
                    <td><%=resultSet.getString("Pyra_Reading") %></td>
                     
                 </tr>
                 <%
                  }
                   connection.close();
                   } catch (Exception e){
                    e.printStackTrace();
                   }
                  %>
                
            </table> 
          </div>
 <script>
    var myVar = setInterval(myTimer, 5000);
    
   function myTimer() {
	   <%
	   if(row_number <4)
	   row_number = row_number +1;
	   else 
	 	row_number = 1;
	   %>
  }
 
</script>   
 

 
<!-- public void setIntHeader(String header, int headerValue) -->
        <!--   <h2>Auto Refresh Header Example</h2> -->
         <%
            // Set refresh, autoload time as 5 seconds
            response.setIntHeader("Refresh", 3);
            
            // Get current time
            Calendar calendar = new GregorianCalendar();
            String am_pm;
            
            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            
            if(calendar.get(Calendar.AM_PM) == 0)
               am_pm = "AM";
            else
               am_pm = "PM";
            String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
            out.println("Crrent Time: " + CT + "\n");
         %>
      

        

</body>
</html>