package com.massmutual.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.massmutual.qa.util.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, HomePage.class);
	}
	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public String validateHomePageURL() {
		return driver.getCurrentUrl();
	}
}
