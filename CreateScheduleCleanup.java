package com.hp.exstream.qa.schedule;

import com.hp.exstream.qa.commonlib.BrowserHandlers;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.GlobalConst;
import com.hp.exstream.qa.commonlib.Login;
import com.hp.exstream.qa.commonlib.BrowserHandlers.Browsers;


public class CreateScheduleCleanup {

	public static class ScheduleTypes{
		public static final String ScheduleOnetime = "One-time";
		public static final String ScheduleRecurring = "Recurring";
		public static final String Others = "Others";
		public static final String ActionCleanupType ="Cleanup";
	}

//Creating Schedule
	public static void main(String[] args) {
		BrowserHandlers b = new BrowserHandlers();
		DeliveryEngineApp CreateSchedule = new DeliveryEngineApp();
		boolean applicationAvailable;
		b.invokeBrowser(Browsers.CHROME, GlobalConst.BrowserDriversPath.CHROME_DRIVER_PATH);
		Login deLogin = new Login();
		applicationAvailable = deLogin.invokeApplication("http://localhost:8081/cc-webgui/app","admin","admin");
		boolean checkboxStatus =  true;
		if(applicationAvailable == true)
		{
			CreateSchedule.newScheduleCreationCleanup("TestCreate9", "Recurring", "Cleanup", checkboxStatus);
		}
	}

}


