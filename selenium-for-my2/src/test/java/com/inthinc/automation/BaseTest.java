package com.inthinc.automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.inthinc.automation.pages.BasePage;
import com.inthinc.automation.pages.enums.Browsers;
import com.inthinc.automation.pages.enums.Domain;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class BaseTest {

	 private static WebDriver webDriver;
//	private static ChromeDriver webDriver;
	private static NgWebDriver ngWebDriver;
	private String domainURL;
	private String driverPath;
	private String driverName;
	Properties p;

	public BasePage basePage;

	@BeforeSuite
	@Parameters({ "config-file" })
	public void setupbrowser(@Optional("src/test/resources/config.properties/") String configfile) {

		setProperties(configfile);
		intializeProperties();
		
		
		ngWebDriver = new NgWebDriver((JavascriptExecutor) webDriver);
		webDriver.get(domainURL);
		webDriver.manage().window().maximize();
	}

	@BeforeMethod

	public void objectintialize() {
		basePage = new BasePage(webDriver);
	}

	private void setProperties(String configfile) {
		p = new Properties();
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(configfile);
			p.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void intializeProperties() {

		String domain = p.getProperty("DOMAIN");
		if (domain.equalsIgnoreCase("QA")) {
			domainURL = Domain.QA.getDomain();
		} else if (domain.equalsIgnoreCase("STAGING")) {
			domainURL = Domain.STAGING.getDomain();
		} else if(domain.equalsIgnoreCase("MY")){
			domainURL = Domain.MY.getDomain();
		} else if(domain.equalsIgnoreCase("SCHLUMBERGER")){
			domainURL = Domain.SCHLUMBERGER.getDomain();
		} else if(domain.equalsIgnoreCase("LDS")){
			domainURL = Domain.LDS.getDomain();
		} else if(domain.equalsIgnoreCase("CHEVRON")){
			domainURL = Domain.CHEVRON.getDomain();
		} else if(domain.equalsIgnoreCase("BARRICK")){
			domainURL = Domain.BARRICK.getDomain();
		}
		BasePage.setUserName(p.getProperty("DomainUserName"));
		BasePage.setPassword(p.getProperty("DomainPass"));

		String browser = p.getProperty("Browser");
		
		if (browser.equalsIgnoreCase("Chrome")) {
			driverPath = Browsers.CHROME.getDriverPath();
			driverName = Browsers.CHROME.getDriverName();
			System.setProperty(driverName, driverPath);
			webDriver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driverPath = Browsers.FIREFOX.getDriverPath();
			driverName = Browsers.FIREFOX.getDriverName();
			System.setProperty(driverName, driverPath);
			webDriver = new FirefoxDriver();
		} 
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public NgWebDriver getNgWebDriver() {
		return ngWebDriver;
	}

}
