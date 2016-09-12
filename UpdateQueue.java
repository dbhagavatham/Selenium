package com.hp.exstream.qa.deliveryQueues;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;

import com.hp.exstream.qa.commonlib.BrowserHandlers;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.DeliveryEngineUI_ID;
import com.hp.exstream.qa.commonlib.GlobalConst;
import com.hp.exstream.qa.commonlib.Login;
import com.hp.exstream.qa.commonlib.BrowserHandlers.Browsers;


public class UpdateQueue {

	public static Map<String,String> QueuesString=new HashMap<String,String>();
	public static Map<String,Boolean> QueuesBoolean=new HashMap<String,Boolean>();
	public static void main(String[] args) {
		BrowserHandlers b = new BrowserHandlers();
		boolean applicationAvailable;
		b.invokeBrowser(Browsers.CHROME, GlobalConst.BrowserDriversPath.CHROME_DRIVER_PATH);
		Login deLogin = new Login();
		DeliveryEngineApp updateQueue = new DeliveryEngineApp();
		applicationAvailable = deLogin.invokeApplication("http://localhost:8081/cc-webgui/app","admin","admin");
		//Variables need to pass through UpdateQueue function
		//Common Boolean Type Variable
		QueuesBoolean.put(DeliveryEngineUI_ID.VARIABLE_OVERWRITECHECKBOX, false);
		QueuesBoolean.put(DeliveryEngineUI_ID.VARIABLE_SIGNALFILE, true);
		//JMS Queue
		QueuesBoolean.put(DeliveryEngineUI_ID.JMS_REAL_QUEUE, true);
		
		System.out.println("QueuesBoolean is :"+QueuesBoolean.size());
		//Common Variables
		QueuesString.put(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION, "jms queue description with JNDI");
		QueuesString.put(DeliveryEngineUI_ID.VARIABLE_PATH, "${cc_root}/tmp");
		QueuesString.put(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP,"12346.txt" );
		QueuesString.put(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD, "*.pdf");
		//LPR Queue Variables
		QueuesString.put(DeliveryEngineUI_ID.LPR_QUEUEFIELD,"lpr test");
		QueuesString.put(DeliveryEngineUI_ID.LPR_HOSTNAME,"Localhost");
		QueuesString.put(DeliveryEngineUI_ID.LPR_PORT,"51515");
		
		//FTP Queue Variables
		QueuesString.put(DeliveryEngineUI_ID.FTP_HOST,"ConnectionFactory");
		QueuesString.put(DeliveryEngineUI_ID.FTP_PORT,"21212");
		QueuesString.put(DeliveryEngineUI_ID.FTP_USER,"Admin");
		QueuesString.put(DeliveryEngineUI_ID.FTP_PASS,"Admin");

		//JMS Queue Variables
		QueuesString.put(DeliveryEngineUI_ID.JMS_CONNECTION_FACTORY,"ConnectionFactory");
		QueuesString.put(DeliveryEngineUI_ID.JMS_QUEUE_NAME,"JMSQueueexp");
		QueuesString.put(DeliveryEngineUI_ID.JMS_USER,"admin");
		QueuesString.put(DeliveryEngineUI_ID.JMS_PASS,"admin");
		QueuesString.put(DeliveryEngineUI_ID.JMS_CORRELATIONFIELD,"test");
		QueuesString.put(DeliveryEngineUI_ID.JMS_MESSAGEFIELD,"250");
		QueuesString.put(DeliveryEngineUI_ID.JMS_MESSAGELIST,"bytes");//bytes and object are accepted
		System.out.println("QueuesString is :"+QueuesString.size());
		if(applicationAvailable == true)
		{
			DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.DELIVERY_QUEUES");
			DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.VARIABLE_DELIVERY_QUEUE_LIST)).click();
			//Calls the UpdateQueue function by passing the Queue name and above Variables 
			updateQueue.UpdateQueue("JMSQueue", QueuesBoolean, QueuesString);		
		}
		b.closeBrowser();
	}

}