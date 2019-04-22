package com.inthinc.automation.pages.enums;

public enum CommonNavBar {

	CONTROLLER("nav[ng-controller='primaryNavCtrl']"),
	HOME("//*[@id=\"btn_home\"]"), 
	FORMS("//*[@id=\"menu-left\"]/ul/li[2]/a"), 
	ASSETS("//*[@id=\"menu-left\"]/ul/li[3]/a"), 
	ODYSSEY("//*[@id=\"menu-left\"]/ul/li[4]/a"), 
	ELD("//*[@id=\"menu-left\"]/ul/li[5]/a"), 
	DVIR("//*[@id=\"menu-left\"]/ul/li[6]/a"),
	SUPERUSER("//*[@id=\"menu-right\"]/ul/li[1]/a"),
	LOGOUT("//*[@id=\"nav\"]/div/button[1]");

	private final String xpath;

	CommonNavBar(String xpath) {
		this.xpath = xpath;
	}

	public String getXPath() {
		return xpath;
	}

}
