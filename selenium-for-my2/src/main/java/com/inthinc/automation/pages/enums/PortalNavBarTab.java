package com.inthinc.automation.pages.enums;

public enum PortalNavBarTab {

	HOME("//*[@id=\"header_menuLeft\"]/ul/li[1]/a"), 
	FORMS("//*[@id=\"header_menuLeft\"]/ul/li[2]/a"),
	ASSETS("//*[@id=\"header_menuLeft\"]/ul/li[3]/a"), 
	ODYSSEY("//*[@id=\"header_menuLeft\"]/ul/li[4]/a"),
	ELD("//*[@id=\"header_menuLeft\"]/ul/li[5]/a"), 
	DVIR("//*[@id=\"header_menuLeft\"]/ul/li[6]/a"),
	LOGOUT("//*[@id=\"template-settings-logout\"]"),
	SUPERUSER("//*[@id=\"header_superUserBtn\"]/a");

	private final String xpath;

	PortalNavBarTab(String xpath) {
		this.xpath = xpath;
	}//*[@id="header_superUserBtn"]/a

	public String getXPath() {
		return xpath;
	}
}
