<%@page import="com.org.Global_Variables"%> 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.org.plc_client"%>
<%@page import="com.org.Global_Variables"%>  
<%@ page import = "java.io.*,java.util.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="CSS/newcss.css">
<link rel="stylesheet" type="text/css" href="CSS/maintable.css">
<title>Windsor Scada</title>
</head>


<body>

<div class="header">
<img src="images/minsolar.png"  style= "float:left ;width:300px;height:100px;padding-top:10px;">   
<h1 id = "myHeader"> MinSolar - SCADA  </h1>
<p id = "myHeaderA"> The Ultimate Solar SCADA Software </P>
</div>
   
<div class="topnav">
  <a href="Grid_Information.jsp" target="iframe_a"> Grid</a>
  <a href="Inverter_Details.jsp" target="iframe_a" >Inverter</a>
  <a href="String_Currents.jsp" target="iframe_a" >Strings Currents </a>
  <a href="Inverter_Config.jsp" target="iframe_a" >Configuration</a>
  <a href="String_Status.jsp" target="iframe_a" > String Status</a>
  <a href="Failure_Report.jsp" target="iframe_a">Inverter Faults</a>
  <a href="Permanent_Fault.jsp" target="iframe_a">Permanent Faults</a>
  <a href="Daily_Generation.jsp" target="iframe_a">Daily Generation</a>
  <a href="daily_gen.jsp" target="iframe_a">Database</a>
  
  <a href="Site_Details.jsp" target="iframe_c">Site Info</a>
  
  
  <p id="dateinfo" style="color:yellow;float:right;"></p>
<script>
var d = new Date();
document.getElementById("dateinfo").innerHTML = d;
</script> 
</div>

<div class="row">
    <div class="column side">
      <img src="images/goodwe-inverter.jpg"  style= "float:left ;width:300px;height:400px;">
    </div> 
  
  
  <div class="column middle">
  <iframe height="550" width="750" style="border:none"  src="Grid_Information.jsp"  name= "iframe_a"></iframe> 
    
  </div>
  
  <div class = "column side">
    <iframe height="650" width="400" style="border:none"  src="power_gen.jsp"  name= "iframe_c"></iframe>           
   </div> 
</div>



  <footer>
        <b> MinSolar Pvt Ltd ,</b> 
        <i>7C Gee Gee Emerald Towers ,</i>
        <i>No 312 Valluvarkottam High Road,</i>
        <i>Nungambakkam ,Chennai-600034, </i><br>
        <i>www.minsolar.com<br></i>
   </footer>
</body>
</html>