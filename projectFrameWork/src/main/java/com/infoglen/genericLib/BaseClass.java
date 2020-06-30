package com.infoglen.genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.infoglen.ObjectRepository.HomePageClass;


public class BaseClass {
	public FileData data = new FileData();
	public static WebDriver driver = null;
	@BeforeSuite
	public void configBS()
	{
		System.out.println("DataBase Connection Start");
	}
	@BeforeClass
	public void configBC() throws IOException
	{
		String browser = data.fetchDatafrom("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}else
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	public WebDriverCommonLib wlib = new WebDriverCommonLib();
	@BeforeMethod
	public void configBM() throws IOException
	{
		driver.get(data.fetchDatafrom("url"));
		HomePageClass hp= PageFactory.initElements(driver, HomePageClass.class);
		hp.getSearchBox().sendKeys(data.fetchDatafrom("location"));
		hp.getSearchBtn().click();
	}
	@AfterMethod
	public void configAM()
	{
	
	}
	@AfterClass
	public void configAC()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void configAS()
	{
		System.out.println("Database connection close");
	}

}
