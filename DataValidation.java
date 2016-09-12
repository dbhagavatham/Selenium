package com.hp.exstream.qa.JobPhases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hp.exstream.qa.bean.AddPhasesBean;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.DeliveryEngineUI_ID;

public class DataValidation implements Phase{
	DeliveryEngineApp commandCenter = new DeliveryEngineApp();
	private AddPhasesBean fBean;
	public DataValidation(AddPhasesBean firstCompositionBean){
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
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_DATAVAL_ADDVAL)).click();
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_DATAVAL_ADDVAL_FILEPATH)).sendKeys(fBean.getDatafilepathExp());
			if(fBean.getValidationType() == "Timestamp")
			{
				System.out.println("Hi insid If eloop copy");
				Select select1 = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_DATAVAL_ADDVAL_VALTYPE)));
				select1.selectByVisibleText(fBean.getValidationType());
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_DATAVAL_ADDVAL_TIMESTAMP_CHEKSUM_CHKBOX)).click();
			}
			else
			{
				System.out.println("Hi insideloop else copy");
				Select select1 = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_DATAVAL_ADDVAL_VALTYPE)));
				select1.selectByVisibleText(fBean.getValidationType());
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JOBDEF_ADD_PHASE_DATAVAL_ADDVAL_VALTEXT)).sendKeys(fBean.getValidationTextExp());
			}
			if(fBean.isActionOnErrContn() == true)
			{
			System.out.println("Its Default val");
			}
			if(fBean.isActionOnErrStop() == false)
			{
				System.out.println("Its Default val");
			}
		
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();
		DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.NEW_JOBDEF_SAVE_BUTTON)).click();
	}


}