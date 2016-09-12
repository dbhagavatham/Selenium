package com.hp.exstream.qa.schedule;


import org.openqa.selenium.support.ui.Select;

import com.hp.exstream.qa.bean.ScheduleBean;
import com.hp.exstream.qa.commonlib.BrowserHandlers;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.GlobalConst;
import com.hp.exstream.qa.commonlib.Login;
import com.hp.exstream.qa.commonlib.BrowserHandlers.Browsers;


//Updating Schedule

public class UpdateSchedule {
	
		


	public static void main(String[] args) {
		
		BrowserHandlers b = new BrowserHandlers();
		boolean applicationAvailable;
		b.invokeBrowser(Browsers.CHROME, GlobalConst.BrowserDriversPath.CHROME_DRIVER_PATH);
		Login deLogin = new Login();
		applicationAvailable = deLogin.invokeApplication("http://localhost:8081/cc-webgui/app","admin","admin");
		DeliveryEngineApp commandcenter = new DeliveryEngineApp();
		boolean checkboxStatus =  true;
		
		ScheduleBean schedule = new ScheduleBean();
		schedule.setJobState(new String[]{"FINISHED"});
		schedule.setSrcjobState(null);
		schedule.setTargetjobDefinition(new String[]{"Sample Normal One Step","Sample One Step RT"});
		schedule.setSrcjobDefinition(new String[]{"Sample Custom Delivery"});
		schedule.setXmlContent("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
						+ "<action xmlns=\"http://www.hp.com/go/exstream/schema/cc-actions\">"
						+ "<type>123</type>"
						+ "</action>");
		
		
		if(applicationAvailable == true)
		{
			DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.SCHEDULES");
			
			commandcenter.updateScheduleCleanup("TestCreate4",checkboxStatus,schedule);
							
		}
		b.closeBrowser();

	}
	
	
	public void selectOptions(Select select, String[] input){
		for (int i = 0; i < input.length; i++) {
			select.selectByVisibleText(input[i]);
		}
	}
}


