<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd"> 

<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@page import="com.mysql.jdbc.Driver"%>

<html> 
<head> 
<title>Connection with mysql database</title> 
</head> 
<body>
<h1>Connection status </h1>
<% 
try {
/* Create string of connection url within specified format with machine name, 
port number and database name. Here machine name id localhost and 
database name is usermaster. */ 
String connectionURL = "jdbc:mysql://localhost:3306/solardb";

// declare a connection by using Connection interface 
Connection con = null; 

// Load JBBC driver "com.mysql.jdbc.Driver" 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

/* Create a connection by using getConnection() method that takes parameters of 
string type connection url, user name and password to connect to database. */ 
con = DriverManager.getConnection(connectionURL, "root", "harini@1968");

// check weather connection is established or not by isClosed() method 
if(!con.isClosed())
%>
<font size="+3" color="green"></b></font>
<% 
out.println("Successfully connected to " + "MySQL server using TCP/IP...");
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from user");  


while(rs.next())  
//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  

out.print(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  



con.close();  
}catch(Exception e){ System.out.println(e);}  

//con.close();
%>

</body> 
</html>