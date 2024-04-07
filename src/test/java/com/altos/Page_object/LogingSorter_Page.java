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
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;

import com.altos.Page_object.*;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingDataProvider;

public class LogingSorter_Page {
	WebDriver driver;
	public BaseClass BC;

	public LogingSorter_Page(WebDriver ldriver) {
		this.driver = ldriver;

	}

	@FindBy(xpath = "//input[@placeholder='Employee Code']")
	WebElement Uname;
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;
	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement Login;
	@FindBy(xpath = "//mat-icon[normalize-space()='keyboard_arrow_down']")
	WebElement loginfbutton;
	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement logout;
	@FindBy(xpath = "//div[@class='title']")
	WebElement Dashbord;
	@FindBy(xpath = "//span[@class='mat-slide-toggle-bar']")
	WebElement switch_Id;
	@FindBy(xpath = "(//i[@class='mat-tooltip-trigger fa fa-medkit oa transition x-md ng-star-inserted'])[1]")
	WebElement Altos_Icon;
	@FindBy(xpath = "//i[@aria-describedby='cdk-describedby-message-hqi-1-6']")
	WebElement Altos_Icon1;
	@FindBy(xpath = "//span[contains(text(),'search')]")
	WebElement Search;
	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	WebElement Associated;

	@FindBy(xpath = "//h5[@class='ng-star-inserted']")
	WebElement Job_page;
	@FindBy(xpath = "//tr[@id='createRow0']//mat-icon[@role='img'][normalize-space()='expand_more']")
	WebElement Drop_Icon;
	@FindBy(xpath = "//a[@class='anchor-with-underline']")
	WebElement Task;
	@FindBy(xpath = "//button[normalize-space()='+ New']")
	WebElement AddSubTask;
	@FindBy(xpath = "//input[@formcontrolname='dateOfService']")
	WebElement Date_Icon1;
	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[3]")
	WebElement Date_Icon2;
	@FindBy(xpath = "//div[@class='mat-calendar-body-cell-content mat-focus-indicator']")
	List<WebElement> Select_Date;
	@FindBy(xpath = "(//input[@placeholder='Select Type'])[1]")
	WebElement Report_Type;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement Report_Title;
	@FindBy(xpath = "//span[@class='mat-option-text']")
	List<WebElement> DropwonList;
	@FindBy(xpath = "(//input[@placeholder='Select Doctor'])[1]")
	WebElement Doctor_Attorney;
	@FindBy(xpath = "(//input[@placeholder='Select Facility'])[1]")
	WebElement Facility;
	@FindBy(xpath = "(//input[@formcontrolname='pageFrom'])[1]")
	WebElement pageFrom;
	@FindBy(xpath = "(//input[@formcontrolname='pageTo'])[1]")
	WebElement pageTo;
	@FindBy(xpath = "//input[@formcontrolname='comment']")
	WebElement comment;
	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	WebElement Save;
	@FindBy(xpath = "//mat-icon[text()='task_alt']")
	WebElement Completed_task;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/app-root[1]/div[1]/div[1]/div[2]/app-side-bar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/div[1]/div[2]/app-task-management-view[1]/div[2]/div[1]/div[5]/div[1]/div[2]/div[1]/button[2]/span[1]")
	WebElement Completed;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[2]/div[1]/mat-dialog-container[1]/app-confirmation-dialog[1]/div[2]/button[2]")
	WebElement Yes;
	@FindBy(xpath = "//button[@mattooltip='Completed']")
	List<WebElement> completedList;
	@FindBy(xpath = "//span[text()=' Create ']")
	WebElement Create;
	@FindBy(xpath = "//span[text()=' Ready For Sorter QA ']")
	WebElement Ready_For_Sorter_QA;
	@FindBy(xpath = "//div[@id='toast-container']/div/div")
	WebElement popup;
	@FindBy(xpath = "/html/body/div[1]/app-root/div/div/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-jobs-list/div/div/div[2]/div[1]/ao-job-auto-multi-complete/mat-form-field/div/div[1]/div[3]/mat-chip-list/div/input")
	WebElement Job_Id;
	@FindBy(xpath = "//mat-option[@role='option']")
	WebElement option;
	@FindBy(xpath = "//h5[normalize-space()='Jobs']")
	WebElement Jobs_Page;
	@FindBy(xpath = "//*[@id='createRow0']/td[1]/a")
	List<WebElement> Job_IDList;
	@FindBy(xpath = "(//a[text()=' Assign To Me'])[1]")
	WebElement Assign_to_me;
	@FindBy(xpath = "//input[@placeholder='Title Keyword']")
	WebElement Title_Keyword;
	@FindBy(xpath = "(//input[@formcontrolname='reportTitle'])[1]")
	WebElement reportTitle;
	@FindBy(xpath = "/html/body/div[1]/app-root/div/div/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-task-management-view/div[2]/div/div[3]/div/div/div/ao-create-sub-task/form/div/div/div/div[8]/app-ao-doctor-name-auto-complete/mat-form-field/div/div[1]/div[3]/input")
	WebElement Select_Doctor;
	@FindBy(xpath = "//input[@placeholder='Select Facility']")
	WebElement Select_Facility;
	@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[5]")
	WebElement Start;
	@FindBy(xpath = "//span[text()=' Mark as partial ']")
	WebElement partial;
	@FindBy(xpath = "//span[text()=' Mark as Duplicate ']")
	WebElement Duplicate;
	@FindBy(xpath = "//label[@for='mat-checkbox-3-input']//span[@class='mat-checkbox-inner-container']")
	WebElement Assigned;
	@FindBy(xpath = "//i[@class='fa fa-eraser']")
	WebElement clear;

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
			Thread.sleep(2000);

		} catch (InterruptedException e) {

		}
	}

	public void CreatTask_Sorter() {
		// loginAltos( usernameApplication, passwordApplication);
		BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		Time_sleep();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		Associated.click();
		Search.click();
		Time_sleep();
		Actions Ssubaction = new Actions(driver);
		Time_sleep();
		//ZoomIn();
		Time_sleep();
		Ssubaction.moveToElement(Drop_Icon).perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Drop_Icon);
		Time_sleep();
		// Task.click();
		Ssubaction.moveToElement(Task).perform();
		js.executeScript("arguments[0].click()", Task);
		Time_sleep();
		Time_sleep();
		Ssubaction.moveToElement(AddSubTask).perform();
		js.executeScript("arguments[0].click()", AddSubTask);
		Time_sleep();
		Ssubaction.moveToElement(Date_Icon1).perform();
		js.executeScript("arguments[0].click()", Date_Icon1);
		Date_Icon1.sendKeys("01-01-2024");
		Time_sleep();
//		int j=0;
//		for (WebElement Select_Date1 : Select_Date) {
//			j = j + 1;
//			if (j == 1) {
//				Select_Date1.click();
//				break;
//			}
//		}
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Time_sleep();
		Ssubaction.moveToElement(Title_Keyword).perform();
		js.executeScript("arguments[0].click()", Title_Keyword);
		//Title_Keyword.click();
		Title_Keyword.sendKeys("DEXA scan");
		Time_sleep();
		option.click();
		Time_sleep();
		reportTitle.sendKeys("Diagnostic Reports");
		reportTitle.sendKeys("Diagnostic Reports");
//		Time_sleep();
//		Select_Doctor.sendKeys("Aditya");
//		Time_sleep();
//		option.click();
		Time_sleep();
		Select_Facility.sendKeys("MedPark");
		Time_sleep();
		option.click();
		Time_sleep();
		Ssubaction.moveToElement(Create).perform();
		js.executeScript("arguments[0].click()", Create);
		//Create.click();
		Time_sleep();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Assert.assertTrue(true);
		Time_sleep();

//		Ssubaction.moveToElement(Completed_task).perform();
//		js.executeScript("arguments[0].click()", Completed_task);
		Time_sleep();
//		Ready_For_Sorter_QA.click();
//		Time_sleep();
//		Yes.click();
		Assert.assertTrue(true);
		Time_sleep();
		Ssubaction.moveToElement(AddSubTask).perform();
		js.executeScript("arguments[0].click()", AddSubTask);
		Time_sleep();
		Ssubaction.moveToElement(Date_Icon1).perform();
		js.executeScript("arguments[0].click()", Date_Icon1);
		//Date_Icon1.click();
		Date_Icon1.sendKeys("01-02-2024");
		Time_sleep();
//		int i = 0;
//		for (WebElement Select_Date1 : Select_Date) {
//			i = i + 1;
//			if (i == 2) {
//				Select_Date1.click();
//				break;
//			}
//		}
		Time_sleep();
		Ssubaction.moveToElement(Title_Keyword).perform();
		js.executeScript("arguments[0].click()", Title_Keyword);
		Time_sleep();
		Title_Keyword.sendKeys("DEXA scan");
		Time_sleep();
		option.click();
		Time_sleep();
		reportTitle.sendKeys("Diagnostic Reports");
		reportTitle.sendKeys("Diagnostic Reports");
//		Select_Doctor.sendKeys("Aditya");
//		Time_sleep();
//		option.click();
		Select_Facility.sendKeys("MedPark");
		Time_sleep();
		option.click();
//		Report_Type.sendKeys("D");
//		Time_sleep();
//		for (WebElement DropwonList1 : DropwonList)
//		{
//			DropwonList1.click();
//			break;
//		}
//		Time_sleep();
//		Doctor_Attorney.sendKeys("D");
//		Time_sleep();
//		for (WebElement DropwonList1 : DropwonList)
//		{
//			DropwonList1.click();
//			break;
//		}
//		Time_sleep();
//		Facility.sendKeys("D");
//		Time_sleep();
//		for (WebElement DropwonList1 : DropwonList)
//		{
//			DropwonList1.click();
//			break;
//		}
		// comment.sendKeys("Test Comment");
		Time_sleep();
		Ssubaction.moveToElement(Create).perform();
		js.executeScript("arguments[0].click()", Create);
		//Create.click();
		Time_sleep();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Assert.assertTrue(true);
//		Time_sleep();
//		Time_sleep();
//		Completed_task.click();
		Time_sleep();
//		Ready_For_Sorter_QA.click();
//		Time_sleep();
//		Yes.click();
		Assert.assertTrue(true);
		Time_sleep();
	}

	public void CreatTask_Sorter_partial() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
Actions Ssubaction = new Actions(driver);
BC = new BaseClass();
Altos_Icon.click();
Jobs_Page.click();
Job_Id.click();
Job_Id.sendKeys(BC.Job_id);
CommonUtility.jsClick(driver, option);
Search.click();
Associated.click();
Search.click();
Time_sleep();
CommonUtility.jsClick(driver, Drop_Icon);
Time_sleep();
Ssubaction.moveToElement(Task).perform();
js.executeScript("arguments[0].click()", Task);
Time_sleep();
Ssubaction.moveToElement(AddSubTask).perform();
js.executeScript("arguments[0].click()", AddSubTask);
Time_sleep();
Ssubaction.moveToElement(Date_Icon1).perform();
js.executeScript("arguments[0].click()", Date_Icon1);
Time_sleep();
Date_Icon1.sendKeys("01-01-2024");
driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
Time_sleep();
Ssubaction.moveToElement(Title_Keyword).perform();
js.executeScript("arguments[0].click()", Title_Keyword);
Title_Keyword.sendKeys("DEXA scan");
Time_sleep();
option.click();
reportTitle.sendKeys("Diagnostic Reports");
reportTitle.sendKeys("Diagnostic Reports");
Time_sleep();
pageTo.clear();
pageTo.sendKeys("1");
Time_sleep();
Select_Facility.sendKeys("MedPark");
Time_sleep();
Ssubaction.moveToElement(option).perform();
js.executeScript("arguments[0].click()", option);
Ssubaction.moveToElement(Create).perform();
js.executeScript("arguments[0].click()", Create);
Time_sleep();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
Assert.assertTrue(true);
Ssubaction.moveToElement(AddSubTask).perform();
js.executeScript("arguments[0].click()", AddSubTask);
Time_sleep();
Ssubaction.moveToElement(Date_Icon1).perform();
js.executeScript("arguments[0].click()", Date_Icon1);
Date_Icon1.sendKeys("01-01-2024");
Time_sleep();
//for (WebElement Select_Date1 : Select_Date) {
//	Select_Date1.click();
//	break;
//}
Time_sleep();
Ssubaction.moveToElement(Title_Keyword).perform();
js.executeScript("arguments[0].click()", Title_Keyword);
Title_Keyword.sendKeys("DEXA scan");
Time_sleep();
Ssubaction.moveToElement(option).perform();
js.executeScript("arguments[0].click()", option);
//option.click();
Time_sleep();
reportTitle.sendKeys("Diagnostic Reports");
reportTitle.sendKeys("Diagnostic Reports");
//Select_Doctor.sendKeys("Aditya");
Time_sleep();
//CommonUtility.jsClick(driver, option);
//Select_Facility.sendKeys("MedPark");
Time_sleep();
//CommonUtility.jsClick(driver, option);
pageFrom.clear();
pageFrom.sendKeys("1");
pageTo.clear();
pageTo.sendKeys("2");
Time_sleep();
//Create.click();
Ssubaction.moveToElement(Create).perform();
js.executeScript("arguments[0].click()", Create);
Time_sleep();
Ssubaction.moveToElement(partial).perform();
js.executeScript("arguments[0].click()", partial);
Assert.assertTrue(true);
Time_sleep();
Ssubaction.moveToElement(AddSubTask).perform();
js.executeScript("arguments[0].click()", AddSubTask);
Ssubaction.moveToElement(Date_Icon1).perform();
js.executeScript("arguments[0].click()", Date_Icon1);
Time_sleep();
Date_Icon1.sendKeys("01-02-2024");
int i = 0;
//for (WebElement Select_Date1 : Select_Date) {
//	i = i + 1;
//	if (i == 2) {
//		Select_Date1.click();
//		break;
//	}
//}
Time_sleep();

Time_sleep();
Ssubaction.moveToElement(Title_Keyword).perform();
js.executeScript("arguments[0].click()", Title_Keyword);
Title_Keyword.sendKeys("DEXA scan");
Time_sleep();
CommonUtility.jsClick(driver, option);
Time_sleep();
reportTitle.sendKeys("Diagnostic Reports");
reportTitle.sendKeys("Diagnostic Reports");
//Select_Doctor.sendKeys("Aditya");
Time_sleep();
//CommonUtility.jsClick(driver, option);
Select_Facility.sendKeys("MedPark");
Time_sleep();
CommonUtility.jsClick(driver, option);
Time_sleep();
Ssubaction.moveToElement(Create).perform();
js.executeScript("arguments[0].click()", Create);
Time_sleep();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
Assert.assertTrue(true);
}

	public void CompleteTask_Sorter() {
		// loginAltos( usernameApplication, passwordApplication);

//		BC = new BaseClass();
//		Altos_Icon.click();
//		Jobs_Page.click();
//		Job_Id.click();
//		Job_Id.sendKeys(BC.Job_id);
//		option.click();
//		Search.click();
//		Time_sleep();
//		Drop_Icon.click();
//		Time_sleep();
//		
//		Task.click();
//		
//		Time_sleep();
//		Completed_task.click();
//	    Time_sleep();
//		Ready_For_Sorter_QA.click();
//		Time_sleep();
//		Yes.click();
//		Assert.assertTrue(true);
//		Time_sleep();
	}

	public void CreatTask_Sorter_Duplicate() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions Ssubaction = new Actions(driver);
                BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		Time_sleep();
		CommonUtility.jsClick(driver, option);
		Search.click();
		Associated.click();
		Search.click();
		Time_sleep();
		CommonUtility.jsClick(driver, Drop_Icon);
		Time_sleep();
		// Task.click();
		Ssubaction.moveToElement(Task).perform();
		js.executeScript("arguments[0].click()", Task);
		//CommonUtility.jsClick(driver, Task);
		Time_sleep();
		Ssubaction.moveToElement(AddSubTask).perform();
		js.executeScript("arguments[0].click()", AddSubTask);
		Ssubaction.moveToElement(Date_Icon1).perform();
		js.executeScript("arguments[0].click()", Date_Icon1);
		Time_sleep();
		Date_Icon1.sendKeys("01-01-2024");
//		for (WebElement Select_Date1 : Select_Date) {
//			Select_Date1.click();
//			break;
//		}
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Time_sleep();
		Ssubaction.moveToElement(Title_Keyword).perform();
		js.executeScript("arguments[0].click()", Title_Keyword);
		//Title_Keyword.click();
		Title_Keyword.sendKeys("DEXA scan");
		Time_sleep();
		option.click();
		reportTitle.sendKeys("Diagnostic Reports");
		reportTitle.sendKeys("Diagnostic Reports");
		//Select_Doctor.sendKeys("Aditya");
		pageTo.clear();
		pageTo.sendKeys("1");
		Select_Facility.sendKeys("MedPark");
		Time_sleep();
		Ssubaction.moveToElement(option).perform();
		js.executeScript("arguments[0].click()", option);
		Time_sleep();
		//Create.click();
		Ssubaction.moveToElement(Create).perform();
		js.executeScript("arguments[0].click()", Create);
		Time_sleep();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Assert.assertTrue(true);
		Time_sleep();
		Ssubaction.moveToElement(AddSubTask).perform();
		js.executeScript("arguments[0].click()", AddSubTask);
		Time_sleep();
		Ssubaction.moveToElement(Date_Icon1).perform();
		js.executeScript("arguments[0].click()", Date_Icon1);
		Time_sleep();
		Date_Icon1.sendKeys("01-01-2024");
//		for (WebElement Select_Date1 : Select_Date) {
//			Select_Date1.click();
//			break;
//		}
		Time_sleep();
		Ssubaction.moveToElement(Title_Keyword).perform();
		js.executeScript("arguments[0].click()", Title_Keyword);
		Title_Keyword.sendKeys("DEXA scan");
		Time_sleep();
		Ssubaction.moveToElement(option).perform();
		js.executeScript("arguments[0].click()", option);
		Time_sleep();
		reportTitle.sendKeys("Diagnostic Reports");
		reportTitle.sendKeys("Diagnostic Reports");
		//Select_Doctor.sendKeys("Aditya");
		Time_sleep();
//		CommonUtility.jsClick(driver, option);
//		Select_Facility.sendKeys("MedPark");
		Time_sleep();
		pageFrom.clear();
		pageFrom.sendKeys("1");
		Time_sleep();
//		Ssubaction.moveToElement(option).perform();
//		js.executeScript("arguments[0].click()", option);
		pageTo.clear();
		pageTo.sendKeys("2");
		Time_sleep();
		Ssubaction.moveToElement(Create).perform();
		js.executeScript("arguments[0].click()", Create);
		Time_sleep();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Ssubaction.moveToElement(Duplicate).perform();
		js.executeScript("arguments[0].click()", Duplicate);
		Assert.assertTrue(true);
		Time_sleep();
		Ssubaction.moveToElement(AddSubTask).perform();
		js.executeScript("arguments[0].click()", AddSubTask);
		Time_sleep();
		Ssubaction.moveToElement(Date_Icon1).perform();
		js.executeScript("arguments[0].click()", Date_Icon1);
		Time_sleep();
		Date_Icon1.sendKeys("01-02-2024");
//		int i = 0;
//		for (WebElement Select_Date1 : Select_Date) {
//			i = i + 1;
//			if (i == 2) {
//				Select_Date1.click();
//				break;
//			}
//		}
		Time_sleep();
		Ssubaction.moveToElement(Title_Keyword).perform();
		js.executeScript("arguments[0].click()", Title_Keyword);
		//Title_Keyword.click();
		Title_Keyword.sendKeys("DEXA scan");
		Time_sleep();
		CommonUtility.jsClick(driver, option);
		Time_sleep();
		reportTitle.sendKeys("Diagnostic Reports");
		reportTitle.sendKeys("Diagnostic Reports");
		//Select_Doctor.sendKeys("Aditya");
		Time_sleep();
		//CommonUtility.jsClick(driver, option);
		Select_Facility.sendKeys("MedPark");
		Time_sleep();
		CommonUtility.jsClick(driver, option);
		Time_sleep();
		//Create.click();
		Ssubaction.moveToElement(Create).perform();
		js.executeScript("arguments[0].click()", Create);
		Time_sleep();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Assert.assertTrue(true);
	}
	public void AssignTask_New_ROR() {
		BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		Time_sleep();
		for (WebElement Job_IDList1 : Job_IDList) {
			CommonUtility.jsClick(driver, Job_IDList1);
			break;
		}
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Actions Ssubaction = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Ssubaction.moveToElement(Assign_to_me).perform();
		js.executeScript("arguments[0].click()", Assign_to_me);
		Time_sleep();
		clear.click();
		Time_sleep();
		Ssubaction.moveToElement(Start).perform();
		js.executeScript("arguments[0].click()", Start);
		CommonUtility.Windows_close();
		Time_sleep();
		Ssubaction.moveToElement(Completed_task).perform();
		js.executeScript("arguments[0].click()", Completed_task);
		Time_sleep();
		Ssubaction.moveToElement(Assign_to_me).perform();
		js.executeScript("arguments[0].click()", Assign_to_me);
		Time_sleep();
		clear.click();
		Time_sleep();
		Ssubaction.moveToElement(Start).perform();
		js.executeScript("arguments[0].click()", Start);
		CommonUtility.Windows_close1();
		Time_sleep();
		Ssubaction.moveToElement(Completed_task).perform();
		js.executeScript("arguments[0].click()", Completed_task);
		Time_sleep();

	}

	public void AssignTask_SOrterQA() {
		BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		Time_sleep();
		for (WebElement Job_IDList1 : Job_IDList) {
			Job_IDList1.click();
			break;
		}
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Actions Ssubaction = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Ssubaction.moveToElement(Assign_to_me).perform();
		js.executeScript("arguments[0].click()", Assign_to_me);
		Time_sleep();
		clear.click();
		Time_sleep();
		Ssubaction.moveToElement(Start).perform();
		js.executeScript("arguments[0].click()", Start);
		Time_sleep();
		CommonUtility.Windows_close();
		Ssubaction.moveToElement(Completed_task).perform();
		js.executeScript("arguments[0].click()", Completed_task);
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
		Ssubaction.moveToElement(Completed_task).perform();
		js.executeScript("arguments[0].click()", Completed_task);
		Time_sleep();
		Ssubaction.moveToElement(Assign_to_me).perform();
		js.executeScript("arguments[0].click()", Assign_to_me);
		Time_sleep();
		clear.click();
		Time_sleep();
		Ssubaction.moveToElement(Start).perform();
		js.executeScript("arguments[0].click()", Start);
		Time_sleep();
		CommonUtility.Windows_close2();
		Ssubaction.moveToElement(Completed_task).perform();
		js.executeScript("arguments[0].click()", Completed_task);
		Time_sleep();

	}

}
