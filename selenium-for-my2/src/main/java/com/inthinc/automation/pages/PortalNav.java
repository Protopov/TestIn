package com.inthinc.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inthinc.automation.pages.enums.PortalNavBarTab;

public class PortalNav extends BasePage {

	public PortalNav(WebDriver driver) {
		super(driver);
	}

	/*
	 * This method is used to get navigation elements on the home page.
	 * 
	 */
	public static WebElement portalNavElement(PortalNavBarTab navEnum) {

		switchToNavigationFrame(webDriver);
		String navElementXPath;
		switch (navEnum) {
		case HOME:
			navElementXPath = PortalNavBarTab.HOME.getXPath();
			break;
		case FORMS:
			navElementXPath = PortalNavBarTab.FORMS.getXPath();
			break;
		case ASSETS:
			navElementXPath = PortalNavBarTab.ASSETS.getXPath();
			break;
		case ODYSSEY:
			navElementXPath = PortalNavBarTab.ODYSSEY.getXPath();
			break;
		case ELD:
			navElementXPath = PortalNavBarTab.ELD.getXPath();
			break;
		case DVIR:
			navElementXPath = PortalNavBarTab.DVIR.getXPath();
			break;
		case LOGOUT:
			navElementXPath = PortalNavBarTab.LOGOUT.getXPath();
			break;
		case SUPERUSER:
			navElementXPath = PortalNavBarTab.SUPERUSER.getXPath();
		default:
			navElementXPath = PortalNavBarTab.HOME.getXPath();
			break;
		}
		element = webDriver.findElement(By.xpath(navElementXPath));
		System.out.println(element.getText());
		return element;

	}

}
