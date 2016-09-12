package com.hp.exstream.qa.schedule;


import com.hp.exstream.qa.commonlib.BrowserHandlers.Browsers;

import com.hp.exstream.qa.commonlib.GlobalConst;
import com.hp.exstream.qa.commonlib.Login;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.BrowserHandlers;

//Deleting Schedule	 

public class DeleteClass{
		 
	 public static void main(String[] args) {
			BrowserHandlers b = new BrowserHandlers();
			boolean applicationAvailable;
			b.invokeBrowser(Browsers.CHROME, GlobalConst.BrowserDriversPath.CHROME_DRIVER_PATH);
			Login deLogin = new Login();
			DeliveryEngineApp commandcenter = new DeliveryEngineApp();
			applicationAvailable = deLogin.invokeApplication("http://localhost:8081/cc-webgui/app","admin","admin");
			if(applicationAvailable == true)
			{
				DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.SCHEDULES");
				
				commandcenter.deleteItemFromTable("TestSelenium");// Delete the schedule name 
								
			}
			b.closeBrowser();
		}
	 
		
	}


