package com.org;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Date;
import java.io.IOException;
import java.net.UnknownHostException;

public class db_connection {
//private int sno;

private Connection con= null;
private Statement st = null;
// private PreparedStatement preparedStatement = null;
private ResultSet rs = null;
public float[]  arr =new float[10] ;
public float[]  cal_gen =new float[10] ;
public float[]  act_gen =new float[10] ;
public float[]  pyra_reading = new float[10] ;



public void database_connect() throws InstantiationException,IllegalAccessException,ClassNotFoundException,SQLException,UnknownHostException,IOException
{
	int i = 0 ;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/solar_scada";
		String uname ="root";
		String pass = "harini@1968";
		String query ="SELECT * FROM dailygeneration";
		//"select * from users where user_id='"+userid+"'"
		
		Connection con = DriverManager.getConnection(url,uname,pass);
	    st = con.createStatement();
	    rs = st.executeQuery(query);
		while(rs.next())
			
		{
		
		//rs.getString(1);
		cal_gen[i] =rs.getFloat(1);
		act_gen[i] =  rs.getFloat(2);
		pyra_reading[i] = rs.getFloat(3);
			
	    System.out.println("sno");
		System.out.println("Actual_Generation");
		System.out.println("Calculated_Generation");
		System.out.println("Pyra_Reading");
		}
		st.close();
		con.close();
		System.out.println("End");
	}catch(Exception e) {
		throw e;
	}
	finally {
		close();
	}
		
	}
	//---------------------------------
	 private void close() {
		    try {
		      if (rs != null) {
		        rs.close();
		      }

		      if (st != null) {
		        st.close();
		      }

		      if (con != null) {
		        con.close();
		      }
		    } catch (Exception e) {

		    }
		  }
	
	
}	

