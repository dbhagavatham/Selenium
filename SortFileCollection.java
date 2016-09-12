package com.hp.exstream.qa.JobPhases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hp.exstream.qa.bean.AddPhasesBean;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.DeliveryEngineUI_ID;

public class SortFileCollection implements Phase{
	DeliveryEngineApp commandCenter = new DeliveryEngineApp();
	private AddPhasesBean fBean;
	public SortFileCollection(AddPhasesBean firstCompositionBean){
		this.fBean = firstCompositionBean;
	}
	@Override
	public void execute() {
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_LINK)).click();
		Select select = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_TYPE)));
		select.selectByVisibleText(fBean.getPhasetype());
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_NAME)).sendKeys(fBean.getphaseName());
		
		if (fBean.isSavetosharedPhase() == true)
		{
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_SAVETO_SHAREDPHASE_CHKBOX)).click();
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_SAVETO_SHAREDPHASE_NAME)).sendKeys(fBean.getSharedphasename());	
		}
		
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.REALTIMEPHASE_NAME)).sendKeys(fBean.getphaseName());
		if(fBean.getAvailableFiles()!=null){
			Select select1 = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.PRESORTCOMPOSITIONLEFT)));
			commandCenter.selectOptions(select1,fBean.getAvailableFiles());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CCCPTORIGHT)).click();
		}
		
		if(fBean.getSelectedFiles()!=null){
			Select select2 = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.PRESORTCOMPOSITIONRIGHT)));
			commandCenter.selectOptions(select2, fBean.getSelectedFiles());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CCCPTOLEFT)).click();

		}
	
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();
		DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.NEW_JOBDEF_SAVE_BUTTON)).click();
	}


}
