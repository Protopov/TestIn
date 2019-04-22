package com.inthinc.automation.pages.portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inthinc.automation.pages.PortalNav;

public class HomePage extends PortalNav {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebElement reports_tb(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='navigation:layout-navigationReports']/span"));

		return element;

	}

	public WebElement vehicles_tb(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='subNavForm:vehicles-trailersReport']/span"));
		return element;

	}
}
