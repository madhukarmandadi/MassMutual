package com.massmutual.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.massmutual.qa.util.TestBase;

public class ValuesPage extends TestBase {
	
	// Values page webelements
	
	@FindBy(id="lbl_val_1")
	WebElement value1;
	
	@FindBy(id="lbl_val_2")
	WebElement value2;
	
	@FindBy(id="lbl_val_3")
	WebElement value3;
	
	@FindBy(id="lbl_val_4")
	WebElement value4;
	
	@FindBy(id="lbl_val_5")
	WebElement value5;
	
	@FindBy(id="lbl_ttl_val")
	WebElement totalBalance;
	
	public ValuesPage() {
		
		PageFactory.initElements(driver, ValuesPage.class);
		
	}
	
	public void countValues() {
		// validate values are > 0
	}
	public void validate_Val_Appear() {
		// validate values are appear on the screen
	}
	
	public void validateTotalBalance() {
		
	}
	public void validateCurrencySign() {
		
	}
	
	
	/*
	 * public HomePOM(WebDriver driver) { //this.driver=driver;
	 * PageFactory.initElements(driver, Values.class); //utilityMethods= new
	 * SeleniumActions(driver);
	 * 
	 * }
	 */
	
}
