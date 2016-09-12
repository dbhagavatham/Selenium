package com.hp.exstream.qa.JobPhases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hp.exstream.qa.bean.AddPhasesBean;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.DeliveryEngineUI_ID;

public class SecondComposition implements Phase{
	DeliveryEngineApp commandCenter = new DeliveryEngineApp();
	private AddPhasesBean fBean;
	public SecondComposition(AddPhasesBean firstCompositionBean){
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
		if(fBean.getAvailableFiles()!=null){
			Select Available = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_SC_PRE_SORT_COMP_LEFT)));
			commandCenter.selectOptions(Available, fBean.getAvailableFiles());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_SC_AVAILABLE_FILES_TORIGHT)).click();
		}	
		if(fBean.getSelectedFiles()!=null){
			System.out.println("in selected");
			Select Selected = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_SC_PRE_SORT_COMP_RIGHT)));
			commandCenter.selectOptions(Selected, fBean.getSelectedFiles());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_SC_SELECTED_FILES_TOLEFT)).click();
		}	
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_SC_PRE_SORT_COMP_RTNCODE)).click();
		Select select2 = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_SC_PRE_SORT_COMP_RTNCODE)));
		select2.selectByVisibleText(fBean.getRetcode());
		
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_SC_CUSTOM_SWITCHES)).sendKeys(fBean.getCustomSwitchExp());
	
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();
		DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.NEW_JOBDEF_SAVE_BUTTON)).click();
	}


}