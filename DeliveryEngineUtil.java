package com.hp.exstream.qa.commonlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DeliveryEngineUtil {

	public static WebElement findById(String id){
		return DeliveryEngineApp.driver.findElement(By.id(id));
	}
}
