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
<!DOCTYPE html>
<html>
<body>

<h1> Daily Generation </h1>
<table border="1">

<%
try{

connection = DriverManager.getConnection(connectionUrl+database, userid, password);

statement=connection.createStatement();
String sql ="select * from dailygeneration where sno <= '"+ row_number +"'";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("sno") %></td>
<td><%=resultSet.getString("Actual_Generation") %></td>
<td><%=resultSet.getString("Calculated_Generation") %></td>
<td><%=resultSet.getString("Pyra_Reading") %></td>
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
     var myVar = setInterval(myTimer, 100);
     var rowcount=1;
     var receivebuf = []; 
     receivebuf     =  client.client();
     
     
function myTimer() {
	<%row_number =row_number+1; 
	if(row_number>=4)
		row_number=0;
	
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