package com.hp.exstream.qa.JobPhases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hp.exstream.qa.bean.AddPhasesBean;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.DeliveryEngineUI_ID;

public class FileManagement implements Phase{
	DeliveryEngineApp commandCenter = new DeliveryEngineApp();
	private AddPhasesBean fBean;
	public FileManagement(AddPhasesBean firstCompositionBean){
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
		
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_FM_ADD_OPERATION)).click();
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_FM_ADD_OPR_ACTION_TYPE)).click();
		
		if(fBean.getActionOnFileOrFolder() == "Move")
		{
			System.out.println("Hi insideloop");
		Select select1 = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_FM_ADD_OPR_ACTION_TYPE)));
		select1.selectByVisibleText(fBean.getActionOnFileOrFolder());
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_FM_ADD_OPR_FILE_SOURCE)).sendKeys(fBean.getFileOrFolderNameExp());
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_FM_ADD_OPR_FILE_DEST)).sendKeys(fBean.getMoveto());
		}
		
		if(fBean.getActionOnFileOrFolder() == "Copy")
		{
			System.out.println("Hi insideloop copy");
		Select select1 = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_FM_ADD_OPR_ACTION_TYPE)));
		select1.selectByVisibleText(fBean.getActionOnFileOrFolder());
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_FM_ADD_OPR_FILE_SOURCE)).sendKeys(fBean.getFileOrFolderNameExp());
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_FM_ADD_OPR_FILE_DEST)).sendKeys(fBean.getCopyto());
		}
		
		if(fBean.getActionOnFileOrFolder() == "Delete")
		{
			System.out.println("Hi insideloop Delete");
		Select select1 = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_FM_ADD_OPR_ACTION_TYPE)));
		select1.selectByVisibleText(fBean.getActionOnFileOrFolder());
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_FM_ADD_OPR_FILE_SOURCE)).sendKeys(fBean.getFileOrFolderNameExp());
		}

		
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();
		DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.NEW_JOBDEF_SAVE_BUTTON)).click();
	}


}