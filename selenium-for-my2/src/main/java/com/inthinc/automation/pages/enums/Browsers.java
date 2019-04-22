package com.inthinc.automation.pages.enums;

public enum Browsers {

	CHROME("webdriver.chrome.driver", "src/main/resources/chromedriver"),
	FIREFOX("webdriver.gecko.driver", "src/main/resources/geckodriver");
	
	private final String driverName;
	private final String driverPath;
	public String getDriverName() {
		return driverName;
	}


	public String getDriverPath() {
		return driverPath;
	}

	Browsers(String driverName, String driverPath) {
		this.driverName = driverName;
		this.driverPath = driverPath;
	}
}
