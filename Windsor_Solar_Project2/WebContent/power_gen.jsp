<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page import = "java.io.*,java.util.*" %>
<%!public int row_number=1; %>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "solardb";
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
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="CSS/tablesheet.css">
 <link rel="stylesheet" type="text/css" href="CSS/newcss.css">
</head>


<body>

<h2> Power Generation </h2>
<table border="1">


<tr>
  <%
try{

connection = DriverManager.getConnection(connectionUrl+database, userid, password);

statement=connection.createStatement();
String sql ="select * from power_generation where sno = '"+ row_number+"'";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>      
       
    </tr>

<tr>
        <td> <h2> POWER </h2></td>
        <td> <h2><%=resultSet.getString("power") %>        </h2></td>
    </tr>
    <tr>
        <td> <h2> E -DAY     </h2></td>
        <td> <h2><%=resultSet.getString("e-day")    %>     </h2></td>
    </tr>
    <tr>   
        <td><h2> E -TOTAL   </h2></td>
        <td><h2> <%=resultSet.getString("e-total")     %>   </h2></td>
    </tr>
    <tr>
        <td><h2> H-TOTAL    </h2></td>
        <td> <h2> <%=resultSet.getString("h_total")     %>   </h2></td>
    </tr>
    <tr>
        <td><h2> BUS VOLTAGE</h2></td>
        <td> <h2> <%=resultSet.getString("bus_voltage")    %>    </h2></td>
    </tr>    
    <tr> 
        <td><h2> PV - MODE  </h2> </td>
        <td> <h2> <%=resultSet.getString("pv_mode")   %> </h2></td>
    </tr>
     <tr> 
        <td><h2> Pyranameter  </h2> </td>
        <td> <h2> <%=resultSet.getString("pyranameter")    %> </h2></td>
    </tr>
     <tr> 
        <td><h2> Field Temperature  </h2> </td>
        <td> <h2> <%=resultSet.getString("field_temperature") %> </h2></td>
    </tr>
<%
}

connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
 
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
<% 
            // Set refresh, autoload time as 5 seconds
            response.setIntHeader("Refresh", 5);
            
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