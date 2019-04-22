package com.inthinc.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginvalidation extends BasePage {
	
	public Loginvalidation(WebDriver driver) {
		super(driver);
	}
	
	public WebElement username(){
		
		return element = webDriver.findElement(By.xpath("//*[@id='username']"));	
		
	}

	public WebElement password(){
		
		return element = webDriver.findElement(By.xpath("//*[@id='password']"));
	}

    
}
