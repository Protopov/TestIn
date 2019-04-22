package com.inthinc.automation.login;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.inthinc.automation.BaseTest;
import com.inthinc.automation.pages.LoginPage;
import com.inthinc.automation.pages.Vehiclepage;
import com.inthinc.automation.pages.assets.AssetsPage;
import com.inthinc.automation.pages.assets.Placepage;
import com.inthinc.automation.pages.assets.Trailerpage;
import com.inthinc.automation.pages.enums.PortalNavBarTab;
import com.inthinc.automation.pages.portal.HomePage;

public class Assestpagetest extends BaseTest {
	
	@Test(priority = 1)
	public void getbrowser() throws InterruptedException {

		getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage.username().sendKeys("pnarva");
		LoginPage.password().sendKeys("pnarva");
		LoginPage.login_bt().click();
		System.out.println("login into system");
		
	}

// Creating user
	
	@Test (priority = 2)
	public void assetspageuser() throws InterruptedException{
		System.out.println("Creating a user");
		getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage.portalNavElement(PortalNavBarTab.ASSETS).click();	
		getNgWebDriver().waitForAngularRequestsToFinish();
		getWebDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		AssetsPage.addPeople().click();
		AssetsPage.first_name().sendKeys("saiW");
		AssetsPage.last_name().sendKeys("karavadi");
		AssetsPage.empid().sendKeys("080426");
		AssetsPage.timezone2().selectByVisibleText("English (United States)");
		AssetsPage.timezone().selectByVisibleText("US/Alaska");
		AssetsPage.measurement().selectByVisibleText("English");
		AssetsPage.driverinfo_c().click();
		AssetsPage.driverteam().click();
		AssetsPage.dropdown1().click();
		AssetsPage.licence_bt().sendKeys("SARA868768765");
		getNgWebDriver().waitForAngularRequestsToFinish();
		AssetsPage.save_bt().click();
		}

// Edit and Deleting user
	
@Test (priority =3 )
	public void assetspagedeleteuser() throws InterruptedException{
//	HomePage.portalNavElement(PortalNavBarTab.ASSETS).click();
	System.out.println("Edit and delete user");
	Thread.sleep(5000);
	AssetsPage.search_colum().sendKeys("karavadi");
	Thread.sleep(9000);
	 AssetsPage.row_clk().click();
    AssetsPage.edit_clk().click();
    AssetsPage.first_name().clear();
    AssetsPage.first_name().sendKeys("Testing sai");
	Thread.sleep(7000);
	AssetsPage.save_btt().click();
	Thread.sleep(9000);
	AssetsPage.search_colum().clear();
	AssetsPage.search_colum().sendKeys("karavadi");
	Thread.sleep(9000);
	AssetsPage.click_cl1().click();
	Thread.sleep(5000);
	AssetsPage.delete_bt().click();
	Thread.sleep(2000);
	AssetsPage.cofrmdelete().click();

	}

// creating a vehicle 

@Test (priority = 4)

public void createvehicle() throws InterruptedException{
	//HomePage.portalNavElement(PortalNavBarTab.ASSETS).click();
	System.out.println("Creating vehicle");
	Thread.sleep(5000);
	Vehiclepage.vehicle_bt().click();
	Vehiclepage.add_bt().click();
	Thread.sleep(5000);
	Vehiclepage.search_vehicle().click();
	Vehiclepage.dropdown().click();
	Vehiclepage.vehicle_id().sendKeys("60545");
	Vehiclepage.vin_id().sendKeys("647897656554");
	Vehiclepage.make_field().sendKeys("2019");
	Vehiclepage.model_field().sendKeys("2019");
	Vehiclepage.year_field().clear();
	Vehiclepage.year_field().sendKeys("2019");
	Thread.sleep(6000);
	Vehiclepage.save_bt().click();
}

// Editing and deleting the vehicle 

@Test (priority = 5)


public void editvehicle() throws InterruptedException{
	System.out.println("Edit and delete vehicle");
	//HomePage.portalNavElement(PortalNavBarTab.ASSETS).click();
	//Vehiclepage.vehicle_bt().click();
	Thread.sleep(4000);
	Vehiclepage.search_field().sendKeys("647897656554");
	Vehiclepage.vehiclepath().click();
	Vehiclepage.edit_bt().click();
	Thread.sleep(9000);
	Vehiclepage.make_field().clear();
	Vehiclepage.make_field().sendKeys("2020");
	Thread.sleep(5000);
	Vehiclepage.saveafteredit().click();	
	Thread.sleep(9000);
	Vehiclepage.search_field().sendKeys("647897656554");
	Thread.sleep(5000);
	Vehiclepage.vehiclepath().click();
	Vehiclepage.delete_bt().click();
	Thread.sleep(5000);
	Vehiclepage.confirmdelete_bt().click();
	
}
// creating Trailer
@Test (priority = 6)
public void createtrailer() throws InterruptedException{
	System.out.println("Creating Trailer");
	//HomePage.portalNavElement(PortalNavBarTab.ASSETS).click();
	Thread.sleep(6000);
	Trailerpage.trailer_bt().click();
	Trailerpage.add_bt().click();
	Trailerpage.trailer_name().sendKeys("TESTINGG");
	Trailerpage.trailer_vin().sendKeys("456878995");
	Thread.sleep(8000);
	Trailerpage.save_bt().click();
	}

// Editing and deleting trailers 
@Test (priority = 7)
public void edittrailer() throws InterruptedException{
	System.out.println("Edit and delete trailer ");
	Thread.sleep(6000);
	Trailerpage.searchfield().sendKeys("TESTINGG");
	Thread.sleep(8000);
	Trailerpage.trailerpath().click();
	Trailerpage.editbutton().click();
	Trailerpage.makefield().sendKeys("2020");
	Thread.sleep(8000);
	Trailerpage.saveafteredit().click();
	Thread.sleep(5000);
	Trailerpage.deletetrailer().click();
	Thread.sleep(5000);
	Trailerpage.confirmdelete().click();
	
	
}

// creating place
@Test (priority = 8)
public void createplace() throws InterruptedException{
	System.out.println("creating a place");
	//HomePage.portalNavElement(PortalNavBarTab.ASSETS).click();
	Thread.sleep(5000);
	Placepage.place_bt().click();
	Placepage.add_bt().click();
	Placepage.placename().sendKeys("Salt lake city");
	Placepage.cityname().sendKeys("hyderabad");
	Thread.sleep(5000);
	Placepage.save_bt().click();
}

// Editing and deleting place 
  @Test (priority = 9)
  public void editplace() throws InterruptedException{
	System.out.println("edit and delete place");
	Thread.sleep(8000);
	Placepage.searchfield().sendKeys("Hyderabad");
	Thread.sleep(8000);
	Placepage.rowclick().click();
	Placepage.edit_bt().click();
	Placepage.cityname().clear();
	Placepage.cityname().sendKeys("SLC");
	Thread.sleep(5000);
	Placepage.saveafteredit().click();
	
}
}
