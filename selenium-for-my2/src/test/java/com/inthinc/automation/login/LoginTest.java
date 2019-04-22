package com.inthinc.automation.login;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.inthinc.automation.BaseTest;
import com.inthinc.automation.pages.BasePage;
import com.inthinc.automation.pages.LoginPage;
import com.inthinc.automation.pages.assets.AssetsPage;
import com.inthinc.automation.pages.enums.CommonNavBar;
import com.inthinc.automation.pages.enums.PortalNavBarTab;
import com.inthinc.automation.pages.portal.HomePage;

public class LoginTest extends BaseTest {

	
	
@Test(priority = 1)
	//@Test
	public void getbrowser() throws InterruptedException {

		getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage.username().sendKeys(BasePage.getUserName());
		LoginPage.password().sendKeys(BasePage.getPassword());
		LoginPage.login_bt().click();
		System.out.println("login into system");
		LoginPage.logoutButton().click();
		LoginPage.return_bt().click();
		
	}
@Test (priority =2)

public void getbrowser2(){
	
	getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	LoginPage.username().sendKeys(BasePage.getUserName());
	LoginPage.login_bt().click();
	System.out.println("Password is a required field.");
}

@Test (priority = 3)

public void getbrowser3(){
	
	LoginPage.password().sendKeys(BasePage.getPassword());
	LoginPage.login_bt().click();
	System.out.println("Username is a required field  ");
	
}

@Test(priority = 4)
//@Test(dependsOnMethods = { "getbrowser" })
public void assetspage() throws InterruptedException {

	getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	HomePage.portalNavElement(PortalNavBarTab.ASSETS).click();	
	getNgWebDriver().waitForAngularRequestsToFinish();
	getWebDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	/*getNgWebDriver().waitForAngularRequestsToFinish();
	AssetsPage.cancel().click();*/
}	

// click super user and configurator and forms 
@Test (priority = 6)

public void configuratorclk() throws InterruptedException{
	getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	AssetsPage.commonNavElement(CommonNavBar.SUPERUSER).click();
	LoginPage.configurator_clk().click();
	Thread.sleep(4000);
	getWebDriver().navigate().back();
	AssetsPage.commonNavElement(CommonNavBar.FORMS).click();
    getWebDriver().navigate().back();
    AssetsPage.commonNavElement(CommonNavBar.HOME).click();
    LoginPage.portalNavElement(PortalNavBarTab.LOGOUT).click();//*[@id="btn_home"]

}

// Click Tiwipro and Quatermaster 

@Test (priority =5)

public void tiwipro_clk() throws InterruptedException{
	AssetsPage.commonNavElement(CommonNavBar.SUPERUSER).click();
	LoginPage.twipro_clk().click();
	Thread.sleep(9000);
	LoginPage.username_twi().sendKeys(BasePage.getUserName());
	Thread.sleep(5000);
	LoginPage.password_twi().sendKeys(BasePage.getPassword());//BasePage.getPassword()
	LoginPage.login_twi().click();
	Thread.sleep(5000);
	getWebDriver().navigate().back();
	getWebDriver().navigate().back();
	getNgWebDriver().waitForAngularRequestsToFinish();
	AssetsPage.commonNavElement(CommonNavBar.SUPERUSER).click();
	LoginPage.quatermaster_clk().click();////*[@id="nav"]/div/button[1]
	Thread.sleep(5000);
}


}
  

