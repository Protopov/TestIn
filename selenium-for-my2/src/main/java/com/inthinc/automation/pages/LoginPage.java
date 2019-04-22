package com.inthinc.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inthinc.automation.pages.enums.PortalNavBarTab;

public class LoginPage extends PortalNav{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement username() {

		element = webDriver.findElement(By.xpath("//*[@id='username']"));
		return element;

	}

	public static WebElement password() {

		return element = webDriver.findElement(By.xpath("//*[@id='password']"));
	}

	public static WebElement login_bt() {

		element = webDriver.findElement(By.xpath("//*[@id='fm1']/button"));
		return element;

	}

	public static WebElement logoutButton() {

		element = portalNavElement(PortalNavBarTab.LOGOUT);
//		element = webDriver.findElement(By.id("template-settings-logout"));
		return element;

	}

	public static WebElement return_bt() {

		element = webDriver.findElement(By.xpath("html/body/div/div/div[1]/div[2]/a"));
		return element;
		//*[@id='fm1']/a
	}
	
	public static WebElement configurator_clk(){
		
		return element = webDriver.findElement(By.xpath("//*[@id=\"menu-right\"]/ul/li[1]/ul/li[2]/a"));
	}
	
	public static WebElement twipro_clk(){
		
		element = webDriver.findElement(By.xpath("//*[@id=\"menu-right\"]/ul/li[1]/ul/li[1]/a"));
		return element;
		
	}
	public static WebElement username_twi(){
		return element = webDriver.findElement(By.xpath("//*[@id=\"j_username\"]"));
	}
	public static WebElement password_twi(){
		element = webDriver.findElement(By.xpath("//*[@id=\"j_password\"]"));
		return element;
		
	}
	public static WebElement login_twi(){
		element = webDriver.findElement(By.xpath("//*[@id=\"login_btn\"]"));
		return element;
		
	}
	public static WebElement quatermaster_clk(){
		element = webDriver.findElement(By.xpath("//*[@id=\"menu-right\"]/ul/li[1]/ul/li[4]/a"));
		return element;
		
	}

}
