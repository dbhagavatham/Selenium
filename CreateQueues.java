package com.hp.exstream.qa.deliveryQueues;
import java.util.HashMap;
import java.util.Map;
import com.hp.exstream.qa.commonlib.BrowserHandlers;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.GlobalConst;
import com.hp.exstream.qa.commonlib.Login;
import com.hp.exstream.qa.commonlib.BrowserHandlers.Browsers;
import com.hp.exstream.qa.commonlib.DeliveryEngineUI_ID;

	public class CreateQueues
	{
		public static class  QueuesTypes
		{
			public static final String  LocalFolderQueue = "Local folder";
			public static final String  LPRQueue = "LPR";
			public static final String  JMSQueue= "JMS";
			public static final String  FTPQueue= "FTP";
			
		}
		
	public static void main(String[] args) {
		DeliveryEngineApp CreateQueues= new DeliveryEngineApp();
		BrowserHandlers b = new BrowserHandlers();
		boolean applicationAvailable;
		b.invokeBrowser(Browsers.CHROME, GlobalConst.BrowserDriversPath.CHROME_DRIVER_PATH);
		Login deLogin = new Login();
		applicationAvailable = deLogin.invokeApplication("http://localhost:8081/cc-webgui/app","admin","admin");
		//Variables need to pass through CreateQueue function
		Map<String,Boolean> QueuesBoolean=new HashMap<String,Boolean>();
		//Common Boolean Type Variable
		QueuesBoolean.put(DeliveryEngineUI_ID.VARIABLE_OVERWRITECHECKBOX, true);
		QueuesBoolean.put(DeliveryEngineUI_ID.VARIABLE_SIGNALFILE, true);
		//JMS Queue
		QueuesBoolean.put(DeliveryEngineUI_ID.JMS_REAL_QUEUE, false);
		
		System.out.println("QueuesBoolean is :"+QueuesBoolean.size());
		Map<String,String> QueuesString=new HashMap<String,String>();
		//Common Variables
		QueuesString.put(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION, "This is Queue Description...");
		QueuesString.put(DeliveryEngineUI_ID.VARIABLE_PATH, "${cc_root}/tmp");
		QueuesString.put(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP,"12345.pdf" );
		QueuesString.put(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD, "*.*");
		
		//LPR Queue Variables
		QueuesString.put(DeliveryEngineUI_ID.LPR_QUEUEFIELD, "lpr");
		QueuesString.put(DeliveryEngineUI_ID.LPR_HOSTNAME, "LocalHost");
		QueuesString.put(DeliveryEngineUI_ID.LPR_PORT,"51515");
		
		//FTP Queue Variables
		QueuesString.put(DeliveryEngineUI_ID.FTP_HOST, "ConnectionFactory");
		QueuesString.put(DeliveryEngineUI_ID.FTP_PORT, "21212");
		QueuesString.put(DeliveryEngineUI_ID.FTP_USER, "Admin");
		QueuesString.put(DeliveryEngineUI_ID.FTP_PASS, "Admin");
		//JMS Queue Variables
		QueuesString.put(DeliveryEngineUI_ID.JMS_CONNECTION_FACTORY, "TestConnectionFactory");
		QueuesString.put(DeliveryEngineUI_ID.JMS_QUEUE_NAME, "JMSQueue");
		QueuesString.put(DeliveryEngineUI_ID.JMS_USER, "Admin");
		QueuesString.put(DeliveryEngineUI_ID.JMS_PASS, "Admin");
		QueuesString.put(DeliveryEngineUI_ID.JMS_CORRELATIONFIELD, "test");
		QueuesString.put(DeliveryEngineUI_ID.JMS_MESSAGEFIELD, "250");
		QueuesString.put(DeliveryEngineUI_ID.JMS_MESSAGELIST, "object");//bytes and object are accepted
		System.out.println("QueuesString is :"+QueuesString.size());
		if(applicationAvailable == true)
		{
			//Calls the CreateQueue function by passing the Queue name,Queue Type and above Variables 
			CreateQueues.CreateQueue("FTPQueue","FTP",QueuesBoolean, QueuesString);			
		}
		b.closeBrowser();
		}
	}

