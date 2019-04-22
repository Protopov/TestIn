package com.inthinc.automation.pages.assets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inthinc.automation.BaseTest;
import com.inthinc.automation.pages.CommonNav;
import com.paulhammant.ngwebdriver.ByAngular;

public class Trailerpage extends CommonNav {

	public Trailerpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
 public static WebElement trailer_bt(){
	 return element = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/ul/li[4]/a"));
 }
 public static WebElement add_bt(){
	 return element = webDriver.findElement(By.xpath("//*[@id='detail']/form/div/button"));
 }
 public static WebElement trailer_name(){
	 return element = webDriver.findElement(By.xpath("//*[@id='name']"));
 }
 public static WebElement trailer_vin(){
	 return element = webDriver.findElement(By.xpath("//*[@id='vin']"));
 }
 public static WebElement save_bt(){
	 return element = webDriver.findElement(By.xpath("//*[@id='detail']/form/div/button[1]"));
 }
 public static WebElement searchfield(){
	 return element = webDriver.findElement(By.xpath("//*[@id='globalFilter']"));
 }
 public static WebElement trailerpath(){
	 return element = webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div/div/div/div/div/div/div"));
 }
 public static WebElement editbutton(){
	 return element = webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[2]/div/form/div/button[1]"));
 }
 public static WebElement makefield(){
	 return element = webDriver.findElement(By.xpath("//*[@id='make']"));
 }
 public static WebElement saveafteredit(){
	 return element = webDriver.findElement(By.xpath("//*[@id='detail']/form/div/button[1]"));
 }
 public static WebElement deletetrailer(){
	 return element = webDriver.findElement(By.xpath("//*[@id='detail']/form/div/button[2]"));
 }
 public static WebElement confirmdelete(){
	 return element = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]"));
 }
 
	
}
