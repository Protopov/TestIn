package com.inthinc.automation.login;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.inthinc.automation.BaseTest;
import com.inthinc.automation.pages.LoginPage;
import com.inthinc.automation.pages.dvir.DVIRPage;
import com.inthinc.automation.pages.enums.PortalNavBarTab;
import com.inthinc.automation.pages.portal.HomePage;

public class DVIRPagetest extends BaseTest {
	
	@Test(priority = 1)
	public void getbrowser() throws InterruptedException {

		getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage.username().sendKeys("pnarva");
		LoginPage.password().sendKeys("pnarva");
		LoginPage.login_bt().click();
		System.out.println("login into system");
		
	}
	
    @Test (priority = 2)
    public void getdvirtab() throws InterruptedException{
    	
    	HomePage.portalNavElement(PortalNavBarTab.DVIR).click();
    	Thread.sleep(8000);
    	DVIRPage.startdate().sendKeys("01012019");
    	DVIRPage.enddate().sendKeys("01022019");
    	DVIRPage.selectvehicle().click();
    	Thread.sleep(8000);
    	DVIRPage.entervehicle().sendKeys("sashasupercar");
    	DVIRPage.selectvehicledropdown().click();
    	DVIRPage.findbutton().click();
    }


}
