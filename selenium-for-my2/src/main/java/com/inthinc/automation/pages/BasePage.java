package com.inthinc.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	protected static WebDriver webDriver;
	private static String userName;
	private static String password;

	public static WebElement element = null;

	public BasePage(WebDriver webDriver) {

		BasePage.webDriver = webDriver;

		PageFactory.initElements(webDriver, this);
	}

	public static void switchToNavigationFrame(WebDriver webDriver) {
		webDriver.switchTo().frame("navigationFrame");
	}
	
	public static WebElement inthincButton() {
		return webDriver.findElement(By.xpath("//*[@id=\"header_navigation\"]/div/a"));
	}

	public static String getUserName() {
		return userName;
	}

	public static void setUserName(String userName) {
		BasePage.userName = userName;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		BasePage.password = password;
	}
}
