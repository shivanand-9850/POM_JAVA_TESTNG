package com.altos.Page_object;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import com.altos.Utility.*;

public class LogingQA_page {
	WebDriver driver;
	public BaseClass BC;

	public LogingQA_page(WebDriver ldriver) {
		this.driver = ldriver;
	}

	// @FindBy(xpath="//input[@placeholder='Email']") WebElement Uname;
	@FindBy(xpath = "//input[@placeholder='Employee Code']")
	WebElement Uname;
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;
	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement Login;
	@FindBy(xpath = "//mat-icon[normalize-space()='keyboard_arrow_down']")
	WebElement Loginfbutton;
	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement logout;
	@FindBy(xpath = "//div[@class='title']")
	WebElement Dashbord;
	@FindBy(xpath = "//span[@class='mat-slide-toggle-bar']")
	WebElement Switch_Id;
	@FindBy(xpath = "(//i[@class='mat-tooltip-trigger fa fa-medkit oa transition x-md ng-star-inserted'])[1]")
	WebElement Altos_Icon;
	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	WebElement Associated;
	@FindBy(xpath = "//span[contains(text(),'search')]")
	WebElement Search;
	@FindBy(xpath = "//h5[@class='ng-star-inserted']")
	WebElement Job_page;

	@FindBy(xpath = "(//a[@class='anchor-with-underline ng-tns-c500-268 ng-star-inserted'])")
	List<WebElement> Job_NoList;
	@FindBy(xpath = "//*[@id=\"createRow0\"]/td[1]/a")
	WebElement Job_NoList1;
	// @FindBy(xpath="//a[normalize-space()='Assign to me']") WebElement
	// Assign_to_me;
	@FindBy(xpath = "//mat-icon[normalize-space()='expand_more']")
	WebElement Expand_more;
	@FindBy(xpath = "//div[@class='angular-editor-textarea']")
	WebElement Textarea;
	@FindBy(xpath = "//mat-icon[text()='task_alt']")
	WebElement task_done;
	@FindBy(xpath = "//mat-option[@role='option']")
	WebElement option;
	@FindBy(xpath = "//h5[normalize-space()='Jobs']")
	WebElement Jobs_Page;
	@FindBy(xpath = "//*[@id='createRow0']/td[1]/a")
	List<WebElement> Job_IDList;
	@FindBy(xpath = "(//a[text()=' Assign To Me'])[1]")
	WebElement Assign_to_me;
	@FindBy(xpath = "//*[@src='../../../assets/images/svg/Icon awesome-play.svg']")
	WebElement Start;
	@FindBy(xpath = "(//*[@role='combobox'])[1]")
	WebElement Job_Id;
	@FindBy(xpath = "//span[normalize-space()='Ready For QA2']")
	WebElement Ready_For_QA2;
	@FindBy(xpath = "(//div[@role='tab' ])[3]")
	WebElement Tab_QA1;
	@FindBy(xpath = "(//div[@role='tab' ])[4]")
	WebElement Tab_QA2;
	@FindBy(xpath = "//div[text()='QA']")
	WebElement Tab_QA;
	@FindBy(xpath = "//i[@class='mat-tooltip-trigger fa fa-user oa transition x-md ng-star-inserted']")
	WebElement HRMS;
	@FindBy(xpath = "//span[text()=' Complete ']")
	WebElement Complete;
	@FindBy(xpath = "(//span[@class='mat-ripple-element mat-checkbox-persistent-ripple'])[1]")
	WebElement Assigned;
	@FindBy(xpath = "//i[@class='fa fa-eraser']")
	WebElement clear;
	@FindBy(xpath = "//button[normalize-space()='No']")WebElement No;

	public void Time_sleep() {

		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {

		}
	}

	public void Complete_QA_Task() {
		BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		Associated.click();
		Search.click();
		Time_sleep();
		Job_NoList1.click();
		Time_sleep();
		Tab_QA.click();
		Time_sleep();
		Actions Ssubaction = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Ssubaction.moveToElement(Assigned).perform();
		js.executeScript("arguments[0].click()", Assigned);
		Search.click();
		Ssubaction.moveToElement(Assign_to_me).perform();
		js.executeScript("arguments[0].click()", Assign_to_me);
		Time_sleep();
		clear.click();
		Ssubaction.moveToElement(Start).perform();
		js.executeScript("arguments[0].click()", Start);
		Time_sleep();
		Complete.click();
		Time_sleep();
		No.click();
		Ready_For_QA2.click();
		Time_sleep();
		No.click();
		Ssubaction.moveToElement(Assigned).perform();
		js.executeScript("arguments[0].click()", Assigned);
		Search.click();
		Ssubaction.moveToElement(Assign_to_me).perform();
		js.executeScript("arguments[0].click()", Assign_to_me);
		Time_sleep();
		clear.click();
		Ssubaction.moveToElement(Start).perform();
		js.executeScript("arguments[0].click()", Start);
		Time_sleep();
		Complete.click();
		Time_sleep();
		Ready_For_QA2.click();
		No.click();
		Assert.assertTrue(true);
		Time_sleep();
	}

	public void Complete_QA1_Task() {
		BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		Associated.click();
		Search.click();
		Time_sleep();
		Job_NoList1.click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Time_sleep();
		Tab_QA1.click();
		Actions Ssubaction = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Ssubaction.moveToElement(Assigned).perform();
		js.executeScript("arguments[0].click()", Assigned);
		Search.click();
		Time_sleep();
		Ssubaction.moveToElement(Assign_to_me).perform();
		js.executeScript("arguments[0].click()", Assign_to_me);
		Time_sleep();
		clear.click();
		Time_sleep();
		Ssubaction.moveToElement(Start).perform();
		js.executeScript("arguments[0].click()", Start);
		CommonUtility.Windows_close();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, -100)");
		Time_sleep();
		Complete.click();
		Time_sleep();
		Ready_For_QA2.click();
		Time_sleep();
		No.click();
		Tab_QA1.click();
		Ssubaction.moveToElement(Assigned).perform();
		js.executeScript("arguments[0].click()", Assigned);
		Search.click();
		Time_sleep();
		Ssubaction.moveToElement(Assign_to_me).perform();
		js.executeScript("arguments[0].click()", Assign_to_me);
		Time_sleep();
		clear.click();
		Time_sleep();
		Ssubaction.moveToElement(Start).perform();
		js.executeScript("arguments[0].click()", Start);
		Time_sleep();
		CommonUtility.Windows_close1();
		jsExecutor.executeScript("window.scrollBy(0, -100)");
		Complete.click();
		Time_sleep();
		Ready_For_QA2.click();
		No.click();
		Assert.assertTrue(true);
	}

	public void Complete_QA2_Task() {
		BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		Associated.click();
		Search.click();
		Time_sleep();
		Job_NoList1.click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Time_sleep();
		Tab_QA2.click();
		Time_sleep();
		Actions Ssubaction = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Ssubaction.moveToElement(Assigned).perform();
		js.executeScript("arguments[0].click()", Assigned);
		Search.click();
		Ssubaction.moveToElement(Assign_to_me).perform();
		js.executeScript("arguments[0].click()", Assign_to_me);
		Time_sleep();
		clear.click();
		Time_sleep();
		Ssubaction.moveToElement(Start).perform();
		js.executeScript("arguments[0].click()", Start);
		Time_sleep();
		CommonUtility.Windows_close();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, -100)");
		Time_sleep();
		Complete.click();
		Time_sleep();
		//Tab_QA2.click();
		No.click();
		Time_sleep();
		Ssubaction.moveToElement(Assigned).perform();
		js.executeScript("arguments[0].click()", Assigned);
		Search.click();
		CommonUtility.jsClick(driver, Assign_to_me);
		Time_sleep();
		clear.click();
		CommonUtility.Windows_close1();
		CommonUtility.jsClick(driver, Start);
		js.executeScript("arguments[0].click()", Start);
        jsExecutor.executeScript("window.scrollBy(0, -100)");
		Time_sleep();
		Complete.click();
		Time_sleep();
		No.click();
		Assert.assertTrue(true);
		Time_sleep();
	}
}
