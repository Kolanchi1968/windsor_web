package com.org;

public class Global_Variables {
	
        public float Lowest_Feeding_Voltage_of_PV;
		public int Reconnect_Time;
		public float High_Limit_Of_Grid_Voltage;
		public float Low_Limit_Of_Grid_Voltage;
		public float High_Limit_Of_Grid_Frequency;
		public float Low_Limit_Of_Grid_Frequency;
		public byte Yearv;
		public byte Monthv;
		public byte Datev;
		public byte Hourv;
		public byte Minutev;
		public byte Secondv;
		public int Range_Of_Real_Power_Adjust;
		public int Range_Of_Reactive_Power_Adjust;
		public byte[] Serial_Number_Of_Inverter=new byte[16];
		public byte[] Model_Name_Of_Inverter=new byte[16];
		public long Error_Code;
		public long ETotal;
		public long HTotal;
		public float PV_Voltage_Of_First_Tracker;
		public float PV_Voltage_Of_Second_Tracker;
		public float PV_Current_Of_First_Tracker;
		public float PV_Current_Of_Second_Tracker;
		public float Grid_Voltage_Of_Phase1;
		public float Grid_Voltage_Of_Phase2;
		public float Grid_Voltage_Of_Phase3;
		public float Grid_Current_Of_Phase1;
		public float Grid_Current_Of_Phase2;
		public float Grid_Current_Of_Phase3;
		public float Grid_Frequency_Of_Phase1;
		public float Grid_Frequency_Of_Phase2;
		public float Grid_Frequency_Of_Phase3;
		public int  Feeding_Power_To_Grid;
		public int  Running_Status;
		public float Temperature_Of_Heatsink;
		public int   EDay;
		public float Vpv1;
		public float Vpv2;
		public float Ipv1;
		public float Ipv2;
		public float Vac1;
		public float Vac2;
		public float Vac3;
		public float Iac1;
		public float Iac2;
		public float Iac3;
		public float Fac1;
		public float Fac2;
		public float Fac3;
		public int PacL;
		public int Work_Mode;
		//------------Table 8.1---------------------------
		public boolean Wait;
		public boolean Normal;
		public boolean Fault;
		public boolean Permanent_Fault;
	//----------------Table 8.1 End---------------------
		public float Temperature;
		//------------------------------------------------
		public int Error_MessageH;
		public int Error_MessageL;
		//  -------Table 8.2 -----------------------------
		public boolean Internal_Communication_Failure; //bit 31
		public boolean EEProm_RW_Failure;//bit 30
		public boolean Fac_Failure;//bit 29
		// TBD - NA  - bit 28
		//  TBD - NA   -bit 27
		//  TBD; -NA/  -bit 26
		public boolean Relay_Check_Failure;  //bit 25
		//  TBD -NA/  -bit 24
		public boolean Vac_Consistancy_Failure;  //bit 23
		public boolean Fac_Consistancy_Failure;  //bit 22
		public boolean String_Current_Over;  //bit 21 MT Series
		public boolean LCD_Communication_Failure;  //bit 20 MT Series
		public boolean DC_Injection_High;  //bit 19 
		public boolean Isolation_Failure;  //bit 18 
		public boolean Vac_Failure;  //bit 17 
		public boolean External_Fan_Failure;  //bit 16 
		public boolean PV_Over_Voltge;  //bit 15
		public boolean Auto_Test_Failure;  //bit 14
		public boolean Over_Temperature ;  //bit 13
		public boolean Internal_Fan_Failure ;  //bit 12
		public boolean DC_Bus_High ;  //bit 11
		public boolean Ground_I_Failure ;  //bit 10
		public boolean Utility_Loss ;  //bit 9
		public boolean AC_HCT_Failure ;  //bit 8
		public boolean Relay_Device_Failure ;  //bit 7
		public boolean GFCI_Device_Failure ;  //bit 6
		// ---------TBD    ------- //bit 5
		public boolean GFCI_Consistancy_Failure ;  //bit 4
		public boolean DCI_Consistancy_Failure ;  //bit 3
		//----------TBD---------------  //bit 2
		public boolean AC_HCT_Check_Failure ;  //bit 1
		public boolean GFCI_Device_Check_Failure ;  //bit 0
		//-----------Table End--------------------//
		public float E_Total;
		public int H_Total;
		public int Firmware_Version;
		public int Warning_Code;
		public float Pv2_Fault_Value;
		public int Functions_Value;
	//----------------Table 8.3---------------------------
		public boolean High_Impedence_Flag;  //Bit 15,14
		public boolean Ground_Fault_Flag; //Bit 13
		//----------Bit 12 to Bit9 ----NA-------
		public boolean Meter;
		public boolean MPPT_for_Shadow;
		//--------Bit6 to Bit 4 -TBD--------------------
		public boolean Power_Limit_Function;
		public boolean Burn_In_Mode;
		public boolean LVRT;
		public boolean Anti_Islanding;
		//-----------Table 8.3 End----------------
		public float Line2_Fault_Value;
		public float Line3V_Fault_Value;
		public float Bus_Voltage;
		public float NBUS_Voltage;
		public float Line3F_Fault_Value;
		public int Safety_Country;
		public float E_Day;
		public int Year_Month;
		public int Date_Hour;
		public int Minute_Second;
		public int Manufacture_ID;
		public int RSSI;
		public int PV_Mode;
		//-----------Table 8.4--------------------
		public boolean No_PV;  //0x00
		public boolean Stanby;  //0x01
		public boolean Work;  //0x02
		//-----------Table 8.4 End ----------------------
		public int FM_Version_Of_ARM;
		public int GPRS_Burn_In_Mode;
		public int Pac_H;
		public float Vp3;
		public float Vp4;
		public float Ip3;
		public float Ip4;
		public float IString1;
		public float IString2;
		public float IString3;
		public float IString4;
		public float IString5;
		public float IString6;
		public float IString7;
		public float IString8;
		public float IString9;
		public float IString10;
		public float IString11;
		public float IString12;
		public float IString13;
		public float IString14;
		public float IString15;
		public float IString16;
		public int IString_Status;
		// ----------Table 8.5----------------------
		public boolean[] IString_Status_Flag = new boolean[16];
		
		
		//-------------Table 8.5 End -------------------
		public float IString18;
		public float IString19;
		public float IString20;
		public int PID_Status;
		
		 
         public float Actual_Generation;
         public float Caclulated_Generation;
         public float Pyranameter_Reading;
         public float Inveter_Running_Hours;
         public float Performance_Ratio;
         public float CUF;
		
		
		
		//----------------Table 8.6 ------------------
		public void Inverter_Errors()
		{
			 
			if((Error_MessageH & 0x8000) >0)  //bit 31
				Internal_Communication_Failure=true;
			else
				Internal_Communication_Failure=false;
			
			if((Error_MessageH & 0x4000) >0) //bit 30
			EEProm_RW_Failure = true;
			else
				EEProm_RW_Failure = false;
				
			if((Error_MessageH & 0x2000) >0) //bit 29
			Fac_Failure = true;
			else
				Fac_Failure = false;	
			
			// TBD - NA  - bit 28 -0x1000
			//  TBD - NA   -bit 27 -0x0800
			//  TBD; -NA/  -bit 26 - 0x0400
		
			if((Error_MessageH & 0x0200) >0) //bit 25
			Relay_Check_Failure=true;
			else
				Relay_Check_Failure=false;
				
			//  TBD -NA/  -bit 24 -0100
			if((Error_MessageH & 0x0080) >0) //bit 23
			 Vac_Consistancy_Failure = true;
			else
				 Vac_Consistancy_Failure = false;
				
			if((Error_MessageH & 0x0040) >0) //bit 22
				 Fac_Consistancy_Failure=true ;
			else
				Fac_Consistancy_Failure=false ;
			
			if((Error_MessageH & 0x0020) >0) //bit 21 MT Series
			    String_Current_Over = true;
			else
				String_Current_Over =false;
			if((Error_MessageH & 0x0010) >0) //bit 20 MT Series
				LCD_Communication_Failure = true;
			else 
				LCD_Communication_Failure = false;
		    if((Error_MessageH & 0x0008) >0) //bit 19
		    	DC_Injection_High  = true;
		    else
		    	DC_Injection_High  = false;
		    if((Error_MessageH & 0x0004) >0) //bit 18	  
		       Isolation_Failure= true;
		    else
		    	 Isolation_Failure= false;
		    if((Error_MessageH & 0x0002) >0) //bit 17	 
			 Vac_Failure = true;
		    else
		     Vac_Failure = false;
		    if((Error_MessageH & 0x0001) >0) //bit 16
		    	External_Fan_Failure=true;
		    else
		    	External_Fan_Failure=false;
		    //--------------------Error MessageL--------------
		    if((Error_MessageL & 0x8000) >0) //bit 15
		     PV_Over_Voltge=true;
		    else
		    	PV_Over_Voltge=false;
		    if((Error_MessageL & 0x4000) >0) //bit 14
			 Auto_Test_Failure = true;
		    else
		     Auto_Test_Failure = false;
		    if((Error_MessageL & 0x2000) >0) //bit 13
			 Over_Temperature = true;
		    else
		     Over_Temperature = false;
		    if((Error_MessageL & 0x1000) >0) //bit 12
			 Internal_Fan_Failure =true;
		    else
		     Internal_Fan_Failure = false;
		    if((Error_MessageL & 0x0800) >0) //bit 11	
		     DC_Bus_High =true;
		    else
		    	DC_Bus_High =false;
		    if((Error_MessageL & 0x0400) >0) //bit 10		
		     Ground_I_Failure =true;
		    else
		    	 Ground_I_Failure =false;
		    if((Error_MessageL & 0x0200) >0) //bit 9	
			 Utility_Loss =true;
		    else
		    Utility_Loss =false;
		    if((Error_MessageL & 0x0100) >0) //bit 8	
			 AC_HCT_Failure=true;
		    else
		    	AC_HCT_Failure=false;	
		    if((Error_MessageL & 0x0080) >0) //bit 7
		    	Relay_Device_Failure =true;
		    else
		    	Relay_Device_Failure =false;
		    if((Error_MessageL & 0x0040) >0) //bit 6
		     GFCI_Device_Failure =true;
		    else
		     GFCI_Device_Failure =false;	
			// ---------TBD    ------- //bit 5 -0020
		    if((Error_MessageL & 0x0010) >0) //bit4
			 GFCI_Consistancy_Failure =true;
		    else
		     GFCI_Consistancy_Failure = false;
		    if((Error_MessageL & 0x0008) >0) //bit3
		    	 DCI_Consistancy_Failure =true;
		    else
		    	DCI_Consistancy_Failure =false;
		    //----------TBD---------------  //bit 2 -0x0004
		    if((Error_MessageL & 0x0002) >0) //bit1
			AC_HCT_Check_Failure =true;
			else
			AC_HCT_Check_Failure = false;	
		    if((Error_MessageL & 0x0001) >0) //bit0
			 GFCI_Device_Check_Failure =true;
		    else
		     GFCI_Device_Check_Failure =false;	
			//-----------Table End--------------------//
			
			
			
		}
		
		
	//---------------------------------------------------------------------
		public void Grid_Configuration()
		{
			plc_client pl = new plc_client();
			
			int lfv,hlgv,llgv,hlgf,llgf;
			//----------- 0 ,1---------------------
			lfv =  pl.response[1]; 
			lfv =  lfv << 8;
			lfv = lfv | pl.response[0];			
			Lowest_Feeding_Voltage_of_PV = lfv / 10 ;
			//-------------2,3---------------------
			Reconnect_Time =  pl.response[3];
			Reconnect_Time = Reconnect_Time << 8;
			Reconnect_Time = Reconnect_Time | pl.response[2];
			//---------------4,5----------------------------
			hlgv = pl.response[5];
			hlgv= hlgv << 8;
			hlgv = hlgv | pl.response[4];
			High_Limit_Of_Grid_Voltage = (float) hlgv/10;
			//----------------6,7----------------------
			llgv =pl.response[7];
			llgv = llgv << 8;
			llgv =pl.response[6];
			Low_Limit_Of_Grid_Voltage = llgv/10;
			//--------------8,9----------------------
			hlgf =pl.response[9];
			hlgf = hlgf << 8;
			hlgf =pl.response[8];
			High_Limit_Of_Grid_Frequency = hlgf/10;
			//--------------10,11---------------------
			llgf =pl.response[11];
			llgf = llgf << 8;
			llgf =pl.response[10];
			Low_Limit_Of_Grid_Frequency = llgf/10;
			
		}
		public void Date_Time()
		{
			plc_client pl = new plc_client();
			Yearv = pl.response[12];
			Monthv = pl.response[13];
			Datev = pl.response [14];
			Hourv = pl.response[15];
			Minutev = pl.response [16];
			Secondv = pl.response[17];
		}
		public void Power_Adjust()
		{
			plc_client pl = new plc_client();
			
			//------------Real Power Adj---18,19---------
		    Range_Of_Real_Power_Adjust =pl.response[19];
		    Range_Of_Real_Power_Adjust =  Range_Of_Real_Power_Adjust << 8;
		    Range_Of_Real_Power_Adjust = Range_Of_Real_Power_Adjust | pl.response[18];
		    //-------------Reactive Power Adj ---20 21--------------
		    Range_Of_Reactive_Power_Adjust =pl.response[21];
		    Range_Of_Reactive_Power_Adjust =   Range_Of_Reactive_Power_Adjust << 8;
		    Range_Of_Reactive_Power_Adjust =  Range_Of_Reactive_Power_Adjust | pl.response[20];
		    
		}
	
		public void Inverter_Details()
		{
			plc_client pl = new plc_client();
		   Serial_Number_Of_Inverter[0]= pl.response[22];
		   Serial_Number_Of_Inverter[1]= pl.response[23];
		   Serial_Number_Of_Inverter[2]= pl.response[24];
		   Serial_Number_Of_Inverter[3]= pl.response[25];
		   Serial_Number_Of_Inverter[4]= pl.response[26];
		   Serial_Number_Of_Inverter[5]= pl.response[27];
		   Serial_Number_Of_Inverter[6]= pl.response[28];
		   Serial_Number_Of_Inverter[7]= pl.response[29];
		   Serial_Number_Of_Inverter[8]= pl.response[30];
		   Serial_Number_Of_Inverter[9]= pl.response[31];
		   Serial_Number_Of_Inverter[10]= pl.response[32];
		   Serial_Number_Of_Inverter[11]= pl.response[33];
		   Serial_Number_Of_Inverter[12]= pl.response[34];
		   Serial_Number_Of_Inverter[13]= pl.response[35];
		   Serial_Number_Of_Inverter[14]= pl.response[36];
		   Serial_Number_Of_Inverter[15]= pl.response[37];
			
		   Model_Name_Of_Inverter[0]= pl.response[38];
		   Model_Name_Of_Inverter[1]= pl.response[39];
		   Model_Name_Of_Inverter[2]= pl.response[40];
		   Model_Name_Of_Inverter[3]= pl.response[41];
		   Model_Name_Of_Inverter[4]= pl.response[42];
		   Model_Name_Of_Inverter[5]= pl.response[43];
		   Model_Name_Of_Inverter[6]= pl.response[44];
		   Model_Name_Of_Inverter[7]= pl.response[45];
		   Model_Name_Of_Inverter[8]= pl.response[46];
		   Model_Name_Of_Inverter[9]= pl.response[47];
	     }
		public void Error_Code()
		{
			
			plc_client pl = new plc_client();
			//---------48,49,50,51---------------
			Error_Code =   pl.response[51];
			Error_Code = Error_Code << 8;
			
			Error_Code = Error_Code | pl.response[50];
			Error_Code = Error_Code << 8;
			
			Error_Code = Error_Code | pl.response[49];
			Error_Code = Error_Code << 8;
			
			Error_Code = Error_Code | pl.response[48];
			
		}
		
		public void HTotal_ETotal()
		{
			plc_client pl = new plc_client();
			//---------52,53,54,55---------------
			ETotal =   pl.response[55];
			ETotal= ETotal << 8;
			
			ETotal = ETotal | pl.response[54];
			ETotal = ETotal << 8;
			
			ETotal = ETotal | pl.response[53];
			ETotal =ETotal << 8;
			
			ETotal = ETotal| pl.response[52];
			
			//---------56,57,58,59  ---------------
			 HTotal =   pl.response[59];
			 HTotal=  HTotal << 8;
			
			 HTotal =  HTotal | pl.response[58];
			 HTotal =  HTotal << 8;
			
			 HTotal = HTotal | pl.response[57];
			 HTotal = HTotal << 8;
			
			 HTotal =  HTotal| pl.response[56];
			
			}
     public void PV_Tracking_Voltage()
		{
			int VFirst_Tracker,VSecond_Tracker,IFirst_Tracker,ISecond_Tracker;
			
			plc_client pl = new plc_client();
			//----------V First Tracker ---60 ,61-----------------
			VFirst_Tracker = pl.response[61];
			VFirst_Tracker = VFirst_Tracker << 8;
			VFirst_Tracker = pl.response[60];
			PV_Voltage_Of_First_Tracker = VFirst_Tracker/10;
			//--------------V Second Tracker ---62 63------------
			VSecond_Tracker = pl.response[63];
			VSecond_Tracker = VSecond_Tracker << 8;
			VSecond_Tracker = pl.response[62];
			PV_Voltage_Of_Second_Tracker= VSecond_Tracker/10;
			//---------------I First Tracker  ---64 , 65-----------
			IFirst_Tracker = pl.response[65];
			IFirst_Tracker =IFirst_Tracker << 8;
			IFirst_Tracker = pl.response[64];
			PV_Current_Of_First_Tracker = IFirst_Tracker/10;
			//---------------I Second  Tracker  ---66 , 67-----------
			ISecond_Tracker = pl.response[67];
			ISecond_Tracker =ISecond_Tracker << 8;
			ISecond_Tracker = pl.response[66];
			PV_Current_Of_Second_Tracker = ISecond_Tracker/10;
			}
     public void Grid_Parameters()
     {
    	int gvph1,gvph2,gvph3,giph1,giph2,giph3,gfph1,gfph2,gfph3,eday, Heatsink_Temperature;
    	plc_client pl = new plc_client();
    	//---------------Grid Voltage Ph1  ---68 , 69-----------
    	gvph1 = pl.response[69];
    	gvph1 =gvph1 << 8;
    	gvph1 = pl.response[68];
    	Grid_Voltage_Of_Phase1 = gvph1/10;
    	//---------------Grid Voltage Ph2   ---70 , 71-----------
    	gvph2 = pl.response[71];
    	gvph2 =gvph2<< 8;
    	gvph2 = pl.response[70];
    	Grid_Voltage_Of_Phase1 = gvph2/10;
    	//---------------Grid Voltage Ph3   ---72 , 73-----------
    	gvph3 = pl.response[73];
    	gvph3 = gvph3<< 8;
    	gvph3 = pl.response[72];
    	Grid_Voltage_Of_Phase2 = gvph3/10;
    	//---------------Grid Current of   Ph1   ---74 , 75-----------
    	giph1 = pl.response[75];
    	giph1= giph1<< 8;
    	giph1 = pl.response[74];
    	Grid_Voltage_Of_Phase3 = giph1/10;
    	//---------------Grid Current of   Ph2   ---76 , 77-----------
    	giph2 = pl.response[77];
    	giph2= giph2<< 8;
    	giph2 = pl.response[76];
    	Grid_Voltage_Of_Phase3 = giph2/10;
    	//---------------Grid Current of   Ph3   ---78 , 79-----------
    	giph3 = pl.response[79];
    	giph3= giph3<< 8;
    	giph3 = pl.response[78];
    	Grid_Voltage_Of_Phase3 = giph3/10;
    	//---------------Grid Frequency of Ph1    ---80 , 81-----------
    	gfph1 = pl.response[81];
    	gfph1= gfph1<< 8;
    	gfph1 = pl.response[80];
    	Grid_Frequency_Of_Phase1 = gfph1/10;
    	//---------------Grid Frequency of  Ph2  ---82 , 83-----------
    	gfph2 = pl.response[83];
    	gfph2= gfph2<< 8;
    	gfph2 = pl.response[82];
    	Grid_Frequency_Of_Phase2 = gfph2/10;
    	//---------------Grid Frequency of  Ph3  ---82 , 83-----------
    	gfph3 = pl.response[83];
    	gfph3= gfph2<< 8;
    	gfph3 = pl.response[82];
    	Grid_Frequency_Of_Phase3 = gfph3/10;
    	//---------------Feeding Power to Grid  ---84 , 85-----------
    	 Feeding_Power_To_Grid = pl.response[85];
    	 Feeding_Power_To_Grid= Feeding_Power_To_Grid << 8;
    	 Feeding_Power_To_Grid = pl.response[84];
    	//-------------Running Status  ---86 , 87-----------
    	 Running_Status = pl.response[87];
    	 Running_Status=Running_Status << 8;
    	 Running_Status = pl.response[86];
    	//-------------Running Status  ---88 , 89-----------
    	 Heatsink_Temperature = pl.response[89];
    	 Heatsink_Temperature= Heatsink_Temperature << 8;
    	 Heatsink_Temperature = pl.response[88];
    	 Temperature_Of_Heatsink =  Heatsink_Temperature/10;
    	//-------------Running Status  ---90 , 91-----------
    	 eday = pl.response[91];
    	 eday= eday << 8;
    	 eday = pl.response[90];
    	 eday =  eday/10;
    }
   public void MT_PV_PhaseVIF()
   {
	   int vpv1,vpv2,ipv1,ipv2,vac1,vac2,vac3,iac1,iac2,iac3,fac1,fac2,fac3,pacl;
	   plc_client pl = new plc_client();
	 //-------------Vpv1  ---92 , 93-------------------------
	     vpv1 = pl.response[93];
	     vpv1= vpv1<< 8;
	     vpv1 = pl.response[92];
	     Vpv1 =  vpv1/10;
	     //----------Vpv2  ---94 , 95------------------------
	     vpv2 = pl.response[95];
	     vpv2= vpv2<< 8;
	     vpv2 = pl.response[94];
	     Vpv2 = vpv2/10;
	     //----------IPv1-----96 ,97 ----------------------------
	     ipv1 = pl.response[97];
	     ipv1= ipv1<< 8;
	     ipv1 = pl.response[96];
	     Ipv1 = ipv1/10;
	     //--------IPV2 98 , 99------------------------------------------
	     ipv2 = pl.response[99];
	     ipv2= ipv2<< 8;
	     ipv2 = pl.response[98];
	     Ipv2 = ipv2/10;
	     //--------Vac1 100 ,101------------------------------------------
	     vac1 = pl.response[101];
	     vac1= vac1<< 8;
	     vac1 = pl.response[100];
	     Vac1 = Vac1/10;
	   //--------Vac2 102 ,103------------------------------------------
	     vac2 = pl.response[103];
	     vac2= vac1<< 8;
	     vac2 = pl.response[102];
	     Vac2 =vac2/10;
	   //--------Vac3 104 ,105------------------------------------------
	     vac3 = pl.response[105];
	     vac3=  vac3<< 8;
	     vac3 = pl.response[104];
	     Vac3 = vac3/10;
	     //-------Iac1 106 ,107------------------------------------------
	     iac1 = pl.response[107];
	     iac1=  iac1<< 8;
	     iac1 = pl.response[106];
	     Iac1= iac1/10;
	     //--------Iac2 108 ,109------------------------------------------
	     iac2 = pl.response[109];
	     iac2=  iac2<< 8;
	     iac2 = pl.response[108];
	     Iac1= iac1/10;
	     //--------Iac3 110 ,111------------------------------------------
	     iac3 = pl.response[111];
	     iac3=   iac3<< 8;
	     iac3 = pl.response[110];
	     Iac1=  iac3 / 10;
	     //--------Fac1 112 ,113------------------------------------------
	     fac1 = pl.response[113];
	     fac1 = fac1 << 8;
	     fac1 = pl.response[112];
	     Fac1 = fac1 / 10;
	     //--------Fac2 114 ,115------------------------------------------
	     fac2 = pl.response[115];
	     fac2 = fac1 << 8;
	     fac2 = pl.response[114];
	     fac2 = fac2 / 10;
	     //--------Fac3 116 ,117------------------------------------------
	     fac3 = pl.response[117];
	     fac3 = fac1 << 8;
	     fac3 = pl.response[116];
	     Fac3 = fac3 / 10;
	     //--------Fac2 118 ,119------------------------------------------
	     pacl = pl.response[119];
	     pacl =  pacl << 8;
	     pacl = pl.response[118];
	     PacL =  pacl / 10;
	     //--------PacL 120 ,121------------------------------------------
	     pacl = pl.response[121];
	     pacl =  pacl << 8;
	     pacl = pl.response[120];
	     PacL =  pacl / 10;
	     //--------Work_Mode------------------------------------------
	     Work_Mode = pl.response[123];
	     Work_Mode =  pacl << 8;
	     Work_Mode = pl.response[122];
	     }
		
   public void MT_Inverter_Running_Status()
   {
	   
	   //------------Table 8.1---------------------------
	    if(  Work_Mode == 0x0000)
			Wait = true ;
	    else if(  Work_Mode == 0x0001)
			Normal = true ;
	    else if(  Work_Mode == 0x0002)
			Fault = true ;
	    else if(  Work_Mode == 0x0002)
			 Permanent_Fault = true ;
	  
 }		
	//----------------Table 8.1 End---------------------
	public void MT_Errors() {	
       
		int temperature; 
		 plc_client pl = new plc_client();
		//-------------Temperature --124 ,125---------------------------------------------
		temperature= pl.response[125];
		temperature = temperature << 8;
		temperature = pl.response[124];
		Temperature = temperature / 10;
	    //--------------Error MessageH ---126,127----------------------------------------- 
		Error_MessageH= pl.response[127];
		Error_MessageH = Error_MessageH << 8;
		Error_MessageH = pl.response[126];
		 //--------------Error Message ---128,129----------------------------------------- 
		Error_MessageL= pl.response[129];
		Error_MessageL = Error_MessageL << 8;
		Error_MessageL = pl.response[128];
	
		//  -------Table 8.2 -----------------------------
		
		if((Error_MessageH & 0x8000)>0)//bit 31
	    Internal_Communication_Failure = true;
		if((Error_MessageH & 0x4000)>0)//bit 30
			EEProm_RW_Failure = true;
		if((Error_MessageH & 0x2000)>0)//bit 29
			Fac_Failure = true;
		// TBD - NA  - bit 28  -0x1000
	    //  TBD - NA   -bit 27 -0x0800
		//  TBD; -NA/  -bit 26 -0x0400
		if((Error_MessageH & 0x0200)>0)//bit 25
			Relay_Check_Failure = true;
	     //  TBD -NA/  -bit 24 -0x0100
		if((Error_MessageH & 0x0080)>0)//bit 23
			Vac_Consistancy_Failure = true;
		if((Error_MessageH & 0x0040)>0)//bit 22
			Fac_Consistancy_Failure = true;
		if((Error_MessageH & 0x0020)>0)//bit 21
			String_Current_Over = true;
		if((Error_MessageH & 0x0010)>0)//bit 20 MT Series
			LCD_Communication_Failure = true;
		if((Error_MessageH & 0x0008)>0)//bit 19 
			 DC_Injection_High = true;
		if((Error_MessageH & 0x0004)>0)//bit 18 
			Isolation_Failure = true;
		if((Error_MessageH & 0x0002)>0)//bit 17 
			 Vac_Failure = true;
		if((Error_MessageH & 0x0001)>0)//bit 16 
			External_Fan_Failure = true;
		
		if((Error_MessageL & 0x8000)>0)//bit 15 
			PV_Over_Voltge = true;
		if((Error_MessageL & 0x4000)>0)//bit 14 
			Auto_Test_Failure = true;
		if((Error_MessageL & 0x2000)>0)//bit 13 
			 Over_Temperature = true;
		if((Error_MessageL & 0x1000)>0)//bit 12 
			Internal_Fan_Failure = true;
		if((Error_MessageL & 0x0800)>0)//bit 11
			DC_Bus_High = true;
		if((Error_MessageL & 0x0400)>0)//bit 10
			Ground_I_Failure = true;
		if((Error_MessageL & 0x0200)>0)//bit 9
			Utility_Loss = true;
		if((Error_MessageL & 0x0100)>0)//bit 8
			AC_HCT_Failure = true;
		if((Error_MessageL & 0x0080)>0)//bit 7
			Relay_Device_Failure = true;
		if((Error_MessageL & 0x0040)>0)//bit 6
			GFCI_Device_Failure = true;
		// ---------TBD    ------0020- //bit 5 
		if((Error_MessageL & 0x0010)>0)//bit 4
			GFCI_Device_Failure = true;
		if((Error_MessageL & 0x0008)>0)//bit 3
			DCI_Consistancy_Failure = true;
		//----------TBD------0x0004---  //bit 2
		if((Error_MessageL & 0x0002)>0)//bit 1
			AC_HCT_Check_Failure = true;
		if((Error_MessageL & 0x0001)>0)//bit 0
			GFCI_Device_Check_Failure = true;
		//-----------Table End--------------------//
		
	}
		
	public void MT_ETotal_HTotal()
	{
		 
		long etotal,  pv2faultvalue;
		plc_client pl = new plc_client();
		 //--------------Error Message ---130,131----------------------------------------- 
		Error_MessageL= pl.response[131];
		Error_MessageL = Error_MessageL << 8;
		Error_MessageL = pl.response[130];
		 //-------------E Total ---132,133,134,135----------------------------------------- 
		etotal= pl.response[135];
		etotal = etotal << 8;
		etotal = pl.response[134];
		etotal =etotal << 8;
		etotal = pl.response[133];
		etotal = etotal << 8;
		E_Total = pl.response[132];
		//-------------H Total ---136,137,138,139----------------------------------------- 
		H_Total = pl.response[139];
		H_Total = H_Total << 8;
		H_Total = pl.response[138];
		H_Total = H_Total << 8;
		H_Total = pl.response[137];
		H_Total = H_Total << 8;
		H_Total = pl.response[136];
		 //--------------Error Message ---140,141----------------------------------------- 
		Firmware_Version= pl.response[141];
		Firmware_Version =  Firmware_Version << 8;
		Firmware_Version = pl.response[140];
		 //--------------EWarning Code ---142,143----------------------------------------- 
		Warning_Code= pl.response[143];
		Warning_Code =  Warning_Code << 8;
		Warning_Code = pl.response[142];
		 //--------------EWarning Code ---144,145----------------------------------------- 
		pv2faultvalue= pl.response[145];
		pv2faultvalue = pv2faultvalue << 8;
		pv2faultvalue = pl.response[144];
		Pv2_Fault_Value = pv2faultvalue/10;
		 //--------------EWarning Code ---146,147----------------------------------------- 
		Functions_Value= pl.response[147];  //Refer table 8.3
		Functions_Value =  Firmware_Version << 8;
		Functions_Value = pl.response[146];
	}
	public void Functions_Value_Flags() {
		//----------------Table 8.3----------//Bit 15,14-----------------
		if((Functions_Value & 0xC000) > 0)
			 High_Impedence_Flag =true;
		if((Functions_Value & 0x2000) > 0) //Bit 13
			Ground_Fault_Flag =true;
		//----------Bit 12 to Bit9 ----0x1000,0x0800,0x0400,0x0200-----
		if((Functions_Value & 0x0100) > 0) //Bit 8
			Meter =true;
		if((Functions_Value & 0x0080) > 0) //Bit 7
			MPPT_for_Shadow = true;
		//--------Bit6 to Bit 4 -TBD----0x0040,0x0020,0x0010----------------
		if((Functions_Value & 0x0008) > 0) //Bit 7
			Power_Limit_Function = true;
		
		if((Functions_Value & 0x0004) > 0) //Bit 7
			Burn_In_Mode = true;
		 
		if((Functions_Value & 0x0002) > 0) //Bit 7
			LVRT = true;
		if((Functions_Value & 0x0001) > 0) //Bit 7
			 Anti_Islanding = true;
		 
		//-----------Table 8.3 End----------------
	}
	
	public void  Busvolage_and_Faultvalue() {	
	int line2vfaultvalue,line3vfaultvalue,busvoltage,nbusvoltage,line3ffaultvalue,eday;
		plc_client pl = new plc_client();
	//--------------Line2 Fault Value ---148,149----------------------------------------- 
		line2vfaultvalue= pl.response[149];  //Refer table 8.3
		line2vfaultvalue = line2vfaultvalue << 8;
		line2vfaultvalue = pl.response[148];
		Line2_Fault_Value = line2vfaultvalue/10;
		//--------------Line3 Fault Value ---150,151----------------------------------------- 
		line3vfaultvalue= pl.response[151];  //Refer table 8.3
		line3vfaultvalue =  line3vfaultvalue << 8;
		line3vfaultvalue = pl.response[150];
		Line3V_Fault_Value = line3vfaultvalue /10;
		//--------------Bus Voltage  ---152,153----------------------------------------- 
		busvoltage= pl.response[153];  //Refer table 8.3
		busvoltage =  busvoltage << 8;
		busvoltage = pl.response[152];
		Bus_Voltage = busvoltage /10;
		//-------------N-Bus Voltage  ---154,155----------------------------------------- 
		nbusvoltage= pl.response[155];  //Refer table 8.3
		nbusvoltage =  nbusvoltage << 8;
		nbusvoltage = pl.response[154];
		NBUS_Voltage = nbusvoltage /10;
	   
		//--------------Line 3 F Fault Value ---156,157----------------------------------------- 
		line3ffaultvalue= pl.response[157];  //Refer table 8.3
		line3ffaultvalue =  line3ffaultvalue << 8;
		line3ffaultvalue = pl.response[156];
		Line3F_Fault_Value = line3ffaultvalue /10;
		//--------------Safety Country ---158,159----------------------------------------- 
		Safety_Country = pl.response[159];  //Refer table 8.3
		Safety_Country =   Safety_Country << 8;
		Safety_Country = pl.response[158];
		//--------------E-Day ---160,161----------------------------------------- 
		eday = pl.response[161];  //Refer table 8.3
		eday =  eday << 8;
		eday = pl.response[160];
		E_Day = eday/10;
		//--------------Safety Country ---162,163----------------------------------------- 
		Year_Month = pl.response[163];  //Refer table 8.3
		Year_Month = Year_Month << 8;
		Year_Month= pl.response[162];
		//-------------Data Hour ---164,165----------------------------------------- 
		Date_Hour = pl.response[165];  //Refer table 8.3
		Date_Hour = Year_Month << 8;
		Date_Hour = pl.response[164];	   
		//--------------Minute Second---166,167----------------------------------------- 
		Minute_Second = pl.response[167];  //Refer table 8.3
		Minute_Second =  Minute_Second << 8;
		Minute_Second = pl.response[166];	
		//-------------Manufacture IDy ---168,169----------------------------------------- 
		Manufacture_ID = pl.response[169];  //Refer table 8.3
		Manufacture_ID =  Manufacture_ID << 8;
		Manufacture_ID = pl.response[168];	
		//-------------Manufacture IDy --170,171----------------------------------------- 
		RSSI = pl.response[171];  //Refer table 8.3
		RSSI = RSSI << 8;
		RSSI = pl.response[170];	
		
		
		}
	public void PV_Mode() {
		plc_client pl = new plc_client();
	//-------------172 ,173 PV Mode ---------------------------------------- 
			PV_Mode = pl.response[173];  //Refer table 8.3
			PV_Mode = PV_Mode << 8;
			PV_Mode = pl.response[172];	
		//-----------Table 8.4--------------------
			if(PV_Mode ==0x00)	//0x00
		    No_PV = true;  
			if(PV_Mode ==0x01)	//0x01
		    Stanby = true;  
			if(PV_Mode ==0x02)	//0x02
	        Work = true;
		//-----------Table 8.4 End ----------------------
	}
	public void MT_FM_Version()
	{
		int vp3,vp4,ip3,ip4;
		plc_client pl = new plc_client();
		//-------------174 ,175 FM Version  ---------------------------------------- 
		FM_Version_Of_ARM = pl.response[175];  //Refer table 8.3
		FM_Version_Of_ARM =FM_Version_Of_ARM << 8;
		FM_Version_Of_ARM = pl.response[174];	
		
		//-----------GPRS_Burn_In_Mode--176 ,177  ---------------------------------------- 
		GPRS_Burn_In_Mode = pl.response[177];  //Refer table 8.3
		GPRS_Burn_In_Mode =GPRS_Burn_In_Mode << 8;
		GPRS_Burn_In_Mode= pl.response[176];	
		
		//-----------Pac_H --178 ,179  ---------------------------------------- 
		Pac_H = pl.response[179];  //Refer table 8.3
		Pac_H =Pac_H << 8;
		Pac_H = pl.response[178];	
		
		//-----------Vp3--180 ,181  ---------------------------------------- 
		vp3 = pl.response[181];  //Refer table 8.3
		vp3 = vp3 << 8;
		vp3= pl.response[180];	
		Vp3 = vp3/10;
		
		//----------Vp4 --182 , 183  ---------------------------------------- 
		vp4 = pl.response[183];  //Refer table 8.3
		vp4 = vp3 << 8;
		vp4= pl.response[182];	
		Vp4 = vp4/10;
		
		//----------Vp4 --184 , 185  ---------------------------------------- 
		ip3 = pl.response[185];  //Refer table 8.3
		ip3 = ip3 << 8;
		ip3 = pl.response[184];	
		Ip3 = ip3 / 10;
		//----------Vp4 --186 , 187  ---------------------------------------- 
		ip4 = pl.response[187];  //Refer table 8.3
		ip4 = ip3 << 8;
		ip4 = pl.response[186];	
		Ip4 = ip4 / 10;
		}	
		
		public void MT_String_Currents()
		{
	    plc_client pl = new plc_client();
	     int[] istring =new int[22];	
	  //---------- IString1------188 , 189  ---------------------------------------- 
	    istring[0] = pl.response[189];  //Refer table 8.3
	    istring[0] =  istring[0]  << 8;
	    istring[0] = pl.response[188];	
	    IString1 = istring[0] / 10;
	    //---------- IString2------190 , 191  ---------------------------------------- 
	    istring[1] = pl.response[191];  //Refer table 8.3
	    istring[1] =  istring[1] << 8;
	    istring[1] = pl.response[190];	
	    IString2 =  istring[1] / 10;
	    //---------- IString3-----Vp4 --192 , 193  ---------------------------------------- 
	    istring[2] = pl.response[193];  //Refer table 8.3
	    istring[2] =  istring[2] << 8;
	    istring[2] = pl.response[192];	
	    IString3=  istring[2] / 10;
	    //---------- IString4------194 , 195  ---------------------------------------- 
	    istring[3] = pl.response[195];  //Refer table 8.3
	    istring[3] =  istring[3] << 8;
	    istring[3] = pl.response[194];	
	    IString4=  istring[3] / 10;
	    //---------- IString5-------196 , 197  ---------------------------------------- 
	    istring[4] = pl.response[197];  //Refer table 8.3
	    istring[4] =  istring[4] << 8;
	    istring[4] = pl.response[196];	
	    IString5=  istring[4] / 10;
	    //---------- IString6-------198 , 199  ---------------------------------------- 
	    istring[5] = pl.response[199];  //Refer table 8.3
	    istring[5] =  istring[5] << 8;
	    istring[5] = pl.response[198];	
	    IString6=  istring[5] / 10;
	    //---------- IString7---- --200 , 201  ---------------------------------------- 
	    istring[6] = pl.response[201];  //Refer table 8.3
	    istring[6] =  istring[6] << 8;
	    istring[6] = pl.response[200];	
	    IString7=  istring[6] / 10;
	    //---------- IString8---- --202 , 203  ---------------------------------------- 
	    istring[7] = pl.response[203];  //Refer table 8.3
	    istring[7] =  istring[7] << 8;
	    istring[7] = pl.response[202];	
	    IString8=  istring[7] / 10;
	    //---------- IString9---- --204 , 205  ---------------------------------------- 
	    istring[8] = pl.response[205];  //Refer table 8.3
	    istring[8] =  istring[8] << 8;
	    istring[8] = pl.response[204];	
	    IString9=  istring[8] / 10;
	    //---------- IString10----- --206 , 207  ---------------------------------------- 
	    istring[9] = pl.response[207];  //Refer table 8.3
	    istring[9] =  istring[9] << 8;
	    istring[9] = pl.response[206];	
	    IString10=  istring[9] / 10;
	    //---------- IString11---- --208 , 209  ---------------------------------------- 
	    istring[10] = pl.response[209];  //Refer table 8.3
	    istring[10] =  istring[10] << 8;
	    istring[10] = pl.response[208];	
	    IString11=  istring[10] / 10;
	    //---------- IString12--- --210 , 211  ---------------------------------------- 
	    istring[11] = pl.response[211];  //Refer table 8.3
	    istring[11] =  istring[11] << 8;
	    istring[11] = pl.response[210];	
	    IString12=  istring[11] / 10;
	    //---------- IString13--- --212 , 213  ---------------------------------------- 
	    istring[12] = pl.response[213];  //Refer table 8.3
	    istring[12] =  istring[12] << 8;
	    istring[12] = pl.response[212];	
	    IString13=  istring[12] / 10;
	    //---------- IString14--- --214 , 215  ---------------------------------------- 
	    istring[13] = pl.response[215];  //Refer table 8.3
	    istring[13] =  istring[13] << 8;
	    istring[13] = pl.response[214];	
	    IString14=  istring[13] / 10;
	    //---------- IString15--- --216 , 217  ---------------------------------------- 
	    istring[14] = pl.response[217];  //Refer table 8.3
	    istring[14] =  istring[14] << 8;
	    istring[14] = pl.response[216];	
	    IString15=  istring[15] / 10;
	    //---------- IString15--- --218 , 219  ---------------------------------------- 
	    istring[15] = pl.response[219];  //Refer table 8.3
	    istring[15] =  istring[15] << 8;
	    istring[15] = pl.response[218];	
	    IString16=  istring[15] / 10;
	    //---------- IString Status-- --220 , 221 ---------------------------------------- 
	    istring[16] = pl.response[221];  //Refer table 8.3
	    istring[16] =  istring[16] << 8;
	    istring[16] = pl.response[220];	
	    IString_Status=  istring[16] / 10;
	    //---------- IString18 -- --222 , 223 ---------------------------------------- 
	    istring[17] = pl.response[223];  //Refer table 8.3
	    istring[17] =  istring[17] << 8;
	    istring[17] = pl.response[222];	
	    IString18=  istring[17] / 10;
	    //---------- IString19-- --224 , 225 ---------------------------------------- 
	    istring[18] = pl.response[225];  //Refer table 8.3
	    istring[18] =  istring[18] << 8;
	    istring[18] = pl.response[224];	
	    IString19=  istring[18] / 10;
	    //---------- IString20-- --226 , 227 ---------------------------------------- 
	    istring[19] = pl.response[227];  //Refer table 8.3
	    istring[19] =  istring[18] << 8;
	    istring[19] = pl.response[226];	
	    IString20=  istring[18] / 10;
	    //---------- IString20-- --228 , 229 ---------------------------------------- 
	    PID_Status = pl.response[229];  //Refer table 8.3
	    PID_Status = PID_Status << 8;
	    PID_Status = pl.response[228];	
	   
	     }
		public void MTString_Status()
		{
		int[] istringcompare = {0x8000,0x4000,0x2000,0x1000,0x0800,0x0400,0x0200,0x0100,0x0080,0x0040,0x0020,0x0010,0x0008,0x0004,0x0002,0x0001};
		 int i;
		// ----------Table 8.5----------------------
		for( i=0; i<16 ; i++) {
			if((istringcompare[i] &  IString_Status) > 0 )
				IString_Status_Flag[i] = true;
	    }
	   }
   
		public static void main(String[] args) {
			Global_Variables gl = new Global_Variables();
			gl.Grid_Configuration();
			gl.Inverter_Details();
			gl.Error_Code();
			gl.HTotal_ETotal();
			gl.PV_Tracking_Voltage();
			gl.Grid_Parameters();
			gl.MT_PV_PhaseVIF();
			gl.MT_Inverter_Running_Status();
			gl.MT_Errors();
			gl.MT_ETotal_HTotal();
			gl.Functions_Value_Flags();
			gl.Busvolage_and_Faultvalue();
			gl.PV_Mode();
			gl. MT_FM_Version();
			gl.MTString_Status();
		  
		
		} 
  


}





