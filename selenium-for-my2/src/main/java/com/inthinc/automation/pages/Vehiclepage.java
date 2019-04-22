package com.inthinc.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inthinc.automation.pages.enums.AssetsPageTab;

public class Vehiclepage extends CommonNav {
	
	public Vehiclepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement vehicle_bt(){
		
		return element = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/ul/li[2]/a"));
	}

	public static WebElement add_bt(){
		element = webDriver.findElement(By.xpath("//*[@id=\"detail\"]/form/div/button"));
		return element;		
	}
	public static WebElement search_vehicle(){
		
		return element = webDriver.findElement(By.xpath("//*[@id=\"dropdownMenu2\"]"));
	}

	public static WebElement dropdown(){
		
		return element = webDriver.findElement(By.xpath(("//*[contains(@id, 'accordiongroup')]/div/div[1]/div/div/ul/li[3]/a")));
	}
	public static WebElement vehicle_id(){
		return element = webDriver.findElement(By.xpath("//*[@id=\"name\"]"));
	}
	public static WebElement status_field(){
		return element = webDriver.findElement(By.xpath("//*[@id='status']"));
	}
	public static WebElement vin_id(){
		return element = webDriver.findElement(By.xpath("//*[@id='vin']"));
	}
	public static WebElement make_field(){
		return element = webDriver.findElement(By.xpath("//*[@id='make']"));
	}
	public static WebElement model_field(){
		return element = webDriver.findElement(By.xpath("//*[@id='model']"));
	}
	public static WebElement year_field(){
		return element = webDriver.findElement(By.xpath("//*[@id='year']"));
	}
	public static WebElement save_bt(){
		return element = webDriver.findElement(By.xpath("//*[@id='detail']/form/div/button[1]"));
	}
	public static WebElement edit_bt(){
		return element = webDriver.findElement(By.xpath("//html/body/div/div[3]/div/div/div/div[2]/div/form/div/button[1]"));
	}
	public static WebElement vehiclepath(){
		return element = webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div/div/div/div/div/div/div"));
	}
	public static WebElement search_field(){
		return element = webDriver.findElement(By.xpath("//*[@id='globalFilter']"));
	}
	public static WebElement delete_bt(){
		return element = webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[2]/div/form/div/button[2]"));
	}
	public static WebElement confirmdelete_bt(){
		return element = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]"));
	}
	public static WebElement saveafteredit(){
		return element = webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[2]/div/form/div/button[1]"));
	}

}

