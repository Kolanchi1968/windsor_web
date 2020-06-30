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

<%@page import="com.org.Global_Variables"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grid Information</title>
<link rel="stylesheet" type="text/css" href="CSS/newcss.css">
 <link rel="stylesheet" type="text/css" href="CSS/tablesheet.css">
</head>
<body>
<% Global_Variables gv = new Global_Variables();%>

<h2> Grid Parameters</h2>
<table style="width:100%" align =left>
  <tr>
    <th>Grid Parameters</th>
    <th>Phase1</th> 
    <th>Phase2</th>
    <th>Phase2</th>
  </tr>
  <%
try{

connection = DriverManager.getConnection(connectionUrl+database, userid, password);

statement=connection.createStatement();
String sql ="select * from grid_parameters where sno = '"+ row_number+"'";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
  
  
  <tr>
    <td> Grid Voltage</td>
    <td><%=resultSet.getString("grid_voltage_ph1") %></td>
    <td><%=resultSet.getString("grid_voltage_ph2") %></td>
    <td><%=resultSet.getString("grid_voltage_ph3") %></td>
  </tr>
  <tr>
    <td> Grid Current</td>
    <td><%=resultSet.getString("grid_current_ph1") %></td>
    <td><%=resultSet.getString("grid_current_ph2") %></td>
    <td><%=resultSet.getString("grid_current_ph3") %></td>
  </tr>
  <tr>
   <td> Grid Frequency</td>
    <td><%=resultSet.getString("grid_frequency") %></td>
    <td><%=resultSet.getString("grid_frequency") %></td>
    <td><%=resultSet.getString("grid_frequency") %></td>
  </tr>
</table>
</div>
        
  <div> 
       <h2> PV Field </h2>  
 <table>
     <tr>
         <th> Description </th> 
         <th> Value </th> 
     </tr>
     
      <tr>
         <td>PV1 Voltage </td> 
         <td> <%=resultSet.getString("pv1_voltage") %></td> 
     </tr>
     <tr>
         <td>PV2 Voltage </td> 
         <td><%=resultSet.getString("pv2_voltage") %></td> 
      </tr>
 </table>
  </div>
   <div>
       <h2>  Inverter Temperatures </h2>   
         
      
      <table>
      
      <tr>
         <td> Temperature of heat sink  </td> 
         <td> <%=resultSet.getString("field_temperature") %></td> 
      </tr>
      <tr>
         <td> Inverter Internal Temperature</td> 
         <td>  <%out.print(row_number);%></td> 
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
      
      
      
      
      
      
  </div>
  <div>
 </div>   
 </body>
</html>
