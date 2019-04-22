package com.inthinc.automation.pages.assets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inthinc.automation.pages.CommonNav;
import com.inthinc.automation.pages.enums.AssetsPageTab;
import com.paulhammant.ngwebdriver.ByAngular;

public class AssetsPage extends CommonNav {

	public AssetsPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement getTab(AssetsPageTab assetsTabsEnum) {

		String elementPath;
		switch (assetsTabsEnum) {
		case PEOPLE:
			elementPath = AssetsPageTab.PEOPLE.getXPATH();
			break;
		case VEHICLES:
			elementPath = AssetsPageTab.VEHICLES.getXPATH();
			break;
		case DEVICES:
			elementPath = AssetsPageTab.DEVICES.getXPATH();
			break;
		case TRAILERS:
			elementPath = AssetsPageTab.TRAILERS.getXPATH();
			break;
		case ZONES:
			elementPath = AssetsPageTab.ZONES.getXPATH();
			break;
		case PLACES:
			elementPath = AssetsPageTab.PLACES.getXPATH();
			break;
		default:
			elementPath = AssetsPageTab.PEOPLE.getXPATH();
			break;
		}
		element = webDriver.findElement(By.xpath(elementPath));
		System.out.println(element.getText());
		return element;
	}
	
	public static WebElement addPeople() {
		element = webDriver.findElement(ByAngular.buttonText("Add"));
		return element;
	}
	
	public static WebElement cancel() {
		element = webDriver.findElement(ByAngular.buttonText("Cancel"));
		return element;
	}
	public static WebElement first_name(){
		element = webDriver.findElement(By.xpath("//*[@id='first']"));
		return element;
		
	}
	public static WebElement last_name(){
		element = webDriver.findElement(By.xpath("//*[@id='last']"));
		return element;
		
	}
	public static WebElement empid(){
		element = webDriver.findElement(By.xpath("//*[@id='empid']"));
		return element;
		
	}
	public static Select timezone(){
		
		Select element = new Select(webDriver.findElement(By.xpath("//*[@id='tzID']")));
		return element;
		
	}
	public static Select timezone2(){
		Select element = new Select(webDriver.findElement(By.id("locale")));
		return element;
		
	}
	public static Select measurement(){
		Select element = new Select(webDriver.findElement(By.id("measureType")));
		return element;
		
	}
	public static WebElement driverinfo_c(){
		
		JavascriptExecutor js= (JavascriptExecutor)webDriver;
		js.executeScript("window.scrollBy(0,100)");
		element = webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div/form/uib-accordion/div/div[2]/div[1]/h4/a/span/div"));
		return element;
		
	}
	public static WebElement driverteam(){
		element = webDriver.findElement(By.xpath("//*[@id='dropdownMenu1']"));
		return element;
		
	}
	public static WebElement dropdown1() throws InterruptedException{
		Thread.sleep(1000);
		element = webDriver.findElement(By.xpath("//*[contains(@id, 'accordiongroup')]/div/div[2]/div/div/ul/li/a[contains(text(), 'PR TEST TEAM1')]"));
		return element;
		
	}
  	
	public static WebElement licence_bt(){
		element = webDriver.findElement(By.xpath("//*[@id='license']"));
		return element;
		}
	public static WebElement save_bt() throws InterruptedException{
		Thread.sleep(2000);
		element = webDriver.findElement(ByAngular.buttonText("Save"));
		return element;
	}
	
	public static WebElement search_colum(){
		element = webDriver.findElement(By.xpath("//*[@id='globalFilter']"));
		return element;
		
	}//*[@id="1548237730355-1-uiGrid-001M-cell"]/div/div/div
	public static WebElement click_cl() throws InterruptedException{
		Thread.sleep(2000);
		element = webDriver.findElement(By.xpath("//*[contains(@id, '-1-uiGrid-001M-cell')]/div/div/div"));
		return element;
	}
	public static WebElement row_clk(){
		return element = webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div/div/div/div"));
	}
	public static WebElement edit_clk(){
       element = webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[2]/div/form/div/button[1]"));
		return element;
		
	}
    public static WebElement driverinfo1_c(){
		
		JavascriptExecutor js= (JavascriptExecutor)webDriver;
		js.executeScript("window.scrollBy(0,100)");
		element = webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div/form/uib-accordion/div/div[2]/div[1]/h4/a/span/div"));
		return element;
		
	}
    public static WebElement changeinfo(){
    	return element = webDriver.findElement(By.xpath("//*[@id='title']"));
    }
    
    public static WebElement save_btt(){
    	return element = webDriver.findElement(By.xpath("//*[@id='detail']/form/div/button[1]"));
    }
    public static WebElement click_cl1() throws InterruptedException{
		Thread.sleep(2000);
		element = webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div/div/div/div"));
		return element;
		
	}
    public static WebElement delete_bt(){
    	element = webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[2]/div/form/div/button[2]"));
		return element;
    	
    }
    public static WebElement cofrmdelete(){
    	return element = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]"));
    }
    public static WebElement adminuser(){
    	return element = webDriver.findElement(By.xpath("//*[@id='isUser']"));
    }
    public static WebElement click_cl2() throws InterruptedException{
		Thread.sleep(2000);
		element = webDriver.findElement(By.xpath("//*[contains(@id, '-4-uiGrid-001M-cell')]/div/div/div"));
		return element;
		
	}
    public static WebElement user(){
    	JavascriptExecutor js= (JavascriptExecutor)webDriver;
		js.executeScript("window.scrollBy(0,100)");
    	element = webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div/form/uib-accordion/div/div[3]/div[1]/h4/a/span/div"));
		return element;  	
    }
    public static WebElement username1(){
    	element = webDriver.findElement(By.xpath("//*[@id='username']"));
		return element;
    }
    public static WebElement password2(){
    	element = webDriver.findElement(By.xpath("//*[@id='passwordReset']"));
		return element;  	
    }
    public static WebElement confirmmpass(){
    	element = webDriver.findElement(By.xpath("//*[@id='passwordCheck']"));
		return element;	
    }
    public static WebElement dropdown_group(){
    	element = webDriver.findElement(By.xpath("//*[@id='dropdownMenu4']"));
		return element;   	
    }
    public static WebElement select_group(){
    	element = webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div/form/uib-accordion/div/div[3]/div[2]/div/div[4]/div/div/ul/li[2]/a"));
		return element;	
    }
    public static Select select_roles(){
    	Select element = new Select(webDriver.findElement(By.id("roleID"))); 	
		return element;
    }
    public static WebElement notifications_clk(){
    	element = webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div/form/uib-accordion/div/div[4]/div[1]/h4/a/span/div"));
		return element;  	
    }
    public static WebElement emailid(){
    	return element = webDriver.findElement(By.xpath("//*[@id='priEmail']"));
    }
}
