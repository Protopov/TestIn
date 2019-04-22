package com.inthinc.automation.pages.enums;

public enum ELDPageTabs {

	DRIVERLOGS("/html/body/div/div[2]/div/div/div/ul/li[1]/p"), 
	FUELSTOPS("/html/body/div/div[2]/div/div/div/ul/li[2]/p"),
	UNIDENTIFIEDLOGS("/html/body/div/div[2]/div/div/div/ul/li[3]/p");

	private final String xpath;

	ELDPageTabs(String xpath) {
		this.xpath = xpath;
	}

	public String getXPATH() {
		return xpath;
	}
}
