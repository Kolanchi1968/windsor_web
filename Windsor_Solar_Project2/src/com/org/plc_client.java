package com.org;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class plc_client {
	 public  byte[] response =new byte[1024];
	 
	public void read_plc() throws UnknownHostException,IOException {
	 Socket sock = new Socket("192.168.1.5",502);
     InputStream in =sock.getInputStream();
     OutputStream out = sock.getOutputStream();
     byte[] writebuf;
     writebuf  = new byte[12];
     writebuf[0]=0; //Transaction Identifier
     writebuf[1]=02; //Transaction Identifier
     writebuf[2]=0;  //Protocol Identifier -Modbus TCP
     writebuf[3]=0;  //Protocol Identifier -Modbus TCP
     writebuf[4]=0;  // Length of the field
     writebuf[5]=06;  //Length of the field
     writebuf[6]=0;   //Unit Identifier 
     writebuf[7]=03;  //Function Code
     writebuf[8]=0;  
     writebuf[9]=0;
     writebuf[10]=0;
     writebuf[11]=0x0a;
     out.write(writebuf);
   
     in.read(response);
     for(byte i=0;i<230;i++){
     System.out.println("Received from server ..." + i +":" + response[i]);
     }
     
     sock.close();
    
 }
 

}
