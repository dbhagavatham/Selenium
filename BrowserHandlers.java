//*****************************************************  General Information ****************************************
// Name of the Author : Jagan Malla
// Name of the Class : BrowserHandlers
// Purpose of the Class : This class will contain all common generic functions related to browser handlers.
// Date Created : Jul 27, 2016
// Last Date Updated : Jul 29, 2016
// Last updated By: Jagan
// Reviewed By : Jagan
// Last Reviewed Date : Jul 29,2016
//*******************************************************************************************************************


//********************************************************  packages ************************************************
package com.hp.exstream.qa.commonlib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



//****************************************************  Class Information ********************************************

public class BrowserHandlers 
{
	//****************************************************  Method Information ********************************************
	// Name of the Method : invokeBrowser
	// Purpose of the Method : This Method will invoke the browser based on request.
	// Input : call this method by passing argument as "common.Browser.{BrowserName}"
	// Output : No Return Value
	//*********************************************************************************************************************
	
	public static class Browsers
	{
		
		public static final int FIREFOX = 1;
		public static final int IE = 3;
		public static final int CHROME = 2;
		
	}
	
	/**
	 * 
	 * @param browserType 
	 */
	public void invokeBrowser(int browserType, String browserDriverPath)
	{
		DesiredCapabilities capabilities;
		switch(browserType)
		{
			case Browsers.FIREFOX:
				DeliveryEngineApp.driver = new FirefoxDriver();
				break;
			case Browsers.CHROME:
				System.setProperty("webdriver.chrome.driver",browserDriverPath);
				DeliveryEngineApp.driver = new ChromeDriver();				
				break;
			case Browsers.IE:
				System.setProperty("webdriver.ie.driver",browserDriverPath);
				capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				DeliveryEngineApp.driver =  new InternetExplorerDriver(capabilities);
				break;
			default:
				System.setProperty("webdriver.ie.driver",browserDriverPath);
				capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				DeliveryEngineApp.driver =  new InternetExplorerDriver(capabilities);
				break;
		}
		DeliveryEngineApp.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		DeliveryEngineApp.driver.manage().window().maximize(); 
	}
	//****************************************************  Method Information ********************************************
	// Name of the Method : closeBrowser
	// Purpose of the Method : This Method will close the browser based on request.
	// Input : It will close current active browser.
	// Output : No Return Value
	//*********************************************************************************************************************
	public void closeBrowser()
	{
		DeliveryEngineApp.driver.close();
	}
	
	/**
	 * 
	 * @return true if driver is alive else false
	 */
	
	public boolean isDeliveryEngineSessionExpired()
	{
		boolean flag = false;
		System.out.println("url is :"+DeliveryEngineApp.driver.getTitle());	  
		
        //
        try{
        	if(DeliveryEngineApp.driver.getTitle().equals("HP Exstream Command Center"))
    		{
    			System.out.println("test in");
    			DeliveryEngineApp.menuSelection("App.MenuNavigation.JOBS");
    			if(DeliveryEngineApp.msgbox.isExists() == true)
    			{
    				DeliveryEngineApp.msgbox.dismiss();
    				flag = true;
    			}    			
    		}
        }
        catch (Exception e) {
        	DeliveryEngineApp.menuSelection("App.MenuNavigation.JOB_DEFINITIONS");
			if(DeliveryEngineApp.msgbox.isExists() == true)
			{
				DeliveryEngineApp.msgbox.dismiss();
				flag = true;
			}
			else
			{
				flag = false;
			}
		}
        return flag;
	}
}


