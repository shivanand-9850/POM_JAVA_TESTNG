package com.altos.Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.altos.Page_object.*;

public class CommonUtility {
	static WebDriver driver;
	public BaseClass BC;

	public CommonUtility(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public String WorkItem_id = "";
	@FindBy(xpath = "//input[@placeholder='Employee Code']")
	WebElement Uname;
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;
	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement Login;
	@FindBy(xpath = "//i[@class='mat-tooltip-trigger fa fa-gear oa transition x-md ng-star-inserted']")
	WebElement HRMS_setting;
	@FindBy(xpath = "(//i[@class='mat-tooltip-trigger fa fa-medkit oa transition x-md ng-star-inserted'])[1]")
	WebElement Altos_Icon;
	@FindBy(xpath = "//h2[text()='Altos Hub']")
	WebElement Altos_Hub;
	@FindBy(xpath = "//div[text()='HRMS'][1]")
	WebElement HRMS_Text;
	@FindBy(tagName = "body")
	static WebElement element3;

	public void ZoomIn() {
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	}

	public void Time_sleep() {
		try {
			Thread.sleep(6000);

		} catch (InterruptedException e) {

		}
	}
	// TODO Auto-generated method stub

	// Common utility method to find and click an element containing a specific
	// keyword
	public static void findAndClickElementByKeyword(List<WebElement> elements, String keyword) {
		for (int i = 0; i < elements.size(); i++) {
			String elementText = elements.get(i).getText();
			System.out.println(elementText);
			if (elementText.contains(keyword)) {
				elements.get(i).click();
				System.out.println("Clicked");
				break;
			}

		}
	}

	public static void jsClick(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", element);

	}

	public static void scrollVertically(WebDriver driver, int yOffset) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, arguments[0]);", yOffset);

	}

	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public void loginAltos(String usernameApplication, String passwordApplication) {
		ZoomIn();
		for (int i = 0; i < 5; i++) {
			Time_sleep();
			try {
				Time_sleep();
				Uname.sendKeys(usernameApplication);
				Password.sendKeys(passwordApplication);
				Login.click();
				Time_sleep();
				driver.navigate().refresh();
				// HRMS_setting.click();
				Time_sleep();
				String y = "Altos Hub";
				Time_sleep();
				String x = Altos_Hub.getText();
				System.out.println(x);
				if (y.equalsIgnoreCase(x)) {
					Altos_Icon.click();
					break;
				}
			}

			catch (Exception e) 
			{
				Uname.clear();
				Uname.sendKeys(usernameApplication);
				Password.clear();
				Password.sendKeys(passwordApplication);
				Login.click();
				Time_sleep();
				String c = "Altos Hub";
				Time_sleep();
				String d = Altos_Hub.getText();
				System.out.println(d);
				// HRMS_setting.click();
				if (c.equalsIgnoreCase(d)) {
					Altos_Icon.click();
					break;
				}
			}
		}
		Altos_Icon.click();
	}

//	public static WebDriver initializeDriverWithImplicitWait() {
//		            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		            return driver;    
//		    }
	public static void performClickAction(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

	public static void initializeDriverWithImplicitWait() {

		WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout

	}

	public static void Scrollup() {
		element3.click();
		element3.sendKeys(Keys.PAGE_UP);
		element3.sendKeys(Keys.PAGE_UP);

	}

	public static void Scrolldown() {
		element3.click();
		element3.sendKeys(Keys.PAGE_DOWN);
		element3.sendKeys(Keys.PAGE_DOWN);

	}

	public static void WithoutClick_Scrolldown() {
		element3.sendKeys(Keys.PAGE_DOWN);
		element3.sendKeys(Keys.PAGE_DOWN);

	}

	public static String generateUniqueText() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String timestamp = dateFormat.format(new Date());
		Random random = new Random();
		int randomNumber = random.nextInt(10000); // You can adjust the range as needed
		return "UniqueText_" + timestamp + "_" + randomNumber;
	}

	public static void main(String[] args) {
		String uniqueText = generateUniqueText();
		System.out.println("Generated Unique Text: " + uniqueText);

	}
	public static void Windows_close() {
		 String parentWindowHandle = driver.getWindowHandle();
	        Set<String> windowHandles = driver.getWindowHandles();
	        for (String windowHandle : windowHandles) {
	            if (!windowHandle.equals(parentWindowHandle)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	        driver.close();
	        driver.switchTo().window(parentWindowHandle);
		
	}
	public static void Windows_close1() {
		  String parentWindowHandle = driver.getWindowHandle();
	        Set<String> windowHandles1 = driver.getWindowHandles();
	        for (String windowHandle : windowHandles1) {
	            if (!windowHandle.equals(parentWindowHandle)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	        driver.close();
	        driver.switchTo().window(parentWindowHandle);
		
		
	}
	public static void Windows_close2() {
		  String parentWindowHandle = driver.getWindowHandle();
	        Set<String> windowHandles2 = driver.getWindowHandles();
	        for (String windowHandle : windowHandles2) {
	            if (!windowHandle.equals(parentWindowHandle)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	        driver.close();
	        driver.switchTo().window(parentWindowHandle);
		
		
	}
}
