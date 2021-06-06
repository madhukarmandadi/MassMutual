package com.cg.utility;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumActions {

	WebDriver driver;

	public SeleniumActions(WebDriver driver) {

		this.driver = driver;
	}

	public void enterText(WebElement element, String textToEnter) {

		try {

			if (element.isEnabled() && element.isDisplayed()) {

				element.clear();
				element.sendKeys(textToEnter);
			} else {
				System.out.println("Element not visible exception");

			}

		} catch (NoSuchElementException e) {

			e.printStackTrace();
		} catch (ElementNotVisibleException e) {

			e.printStackTrace();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void safeJavaScriptClick(WebElement element) {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Clicking on element with using java script click");

				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} else {
				System.out.println("Unable to click on element");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getStackTrace());
		}
	}
}
