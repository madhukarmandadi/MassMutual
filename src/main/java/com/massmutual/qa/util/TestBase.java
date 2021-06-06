package com.massmutual.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.cg.exception.browserNotConfiguredException;

public class TestBase {
	


	public static WebDriver driver = null;
	public static Properties prop;
	Actions action;

	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"src\\main\\java\\com\\massmutual\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public static void init() throws browserNotConfiguredException {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			throw new browserNotConfiguredException("given browser not supported");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LAOD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//action = new Actions(driver);
		driver.get(prop.getProperty("url"));
		
	}



}
