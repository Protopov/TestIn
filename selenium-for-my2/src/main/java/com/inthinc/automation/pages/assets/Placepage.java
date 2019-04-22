package com.inthinc.automation.pages.assets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inthinc.automation.pages.CommonNav;

public class Placepage extends CommonNav{

	public Placepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
public static WebElement place_bt(){
	return element = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/ul/li[6]/a"));
}
public  static WebElement add_bt(){
	return element = webDriver.findElement(By.xpath("//*[@id='detail']/form/div/button"));
}
public static WebElement placename(){
	return element = webDriver.findElement(By.xpath("//*[@id='name']"));
}
public static WebElement streetname(){
	return element = webDriver.findElement(By.xpath("//*[@id='streetName']"));
}
public static WebElement cityname(){
	return element = webDriver.findElement(By.xpath("//*[@id='city']"));
}
public static WebElement save_bt(){
	return element = webDriver.findElement(By.xpath("//*[@id='detail']/form/div/button[1]"));
}
public static WebElement edit_bt(){
	return element = webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[2]/div/form/div/button[1]"));
}
public static WebElement searchfield(){
	return element = webDriver.findElement(By.xpath("//*[@id='globalFilter']"));
	
}
public static WebElement rowclick(){
	return element =webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div/div[1]/div/div/div/div/div"));
}
public static WebElement saveafteredit(){
	return element = webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[2]/div/form/div/button[1]"));
}

}
