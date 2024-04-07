package com.altos.Utility;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.*;

public class BrowserFactory {
	public WebDriver driver;

	@SuppressWarnings("deprecation")
	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL)
	{
		
		if (browserName.equals("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeOptions co =new ChromeOptions();
			//co.setHeadless(true);
			//co.addArguments("--headless");
			co.setBinary("./Drivers/chrome-win64/chrome.exe");
		    driver =new ChromeDriver(co);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			
		}
		else if (browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.geckod.driver", "/Drivers/geckodriver.exe");
			//driver=new FirefoxDriver();
			FirefoxOptions options = new FirefoxOptions();
			options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			//capabilities.setCapability("marionette",true);
			driver= new FirefoxDriver(options);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		}
		else if (browserName.equals("IE"))
		{
			System.setProperty("webdriver.IE.driver", "./Drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		}
		else if (browserName.equals("Edge"))
		{
			System.setProperty("webdriver.IE.driver", "./Drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("We do not Support this Browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
		
		
		
		
	}
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
	{
		
	}

}
