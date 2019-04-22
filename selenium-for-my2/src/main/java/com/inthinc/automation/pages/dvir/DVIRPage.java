package com.inthinc.automation.pages.dvir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inthinc.automation.pages.CommonNav;

public class DVIRPage extends CommonNav {

	public DVIRPage(WebDriver driver) {
		super(driver);
	}
	
	public static 	WebElement startdate(){
		return element = webDriver.findElement(By.xpath("//*[@id='startDateAssets']"));
	}
	public static WebElement enddate(){
		return element = webDriver.findElement(By.xpath("//*[@id='endDateAssets']"));
	}
	public static WebElement selectvehicle(){
		
		return element = webDriver.findElement(By.xpath("/html/body/div/div/ui-view/ui-view/div/div/div[2]/div/div[2]/div[3]/div/div[1]/span"));
	}
	
	public static WebElement entervehicle(){
		
		return element = webDriver.findElement(By.xpath("/html/body/div[2]/input[1]"));
	}
	
    public static WebElement selectvehicledropdown(){
    	
    	return element = webDriver.findElement(By.xpath("/html/body/div[2]/ul/li/div[3]/span/div/span"));
    }

    public static WebElement findbutton(){
    	return element = webDriver.findElement(By.xpath("/html/body/div/div/ui-view/ui-view/div/div/div[2]/div/div[2]/div[7]/button[1]"));
    }
    

}

