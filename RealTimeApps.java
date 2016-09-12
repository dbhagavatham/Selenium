package com.hp.exstream.qa.realtimeApps;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.DeliveryEngineUI_ID;
import com.hp.exstream.qa.commonlib.MessageBox;


public class RealTimeApps {
	MessageBox msgbox = new MessageBox();
	public static DeliveryEngineApp commandCenter = new DeliveryEngineApp();
	
	public static String NEW_RTAPP_DESC = "a";
	public static String NEW_RTAPP_STARTUPTYPE = "b";
	public static String NEW_RTAPP_ENGINE = "c";	
	public static String NEW_RTAPP_PACKAGE_EXP ="d";
	public static String NEW_RTAPP_ENGINE_CUSTOM_SWITCH_EXP ="e";
	public static String NEW_RTAPP_POOL_ENGINES ="f";
	public static String NEW_RTAPP_POOL_ENGINE_ERROR_LEVEL ="i";
	public static String NEW_RTAPP_POOL_RESTART_ENGINE_MAX_COUNT ="l";
	public static String NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_COUNT ="m";
	public static String NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_AGE ="n";
	public static String EDIT_RTAPP_DESC = "aa";
	public static String EDIT_RTAPP_STARTUPTYPE = "bb";
	public static String EDIT_RTAPP_ENGINE = "cc";	
	public static String EDIT_RTAPP_PACKAGE_EXP ="dd";
	public static String EDIT_RTAPP_ENGINE_CUSTOM_SWITCH_EXP ="ee";
	public static String EDIT_RTAPP_POOL_ENGINES ="ff";
	public static String EDIT_RTAPP_POOL_ENGINE_ERROR_LEVEL ="ii";
	public static String EDIT_RTAPP_POOL_RESTART_ENGINE_MAX_COUNT ="ll";
	public static String EDIT_RTAPP_POOL_ARCHIVE_ENGINE_MAX_COUNT ="mm";
	public static String EDIT_RTAPP_POOL_ARCHIVE_ENGINE_MAX_AGE ="nn";
	
	boolean flag = false; 
	
	public void NewRTApp (String RtappType,String RtAppname,boolean ArchPkgChk,boolean RestartEnginechk,boolean ArchEngDirChk, Map<String, String > RTappvariablesList) throws InterruptedException
	
	{	
		DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.REAL_TIME_APPS");
		DeliveryEngineApp.selectLeftMenuItem("DeliveryEngineApp.LeftMenuNavigation.REALTIME_NEW");	
		if(RtappType == "Managed")
		{
			DeliveryEngineApp.driver.findElement(By.xpath("//span  [@id='"+DeliveryEngineUI_ID.NEW_RTAPP_TYPE_MANAGED+"']")).click();
			DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_TYPE_CONTINUE+"")).click();
		}	
			else{
				DeliveryEngineApp.driver.findElement(By.xpath("//span  [@id='"+DeliveryEngineUI_ID.NEW_RTAPP_TYPE_NOTMANAGED+"']")).click();
				DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_TYPE_CONTINUE+"")).click();
			}	
		setRTAppProperties(RtappType,RtAppname,ArchPkgChk,RestartEnginechk,ArchEngDirChk,RTappvariablesList);
	}

	private void setRTAppProperties(String RtappType,String RtAppname,Boolean ArchPkgChk,Boolean RestartEnginechk,Boolean ArchEngDirChk,Map<String, String> variablesList) throws InterruptedException
	{
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_NAME+"")).sendKeys(RtAppname);
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_DESC+"")).sendKeys(variablesList.get(NEW_RTAPP_DESC));
		Select select = new Select(DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_STARTUPTYPE+"")));
		select.selectByVisibleText(variablesList.get(NEW_RTAPP_STARTUPTYPE));
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_PACKAGE_BUTTON+"")).click();
		Select select2 = new Select(DeliveryEngineApp.driver.findElement(By.xpath("//*[@id='"+DeliveryEngineUI_ID.NEW_RTAPP_PACKAGE_LIST+"']")));
		select2.selectByVisibleText(variablesList.get(NEW_RTAPP_PACKAGE_EXP));
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.APPLICATION_WINDOW_OK+"")).click();
			if (ArchPkgChk == true)
			{
				DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_ARCHIVE_PACKAGE_CHKBOX+"")).click();
			}
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_ENGINE_CUSTOM_SWITCH+"")).sendKeys(variablesList.get(NEW_RTAPP_ENGINE_CUSTOM_SWITCH_EXP));
			if (RestartEnginechk == true)
			{
				System.out.println("RTAPP RESTART ENGINE AUTO CHKBOX Enabled ");
			}
			if (ArchEngDirChk == true)
			{
				System.out.println("RTAPP Archive CHKBOX Enabled ");
			}
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_RESTART_ENGINE_MAX_COUNT+"")).clear();
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_RESTART_ENGINE_MAX_COUNT+"")).sendKeys(variablesList.get(NEW_RTAPP_POOL_RESTART_ENGINE_MAX_COUNT));
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_COUNT+"")).clear();
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_COUNT+"")).sendKeys(variablesList.get(NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_COUNT));
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_AGE+"")).clear();
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_AGE+"")).sendKeys(variablesList.get(NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_AGE));
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_SAVE_BUTTON+"")).click();
		
		if(msgbox.isExists() == true)
		{
			System.out.println(msgbox.getText());
			msgbox.dismiss();
			DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_CANCEL_BUTTON+"")).click();
		}
		else
		{				
			System.out.println(RtAppname +"RealTimeApp created Sucessfully");			
		} 
	}
	public void UpdateRTApp(String RtAppname,Boolean ArchPkgChk,Boolean RestartEnginechk,Boolean ArchEngDirChk,Map<String, String> variablesList)
	{
		variablesList.values();
		String MessageText = "abc";
		DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.REAL_TIME_APPS");
		commandCenter.editItemFromTable(RtAppname);
		System.out.println("this Meassage is:" + MessageText);
		MessageText = DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_DESC+"")).getAttribute("value");
		System.out.println("this Meassage is:" + MessageText);
		if (MessageText != null)
		{
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_DESC+"")).clear();	
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_DESC+"")).sendKeys(variablesList.get(EDIT_RTAPP_DESC));
		}
		Select select = new Select(DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_STARTUPTYPE+"")));
		select.selectByVisibleText(variablesList.get(EDIT_RTAPP_STARTUPTYPE));
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_PACKAGE_BUTTON+"")).click();
		Select select1 = new Select(DeliveryEngineApp.driver.findElement(By.xpath("//*[@id='"+DeliveryEngineUI_ID.NEW_RTAPP_PACKAGE_LIST+"']")));
		select1.selectByVisibleText(variablesList.get(EDIT_RTAPP_PACKAGE_EXP));
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.APPLICATION_WINDOW_OK+"")).click();
		
		if (ArchPkgChk == true)
		{
			DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_ARCHIVE_PACKAGE_CHKBOX+"")).click();
		}
		DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_ENGINE_CUSTOM_SWITCH+"")).clear();
	DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_ENGINE_CUSTOM_SWITCH+"")).sendKeys(variablesList.get(EDIT_RTAPP_ENGINE_CUSTOM_SWITCH_EXP));
		if (RestartEnginechk == true)
		{
			System.out.println("RTAPP RESTART ENGINE AUTO CHKBOX Enabled ");
		}
		if (ArchEngDirChk == true)
		{
			System.out.println("RTAPP Archive CHKBOX Enabled ");
		}
	DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_RESTART_ENGINE_MAX_COUNT+"")).clear();
	DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_RESTART_ENGINE_MAX_COUNT+"")).sendKeys(variablesList.get(EDIT_RTAPP_POOL_RESTART_ENGINE_MAX_COUNT));
	DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_COUNT+"")).clear();
	DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_COUNT+"")).sendKeys(variablesList.get(EDIT_RTAPP_POOL_ARCHIVE_ENGINE_MAX_COUNT));
	DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_AGE+"")).clear();
	DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_AGE+"")).sendKeys(variablesList.get(EDIT_RTAPP_POOL_ARCHIVE_ENGINE_MAX_AGE));
	DeliveryEngineApp.driver.findElement(By.id(""+DeliveryEngineUI_ID.NEW_RTAPP_SAVE_BUTTON+"")).click();
	}
	public void SearchRTApp(String RtAppname)
	{
		DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.REAL_TIME_APPS");
		commandCenter.searchItemFromTable(RtAppname);	
	}
	public void DeleteRTApp(String RtAppname)
	{
		DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.REAL_TIME_APPS");
		commandCenter.deleteItemFromTable(RtAppname);	
	}
	public void ExportRTApp(String RtAppname)
	{
		DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.REAL_TIME_APPS");
		commandCenter.exportItemFromTable(RtAppname);	
	}
	public void ExportAllRTApp()
	{
		DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.REAL_TIME_APPS");
		DeliveryEngineApp.selectLeftMenuItem("DeliveryEngineApp.LeftMenuNavigation.REALTIME_EXPORTALL");	
	}
}
