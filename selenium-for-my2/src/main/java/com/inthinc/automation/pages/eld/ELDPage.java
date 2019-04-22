package com.inthinc.automation.pages.eld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inthinc.automation.pages.CommonNav;
import com.inthinc.automation.pages.enums.ELDPageTabs;

public class ELDPage extends CommonNav {

	public ELDPage(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement getTab(ELDPageTabs eldPageTabs) {

		String elementPath;
		switch (eldPageTabs) {
		case DRIVERLOGS:
			elementPath = ELDPageTabs.DRIVERLOGS.getXPATH();
			break;
		case FUELSTOPS:
			elementPath = ELDPageTabs.FUELSTOPS.getXPATH();
			break;
		case UNIDENTIFIEDLOGS:
			elementPath = ELDPageTabs.UNIDENTIFIEDLOGS.getXPATH();
			break;
		default:
			elementPath = ELDPageTabs.DRIVERLOGS.getXPATH();
			break;
		}
		element = webDriver.findElement(By.xpath(elementPath));
		System.out.println(element.getText());
		return element;
	}

}
