package com.inthinc.automation.pages.enums;

public enum AssetsPageTab {

	PEOPLE("/html/body/div/div[2]/div/div/ul/li[1]/a"), 
	VEHICLES("/html/body/div/div[2]/div/div/ul/li[2]/a"), 
	DEVICES("/html/body/div/div[2]/div/div/ul/li[3]/a"), 
	TRAILERS("/html/body/div/div[2]/div/div/ul/li[4]/a"), 
	ZONES("/html/body/div/div[2]/div/div/ul/li[5]/a"), 
	PLACES("/html/body/div/div[2]/div/div/ul/li[6]/a");

	private final String xpath;

	AssetsPageTab(String xpath) {
		this.xpath = xpath;
	}

	public String getXPATH() {
		return xpath;
	}

}
