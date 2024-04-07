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
import org.openqa.selenium.Keys;

import com.altos.Utility.*;

public class LogingMT_page {
	WebDriver driver;
	public BaseClass BC;

	public LogingMT_page(WebDriver ldriver) {
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
	@FindBy(xpath = "//*[text()='SORTERQA']")
	WebElement Sorter_QA;
	@FindBy(xpath = "//*[text()='+ New']")
	WebElement ADD;
	@FindBy(xpath = "//*[@formcontrolname='reportTitle']")
	WebElement reportTitle;
	@FindBy(xpath = "(//*[@formcontrolname='reportTitle'])[2]")
	WebElement reportTitle1;
	@FindBy(xpath = "//*[@placeholder='Select Title']")
	WebElement reportTitle2;
	
	@FindBy(xpath = "(//*[@role='combobox'])[4]")
	WebElement title_keyword;
	@FindBy(xpath = "(//*[@fill='currentColor'])[2]")
	WebElement Calender1;
	@FindBy(xpath = "(//*[@fill='currentColor'])[3]")
	WebElement Calender2;
	@FindBy(xpath = "//*[text()=' 14 ']")
	WebElement Date_pick;
	
	@FindBy(xpath = "(//*[@role='combobox'])[5]")
	WebElement title_keyword1;
	@FindBy(xpath = "(//*[@role='combobox'])[8]")
	WebElement report_type;

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
	@FindBy(xpath = "//span[normalize-space()='Ready For MT2']")
	WebElement Ready_For_MT2;
	@FindBy(xpath = "//span[normalize-space()='Ready For QA']")
	WebElement Ready_For_QA;
	@FindBy(xpath = "//div[contains(text(),'MT2')]")
	WebElement Tab_MT2;
	@FindBy(xpath = "//div[@class='content']")
	WebElement logout_Icon;
	@FindBy(xpath = "//span[normalize-space()='LOG OUT']")
	WebElement LOG_OUT;
	@FindBy(xpath = "//i[@class='mat-tooltip-trigger fa fa-user oa transition x-md ng-star-inserted']")
	WebElement HRMS;
	@FindBy(xpath = "//label[@for='mat-checkbox-1-input']//span[@class='mat-checkbox-inner-container']")
	WebElement Completed;
	@FindBy(xpath = "//i[@class=\"fa fa-eraser\"]")
	WebElement clear;
	@FindBy(xpath = "//mat-icon[text()='undo_icon']")
	WebElement undo_icon;
	@FindBy(xpath = "//span[text()=' Complete ']")
	WebElement Complete;
	@FindBy(xpath = "/html/body/div[1]/app-root/div/div/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-task-management-view/div[2]/div/div[2]/div[1]/div/div[1]/mat-checkbox/label/span[1]")
	WebElement Assigned;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement a_select;
	@FindBy(xpath = "//*[text()=' Create ']")
	WebElement create;
	@FindBy(xpath = "//*[text()=' Mark as Duplicate ']")
	WebElement Mark_as_duplicate;
	@FindBy(xpath = "//*[text()='View Primary Records']")
	WebElement View_primary_record;
	@FindBy(xpath = "//*[text()=' Un Duplicate ']")
	WebElement Un_duplicate;
	@FindBy(xpath = "//*[text()='edit']")
	WebElement Edit;
	@FindBy(xpath = "//*[text()='Medical Record']")
	WebElement Medicalrecord;
	@FindBy(xpath = "//*[@role='listbox']//mat-option//span")
	List <WebElement> dropdown;
	@FindBy(xpath = "//*[text()=' Save ']")
	WebElement Save;
	@FindBy(xpath = "//*[text()=' view_list ']")
	WebElement Expand;
	@FindBy(xpath = "//*[text()=' Un Duplicate ']")
	WebElement Un_duplicate1;
	@FindBy(xpath = "//*[text()=' Change Primary ']")
	WebElement Change_primary;
	@FindBy(xpath = "//*[text()=' Save Changes ']")
	WebElement Save_changes;
	@FindBy(xpath = "//*[@class='mat-checkbox mat-accent']/label/span[1]")
	WebElement checkmark;
	
	@FindBy(xpath = "(//*[@role='row'])[2]//td/mat-checkbox/label/span[1]")
	WebElement Cheak_box1;
	@FindBy(xpath = "//*[@id='createRow1']/td[1]/mat-checkbox/label/span[1]")
	WebElement Cheak_box2;
	@FindBy(xpath = "//*[text()=' Group ']")
	WebElement Group;
	@FindBy(xpath = "(//*[text()='MT'])[1]")
	WebElement MT;
	@FindBy(xpath = "//*[text()=' 2185 ']")
	WebElement num;
	@FindBy(xpath = "//span[text()=' Ready For MT2 ']")
	WebElement ready_for_mt_2;
	@FindBy(xpath = "(//*[text()=' Assign to me'])[1]")
	WebElement Assign_to_me1;
//	@FindBy(xpath = "//*[text()='Assigned']")
//	WebElement Assigned;
	//*[text()='Assigned']
	@FindBy(xpath = "(//*[text()=' search '])[1]")
	WebElement search;
	@FindBy(xpath = "(//*[@type='checkbox'])[1]")
	WebElement check_b;
	@FindBy(xpath = "//*[@id='id_viewer_overlay']")
	WebElement only_office;
	@FindBy(xpath = "//*[@id='createRow0']/td[15]/button[1]/span[1]/img")
	WebElement Play_button;
	@FindBy(xpath = "//*[@id='createRow0']/td[15]/button[4]/span[1]/img")
	WebElement Delete_icon;
	@FindBy(xpath = "//*[@id='createRow0']/td[15]/button[2]/span[1]/img")
	WebElement Delete_icon3;
	//*[@id="createRow0"]/td[15]/button[2]/span[1]/img
	@FindBy(xpath = "//*[@id='createRow0']/td[14]/button[2]/span[1]/img")
	WebElement Delete_icon1;
	@FindBy(xpath = "//*[@formcontrolname='reasonForDeletion']")
	WebElement Comment;
	@FindBy(xpath = "//*[text()='Yes']")
	WebElement Yes;
	@FindBy(xpath = "//*[text()='Preview']")
	WebElement preview;
	
	@FindBy(xpath = "//*[text()='undo_icon']")
	WebElement revert_button;
	@FindBy(xpath = "//*[text()='undo']")
	WebElement revert_button1;
	
	@FindBy(xpath = "//*[@formcontrolname='reasonForDeletion']")
	WebElement reason_for_delete;

	@FindBy(xpath = "//*[text()=' clear_all ']")
	WebElement Clear;
	@FindBy(xpath = "//html")
	WebElement empty_space;
	@FindBy(xpath = "//button[normalize-space()='No']")WebElement No;
	

	public void Time_sleep() {

		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {

		}
	}

	public void log_out() {
		logout_Icon.click();
		Time_sleep();
		LOG_OUT.click();
		Time_sleep();
	}

	public void Complete_MT_Task() {
		BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		Associated.click();
		Search.click();
		Job_NoList1.click();
		Time_sleep();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Actions Ssubaction = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Ssubaction.moveToElement(Assigned).perform();
		js.executeScript("arguments[0].click()", Assigned);
		Search.click();
		Assign_to_me.click();
		Time_sleep();
		Time_sleep();
		Complete.click();
		No.click();
		Time_sleep();
		Assert.assertTrue(true);
		Time_sleep();
	}

	public void Complete_MT1_Task() {
		BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		System.out.println(Job_Id);
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		Associated.click();
		Search.click();
		Time_sleep();
		Job_NoList1.click();
		Time_sleep();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
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
		Time_sleep();
		CommonUtility.Windows_close();
        Complete.click();
		Time_sleep();
		Ready_For_MT2.click();
		 No.click();
		Ssubaction.moveToElement(Assigned).perform();
		js.executeScript("arguments[0].click()", Assigned);
		Search.click();
		Ssubaction.moveToElement(Assign_to_me).perform();
		js.executeScript("arguments[0].click()", Assign_to_me);
		Time_sleep();
		Ssubaction.moveToElement(clear).perform();
		js.executeScript("arguments[0].click()", clear);
		Time_sleep();
		Ssubaction.moveToElement(Start).perform();
		js.executeScript("arguments[0].click()", Start);
		Time_sleep();
		CommonUtility.Windows_close1();
		Ssubaction.moveToElement(Complete).perform();
		js.executeScript("arguments[0].click()", Complete);
		Ssubaction.moveToElement(Ready_For_MT2).perform();
		js.executeScript("arguments[0].click()", Ready_For_MT2);
		No.click();
		Assert.assertTrue(true);
		Time_sleep();
	}

	public void Complete_MT2_Task() {

		BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		Search.click();
		Associated.click();
		Search.click();
		Time_sleep();
		Job_NoList1.click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Actions Ssubaction = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Ssubaction.moveToElement(Tab_MT2).perform();
		js.executeScript("arguments[0].click()", Tab_MT2);
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
		CommonUtility.Windows_close();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		Time_sleep();
        jsExecutor.executeScript("window.scrollBy(0, -100)");
		Time_sleep();
//		Textarea.clear();
//		Textarea.sendKeys("A cardiac surgeon is a medical doctor who performs surgery on the heart and the major blood vessels around it. There are several different medical specialties that a cardiac surgeon may fall under");
		Time_sleep();
		Ssubaction.moveToElement(Complete).perform();
		js.executeScript("arguments[0].click()", Complete);
		Ssubaction.moveToElement(Ready_For_QA).perform();
		js.executeScript("arguments[0].click()", Ready_For_QA);
		No.click();
		Time_sleep();
		
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
		CommonUtility.Windows_close1();
		jsExecutor.executeScript("window.scrollBy(0, -100)");
		Time_sleep();
//		Textarea.clear();
//		Textarea.sendKeys("A cardiac surgeon is a medical doctor who performs surgery on the heart and the major blood vessels around it. There are several different medical specialties that a cardiac surgeon may fall under");
		Time_sleep();
//		for (WebElement task_done1 : task_dones)
//		{
//			Time_sleep();
//			task_done1.click();
//			System.out.println(task_done1.getText());
//		}
		Time_sleep();
		Ssubaction.moveToElement(Complete).perform();
		js.executeScript("arguments[0].click()", Complete);
		Ssubaction.moveToElement(Ready_For_QA).perform();
		js.executeScript("arguments[0].click()", Ready_For_QA);
		No.click();
		Time_sleep();
		Assert.assertTrue(true);
		Time_sleep();
	}

	public void loginAltos_QA(String usernameApplication, String passwordApplication) {
//			Switch_Id.click();
//			Uname.clear();
//			Uname.sendKeys(usernameApplication);
//			Password.clear();
//			Password.sendKeys(passwordApplication);
//			Login.click();
//			driver.getTitle();
//			System.out.println(Dashbord.getText());
//			Altos_Icon.click();
//			
//			
//			
	}

	public void Complete_QA_Task(String usernameApplication, String passwordApplication) {
//			loginAltos_QA( usernameApplication, passwordApplication);
//			Altos_Icon.click();
//			Job_page.click();
//			Associated.click();
//			Search.click();
//
//			Job_NoList1.click();
//
//			Assign_to_me.click();
//			Time_sleep();
//			//Expand_more.click();
//			Textarea.clear();
//			Textarea.sendKeys("A cardiac surgeon is a medical doctor who performs surgery on the heart and the major blood vessels around it. There are several different medical specialties that a cardiac surgeon may fall under,\"\r\n"
//					+ "					+ \" some of which have overlapping areas of focus.Automation");
//			Time_sleep();
////			for (WebElement task_done1 : task_dones)
////			{
////				task_done1.click();
////			}
//			task_done.click();
//			log_out();
//			Assert.assertTrue(true);
	}

	public void loginAltos_QC(String usernameApplication, String passwordApplication) {
//			Switch_Id.click();
//			Uname.clear();
//			Uname.sendKeys(usernameApplication);
//			Password.clear();
//			Password.sendKeys(passwordApplication);
//			Login.click();
//			driver.getTitle();
//			System.out.println(Dashbord.getText());
//			Altos_Icon.click();
//			
	}

//		
	public void Complete_QC_Task(String usernameApplication, String passwordApplication) {
//			loginAltos_QC( usernameApplication, passwordApplication);
//			Altos_Icon.click();
//			Job_page.click();
//			Associated.click();
//			Search.click();
//			Time_sleep();
//
//			Job_NoList1.click();
//
//			Assign_to_me.click();
//			Time_sleep();
//			//Expand_more.click();
//			Textarea.clear();
//			Textarea.sendKeys("A cardiac surgeon is a medical doctor who performs surgery on the heart and the major blood vessels around it. There are several different medical specialties that a cardiac surgeon may fall under,"
//					+ " some of which have overlapping areas of focus. Automation");
//			Time_sleep();
////			for (WebElement task_done1 : task_dones)
////			{
////				task_done1.click();
////			}
//			task_done.click();
//			log_out();
//			Time_sleep();
//			Assert.assertTrue(true);
	}
	public void revert_job() {
		BC = new BaseClass();
	   CommonUtility.jsClick(driver, Altos_Icon);
	   Time_sleep();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		Associated.click();
		Search.click();
		Time_sleep();
	CommonUtility.jsClick(driver, Job_NoList1);
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Time_sleep();
		CommonUtility.jsClick(driver, Sorter_QA);
		Time_sleep();
		CommonUtility.Scrolldown();
		Time_sleep();
		CommonUtility.jsClick(driver, ADD);
		Time_sleep();
		reportTitle.sendKeys("sampledata");
		title_keyword.sendKeys("a");
		a_select.click();
		String as=driver.getWindowHandle();
		CommonUtility.jsClick(driver, create);
		Time_sleep();
		CommonUtility.jsClick(driver, Play_button);Time_sleep();
		Time_sleep();
	Set<String>ap=driver.getWindowHandles();
	for(String as1:ap) {
		if(!as1.equals(as)) {
			driver.switchTo().window(as1);
			driver.close();
		}
	}driver.switchTo().window(as);
		
		CommonUtility.jsClick(driver, Complete);
		Time_sleep();
		No.click();
	CommonUtility.jsClick(driver, check_b);
		Time_sleep();
		search.click();
		Time_sleep();
		CommonUtility.jsClick(driver, MT);
		Time_sleep();
		CommonUtility.jsClick(driver, Assigned);
		Time_sleep();
		CommonUtility.jsClick(driver, Search);
		Time_sleep();
		CommonUtility.jsClick(driver, Assign_to_me1);
		Time_sleep();
		CommonUtility.jsClick(driver, Play_button);Time_sleep();
		Set<String>ap1=driver.getWindowHandles();
		for(String as1:ap1
				) {
			if(!as1.equals(as)) {
				driver.switchTo().window(as1);
				driver.close();
			}
		}driver.switchTo().window(as);
		Time_sleep();
		CommonUtility.jsClick(driver, Complete);
		Time_sleep();
		No.click();
		CommonUtility.jsClick(driver, ready_for_mt_2);
		Time_sleep();
		CommonUtility.jsClick(driver, MT);
		Time_sleep();
		CommonUtility.jsClick(driver, check_b);
		Time_sleep();
		
		search.click();
		Time_sleep();
		CommonUtility.jsClick(driver, revert_button);
		Clear.click();
		search.click();
		Time_sleep();
		 Assert.assertTrue(Play_button.isDisplayed(), "Play_button is  visible on the webpage");
		 Time_sleep();
		 CommonUtility.jsClick(driver, Delete_icon);
		 Time_sleep();
		 Comment.sendKeys("delete");
		 CommonUtility.jsClick(driver, Yes);
		 Time_sleep();
		 CommonUtility.jsClick(driver, ADD);
			Time_sleep();
			reportTitle.sendKeys("sampledata");
			title_keyword.sendKeys("Therapy Notes");
			Time_sleep();
			a_select.click();
			Time_sleep();
			
			Time_sleep();
			CommonUtility.jsClick(driver, create);
			Time_sleep();
			CommonUtility.jsClick(driver, ADD);
			Time_sleep();
			reportTitle1.sendKeys("sampledata");
			title_keyword1.sendKeys("Therapy Notes");
			a_select.click();
			Time_sleep();
			CommonUtility.jsClick(driver, create);
			Time_sleep();
			CommonUtility.jsClick(driver, Cheak_box1);
			Time_sleep();
			CommonUtility.jsClick(driver, Cheak_box2);
			Time_sleep();
			CommonUtility.jsClick(driver, Group);
			Time_sleep();
			CommonUtility.jsClick(driver, Assign_to_me1);
			Time_sleep();
			CommonUtility.jsClick(driver, revert_button1);
			Time_sleep();
			reason_for_delete.sendKeys("revertisdone");
			Time_sleep();
			CommonUtility.jsClick(driver, Yes);
			Time_sleep();
			CommonUtility.jsClick(driver, Yes);
			CommonUtility.jsClick(driver, Delete_icon);
			 Time_sleep();
			 Comment.sendKeys("delete");
			 CommonUtility.jsClick(driver, Yes);
			 Time_sleep();
			 CommonUtility.jsClick(driver, Delete_icon1);
			 Time_sleep();
			 Comment.sendKeys("delete");
			 CommonUtility.jsClick(driver, Yes);
			 Time_sleep();
		
		
		
		
	}
	public void Edit_and_preview() {
		
		BC = new BaseClass();
		   CommonUtility.jsClick(driver, Altos_Icon);
			Jobs_Page.click();
			Job_Id.click();
			Job_Id.sendKeys(BC.Job_id);
			option.click();
			Search.click();
			Associated.click();
			Search.click();
			Time_sleep();
		CommonUtility.jsClick(driver, Job_NoList1);
			driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
			Time_sleep();
			CommonUtility.jsClick(driver, Sorter_QA);
			Time_sleep();
			CommonUtility.Scrolldown();
			Time_sleep();
			CommonUtility.jsClick(driver, ADD);
			Time_sleep();
			reportTitle.sendKeys("sampledata");
			title_keyword.sendKeys("a");
			a_select.click();
			String as=driver.getWindowHandle();
			CommonUtility.jsClick(driver, create);
			Time_sleep();
			CommonUtility.jsClick(driver, Edit);
			CommonUtility.jsClick(driver, Medicalrecord);
			Time_sleep();
			CommonUtility.findAndClickElementByKeyword(dropdown,"Miscellaneous" );
			Time_sleep();
			reportTitle2.clear();
			Time_sleep();
			reportTitle2.sendKeys(CommonUtility.generateUniqueText());
			Time_sleep();
			CommonUtility.jsClick(driver, Save);
			Time_sleep();
			CommonUtility.jsClick(driver, Play_button);Time_sleep();
			Time_sleep();
		Set<String>ap=driver.getWindowHandles();
		for(String as1:ap) {
			if(!as1.equals(as)) {
				driver.switchTo().window(as1);
				driver.close();
			}
		}driver.switchTo().window(as);
			
			CommonUtility.jsClick(driver, Complete);
			Time_sleep();
			No.click();
		CommonUtility.jsClick(driver, check_b);
			Time_sleep();
			search.click();
			Time_sleep();
			CommonUtility.jsClick(driver, revert_button);
			Time_sleep();
		CommonUtility.jsClick(driver, Clear);
			Time_sleep();
			search.click();
			Time_sleep();
			 Assert.assertTrue(Play_button.isDisplayed(), "Play_button is  visible on the webpage");
			 Time_sleep();
			 CommonUtility.jsClick(driver, Delete_icon);
			 Time_sleep();
			 Comment.sendKeys("delete");
			 CommonUtility.jsClick(driver, Yes);
			 Time_sleep();
			 CommonUtility.jsClick(driver, preview);
			 Time_sleep();
			 Time_sleep();
			 
			 
	}
	
public void Dulicate_unduplicate_task() {
	BC = new BaseClass();
	   CommonUtility.jsClick(driver, Altos_Icon);
	   Time_sleep();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		Associated.click();
		Search.click();
		Time_sleep();
	CommonUtility.jsClick(driver, Job_NoList1);
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Time_sleep();
		CommonUtility.jsClick(driver, Sorter_QA);
		Time_sleep();
		CommonUtility.Scrolldown();
		Time_sleep();
		CommonUtility.jsClick(driver, ADD);
		Time_sleep();
		reportTitle.sendKeys("sampledata");
		title_keyword.sendKeys("a");
		a_select.click();
		Calender1.click();
		Time_sleep();
		Date_pick.click();
		Time_sleep();
		String as=driver.getWindowHandle();
		CommonUtility.jsClick(driver, create);

CommonUtility.jsClick(driver, Sorter_QA);
Time_sleep();
CommonUtility.Scrolldown();
Time_sleep();
CommonUtility.jsClick(driver, ADD);
Time_sleep();
reportTitle.sendKeys("sampledata");
title_keyword.sendKeys("a");
a_select.click();
Calender1.click();
Time_sleep();
Date_pick.click();
Time_sleep();
String as1=driver.getWindowHandle();
CommonUtility.jsClick(driver, create);
Mark_as_duplicate.click();
Time_sleep();
View_primary_record.click();
Time_sleep();
Un_duplicate.click();
Time_sleep();
CommonUtility.jsClick(driver, Delete_icon);
Time_sleep();
 Comment.sendKeys("delete");
 CommonUtility.jsClick(driver, Yes);
 Time_sleep();
 CommonUtility.jsClick(driver, Delete_icon);
 Time_sleep();
  Comment.sendKeys("delete");
 
		CommonUtility.jsClick(driver, Yes);
 CommonUtility.jsClick(driver, MT);
 //driver.navigate().refresh();
 CommonUtility.jsClick(driver, ADD);
	Time_sleep();
	reportTitle.sendKeys("sampledata");
	title_keyword.sendKeys("a");
	a_select.click();
	Calender1.click();
	Time_sleep();
	Date_pick.click();
	Time_sleep();
	String as3=driver.getWindowHandle();
	CommonUtility.jsClick(driver, create);
	Time_sleep();
	 CommonUtility.jsClick(driver, ADD);
		Time_sleep();
		reportTitle.sendKeys("sampledata");
		title_keyword.sendKeys("a");
		a_select.click();
		Calender1.click();
		Time_sleep();
		Date_pick.click();
		Time_sleep();
		//String as3=driver.getWindowHandle();
		CommonUtility.jsClick(driver, create);
		CommonUtility.Scrolldown();
		CommonUtility.jsClick(driver,Mark_as_duplicate);
		Time_sleep();
		CommonUtility.jsClick(driver,Expand);
		Time_sleep();
		CommonUtility.moveToElement(driver, Change_primary);
		CommonUtility.jsClick(driver, Change_primary);
		Time_sleep();
		CommonUtility.jsClick(driver,checkmark);
		Time_sleep();
		CommonUtility.jsClick(driver, Save_changes);
		Time_sleep();
		Time_sleep();
		CommonUtility.jsClick(driver,Expand);
		Time_sleep();
		CommonUtility.jsClick(driver,Un_duplicate1);
		Time_sleep();
		 CommonUtility.jsClick(driver, Delete_icon3);
		 Time_sleep();
		  Comment.sendKeys("delete");
		  CommonUtility.jsClick(driver, Yes);
		  CommonUtility.jsClick(driver, Delete_icon3);
			 Time_sleep();
			  Comment.sendKeys("delete");
			  CommonUtility.jsClick(driver, Yes);
}}
