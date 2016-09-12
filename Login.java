//*****************************************************  General Information ****************************************
// Name of the Author : Jagan Malla
// Name of the Class : Login
// Purpose of the Class : This class will contain all the function related to Command Center application Login.
// Date Created : Jul 27, 2016
// Last Date Updated : Jul 29, 2016
// Last updated By: Jagan
// Reviewed By : Jagan
// Last Reviewed Date : Jul 29,2016
//*******************************************************************************************************************


//********************************************************  packages ************************************************

package com.hp.exstream.qa.commonlib;
import org.openqa.selenium.By;

//****************************************************  Class Information ********************************************
public class Login
{
	//****************************************************  Method Information ********************************************
	// Name of the Method : invokeBrowser
	// Purpose of the Method : This Method will invoke the browser based on request.
	// Input : call this method by passing argument as "common.Browser.{BrowserName}"
	// Output : No Return Value
	//*********************************************************************************************************************	
	private boolean setLoginCredentials(String UserName, String Password)
	{
		boolean flag = false;
		if (DeliveryEngineApp.isDeliveryManagerExists() == true)
		{
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LOGIN_USERNAME)).sendKeys(UserName);
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LOGIN_PASSWORD)).sendKeys(Password);
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LOGIN_OK)).click();
			flag = true;
		}
		else{
			flag = false;
			// Do Nothing...
		}
		return flag;
	}
	
	public boolean invokeApplication(String URL, String userName, String passWord)
	{
		boolean flag = false;
		DeliveryEngineApp.driver.get(URL);
		if(setLoginCredentials(userName,passWord)== true)
		{
			String pageTitle = DeliveryEngineApp.driver.getTitle();
			System.out.println("Page title is " +pageTitle);			
			flag = true;
		}
		else
		{
			System.out.println("Delivery Engine Application not found");
		}
		return flag;
	}
	
	public void setDefaultBaseState()
	{
		DeliveryEngineApp.driver.quit();		
		
	}
	

	
}
