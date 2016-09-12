package com.hp.exstream.qa.deliveryQueues;
import com.hp.exstream.qa.commonlib.BrowserHandlers.Browsers;
import com.hp.exstream.qa.commonlib.GlobalConst;
import com.hp.exstream.qa.commonlib.Login;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.BrowserHandlers;

 public class DeleteQueues{
	 
 public static void main(String[] args) {
		BrowserHandlers b = new BrowserHandlers();
		boolean applicationAvailable;
		b.invokeBrowser(Browsers.CHROME, GlobalConst.BrowserDriversPath.CHROME_DRIVER_PATH);
		Login deLogin = new Login();
		DeliveryEngineApp commandcenter = new DeliveryEngineApp();
		applicationAvailable = deLogin.invokeApplication("http://localhost:8081/cc-webgui/app","admin","admin");
		if(applicationAvailable == true)
		{
			DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.DELIVERY_QUEUES");
			//Delete the Queue By providing the Queue name as parameter for "deleteItemFromTable"
			commandcenter.deleteItemFromTable("JMSQueue");
							
		}
		b.closeBrowser();
	}
 
	
}
