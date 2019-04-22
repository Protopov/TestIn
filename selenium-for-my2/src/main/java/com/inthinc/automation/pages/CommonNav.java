package com.inthinc.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inthinc.automation.pages.enums.CommonNavBar;

public class CommonNav extends BasePage {

	public CommonNav(WebDriver driver) {
		super(driver);
	}

	public static WebElement commonNavElement(CommonNavBar commonNav) {
		switchToNavigationFrame(webDriver);
		element = webDriver.findElement(By.cssSelector(CommonNavBar.CONTROLLER.getXPath()));
		String commonNavElementXPath;
		switch (commonNav) {
		case HOME:
			commonNavElementXPath = CommonNavBar.HOME.getXPath();
			break;
		case FORMS:
			commonNavElementXPath = CommonNavBar.FORMS.getXPath();
			break;
		case ASSETS:
			commonNavElementXPath = CommonNavBar.ASSETS.getXPath();
			break;
		case ODYSSEY:
			commonNavElementXPath = CommonNavBar.ODYSSEY.getXPath();
			break;
		case ELD:
			commonNavElementXPath = CommonNavBar.ELD.getXPath();
			break;
		case DVIR:
			commonNavElementXPath = CommonNavBar.DVIR.getXPath();
			break;
		case SUPERUSER:
			commonNavElementXPath = CommonNavBar.SUPERUSER.getXPath();
			break;
		case LOGOUT:
			commonNavElementXPath = CommonNavBar.LOGOUT.getXPath();
			break;
		default:
			commonNavElementXPath = CommonNavBar.HOME.getXPath();
			break;
		}
		element = webDriver.findElement(By.xpath(commonNavElementXPath));
		System.out.println(element.getText());
		return element;
	}

}
