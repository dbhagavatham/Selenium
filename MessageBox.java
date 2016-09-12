package com.hp.exstream.qa.commonlib;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class MessageBox {

	boolean flag = false; 
	
	public boolean isExists()
	{
		try{
			if((DeliveryEngineApp.driver.findElement(By.xpath("//*[@id='CCMessageBox']/div[9]")).isDisplayed()) ==  true)
			{
				flag = true;				
			}
			else
			{
				flag = false;
			}			
		}
		catch (NoSuchElementException e) {
			System.out.println("No Message Box exists");
		}
		return flag;
	}
	
	public void accept()
	{
		if(this.isExists()==true)
		{
			try {
						DeliveryEngineApp.driver.findElement(By.id("CCYesButton")).isDisplayed();
						DeliveryEngineApp.driver.findElement(By.id("CCYesButton")).click();						
				} catch (NoSuchElementException e) {
						System.out.println("CCYesButton not exists");						
				}
		}
	}
	
	public String getText()
	{
		String MessageText = "Message Text :";
		if(this.isExists()==true)
		{
			MessageText = MessageText+DeliveryEngineApp.driver.findElement(By.xpath("//*[@id='CCMessageBox']")).getText();
		}
		else
		{
			System.out.println("No Message Box exists");
			
		}
		return MessageText;
	}
	
	public void dismiss() 
	{
		if(this.isExists()==true)
		{
			try {
					DeliveryEngineApp.driver.findElement(By.id("CCCOMMAND_OK")).isDisplayed();
					DeliveryEngineApp.driver.findElement(By.id("CCCOMMAND_OK")).click();					
				} catch (NoSuchElementException e) {
					System.out.println("CCCOMMAND_OK not exists");					
				}			
		}
		else
		{
			try {
					DeliveryEngineApp.driver.findElement(By.id("CCNoButton")).isDisplayed();
					DeliveryEngineApp.driver.findElement(By.id("CCNoButton")).click();
			} catch (NoSuchElementException e) {
				System.out.println("CCNoButton not exists");
			}
		}
	}
}
