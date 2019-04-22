package com.inthinc.automation.pages.enums;

public enum Domain {

	QA("https://qa.inthinc.com"),
	STAGING("https://sging.inthinc.com"),
	MY("https://my.inthinc.com"),
	SCHLUMBERGER("https://slumberger.inthinc.com"),
	LDS("https://lds.inthinc.com"),
	CHEVRON("https://cvron.inthinc.com"),
	BARRICK("https://rick.inthinc.com");
	
	private final String domain;

	Domain(String domain) {
		this.domain = domain;
	}
	public String getDomain() {
		return domain;
	}

}
