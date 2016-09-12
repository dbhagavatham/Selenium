package com.hp.exstream.qa.JobPhases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hp.exstream.qa.bean.ScheduleBean;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.DeliveryEngineUI_ID;
import com.hp.exstream.qa.schedule.CreateScheduleCleanup.ScheduleTypes;

public class Schedule implements Phase {

	ScheduleBean schedule;


	public Schedule(ScheduleBean schedule){
		this.schedule = schedule;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		switch(schedule.getActionType()){	

		case ScheduleTypes.ActionCleanupType:
			doCleanUpUpdate(schedule);
			break;

		case ScheduleTypes.Others:
			doOthers(schedule);
			break;

		}
	}

	public ScheduleBean getSchedule() {
		return schedule;
	}

	public void setSchedule(ScheduleBean schedule) {
		this.schedule = schedule;
	}


	public void doCleanUpUpdate(ScheduleBean schedule){

		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.ADD_REMOVE_JOBDEF_SCHEDULE)).click();

		if(schedule.getTargetjobDefinition()!=null){
			Select RemoveJD = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SELECTED_JOBDEF)));
			selectOptions(RemoveJD, schedule.getTargetjobDefinition());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECTED_JOBDEFTOLEFT)).click();
		}

		if(schedule.getSrcjobDefinition()!=null){
			Select select = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SCHEDULE_JOBDEFLIST)));
			selectOptions(select, schedule.getSrcjobDefinition());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CCJDTORIGHT)).click();
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JOBDEF_WINDOW_SAVE)).click();
		}
		//Selecting Job state for schedule

		if(schedule.getJobState()!=null){
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.ADD_REMOVE_JOBSTATES)).click();
			Select RemoveJDState = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SELECTED_JOBSTATE)));
			selectOptions(RemoveJDState, schedule.getJobState());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SCHEDULE_JOBSTATETOLEFT)).click();

		}

		if(schedule.getSrcjobState()!=null){
			Select selectJobStatus = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SCHEDULE_JOBSTATE_LIST)));
			selectOptions(selectJobStatus, schedule.getSrcjobState());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JDSTATETORIGHT)).click();

			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JOBDEF_WINDOW_SAVE)).click();
		}

		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();
	}

	public void doOthers(ScheduleBean schedule){

		DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.ACTIONTYPE_XMl)).clear();
		DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.ACTIONTYPE_XMl)).sendKeys(schedule.getXmlContent());
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();

	}

	public void selectOptions(Select select, String[] input){
		for (int i = 0; i < input.length; i++) {
			select.selectByVisibleText(input[i]);
		}
	}

}
