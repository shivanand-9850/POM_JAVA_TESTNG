package com.altos.Page_object;

import java.io.File;
import java.io.IOException;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.text.DecimalFormat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.Random;
import com.altos.Page_object.*;
import com.aventstack.extentreports.ExtentTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;
import com.altos.Utility.*;
import org.openqa.selenium.Dimension;

public class LogingTL_page1 extends LogingTL_page {

	public LogingTL_page1(WebDriver ldriver) {
		super(ldriver);
		WebDriver driver = null;
		// TODO Auto-generated constructor stub
	}

	public BaseClass BC;
	public String WorkItem_id = "";

	@FindBy(xpath = "//input[@placeholder='Employee Code']")
	WebElement Uname;
	@FindBy(xpath = "//*[text()='LOG OUT']")
	WebElement Log_Out;
	@FindBy(xpath = "//input[@placeholder='Employee Code']")
	WebElement Log_Out_dropdown;
	@FindBy(xpath = "//div[@class='content']")
	WebElement logout_Icon;
	@FindBy(xpath = "//span[normalize-space()='LOG OUT']")
	WebElement LOG_OUT;
	
	
	
	
	
		// @FindBy(xpath="//input[@placeholder='Email']") WebElement Uname;
		
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

		@FindBy(xpath = "//h5[text()='Work Item']")
		WebElement WorkItem_Icon;
		@FindBy(xpath = "//span[text()=' Create New ']")
		WebElement CreateNew_WorkItem;
		@FindBy(xpath = "//span[@class='mat-option-text']")
		WebElement select_clint;
		@FindBy(xpath = "//input[@formcontrolname='clientName']")
		WebElement ClientName;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
		WebElement ClientName_First;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
		WebElement ClientName_First2;
		@FindBy(xpath = "//input[@id='mat-input-1']")
		WebElement Sub_ClientName;
		@FindBy(xpath = "(//span[@class=\"mat-option-text\"])[1]")
		WebElement Sub_ClientName_First;
		@FindBy(xpath = "//input[@id='fileDropRef']")
		WebElement Browse_File;
		@FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger material-icons app-toolbar-menu save-button mat-icon-button mat-button-base mat-primary "
				+ "ng-star-inserted']//mat-icon[@role='img'][normalize-space()='edit']")
		WebElement Eidit_Icon;
		@FindBy(xpath = "//span[text()='Normal']")
		WebElement Priority;
		@FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Super Stat']")
		WebElement Super_Stat;
		@FindBy(xpath = "//mat-icon[text()='check_circle']")
		WebElement check_circle;
		@FindBy(xpath = "//span[normalize-space()='Create Work Items']")
		WebElement CreateWork_Items;

		@FindBy(xpath = "//h5[normalize-space()='Jobs']")
		WebElement Jobs_Page;
		@FindBy(xpath = "//*[@id='createRow0']/td[1]/a")
		List<WebElement> Job_IDList;
		@FindBy(xpath = "//tr[@id='createRow0']/td/a")
		WebElement Job_ID;
		@FindBy(xpath = "(//input[@appautocompleteposition='trigger'])[1]")
		WebElement WorkItem_ID;
		@FindBy(xpath = "(//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element ng-pristine ng-valid ng-touched'])[1]")
		WebElement WorkItem_ID1;
		@FindBy(xpath = "//*[@id=\"createRow0\"]/td[10]/button[1]/span[1]/mat-icon")
		WebElement Edit_IconJob;
		@FindBy(xpath = "//input[@formcontrolname='employeeName']")
		WebElement Member;
		@FindBy(xpath = "//span[@class='mat-option-text']")
		List<WebElement> MemberList1;
		@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
		WebElement Associated;
		@FindBy(xpath = "//span[contains(text(),'search')]")
		WebElement Search;

		@FindBy(xpath = "(//div[@class='mat-tab-label-content'][normalize-space()='Sorter'])[1]")
		WebElement Sorte;
		@FindBy(xpath = "(//div[@class='mat-tab-label-content'][normalize-space()='MT'])[1]")
		WebElement MT;
		@FindBy(xpath = "(//div[@class='mat-tab-label-content'][normalize-space()='QA'])[1]")
		WebElement QA;
		@FindBy(xpath = "(//div[@class='mat-tab-label-content'][normalize-space()='QC'])[1]")
		WebElement QC;
		@FindBy(xpath = "//span[text()='Add']")
		WebElement AddMember;
		@FindBy(xpath = "//input[@id='mat-input-35']")
		WebElement MemberMT;
		@FindBy(xpath = "(//input[@id='mat-input-67']")
		WebElement MemberQA;
		@FindBy(xpath = "//input[@id='mat-input-39']")
		WebElement MemberQC;
		@FindBy(xpath = "//mat-option[@class='mat-option mat-focus-indicator ng-star-inserted']")
		List<WebElement> MemberList;

		@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]")
		WebElement Chack_Box;
		@FindBy(xpath = "//span[normalize-space()='Create Job']")
		WebElement Create_Job;

		@FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='done_outline'])[1]")
		WebElement done_outline;
		@FindBy(xpath = "(//textarea[@class='mat-input-element mat-form-field-autofill-control ng-tns-c57-222 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched'])[1]")
		WebElement Tests_Box;
		@FindBy(xpath = "//button[@class='mat-focus-indicator btn-blue mat-raised-button mat-button-base']")
		WebElement Yes_button;
		@FindBy(xpath = "//span[text()='Ready For Billing']")
		WebElement Ready_For_Billing;
		@FindBy(xpath = "(//a[@target='_blank'][normalize-space()='(view)'])[1]")
		WebElement Ready_For_Billing_view;

		@FindBy(xpath = "//th[@role='columnheader']")
		List<WebElement> Columnheader;
		@FindBy(xpath = "//a[@target='_blank']")
		List<WebElement> Work_Item_List;
		@FindBy(xpath = "//*[@id=\"app-container-id\"]/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-work-item/div/div/div[1]/div[2]/app-ao-workitem-auto-multi-complete/mat-form-field/div/div[1]/div[3]")
		WebElement workItem_Search;
		@FindBy(xpath = "//mat-chip-list[@aria-label='clientName selection']//input[@role='combobox']")
		WebElement Client_Name_Search;
		@FindBy(xpath = "//mat-chip-list[@aria-label='subClientName selection']//input[@role='combobox']']")
		WebElement Sub_Client_Name_Search;
		@FindBy(xpath = "//input[@aria-expanded='true']")
		WebElement Patient_Name_Search;
		@FindBy(xpath = "//div[@class='mat-select-arrow-wrapper ng-tns-c124-101']")
		WebElement File_Type_Select;
		@FindBy(xpath = "//div[@class='mat-select-arrow ng-tns-c124-266']")
		WebElement Priority_Select;
		@FindBy(xpath = "//span[text()=' clear_all ']")
		WebElement clear_all;
		@FindBy(xpath = "//span[contains(text(),'search')]")
		WebElement search;
		@FindBy(xpath = "//span[@class='mat-option-text']")
		WebElement select;
		@FindBy(xpath = "//*[@id=\"mat-chip-list-input-4\"]")
		WebElement List_FirstElement;
		@FindBy(xpath = "//*[@id=\"workItemTable\"]/form/app-grid-table/table/tbody/tr[1]/td[3]/a")
		WebElement List_FirstElement1;
		@FindBy(xpath = "//*[@id=\"workItemTable\"]/form/app-grid-table/table/tbody/tr[1]/td[4]/a")
		WebElement List_FirstElement2;
		@FindBy(xpath = "//*[@id=\"workItemTable\"]/form/app-grid-table/table/tbody/tr[1]/td[5]/a")
		WebElement List_FirstElement3;
		@FindBy(xpath = "//*[@id=\"workItemTable\"]/form/app-grid-table/table/tbody/tr[1]/td[6]/a")
		WebElement List_FirstElement4;
		@FindBy(xpath = "//*[@id=\"workItemTable\"]/form/app-grid-table/table/tbody/tr[1]/td[7]/a")
		WebElement List_FirstElement5;

		@FindBy(xpath = "//tbody/tr[1]/td[3]")
		WebElement workItem_Search1;
		@FindBy(xpath = "//tbody/tr[1]/td[2]")
		WebElement Client_Name_Search1;
		@FindBy(xpath = "//tbody/tr[1]/td[4]")
		WebElement Sub_Client_Name_Search1;
		@FindBy(xpath = "//tbody/tr[1]/td[5]")
		WebElement Patient_Name_Search1;
		@FindBy(xpath = "//tbody/tr[1]/td[6]")
		WebElement File_Type_Select1;
		@FindBy(xpath = "//tbody/tr[1]/td[6]")
		WebElement Priority_Select1;

		@FindBy(xpath = "//mat-icon[text()=' call_merge ']")
		WebElement call_merge;
		@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[6]")
		WebElement Check_Box2;
		@FindBy(xpath = "//span[text()=' Merge ']")
		WebElement Merhe;
		@FindBy(xpath = "(//mat-icon[text()='add'])[3]")
		WebElement Add3;
		@FindBy(xpath = "(//*[@role='combobox'])[11]/div/div[2]")
		WebElement selct_workitemID1;
		@FindBy(xpath = "//span[@class='mat-option-text']")
		WebElement selct_workitemID;
		@FindBy(xpath = "//span[normalize-space()='Merge Work Item']")
		WebElement Merge_WorkItem;
		@FindBy(xpath = "//button[text()='Yes']")
		WebElement Yes;
		@FindBy(xpath = "//span[text()='Add Files']")
		WebElement Add2;
		@FindBy(xpath = "//span[text()= ' Add Work Items ']")
		WebElement Add_WorkItems;

		@FindBy(xpath = "//span[text()=' Create New ']")
		WebElement Create_New_job;
		@FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
		WebElement Super_Stat1;

		@FindBy(xpath = "//button[@class='mat-focus-indicator btn-blue ml-2 mat-raised-button mat-button-base']")
		WebElement Save;
		@FindBy(xpath = "//span[text()=' Save ']")
		WebElement save;
		@FindBy(xpath = "//h5[text()='Client Onboarding']")
		WebElement Client_Onboarding;
		@FindBy(xpath = "//div[@class='row mt-3 mb-3']//span[@class='mat-button-wrapper'][normalize-space()='Create New']")
		WebElement Create_New_Onboarding;
		@FindBy(xpath = "//input[@formcontrolname='clientName']")
		WebElement clientName;
		@FindBy(xpath = "//input[@type='text']")
		List<WebElement> Input_TextBox;
		@FindBy(xpath = "//input[@formcontrolname='designation']")
		WebElement designation;
		@FindBy(xpath = "/html/body/div[1]/app-root/div/div/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-create-client-on-boarding/div/div/div[2]/div/ao-add-client-on-boarding/div/div/form/div/div[2]/div/div[2]/"
				+ "mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")
		WebElement Client_Type;
		@FindBy(xpath = "//span[@class='mat-option-text'][1]")
		WebElement Selectf;
		@FindBy(xpath = "//input[@formcontrolname='medicalDepartment']")
		WebElement MedicalDepartment;
		@FindBy(xpath = "//input[@formcontrolname='address']")
		WebElement Address;
		@FindBy(xpath = "//input[@formcontrolname='sendFileToEmail']")
		WebElement sendFileToEmail;
		@FindBy(xpath = "//input[@formcontrolname='sendStatusToEmail']")
		WebElement sendStatusToEmail;
		@FindBy(xpath = "//input[@formcontrolname='contactPerson']")
		WebElement contactPerson;
		@FindBy(xpath = "/html/body/div[1]/app-root/div/div/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-create-client-on-boarding/div/div/div[2]/div/ao-add-client-on-boarding/div/div/form/div/div[2]/div/div[12]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/"
				+ "span")
		WebElement Business_Type;
		@FindBy(xpath = "//span[text()=' ROR ']")
		WebElement ROR;
		@FindBy(xpath = "//span[text()=' MT ']")
		WebElement MT2;
		@FindBy(xpath = "//input[@formcontrolname='schedule']")
		WebElement schedule;
		@FindBy(xpath = "(//*[text()='edit'])[1]")
		WebElement Edit;
		@FindBy(xpath = "(//*[text()=' expand_more'])[1]")
		WebElement expand_more;
		@FindBy(xpath = "//input[@formcontrolname='subClientName']")
		WebElement subClientName;
		@FindBy(xpath = "(//input[@role='combobox'])[3]")
		WebElement Patient_name1;
		@FindBy(xpath = "//*[@formcontrolname='notes']")
		WebElement Notes;
		@FindBy(xpath = "//*[@formcontrolname='locationName']")
		WebElement locationName;
		@FindBy(xpath = "//*[@formcontrolname='folder']")
		WebElement folder;
		@FindBy(xpath = "//*[@formcontrolname='templateFolder']")
		WebElement templateFolder;
		@FindBy(xpath = "/html/body/div[1]/app-root/div/div/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-ao-add-sub-client/div[1]/div/form/div/div[21]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")
		WebElement File_Format_Type;
		@FindBy(xpath = "//span[@class='mat-option-text']")
		List<WebElement> mat_option_text;
		@FindBy(xpath = "(//span[contains(text(),'Create New')])[1]")
		WebElement Create_New_sub;
		@FindBy(xpath = "//mat-select[@name='clientType']//div//div//div")
		WebElement Client_Type_Sub;
		@FindBy(xpath = "/html/body/div[1]/app-root/div/div/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-ao-add-sub-client/div[1]/div/form/div/div[17]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")
		WebElement Business_Type_Sub;
		@FindBy(xpath = "/html/body/div[1]/app-root/div/div/div[1]/app-header/div/oa-current-role/div/div/div/span/span")
		WebElement logoutt;
		@FindBy(xpath = "//div[@id='toast-container']/div/div")
		WebElement popup;
		@FindBy(xpath = "(//*[@role='combobox'])[1]")
		WebElement Job_Id;
		@FindBy(xpath = "//mat-option[@role='option']")
		WebElement option;
		@FindBy(xpath = "//mat-select[@formcontrolname='location']")
		WebElement location;
		@FindBy(xpath = "//div[text()='Sorter QA']")
		WebElement Sorter_QA;
		@FindBy(xpath = "//div[text()='MT2']")
		WebElement MT2assign;
		@FindBy(xpath = "//div[text()='IR(QA2)']")
		WebElement QA2;

		// Patient ==> Create New Patient
		@FindBy(xpath = "//h5[text()='Patient']")
		WebElement Click_On_Patient;
		@FindBy(xpath = "//span[text()=' Create New ']")
		WebElement Click_Create_Patient;
		@FindBy(xpath = "(//mat-icon[text()='edit'])[2]")
		WebElement Edit_On_Patient;
		@FindBy(id = "mat-input-0")
		WebElement pClient_name;
		@FindBy(id = "mat-input-10")
		WebElement pFirst_name;
		@FindBy(id = "mat-input-12")
		WebElement pLast_name;
		@FindBy(xpath = "//mat-select[@formcontrolname='gender']")
		WebElement pGender;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
		WebElement pMale;
		@FindBy(id = "mat-input-13")
		WebElement pSSN;
		@FindBy(xpath = "//span[text()=' Save ']")
		WebElement pSave;
		@FindBy(xpath = "//div[@role='alert']")
		WebElement alert;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
		WebElement p_first;
		@FindBy(xpath = "//input[@aria-required='true']")
		List<WebElement> p_required;
		@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[3]")
		WebElement Delete;
		@FindBy(xpath = "//span[text()='Yes']")
		WebElement P_Yes;

	//Association Page ==> Client Wise Association
		@FindBy(xpath = "(//div[@class='fab-link ng-star-inserted'])[12]")
		WebElement aClick_Association;
		@FindBy(xpath = "//input[@formcontrolname='clientName']")
		WebElement aClient_Name;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
		WebElement aselect_drop_dwon;
		@FindBy(xpath = "(//span[@class='mat-option-text'])")
		List<WebElement> dropdown7;
		
		@FindBy(xpath = "(//*[@formcontrolname='templateCharacterCount'])")
		WebElement Count;
		@FindBy(xpath = "//*[@id=\"mat-option-0\"]/span")
		WebElement adoctor;
		@FindBy(xpath = "//input[@formcontrolname='subClientName']")
		WebElement aSub_Client;
		@FindBy(xpath = "(//input[@type='text'])[3]")
		WebElement aSub_Input;
		@FindBy(xpath = "(//div[@role='listbox']//mat-option)[2]")
		WebElement aSRor;
		@FindBy(xpath = "(//input[@appautocompleteposition='trigger'])[3]")
		WebElement aEmp;
		@FindBy(xpath = "(//input[@appautocompleteposition='trigger'])[3]")
		WebElement acSearch;
		@FindBy(xpath = "(//div[@role='listbox']//mat-option)[1]")
		WebElement aeselect;
		@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
		List<WebElement> a_Select_Check;
		@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
		WebElement select_seq;
		@FindBy(xpath = "//button[@mattooltip='Search']")
		WebElement a_Search_Chek;
		@FindBy(xpath = "(//td[@role='cell'])[3]")
		String Emp_Role;
		@FindBy(xpath = "//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
		WebElement Client_Check_IN;
		@FindBy(xpath = "//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
		WebElement unselect;
		@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[3]")
		WebElement ass_save;
		@FindBy(xpath = "//mat-icon[text()='edit']")
		List<WebElement> Edits;
		@FindBy(xpath = "//span[@class=\"mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin\"]")
		List<WebElement> Checkbox;
		@FindBy(xpath = "//input[@formcontrolname='fromFolder']")
		WebElement fromFolder;
		@FindBy(xpath = "//input[@formcontrolname='toFolder']")
		WebElement toFolder;
		@FindBy(xpath = "(//*[@class='mat-checkbox-input cdk-visually-hidden'])[9]")
		WebElement ChechBoxF;
		@FindBy(xpath = "((//input[@tabindex='0'])[9]")
		WebElement ChechBoxNot_check;
		@FindBy(xpath = "//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
		List<WebElement> ChechBoxF_all;

	//Association Page ==> Employee Wise Association
		@FindBy(id = "mat-tab-label-0-1")
		WebElement Emp_Click;
		@FindBy(xpath = "//input[@placeholder='Enter Assignee']")
		WebElement Emp_Name;
		@FindBy(xpath = "//input[@placeholder='Enter Assignee']")
		WebElement Emp_send;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
		WebElement Emp_select;
		@FindBy(xpath = "(//input[@appautocompleteposition='trigger'])[2]")
		WebElement aaClient_name;
		@FindBy(xpath = "(//input[@appautocompleteposition='trigger'])[2]")
		WebElement aClient_Input;
		@FindBy(xpath = "(//input[@appautocompleteposition='trigger'])[3]")
		WebElement aSub_Client_name;
		@FindBy(xpath = "//input[@formcontrolname='subClientName']")
		WebElement aSubClient;
		@FindBy(xpath = "(//input[@appautocompleteposition='trigger'])[3]")
		WebElement sSub_Input;
		@FindBy(xpath = "//div[@class='mat-autocomplete-panel ng-star-inserted mat-autocomplete-visible']")
		WebElement select_sub;
		@FindBy(xpath = "//span[@class='material-symbols-outlined']")
		WebElement Sub_search;
		@FindBy(xpath = "/html/body/div[1]/app-root/div/div/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-association/div/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/employee-association/div[3]/div[1]/div/app-grid-table/table/tbody/tr[1]/td[1]/mat-checkbox/label/span[1]")
		WebElement Sub_Checkbox;
		@FindBy(xpath = "//button[@class='mat-focus-indicator btn-blue mt-3 mat-raised-button mat-button-base']")
		WebElement Sub_Button;
		@FindBy(xpath = "//*[text()=' clear_all ']")
		WebElement P_Clear_all;
		@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]")
		WebElement P_check;
		@FindBy(xpath = "(//input[@aria-checked='false'])[9]")
		WebElement P_ancheck_first;
		@FindBy(xpath = "(//input[@aria-checked='false'])")
		WebElement P_ancheck_first1;
		@FindBy(xpath = "(//input[@aria-checked='true'])[1]")
		WebElement P_check_first;
		@FindBy(xpath = "//div[text()='Employee Wise Association']")
		WebElement Employee_Wise_Association;
		@FindBy(xpath = "//span[@class='mat-option-text']")
		List<WebElement> Employee_name;

		@FindBy(xpath = "//mat-option[@role='option']")
		List<WebElement> Option;
		@FindBy(xpath = "//input[@formcontrolname='clientName']")
		WebElement C_clientName;

		@FindBy(xpath = "//input[@formcontrolname='subClientName']")
		WebElement sub_ClientName;

		@FindBy(xpath = "//mat-select[@formcontrolname='fileFormatTypes']")
		WebElement fileFormatTypes;
		@FindBy(xpath = "//span[text()=' Submit ']")
		WebElement Submit;

		@FindBy(xpath = "//mat-select[@formcontrolname='businessType']")
		WebElement businessType;
		@FindBy(xpath = "//span[@class='mat-option-text']")
		List<WebElement> option_text;
		@FindBy(xpath = "//span[text()=' ROR ']")
		WebElement ROR1;
		@FindBy(xpath = "(//button[@mattooltip='Delete'])[2]")
		WebElement Sub_Delete;

		// // Email page
		@FindBy(xpath = "//h5[text()='Email']")
		WebElement Email_page;
		@FindBy(xpath = "(//input[@appautocompleteposition='trigger'])[1]")
		WebElement Client_Name;
		@FindBy(xpath = "(//input[@appautocompleteposition='trigger'])[2]")
		WebElement Sub_Client_Name;
		@FindBy(xpath = "(//span[text()=' Send Email '])[1]")
		WebElement Send_Email;
		@FindBy(xpath = "//div[@class='col-xl-9 col-lg-9 col-md-9']//div[@class='row']")
		WebElement Send_Click;
	// // Log out user
		@FindBy(xpath = "//div[@aria-haspopup='menu']")
		WebElement logIn_menu;
		@FindBy(xpath = "//span[text()='LOG OUT']")
		WebElement Log_out;

		// Client Template==>
		@FindBy(xpath = "//*[text()='Client Template']")
		WebElement Client_Template_page;
		@FindBy(xpath = "//span[text()=' Create New ']")
		WebElement Create_New;
		@FindBy(xpath = "//input[@formcontrolname='clientName']")
		WebElement client_Name;
		@FindBy(xpath = "//input[@formcontrolname='subClientName']")
		WebElement subClient_Name;
		@FindBy(xpath = "//mat-select[@formcontrolname='templateType']")
		WebElement templateType;
		@FindBy(xpath = "//input[@id='fileDropRef']")
		WebElement fileDropRef;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
		WebElement Report_Structure_Template;

		@FindBy(xpath = "(//*[@role='listbox']//span)[text()=' Tagged Document Template ']")
		WebElement Tagged_Document_Template;
		@FindBy(xpath = "(//*[@role='listbox']//span)[1]")
		WebElement Tagged_Document_Template2;
		
		@FindBy(xpath = "(//*[@role='combobox'])[5]/div/div[2]")
		WebElement Job_type_type_dropdown;
		@FindBy(xpath = "((//*[@role='listbox']//span)[text()=' Tagged Document Template '])[2]")
		WebElement Tagged_Document_Templatename;
		
		@FindBy(xpath = "(//span[@class='mat-option-text'])")
		List<WebElement> Tagged_Document_Template1;
		@FindBy(xpath = "//*[@id='mat-input-4']")
		WebElement Tagged_Document_Template_Count;
		@FindBy(xpath = "(//mat-icon[text()='verified'])[2]")
		WebElement verified;
		@FindBy(xpath = "(//input[@appautocompleteposition='trigger'])[1]")
		WebElement trigger;
		@FindBy(xpath = "//i[@class='mat-tooltip-trigger fa fa-user oa transition x-md ng-star-inserted']")
		WebElement HRMS;
		@FindBy(xpath = "//input[@placeholder='Select Patient']")
		WebElement Patient;
		// work_item page
		@FindBy(xpath = "//*[@class='mat-tooltip-trigger fa fa-medkit oa transition x-md ng-star-inserted']")
		WebElement Altos_button;
		@FindBy(xpath = "(//*[@class='fab-link ng-star-inserted'])[1]")
		WebElement Import_button;
		@FindBy(xpath = "//*[text()=' Run All ']")
		WebElement RunAll_button;
		@FindBy(xpath = "//*[text()='Yes']")
		WebElement Yes1_button;
		@FindBy(xpath = "//*[text()=' Pause All ']")
		WebElement PauseAll_button;
		@FindBy(xpath = "//*[text()=' Stop All ']")
		WebElement StopAll_button;
		@FindBy(xpath = "(//input[@aria-haspopup='listbox'])[3]")
		WebElement ClientName_box;
		@FindBy(xpath = "(//input[@aria-haspopup='listbox'])[4]")
		WebElement SubclientName_box;

		@FindBy(xpath = "(//*[@class='mat-focus-indicator mat-tooltip-trigger btn-black search-btn mat-raised-button mat-button-base'])[2]")
		WebElement Search_button;
		@FindBy(xpath = "((//*[text()=' Ganesh_Hospital '])[@class='mat-cell cdk-cell wt-10 cdk-column-logClientName mat-column-logClientName ng-tns-c563-1 ng-star-inserted'])[1]")
		WebElement element;
		@FindBy(xpath = "(//*[@id='mat-select-4-panel'])//mat-option//span")
		List<WebElement> dropdownElement;
		@FindBy(xpath = "(//*[@class='mat-select-arrow-wrapper ng-tns-c127-16'])")
		WebElement DowArrow_button;
		@FindBy(xpath = "(//*[text()='Success '])[1]")
		WebElement element1;
		@FindBy(xpath = "(//input[@role='combobox'])[3]")
		WebElement Client_name;
		@FindBy(xpath = "(//input[@role='combobox'])[4]")
		WebElement SubClient_name;
		@FindBy(xpath = "(//div[@role='listbox'])//mat-option")
		List<WebElement> Connection_string_dropdoewn;
		@FindBy(xpath = "(//*[@class='mat-focus-indicator btn-blue mat-raised-button mat-button-base'])")
		WebElement save_button;
		@FindBy(xpath = "(//*[text()=' Create New '])")
		WebElement Create_new_button;
		@FindBy(xpath = "(//*[@role='combobox'])[8]")
		WebElement Down_arrow_button;
		@FindBy(xpath = "(//*[@role='combobox'])[1]")
		WebElement Client_Name1;
		@FindBy(xpath = "(//*[@role='combobox'])[2]")
		WebElement SubClient_Name1;
		@FindBy(xpath = "//*[@class='mat-select-arrow-wrapper ng-tns-c127-5']")
		WebElement Dropdown1;
		@FindBy(xpath = "//*[@role='listbox']//mat-option//span")
		List<WebElement> Dropdown_Element1;
		@FindBy(xpath = "(//*[@id='mat-select-0-panel'])//mat-option//span")
		List<WebElement> Dropdown_template;
		@FindBy(xpath = "(//*[@role='combobox']/div/div[2])[1]")
		WebElement Dropdown_button_job;
		@FindBy(xpath = "(//*[@id='mat-select-6-panel'])//mat-option//span")
		List<WebElement> Dropdown_Element6;
		@FindBy(xpath = "//*[@role='listbox']//mat-option//span")
		List<WebElement> Priroty_dropdown;
		@FindBy(xpath = "//*[@role='listbox']//mat-option//span")
		List<WebElement> status_dropdown;

		@FindBy(xpath = "//*[@class='mat-select-arrow-wrapper ng-tns-c127-7']")
		WebElement Dropdown2;
		@FindBy(xpath = "(//*[@id='mat-select-2-panel'])//mat-option//span")
		List<WebElement> Dropdown_Element2;
		@FindBy(xpath = "(//*[@class='mat-select-arrow-wrapper ng-tns-c127-20'])")
		WebElement Dropdown3;
		@FindBy(xpath = "(//*[@id='mat-select-6-panel'])//mat-option//span")
		List<WebElement> Dropdown_Element3;
		@FindBy(xpath = "(//*[@class='mat-focus-indicator mat-tooltip-trigger btn-black search-btn mat-raised-button mat-button-base'])")
		WebElement search_button;
		@FindBy(xpath = "//*[@id=\"app-container-id\"]/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-work-item/div/div/div[2]/div[8]/app-search-button/button/span[1]/mat-icon/span")
		WebElement search_button1;

		@FindBy(xpath = "//*[@class='mat-focus-indicator mat-tooltip-trigger material-icons app-toolbar-menu delete-button mat-icon-button mat-button-base mat-warn ng-tns-c563-1 ng-star-inserted']")
		WebElement DeleteClient;
		@FindBy(xpath = "//*[@class='btn-blue mat-button']")
		WebElement Yes_Delete_button;
		@FindBy(xpath = "(//*[@class='fab-link ng-star-inserted'])[2]")
		WebElement work_item_button;
		@FindBy(xpath = "//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']")
		WebElement Calender_icon;
		@FindBy(xpath = "//*[text()=' 8 ']")
		WebElement Date_Select;
		@FindBy(xpath = "(//*[@role='combobox'])[1]")
		WebElement work_item_box1;
		@FindBy(xpath = "(//*[@role='combobox'])[2]")
		WebElement client_box1;
		@FindBy(xpath = "(//*[@role='combobox'])[3]")
		WebElement subclient1;
		@FindBy(xpath = "(//*[@role='combobox'])[2]")
		WebElement subclienttemplate;
		@FindBy(xpath = "(//*[@role='combobox'])[2]/div/div[2]")
		WebElement templatedownarrow;
		@FindBy(xpath = "(//*[@role='combobox'])[4]")
		WebElement Patient_name;
		@FindBy(xpath = "//*[@id='mat-select-0']/div/div[2]")
		WebElement DownArrow1;
		@FindBy(xpath = "//*[@id='mat-select-2']/div")
		WebElement DownArrow2;
		@FindBy(xpath = "(//*[@role='combobox']/div/div[2])[2]")
		WebElement Job_priority_downarrow;
		@FindBy(xpath = "(//*[@role='combobox']/div/div[2])[3]")
		WebElement Job_status_downarrow;

		@FindBy(xpath = "(//*[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]")
		WebElement checkbox;
		@FindBy(xpath = "(//*[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[3]")
		WebElement checkbox1;
		@FindBy(xpath = "(//*[text()=' Split '])")
		WebElement split_button;
		@FindBy(xpath = "(//*[@id='mat-input-1'])")
		WebElement page_add_box;
		@FindBy(xpath = "(//*[text()='add'])")
		WebElement add1_button;
		@FindBy(xpath = "(//*[text()=' Split Work Item '])")
		WebElement Split_Work_Item;
		@FindBy(xpath = "(//*[text()='undo'])[1]")
		WebElement Undo_button;
		@FindBy(xpath = "//*[text()='Yes']")
		WebElement Yes2_button;
		@FindBy(xpath = "//*[text()=' Merge ']")
		WebElement Merge_button;
		@FindBy(xpath = "//*[text()=' Merge Work Item ']")
		WebElement Merge_WorkItem_button;
		@FindBy(xpath = "//*[@id='workItemTable']/form/app-grid-table/table/tbody/tr[1]/td[15]/button[1]/span[1]/mat-icon")
		WebElement Edit_button;
		@FindBy(xpath = "//*[text()='add']")
		WebElement Plus_button;
		@FindBy(xpath = "//*[@id='mat-input-15']")
		WebElement Add_Name_button;
		@FindBy(xpath = "//*[@id='mat-input-17']")
		WebElement Last_Name_button;
		@FindBy(xpath = "//*[text()=' Save ']")
		WebElement save1;
		@FindBy(xpath = "//*[text()='check_circle']")
		WebElement check_Circle;
		@FindBy(xpath = "(//*[@mattooltip='Delete'])[2]")
		WebElement deleteworkitem;
		@FindBy(xpath = "//*[@id='mat-select-6']/div/div[2]")
		WebElement downarrow;
		@FindBy(xpath = "//*[@id='mat-input-0']")
		WebElement reasonbox;
		@FindBy(xpath = "(//*[text()=' expand_more'])[1]")
		WebElement ExpandMore;
		@FindBy(xpath = "(//*[text()=' expand_less'])[1]")
		WebElement expand_less;
		@FindBy(xpath = "//*[@id='workItemTable']/form/app-grid-table/table/tbody/tr[1]/td[3]/a")
		WebElement work_item1;
		@FindBy(xpath = "//*[@id='workItemTable']/form/app-grid-table/table/tbody/tr[1]/td[10]/a")
		WebElement patient_name2;
		@FindBy(xpath = "(//*[@role='combobox'])[4]")
		WebElement Job_patient;
		@FindBy(xpath = "//*[@id='createRow0']/td[2]")
		WebElement Job_patient_name;

		@FindBy(xpath = "(//*[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color'])[3]")
		WebElement next_button;
		@FindBy(xpath = "(//*[text()='rotate_90_degrees_cw'])[1]")
		WebElement clockwise_button;
		@FindBy(xpath = "//*[text()='Page : 1']")
		WebElement page1_button;
		@FindBy(xpath = "(//*[text()='Page : 1'])[2]")
		WebElement page2_button;
		@FindBy(xpath = "//*[text()=' File rotate successfully ']")
		WebElement Alert;
		@FindBy(xpath = "(//*[text()='rotate_90_degrees_ccw'])[1]")
		WebElement Anticlock_rotate;
		@FindBy(xpath = "(//*[text()='zoom_in'])[2]")
		WebElement Zoom_in;
		@FindBy(xpath = "(//*[text()='zoom_out'])[2]")
		WebElement Zoom_Out;
		@FindBy(xpath = "(//*[text()='zoom_in'])[1]")
		WebElement Zoom_in1;
		@FindBy(xpath = "(//*[text()='zoom_out'])[1]")
		WebElement Zoom_Out1;
		@FindBy(xpath = "(//*[@style='width: 1602px; height: 2073px;'])[1]")
		WebElement size;
		@FindBy(xpath = "(//*[@class='textLayer'])[1]")
		WebElement pageContent;
		@FindBy(xpath = "(//*[text()='tab'])[1]")
		WebElement tab;
		@FindBy(xpath = "//*[@id='mat-input-0']")
		WebElement input_num;
		@FindBy(xpath = "(//*[@class='mat-radio-container'])[5]")
		WebElement Show_OCR;
		@FindBy(xpath = "(//*[@class='mat-radio-container'])[2]")
		WebElement Show_Blank;
		@FindBy(xpath = "(//*[@class='mat-radio-container'])[4]")
		WebElement Show_Both;
		@FindBy(xpath = "(//*[@class='mat-radio-container'])[6]")
		WebElement Show_PDF;
		@FindBy(tagName = "body")
		WebElement element3;
		@FindBy(xpath = "(//*[text()='autorenew'])[1]")
		WebElement Auto_renew;
		@FindBy(xpath = "//*[text()=' OCR Processed has Started Successfully ']")
		WebElement Assert_Auto_renew;
		@FindBy(xpath = "(//*[text()= 'tab'])[2]")
		WebElement tab2;
		@FindBy(xpath = "(//*[text()='navigate_before'])[1]")
		WebElement Navigate_Back;
		@FindBy(xpath = "//*[text()='This page is blank.']")
		WebElement blank_page;
		@FindBy(xpath = "//*[text()='Page : 5']")
		WebElement page5;
		@FindBy(xpath = "//*[text()='Jobs']")
		WebElement Jobs_page;
		@FindBy(xpath = "//*[text()=' Create New ']")
		WebElement Create_new_jobs;
		@FindBy(xpath = "(//*[text()='Report Types'])")
		WebElement Add_report;
		@FindBy(xpath = "//*[text()=' Add Report Type ']")
		WebElement Add_report_type;
		
		@FindBy(xpath = "//*[@id='mat-input-0']")
		WebElement Report_type;
		@FindBy(xpath = "//*[@id='mat-input-1']")
		WebElement SubReport_type;
		@FindBy(xpath = "//*[@id='mat-input-2']")
		WebElement Keyword;
		@FindBy(xpath = "//*[text()=' Report type/Sub report type added successfully ']")
		WebElement Add_Success;
		@FindBy(xpath = "//*[@id='reportTypeTable']/app-grid-table/table/tbody/tr[1]/td[4]/button")
		WebElement Add_report_edit;
		@FindBy(xpath = "//*[@placeholder='Keyword']")
		WebElement Keyword_edit1;
		@FindBy(xpath = "//*[text()=' Update ']")
		WebElement Update;
		@FindBy(xpath = "//*[text()='Master']")
		WebElement Master;
		@FindBy(xpath = "//*[text()=' Updated successfully ']")
		WebElement Updated_successfully;
		@FindBy(xpath = "//*[@mattooltip='Download']")
		WebElement Export_template_teg;
		@FindBy(xpath = "//*[@id='clientTemplateTable']/app-grid-table/table/tbody/tr[1]/td[8]/button/span[1]/mat-icon")
		WebElement Client_temp_edit;
		@FindBy(xpath = "(//*[@role='combobox'])[1]")
		WebElement Client_box_onboarding;
		@FindBy(xpath = "(//*[@role='combobox'])[2]")
		WebElement Contact_person;
		@FindBy(xpath = "(//*[@role='combobox'])[3]")
		WebElement Email_Onbarding;
		@FindBy(xpath = "(//*[@role='combobox'])[4]")
		WebElement Phone_no;
		@FindBy(xpath = "(//*[@role='combobox']/div/div[2])[1]")
		WebElement DownArrow_onboarding_type;
		@FindBy(xpath = "(//*[@role='combobox']/div/div[2])[2]")
		WebElement DownArrow_onboarding_status;
		@FindBy(xpath = "(//*[text()='GaneshHospital'])[1]")
		WebElement ganesh_hospital_click;
		@FindBy(xpath = "(//*[text()='Locations'])[1]")
		WebElement Location_click;
		@FindBy(xpath = "(//*[text()=' Add '])[1]")
		WebElement ADD_click;
		@FindBy(xpath = "(//*[@formcontrolname='location'])[1]")
		WebElement location_click;
		@FindBy(xpath = "(//*[@formcontrolname='address'])[1]")
		WebElement locationaddress_click;
		@FindBy(xpath = "(//*[@formcontrolname='phoneNumber'])[1]")
		WebElement phoneNumber;
		@FindBy(xpath = "(//*[text()='Save'])[1]")
		WebElement save2;
		@FindBy(xpath = "(//*[text()='Physicians'])[1]")
		WebElement physician;
		@FindBy(xpath = "(//*[@formcontrolname='physician'])[1]")
		WebElement physician1;
		@FindBy(xpath = "//mat-select[@formcontrolname='jobType']")
		WebElement JobType1;
		@FindBy(xpath = "(//*[@formcontrolname='firstName'])[1]")
		WebElement fname;
		@FindBy(xpath = "(//*[@formcontrolname='middleName'])[1]")
		WebElement mname;
		@FindBy(xpath = "(//*[@formcontrolname='lastName'])[1]")
		WebElement lname;
		@FindBy(xpath = "(//*[@formcontrolname='designation'])[1]")
		WebElement designation1;
		@FindBy(xpath = "(//*[@formcontrolname='physicianFullName'])[1]")
		WebElement physicianFullName;
		@FindBy(xpath = "(//*[@formcontrolname='initial'])[1]")
		WebElement initial;
		@FindBy(xpath = "(//*[@formcontrolname='email'])[1]")
		WebElement email;
		@FindBy(xpath = "(//*[@formcontrolname='phoneNumber'])[1]")
		WebElement phoneNumber1;
		@FindBy(xpath = "(//*[@formcontrolname='custom1'])[1]")
		WebElement custom1;
		@FindBy(xpath = "(//*[@formcontrolname='custom2'])[1]")
		WebElement custom2;
		@FindBy(xpath = "//*[text()='Job Types']")
		WebElement JobType;
		@FindBy(xpath = "(//*[@formcontrolname='name'])[1]")
		WebElement JobType_name;
		@FindBy(xpath = "(//*[text()='edit'])[1]")
		WebElement edit1;
		@FindBy(xpath = "(//mat-icon[text()='edit'])[1]//following::span[text()='Save']")
		WebElement save91;

		public void JOB_type_add_edit() {

			CommonUtility.jsClick(driver, JobType);
			Time_sleep();
			CommonUtility.jsClick(driver, ADD_click);
			JobType_name.sendKeys(CommonUtility.generateUniqueText());
			Time_sleep();
			CommonUtility.jsClick(driver, save2);
			Time_sleep();
			// CommonUtility.jsClick(driver, edit1);
			// JobType_name.sendKeys(CommonUtility.generateUniqueText());
			// Time_sleep();
			// CommonUtility.moveToElement(driver, save91);
			// CommonUtility.jsClick(driver, save91);
			// Time_sleep();
		}

		public void location_and_physicians_add() {
			CommonUtility.jsClick(driver, ganesh_hospital_click);
			CommonUtility.jsClick(driver, Location_click);
			Time_sleep();
			CommonUtility.jsClick(driver, ADD_click);
			Time_sleep();
			location_click.sendKeys("pune");
			locationaddress_click.sendKeys("SP,sadashivpeth,wajechowk,pune,412214");
			phoneNumber.sendKeys("1231231231");
			Time_sleep();
			CommonUtility.jsClick(driver, save2);
			Time_sleep();
			CommonUtility.jsClick(driver, physician);
			Time_sleep();
			CommonUtility.jsClick(driver, ADD_click);
			Time_sleep();
			fname.sendKeys("pradeep");
			mname.sendKeys("vishal");
			lname.sendKeys("dhome");
			Time_sleep();
			physicianFullName.sendKeys("S.A.Kumar");
			initial.sendKeys("aster");
			designation1.sendKeys("Surgeon");
			Time_sleep();
			phoneNumber1.sendKeys("1111111111");
			email.sendKeys("demo1@gmail.com");
			custom1.sendKeys("sample1");
			custom2.sendKeys("sample2");
			Time_sleep();
			CommonUtility.jsClick(driver, save2);
			Time_sleep();

		}

		public void Filter_allfield_clientOnboarding() {
			Actions clselect = new Actions(driver);
			driver.navigate().refresh();
			Time_sleep();

			Client_box_onboarding.sendKeys("GaneshHospital");
			Time_sleep();
			String J1 = "GaneshHospital";
			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J1.equalsIgnoreCase(b)) {
						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J1.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;
					}
				}
			}
			Contact_person.sendKeys("8765764565");
			Time_sleep();
			Email_Onbarding.sendKeys("QA_Automation@gmail.com");
			Phone_no.sendKeys("4567543524");
			Time_sleep();
			CommonUtility.jsClick(driver, DownArrow_onboarding_type);
			Time_sleep();
			CommonUtility.findAndClickElementByKeyword(Dropdown_Element1, "ROR");
			CommonUtility.jsClick(driver, DownArrow_onboarding_status);
			CommonUtility.findAndClickElementByKeyword(Priroty_dropdown, "Active");
			search_button1.click();
			Time_sleep();
			Time_sleep();
			Assert.assertTrue(true);
		}

		public void Add_Reported_type() {
			driver.navigate().refresh();
			CommonUtility.jsClick(driver, Altos_Icon);
			Time_sleep();
			Client_Template_page.click();
			//CommonUtility.WithoutClick_Scrolldown();
		//	CommonUtility.WithoutClick_Scrolldown();
			//CommonUtility.WithoutClick_Scrolldown();
			CommonUtility.jsClick(driver, Add_report);
			Time_sleep();
			CommonUtility.jsClick(driver, Add_report_type);
			Time_sleep();
			Report_type.sendKeys("Medical Reports");
			Time_sleep();
			SubReport_type.sendKeys("Supplemental");

			Keyword.sendKeys(CommonUtility.generateUniqueText());
			save.click();
			Time_sleep();

			String text = Add_Success.getText();
			Assert.assertEquals(text, "Report type/Sub report type added successfully");
			Time_sleep();
			CommonUtility.jsClick(driver, Add_report_edit);
			Keyword_edit1.clear();
			Keyword_edit1.sendKeys(CommonUtility.generateUniqueText());
			Time_sleep();
			CommonUtility.jsClick(driver, Update);
			Time_sleep();
			String text1 = Updated_successfully.getText();
			Assert.assertEquals(text1, "Updated successfully");
			driver.navigate().refresh();
			CommonUtility.jsClick(driver, Master);
			Time_sleep();
			CommonUtility.jsClick(driver, Export_template_teg);
			Time_sleep();

		}

		public void Create_new_Jobs() {
			Altos_button.click();
			Time_sleep();
			CommonUtility.jsClick(driver, Jobs_page);
			CommonUtility.jsClick(driver, Create_new_jobs);
			Time_sleep();

			Assert.assertTrue(true);
		}

		public void Time_sleep() {
			try {
				Thread.sleep(5000);

			} catch (InterruptedException e) {

			}
		}

		public void CreateNew_WorkItem() {
			Altos_Icon.click();
			BC = new BaseClass();
			System.out.println(Helper.getCurrentDataTime());
			WorkItem_Icon.click();
			System.out.println(Helper.getCurrentDataTime());
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			CreateNew_WorkItem.click();
			ClientName.sendKeys("Ganesh_Hospital");
			// CommonUtility.jsClick(driver, select_clint);
			select_clint.click();
			Time_sleep();
			// ClientName_First.click();
			Sub_ClientName.click();
			Time_sleep();
			Sub_ClientName_First.click();
			Time_sleep();
			String projectDirectory = System.getProperty("user.dir");
			Actions subaction = new Actions(driver);
			Random rand = new Random();
			int rand_int = rand.nextInt(1000);
			String str5 = "" + rand_int;
			Path path = Paths.get(str5);
			File f = new File(projectDirectory + "\\TestData\\Upload_File1.pdf");
			File s = new File(projectDirectory + "\\TestData\\Files\\" + path + ".pdf");
			// BC.s1=s;
			try {
				Files.copy(f.toPath(), s.toPath());

			} catch (IOException e) {
				e.printStackTrace();
			}
			if (f.exists()) {
				System.out.println(f.renameTo(s));
			} else {
				System.out.println("File doesn't exists");
			}
			subaction.moveToElement(Browse_File).perform();
			js.executeScript("arguments[0].click()", Browse_File);
			Time_sleep();
			System.out.println(s);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Browse_File.sendKeys("" + s);
			Time_sleep();
			Eidit_Icon.click();
			Priority.click();
			Super_Stat.click();
			check_circle.click();
			Time_sleep();
			Time_sleep();
			CreateWork_Items.click();
			Time_sleep();
			Time_sleep();
			Altos_Icon.click();
			Time_sleep();
			WorkItem_Icon.click();
			Time_sleep();
			Actions Ssubaction = new Actions(driver);
			Time_sleep();
			Ssubaction.moveToElement(Edit).perform();
			js.executeScript("arguments[0].click()", Edit);
			Patient.click();
			Patient.sendKeys("Asitis");
			Time_sleep();
			Sub_ClientName_First.click();
			Time_sleep();
			check_circle.click();
			Time_sleep();
			Time_sleep();
			Chack_Box.click();
			Time_sleep();
			Create_Job.click();
			Time_sleep();
			String Job_ID = popup.getText();
//			String string_output = Job_ID.replaceAll("[^A-Za-z]", "");
//			int number_output = Integer.parseInt(Job_ID.replaceAll("[^0-9]", ""));
			try {
				String string_output = Job_ID.replaceAll("[^A-Za-z]", "");
				int number_output = Integer.parseInt(Job_ID.replaceAll("[^0-9]", ""));
				System.out.println(number_output);
				String string_jobID = Integer.toString(number_output);
				if (string_jobID.length() > 1) {
					BC.Job_id = string_jobID.substring(1);
					// Job_id = Integer.parseInt(modifiedString );
					System.out.println(BC.Job_id);
				} else {
					System.out.println("The value has only one, so removingit will result in 0.");
				}
			} catch (NumberFormatException xVal) { // handle your exception
				String string_output = Job_ID.replaceAll("[^A-Za-z]", "");
				int number_output = Integer.parseInt(Job_ID.replaceAll("[^0-9]", ""));
				System.out.println(number_output);
				String string_jobID = Integer.toString(number_output);
				if (string_jobID.length() > 1) {
					BC.Job_id = string_jobID.substring(1);
					// Job_id = Integer.parseInt(modifiedString );
					System.out.println(BC.Job_id);
				} else {
					System.out.println("The value has only one, so removingit will result in 0.");
				}
			}
//			System.out.println(number_output);
//			String string_jobID = Integer.toString(number_output);
//			if (string_jobID.length() > 1) {
//				BC.Job_id = string_jobID.substring(1);
//				// Job_id = Integer.parseInt(modifiedString );
//				System.out.println(BC.Job_id);
//			} else {
//				System.out.println("The value has only one, so removingit will result in 0.");
//			}
			File file = new File(projectDirectory + "\\TestData\\Files\\" + path + ".pdf");

			if (file.delete()) {
				System.out.println("File deleted successfully");
			} else {
				System.out.println("Failed to delete the file");
			}

		}

		public void AssignTask() {
			BC = new BaseClass();
			Altos_Icon.click();
			Jobs_Page.click();
			Job_Id.click();
			Job_Id.sendKeys(BC.Job_id);
			option.click();
			Search.click();
			Time_sleep();
			// Job_ID.click();
			for (WebElement Job_IDList1 : Job_IDList) {
				Job_IDList1.click();
				break;
			}
			Edit_IconJob.click();
			Time_sleep();
			Member.click();
			Time_sleep();
			Member.sendKeys("2");
			for (WebElement MemberList11 : MemberList1) {
				MemberList11.click();
				break;
			}
			Time_sleep();
			check_circle.click();
			Time_sleep();
			MT.click();
			Time_sleep();
			CommonUtility.jsClick(driver, AddMember);
			Member.sendKeys("3");
			for (WebElement MemberList11 : MemberList1) {
				MemberList11.click();
				break;
			}
			check_circle.click();
			Time_sleep();
			QA.click();
			Time_sleep();
			AddMember.click();

			Member.sendKeys("5");
			for (WebElement MemberList11 : MemberList1) {
				MemberList11.click();
				break;
			}
			check_circle.click();
			Time_sleep();
			QC.click();
			Time_sleep();
			AddMember.click();
			Member.sendKeys("7");
			Time_sleep();
			for (WebElement MemberList11 : MemberList1) {
				MemberList11.click();
				break;
			}
			check_circle.click();
			Time_sleep();
			Assert.assertTrue(true);
			Time_sleep();

		}

		public void AssignTask_New_ROR() {
			BC = new BaseClass();

			// loginAltos_TL( usernameApplication, passwordApplication);
			Altos_Icon.click();
			Jobs_Page.click();
			Job_Id.click();
			Job_Id.sendKeys(BC.Job_id);
			option.click();
			Search.click();
			Time_sleep();
			// Job_ID.click();
			for (WebElement Job_IDList1 : Job_IDList) {
				Job_IDList1.click();
				break;
			}
			Edit_IconJob.click();
			Time_sleep();
			Member.clear();
			Time_sleep();
			Member.sendKeys("2");
			Time_sleep();
		}

		public void CreateNew_Job() {
			Time_sleep();
			Time_sleep();
			Altos_Icon.click();
			Time_sleep();
			WorkItem_Icon.click();
			Time_sleep();
			WorkItem_ID.click();
			Time_sleep();
			System.out.println(WorkItem_id);
			Time_sleep();
			Time_sleep();
			WorkItem_ID.sendKeys(WorkItem_id);
			Time_sleep();
			Time_sleep();
			option.click();
			Time_sleep();
			Search.click();
			Time_sleep();
			Chack_Box.click();
			Time_sleep();
			Create_Job.click();
			String Job_ID = popup.getText();
			String string_output = Job_ID.replaceAll("[^A-Za-z]", "");
			int number_output = Integer.parseInt(Job_ID.replaceAll("[^0-9]", ""));
			System.out.println(number_output);
			String string_jobID = Integer.toString(number_output);
			if (string_jobID.length() > 1) {
				BC.Job_id = string_jobID.substring(1);
				// Job_id = Integer.parseInt(modifiedString );
				System.out.println(BC.Job_id);
			} else {
				System.out.println("The value has only one, so removingit will result in 0.");
			}
			Assert.assertTrue(true);
		}

		public void Ready_For_Billing() {
			Time_sleep();
			BC = new BaseClass();

			// loginAltos_TL( usernameApplication, passwordApplication);
			Altos_Icon.click();
			Jobs_Page.click();
			Job_Id.click();
			Job_Id.sendKeys(BC.Job_id);
			option.click();
			Search.click();
			Time_sleep();
			Time_sleep();
			done_outline.click();
			Time_sleep();
			Ready_For_Billing.click();
			Time_sleep();
			Yes_button.click();
			Time_sleep();
			Altos_Icon.click();
			Jobs_Page.click();
			Time_sleep();
			Ready_For_Billing_view.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Time_sleep();
			Set<String> windows1 = driver.getWindowHandles();
			System.out.println(windows1);
			Time_sleep();
			for (String window : windows1) {
				driver.switchTo().window(window);
				Time_sleep();
				js.executeScript("window.scrollBy(0,400)");
				Time_sleep();
			}
			Time_sleep();
			Assert.assertTrue(true);

		}

		public void Column_Header_Name() {
			Time_sleep();
			WorkItem_Icon.click();
			Time_sleep();

			List<String> Column_name1 = Arrays.asList("", "Import Date & Time", "Work Item", "Client Name",
					"Sub Client Name", "File Type & File Length", "Status", "Priority", "Patient Name", "Report Type",
					"Date Of Service", "Due Date Time", "Operation Status", "Action");
			List<String> Column_Headename = new ArrayList<String>();
			for (WebElement Columnheader1 : Columnheader) {
				Column_Headename.add(Columnheader1.getText());

			}
			System.out.println(Column_Headename);
			Assert.assertEquals(Column_Headename, Column_name1);
		}

		public void Column_Work_Item_ASC() {
			WorkItem_Icon.click();
			Time_sleep();
			List<String> Work_Item_List22 = new ArrayList<String>();

			int c = 0;
			Time_sleep();
			for (WebElement Columnheader1 : Columnheader) {
				c = c + 1;
				if (c == 2) {
					Columnheader1.click();

					break;
				}
			}
			Time_sleep();
			for (WebElement Work_Item_List2 : Work_Item_List) {
				Work_Item_List22.add(Work_Item_List2.getText());
			}
			Collections.sort(Work_Item_List22);
			System.out.println(Work_Item_List22);
			List<String> Work_Item_List11 = new ArrayList<String>();
			Time_sleep();
			for (WebElement Work_Item_List1 : Work_Item_List) {
				Work_Item_List11.add(Work_Item_List1.getText());
			}
			Time_sleep();
			System.out.println(Work_Item_List11);
			Assert.assertEquals(Work_Item_List22, Work_Item_List11);
		}

		public void Column_Work_Item_DSC() {
			Altos_Icon.click();
			WorkItem_Icon.click();
			Time_sleep();
			List Work_Item_List22 = new ArrayList();

			int c = 0;
			Time_sleep();
			for (WebElement Columnheader1 : Columnheader) {
				c = c + 1;
				if (c == 2) {
					Columnheader1.click();
					Time_sleep();
					Columnheader1.click();
					break;
				}
			}
			Time_sleep();
			for (WebElement Work_Item_List2 : Work_Item_List) {
				Work_Item_List22.add(Work_Item_List2.getText());
			}
			List<String> original2 = new ArrayList<>(Work_Item_List22);
			Collections.sort(Work_Item_List22, Collections.reverseOrder());
			System.out.println(Work_Item_List22);
			List Work_Item_List11 = new ArrayList();
			Time_sleep();
			for (WebElement Work_Item_List1 : Work_Item_List) {
				Work_Item_List11.add(Work_Item_List1.getText());
			}
			Time_sleep();
			System.out.println(Work_Item_List11);
			Assert.assertEquals(original2, Work_Item_List11);
		}

		public void FilterBy_workItem_Search() {
			Altos_Icon.click();
			WorkItem_Icon.click();
			Time_sleep();
			workItem_Search.click();
			Time_sleep();
			Time_sleep();
			List_FirstElement.sendKeys(workItem_Search1.getText());
			Time_sleep();
			select.click();
			Time_sleep();
			search.click();
			Time_sleep();
			Assert.assertEquals(List_FirstElement.getText(), workItem_Search1.getText());
			clear_all.click();

		}

		public void Client_Name_Search_Search() {
			Altos_Icon.click();
			WorkItem_Icon.click();
			Time_sleep();
			Client_Name_Search.click();
			List_FirstElement.sendKeys(List_FirstElement2.getText());
			Time_sleep();
			search.click();
			// Assert.assertEquals(Client_Name_Search2, Client_Name_Search1.getText());
			clear_all.click();

		}

		public void Sub_Client_Name_Search() {
			Altos_Icon.click();
			WorkItem_Icon.click();
			Time_sleep();
			Sub_Client_Name_Search.click();
			String Sub_Client_Name_Search2 = "ROR";
			List_FirstElement.click();
			Sub_Client_Name_Search.sendKeys(Sub_Client_Name_Search2);
			search.click();
			Assert.assertEquals(Sub_Client_Name_Search2, Sub_Client_Name_Search1.getText());
			clear_all.click();

		}

		public void Patient_Name_Search() {
			Altos_Icon.click();
			WorkItem_Icon.click();
			Time_sleep();
			Patient_Name_Search.click();
			String Patient_Name_Search2 = "sheetal sanadi";
			List_FirstElement.click();
			Patient_Name_Search.sendKeys(Patient_Name_Search2);
			search.click();
			Assert.assertEquals(Patient_Name_Search2, Patient_Name_Search1.getText());
			clear_all.click();

		}

		public void File_Type_Select() {
			Altos_Icon.click();
			WorkItem_Icon.click();
			Time_sleep();
			File_Type_Select.click();
			// String File_Type_Select2="";
			List_FirstElement.click();
			// File_Type_Select.sendKeys(File_Type_Select2);
			search.click();
			System.out.println(List_FirstElement.getText());
			System.out.println(File_Type_Select1.getText());
			// Assert.assertEquals(List_FirstElement.getText(),
			// File_Type_Select1.getText());
			clear_all.click();

		}

		public void Priority_Select() {
			Altos_Icon.click();
			WorkItem_Icon.click();
			Time_sleep();
			Priority_Select.click();
			// String Priority_Select2="W-001-608";
			List_FirstElement.click();
			// Priority_Select.sendKeys(Priority_Select2);
			search.click();
			Assert.assertEquals(List_FirstElement.getText(), Priority_Select1.getText());
			clear_all.click();

		}

		public void Merge_workItem() {
			Jobs_Page.click();
			Associated.click();
			Search.click();
			Time_sleep();
			Job_ID.click();
			for (WebElement Job_IDList1 : Job_IDList) {
				Job_IDList1.click();
				break;
			}
			call_merge.click();
			Check_Box2.click();
			Merhe.click();
			Time_sleep();
			Merge_WorkItem.click();
			Yes.click();
			Add3.click();
			selct_workitemID1.click();
			Time_sleep();
			// act.doubleClick(selct_workitemID1).build().perform();
			selct_workitemID.click();
			// Edit_IconJob.click();
			Member.clear();
			Member.sendKeys("2");
			for (WebElement MemberList11 : MemberList1) {
				MemberList11.click();
				break;
			}
			Time_sleep();
			check_circle.click();
			Time_sleep();
			MT.click();
			Time_sleep();
			AddMember.click();
			Member.sendKeys("3");
			for (WebElement MemberList11 : MemberList1) {
				MemberList11.click();
				break;
			}
			check_circle.click();
			Time_sleep();
			QA.click();
			Time_sleep();
			AddMember.click();

			Member.sendKeys("5");
			for (WebElement MemberList11 : MemberList1) {
				MemberList11.click();
				break;
			}
			check_circle.click();
			Time_sleep();
			QC.click();
			Time_sleep();
			AddMember.click();
			Member.sendKeys("7");
			Time_sleep();
			for (WebElement MemberList11 : MemberList1) {
				MemberList11.click();
				break;
			}
			check_circle.click();
			Time_sleep();
			Assert.assertTrue(true);

		}

		public void Add_workItem() {
			driver.navigate().refresh();
			BC = new BaseClass();
			Altos_Icon.click();
			Jobs_Page.click();
			String as = driver.getWindowHandle();
			System.out.println(as);
			Time_sleep();
			Job_Id.click();
			Job_Id.sendKeys(BC.Job_id);
			option.click();
			Search.click();
			Time_sleep();
			Job_ID.click();
			// for (WebElement Job_IDList1 : Job_IDList) {
			// Job_IDList1.click();
			// break;
			Time_sleep();
			Set<String> as1 = driver.getWindowHandles();
			for (String ap : as1) {
				if (!ap.equals(as)) {
					driver.switchTo().window(ap);
					CommonUtility.jsClick(driver, Add2);
					Time_sleep();
					CommonUtility.jsClick(driver, Check_Box2);
					Time_sleep();
					CommonUtility.jsClick(driver, Add_WorkItems);
					Time_sleep();
					Yes.click();
					Time_sleep();
				}
			}

//			Add3.click();
//			selct_workitemID1.click();
//			Time_sleep();
//			//act.doubleClick(selct_workitemID1).build().perform();
//			selct_workitemID.click();
//			//Edit_IconJob.click();
//			Member.clear();
//			Member.sendKeys("2");
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
//			Time_sleep();
//			check_circle.click();
//			Time_sleep();
//			MT.click();
//			Time_sleep();
//			AddMember.click();
//			Member.sendKeys("3");
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
//			check_circle.click();
//			Time_sleep();
//			QA.click();
//			Time_sleep();
//			AddMember.click();
//			
//			Member.sendKeys("5");
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
//			check_circle.click();
//			Time_sleep();
//			QC.click();
//			Time_sleep();
//			AddMember.click();
//			Member.sendKeys("7");
//			Time_sleep();
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
//			check_circle.click();
			Time_sleep();
			Assert.assertTrue(true);

		}
		public void Add_Task_NEW_ROR() {
			BC = new BaseClass();
			Altos_Icon.click();
			Jobs_Page.click();
			Job_Id.click();
			Job_Id.sendKeys(BC.Job_id);
			option.click();
			Search.click();
			// Associated.click();
			// Search.click();
			Time_sleep();
			Job_ID.click();
			for (WebElement Job_IDList1 : Job_IDList) {
				Job_IDList1.click();
				break;
			}
			driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
			Time_sleep();
			Actions Ssubaction = new Actions(driver);
			Ssubaction.moveToElement(Add3).perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", Add3);
			Time_sleep();
			CommonUtility.Scrolldown();
			CommonUtility.jsClick(driver,selct_workitemID1 );
			Time_sleep();
			// act.doubleClick(selct_workitemID1).build().perform();
			selct_workitemID.click();
			// Edit_IconJob.click();
			Add3.click();
			selct_workitemID1.click();
			Time_sleep();
			// act.doubleClick(selct_workitemID1).build().perform();
			selct_workitemID.click();
			// Edit_IconJob.click();
			Member.clear();
			Member.sendKeys("2");
			option.click();
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
			Time_sleep();
			Ssubaction.moveToElement(check_circle).perform();
			js.executeScript("arguments[0].click()", check_circle);
			Time_sleep();
			Time_sleep();
		}	

		public void Assing_NEW_ROR() {
			BC = new BaseClass();
			Altos_Icon.click();
			Jobs_Page.click();
			Job_Id.click();
			Job_Id.sendKeys(BC.Job_id);
			option.click();
			Search.click();
			// Associated.click();
			// Search.click();
			Time_sleep();
			Job_ID.click();
			for (WebElement Job_IDList1 : Job_IDList) {
				Job_IDList1.click();
				break;
			}
			driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
			Time_sleep();
			Actions Ssubaction = new Actions(driver);
			Ssubaction.moveToElement(Edit_IconJob).perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", Edit_IconJob);
			// Edit_IconJob.click();
			Member.clear();
			Member.sendKeys("2");
			option.click();
			Time_sleep();
			Ssubaction.moveToElement(check_circle).perform();
			js.executeScript("arguments[0].click()", check_circle);
			Time_sleep();
			Time_sleep();
		}

		public void Add_Task() {
			BC = new BaseClass();
			Altos_Icon.click();
			Jobs_Page.click();
			Job_Id.click();
			Job_Id.sendKeys(BC.Job_id);
			option.click();
			Search.click();
			Time_sleep();
			Job_ID.click();
			for (WebElement Job_IDList1 : Job_IDList) {
				Job_IDList1.click();
				break;
			}
			Add3.click();
			selct_workitemID1.click();
			Time_sleep();
			// act.doubleClick(selct_workitemID1).build().perform();
			selct_workitemID.click();
			// Edit_IconJob.click();
			Add3.click();
			selct_workitemID1.click();
			Time_sleep();
			// act.doubleClick(selct_workitemID1).build().perform();
			selct_workitemID.click();
			// Edit_IconJob.click();
			Member.clear();
			Member.sendKeys(" MT Intern 2   ");
			option.click();
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
			Time_sleep();
			check_circle.click();
			Time_sleep();
			Sorter_QA.click();
			Time_sleep();
			AddMember.click();
			Member.sendKeys("Sorter Qa 1");
			option.click();
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
			check_circle.click();
			Time_sleep();
			MT.click();
			Time_sleep();
			AddMember.click();
			Member.sendKeys("MT 2");
			option.click();
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
			check_circle.click();
			Time_sleep();
			MT2assign.click();
			Time_sleep();
			AddMember.click();
			Member.sendKeys("MTQA2");
			option.click();
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
			check_circle.click();
			Time_sleep();
			QA2.click();
			Time_sleep();
			AddMember.click();
			Member.sendKeys("MTQA1");

			option.click();
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
			check_circle.click();
			Time_sleep();
			QA.click();
			Time_sleep();
			AddMember.click();

			Member.sendKeys("MTQA QA INTERN 2");
			option.click();
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
			check_circle.click();
			Time_sleep();

			QC.click();
			Time_sleep();
			AddMember.click();
			Member.sendKeys("Qc 1");
			Time_sleep();
			option.click();
//			for (WebElement MemberList11 : MemberList1 )
//			{
//				MemberList11.click();
//				break;
//			}
			check_circle.click();
			Time_sleep();
			Assert.assertTrue(true);

		}

		public void WorkItem_Page_job_Task() {
			BC = new BaseClass();

			Altos_Icon.click();
			Jobs_Page.click();
			Job_Id.click();
			Job_Id.sendKeys(BC.Job_id);
			option.click();
			Search.click();
			Time_sleep();
			Job_ID.click();
			for (WebElement Job_IDList1 : Job_IDList) {
				Job_IDList1.click();
				break;
			}
			driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
			Time_sleep();
			Actions Ssubaction = new Actions(driver);
			Ssubaction.moveToElement(Edit_IconJob).perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", Edit_IconJob);
			Member.clear();
			Member.sendKeys("MT Intern 2");
			String c = "MT Intern 2";
			for (WebElement Employee_select : Employee_name) {
				String b = Employee_select.getText().trim();
				if (c.equalsIgnoreCase(b)) {
					Ssubaction.moveToElement(Employee_select).perform();
					js.executeScript("arguments[0].click()", Employee_select);
					check_circle.click();
					break;
				}
			}
			Time_sleep();
			Sorter_QA.click();
			Time_sleep();
			Ssubaction.moveToElement(AddMember).perform();
			js.executeScript("arguments[0].click()", AddMember);
			Member.sendKeys("Sorter Qa 1");
			String d = "Sorter QA 1";
			for (WebElement Employee_select : Employee_name) {
				String b = Employee_select.getText().trim();
				if (d.equalsIgnoreCase(b)) {
					Ssubaction.moveToElement(Employee_select).perform();
					js.executeScript("arguments[0].click()", Employee_select);
					// Employee_select.click();
					check_circle.click();
					break;
				}
			}
			Time_sleep();
			MT.click();
			Time_sleep();
			AddMember.click();
			Member.sendKeys("MT 2");
			String e = "MT 2";
			for (WebElement Employee_select : Employee_name) {
				String b = Employee_select.getText().trim();
				if (e.equalsIgnoreCase(b)) {
					Employee_select.click();
					check_circle.click();
					break;
				}
			}
			Time_sleep();
			MT2assign.click();
			Time_sleep();
			AddMember.click();
			Member.sendKeys("MT QA 2");
			String f = "MT QA 2";
			for (WebElement Employee_select : Employee_name) {
				String b = Employee_select.getText().trim();
				if (f.equalsIgnoreCase(b)) {
					Employee_select.click();
					check_circle.click();
					break;
				}
			}
			Ssubaction.moveToElement(QA2).perform();
			js.executeScript("arguments[0].click()", QA2);
			Time_sleep();
			AddMember.click();
			Member.sendKeys("MT QA 1");
			String g = "MT QA 1";
			Time_sleep();
			for (WebElement Employee_select : Employee_name) {
				String b = Employee_select.getText().trim();
				if (g.equalsIgnoreCase(b)) {
					Employee_select.click();
					check_circle.click();
					break;
				}
			}
			Time_sleep();
			QA.click();
			Time_sleep();
			AddMember.click();

			Member.sendKeys("MTQA-QA Intern 2");
			Time_sleep();
			String k = "MTQA-QA Intern 2";
			for (WebElement Employee_select : Employee_name) {
				String b = Employee_select.getText().trim();
				if (k.equalsIgnoreCase(b)) {
					Employee_select.click();
					check_circle.click();
					break;
				}
			}
			Time_sleep();
			QC.click();
			Time_sleep();
			AddMember.click();
			Member.sendKeys("QC 1");
			Time_sleep();
			String l = "QC 1";
			for (WebElement Employee_select : Employee_name) {
				String b = Employee_select.getText().trim();
				if (l.equalsIgnoreCase(b)) {
					Employee_select.click();
					check_circle.click();
					break;
				}
			}
			Time_sleep();
			Assert.assertTrue(true);

		}

		public void Create_job_onJobPage() throws InterruptedException {
			BC = new BaseClass();
			Altos_Icon.click();
			Time_sleep();
			Jobs_Page.click();
			Associated.click();
			Search.click();
			Time_sleep();
			Create_New_job.click();
			Time_sleep();
			Super_Stat1.click();
			Super_Stat.click();
			Time_sleep();
			clientName.sendKeys("Ganesh_Hospital");
			ClientName_First.click();
			Time_sleep();
			subClientName.click();
			select.click();
			Time_sleep();
			Patient_name1.sendKeys("Automation");
			Time_sleep();

			CommonUtility.jsClick(driver, option);
			CommonUtility.jsClick(driver, location);
			Time_sleep();
			CommonUtility.jsClick(driver, option);
			CommonUtility.jsClick(driver, physician1);
			Time_sleep();
			CommonUtility.jsClick(driver, option);
			CommonUtility.jsClick(driver, JobType1);
			Time_sleep();
			CommonUtility.jsClick(driver, option);
			CommonUtility.jsClick(driver, Save);
			Time_sleep();
			String Job_ID = popup.getText();
			String string_output = Job_ID.replaceAll("[^A-Za-z]", "");
			int number_output = Integer.parseInt(Job_ID.replaceAll("[^0-9]", ""));
			System.out.println(number_output);
			String string_jobID = Integer.toString(number_output);
			if (string_jobID.length() > 1) {
				BC.Job_id = string_jobID.substring(1);
				// Job_id = Integer.parseInt(modifiedString );
				System.out.println(BC.Job_id);
			} else {
				System.out.println("The value has only one, so removingit will result in 0.");
			}

		}

		public void Client_Onboarding() {
			Altos_Icon.click();
			Time_sleep();
			Client_Onboarding.click();
			Time_sleep();
			Create_New_Onboarding.click();
			Time_sleep();
			Client_Type.click();
			Time_sleep();
			Selectf.click();
			Time_sleep();
			designation.clear();
			designation.sendKeys("Surgeon");
			MedicalDepartment.clear();
			MedicalDepartment.sendKeys("Neurology");
			Address.clear();
			Address.sendKeys("1 Andheri. 1.2 Bandra.");
			int c = 0;
			for (WebElement Client_Name : Input_TextBox) {
				c = c + 1;
				if (c == 2) {
					Client_Name.clear();
					Client_Name.sendKeys("Man_Hospital");
					break;

				}

			}
			int c1 = 0;
			for (WebElement Phone_No : Input_TextBox) {
				c1 = c1 + 1;
				if (c1 == 3) {
					Phone_No.clear();
					Phone_No.sendKeys("4567543524");
					break;

				}

			}
			int c2 = 0;
			for (WebElement Office_Phone_No : Input_TextBox) {
				c2 = c2 + 1;
				if (c2 == 4) {
					Office_Phone_No.clear();
					Office_Phone_No.sendKeys("9876543763");
					break;

				}

			}

			int c3 = 0;
			for (WebElement Additional_Phone_No : Input_TextBox) {
				c3 = c3 + 1;
				if (c3 == 5) {
					Additional_Phone_No.clear();
					Additional_Phone_No.sendKeys("9876543210");
					break;

				}

			}
			int c4 = 0;
			for (WebElement FAX_No : Input_TextBox) {
				c4 = c4 + 1;
				if (c4 == 6) {
					FAX_No.clear();
					FAX_No.sendKeys("1234567890");
					break;

				}

			}
			Address.sendKeys("Western Suburbs. 1.1 Andheri. 1.2 Bandra. ");
			sendFileToEmail.sendKeys("QA_Automation@gmail.com");
			sendStatusToEmail.sendKeys("QA_Automation@gmail.com");
			contactPerson.clear();
			contactPerson.sendKeys("8765764565");
			Business_Type.click();
			MT2.click();
			ROR.click();
			schedule.clear();
			schedule.sendKeys("schedule at 10 AM to 8 PM");
			Time_sleep();
			Save.click();
		}

		public void Edit_Client_Onboarding1() {
			Altos_Icon.click();
			Time_sleep();
			Client_Onboarding.click();
			Time_sleep();
			Edit.click();
			Time_sleep();
			Client_Type.click();
			Time_sleep();
			Selectf.click();
			Time_sleep();
			designation.clear();
			designation.sendKeys("Surgeon");
			MedicalDepartment.clear();
			MedicalDepartment.sendKeys("Neurology");
			Address.clear();
			Address.sendKeys("Andheri");
			int c = 0;
			for (WebElement Client_Name : Input_TextBox) {
				c = c + 1;
				if (c == 2) {
					Client_Name.clear();
					Client_Name.sendKeys("Apple_Hospital");
					break;

				}

			}
			int c1 = 0;
			for (WebElement Phone_No : Input_TextBox) {
				c1 = c1 + 1;
				if (c1 == 3) {
					Phone_No.clear();
					Phone_No.sendKeys("4567543521");
					break;

				}

			}
			int c2 = 0;
			for (WebElement Office_Phone_No : Input_TextBox) {
				c2 = c2 + 1;
				if (c2 == 4) {
					Office_Phone_No.clear();
					Office_Phone_No.sendKeys("9876543761");
					break;

				}

			}

			int c3 = 0;
			for (WebElement Additional_Phone_No : Input_TextBox) {
				c3 = c3 + 1;
				if (c3 == 5) {
					Additional_Phone_No.clear();
					Additional_Phone_No.sendKeys("9876543211");
					break;

				}

			}
			int c4 = 0;
			for (WebElement FAX_No : Input_TextBox) {
				c4 = c4 + 1;
				if (c4 == 6) {
					FAX_No.clear();
					FAX_No.sendKeys("1234567891");
					break;

				}

			}
			Address.clear();
			Address.sendKeys("Western Suburbs. 1.1 Andheri. 1.2 Bandra. ");
			sendFileToEmail.clear();
			sendFileToEmail.sendKeys("QA_Automation@gmail.com");
			sendStatusToEmail.clear();
			sendStatusToEmail.sendKeys("QA_Automation@gmail.com");
			contactPerson.clear();
			contactPerson.sendKeys("8765764565");
			Business_Type.click();
			schedule.clear();
			schedule.sendKeys("schedule at 10 AM to 8 PM");
			Time_sleep();
			Actions subaction = new Actions(driver);
			subaction.moveToElement(Save).perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", Save);
			// Save.click();
		}

		public void Sub_Client_Onboarding() {
			Altos_Icon.click();
			Time_sleep();
			Client_Onboarding.click();
			Time_sleep();
			expand_more.click();
			Time_sleep();
			Create_New_sub.click();
			Time_sleep();
			Client_Type_Sub.click();
			Time_sleep();
			Selectf.click();
			Time_sleep();

			designation.clear();
			designation.sendKeys("Surgeon");
			MedicalDepartment.clear();
			MedicalDepartment.sendKeys("Neurology");
			Address.clear();
			Address.sendKeys("1 Andheri. 1.2 Bandra.");
			int c = 0;
			for (WebElement Client_Name : Input_TextBox) {
				c = c + 1;
				if (c == 2) {
					Client_Name.clear();
					Client_Name.sendKeys("1234567890");
					break;

				}

			}
			int c1 = 0;
			for (WebElement Phone_No : Input_TextBox) {
				c1 = c1 + 1;
				if (c1 == 3) {
					Phone_No.clear();
					Phone_No.sendKeys("4567543524");
					break;

				}

			}
			int c2 = 0;
			for (WebElement Office_Phone_No : Input_TextBox) {
				c2 = c2 + 1;
				if (c2 == 4) {
					Office_Phone_No.clear();
					Office_Phone_No.sendKeys("9876543763");
					break;

				}

			}
			Address.sendKeys("Western Suburbs. 1.1 Andheri. 1.2 Bandra. ");

//			Business_Type_Sub.click();
//			MT2.click();
//	        ROR.click();
//	        Time_sleep();
//	        Business_Type_Sub.click();  
			schedule.clear();
			schedule.sendKeys("Test the QA Automation 10 PM to 9 AM");
			Time_sleep();
			sendFileToEmail.sendKeys("QA_Automation@gmail.com");
			sendStatusToEmail.sendKeys("QA_Automation@gmail.com");
			Notes.click();
			Time_sleep();
			Notes.sendKeys(
					"Clint eastwood old bruce wayne, #Flat plate collector pdf, Ragnhild alexandra lorentzen, Logger javascript,"
							+ " ##JUST TEST## ... Film il giustiziere della notte!");

			Time_sleep();
			Client_Type_Sub.click();
			Time_sleep();
			for (WebElement mat_option_text1 : mat_option_text) {

				mat_option_text1.click();
				break;
			}
			Time_sleep();
//			Save.click();
			Time_sleep();
		}

		public void Create_Patient_Page() {
			Time_sleep();
			Click_On_Patient.click();
			Time_sleep();
			Click_Create_Patient.click();
			Time_sleep();
			pGender.click();
			pMale.click();
			int c = 0;
			Time_sleep();
			for (WebElement Client_Name : p_required) {
				c = c + 1;
				if (c == 1) {
					Client_Name.clear();
					Client_Name.click();
					Client_Name.sendKeys("Ganesh_Hospital");
					p_first.click();
				}

				else if (c == 2) {
					// Time_sleep();
					Client_Name.clear();
					Client_Name.sendKeys("Test_FirstName");
				} else if (c == 3) {
					// Time_sleep();
					Client_Name.clear();
					Client_Name.sendKeys("Test_Last Name");
				} else if (c == 4) {
					// Time_sleep();
					Client_Name.clear();
					Client_Name.sendKeys("9877665544");
				} else if (c == 5) {
					// Time_sleep();
					Client_Name.clear();
					Client_Name.sendKeys("Test@gmail.com");
				}

			}

			Time_sleep();
//			Actions action=new Actions(driver);
//			action.moveToElement(pSave);
			Time_sleep();
			pSave.click();
			Time_sleep();
			String actual = (alert.getText());
			String expected = "Patient added successfully";
			Assert.assertEquals(actual, expected);

		}

		public void Edit_Patient_Page() {
			Time_sleep();
			Altos_Icon.click();
			Time_sleep();
			Click_On_Patient.click();
			Time_sleep();
			Edit_On_Patient.click();
			Time_sleep();
//			pGender.click();
//			pMale.click();
			int c = 0;
			for (WebElement Client_Name : p_required) {
				c = c + 1;
				if (c == 2) {
					// Time_sleep();
					Client_Name.clear();
					Client_Name.sendKeys("Test_FirstName1");
				} else if (c == 3) {
					// Time_sleep();
					Client_Name.clear();
					Client_Name.sendKeys("Test_Last Name");
				} else if (c == 4) {
					// Time_sleep();
					Client_Name.clear();
					Client_Name.sendKeys("9877665545");
				} else if (c == 5) {
					// Time_sleep();
					Client_Name.clear();
					Client_Name.sendKeys("Test1@gmail.com");
				}

			}
//			Time_sleep();
//			pFirst_name.clear();
//			pFirst_name.sendKeys("RAHAT");
//			pLast_name.clear();
//			pLast_name.sendKeys("Khan");
//			pSSN.clear();
//			pSSN.sendKeys("1234567");
//			Actions action=new Actions(driver);
//			action.moveToElement(pSave);
			Time_sleep();
			pSave.click();
			Time_sleep();
			String actual = (alert.getText());
			String expected = "Patient update successfully";
			Assert.assertEquals(actual, expected);

		}

		public void Delete_Patient_Page() {
			Altos_Icon.click();
			Time_sleep();
			Click_On_Patient.click();
			Time_sleep();
			Delete.click();
			Time_sleep();
			P_Yes.click();
			Time_sleep();
			String actual = (alert.getText());
			String expected = "Patient deleted successfully";
			Assert.assertEquals(actual, expected);

		}

		public void Log_out() {
			// Time_sleep();
			logIn_menu.click();
			Log_out.click();

		}

	//Association Page ==> Client Wise Association
		public void Association_Page_Employee_filter() {

			Altos_Icon.click();
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			aselect_drop_dwon.click();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			aselect_drop_dwon.click();
			aEmp.click();
			acSearch.sendKeys("MTQA-QA Intern 1");
			String a = "MTQA-QA Intern 1";

			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (a.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (a.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			}
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);

			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			}
		}

		public void Association_Page_Employee_filter1() {
			Time_sleep();
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			aselect_drop_dwon.click();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			aselect_drop_dwon.click();
			P_Clear_all.click();
			aEmp.click();
			acSearch.sendKeys("Sorter QA 1");
			String a = "Sorter QA 1";
			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					System.out.println(b);
					if (a.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					System.out.println(b);
					if (a.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			}
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);

			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual.equalsIgnoreCase(expected)) {
				Assert.assertEquals(actual, expected);
			}

		}

		public void Association_Page_Employee_filter2() {
			Time_sleep();
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			aselect_drop_dwon.click();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			aselect_drop_dwon.click();
			P_Clear_all.click();
			aEmp.click();
			acSearch.sendKeys("MTQA-QA Intern 3");
			Time_sleep();
			String f = "MTQA-QA Intern 3";

			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					System.out.println(b);
					if (f.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					System.out.println(b);
					if (f.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			}
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);

			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			}

		}

		public void Association_Page_Employee_filter3() {
			Time_sleep();
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			aselect_drop_dwon.click();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			aselect_drop_dwon.click();
			P_Clear_all.click();
			aEmp.click();
			acSearch.sendKeys("MT 1");
			String d = "MT 1";

			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (d.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (d.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			}
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);

			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			}

		}

		public void Association_Page_Employee_filter4() {
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			aselect_drop_dwon.click();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			aselect_drop_dwon.click();
			P_Clear_all.click();
			aEmp.click();
			acSearch.sendKeys("MT QA 2");
			String d = "MT QA 2";

			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					Time_sleep();
					System.out.println(b);
					if (d.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					System.out.println(b);
					if (d.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						js.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			}
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);

			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			}

		}

		public void Association_Page_Employee_filter5() {
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			aselect_drop_dwon.click();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			aselect_drop_dwon.click();
			P_Clear_all.click();
			aEmp.click();
			acSearch.sendKeys("MT Intern 5");
			String g = "MT Intern 5";
			for (WebElement Employee_select : Employee_name) {
				String b = Employee_select.getText().trim();
				if (g.equalsIgnoreCase(b)) {

					System.out.println(b);
					clselect.moveToElement(Employee_select).perform();
					Time_sleep();
					js.executeScript("arguments[0].click()", Employee_select);
					Time_sleep();
					a_Search_Chek.click();
					Time_sleep();
					break;

				}
			}
			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (g.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (g.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						js.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			}
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);

			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			}

		}

		public void Association_Page_Employee_filter6() {
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			aselect_drop_dwon.click();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			aselect_drop_dwon.click();
			P_Clear_all.click();
			aEmp.click();
			acSearch.sendKeys("MTQA-QA Intern 2");
			String a = "MTQA-QA Intern 2";

			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (a.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (a.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			}
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			}

		}

		public void Association_Page_Employee_filter7() {
			Time_sleep();
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			Time_sleep();
			aselect_drop_dwon.click();
			Time_sleep();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			Time_sleep();
			aselect_drop_dwon.click();
			Time_sleep();
			P_Clear_all.click();
			aEmp.click();
			Time_sleep();
			acSearch.sendKeys("MT QA 1");
			Time_sleep();
			String J = "MT QA 1";
			try {
				for (WebElement Employee_select : Employee_name)

				{
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name)

				{
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}

			}
			Time_sleep();
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			}

		}

		public void Association_Page_Employee_filter8() {
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			aselect_drop_dwon.click();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			aselect_drop_dwon.click();
			P_Clear_all.click();
			aEmp.click();
			acSearch.sendKeys("MT Intern 8");
			Time_sleep();
			String J = "MT Intern 8";

			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}

			}
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);

			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			}

		}

		public void Association_Page_Employee_filter9() {
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			aselect_drop_dwon.click();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			aselect_drop_dwon.click();
			P_Clear_all.click();
			aEmp.click();
			acSearch.sendKeys("QC 1");
			String J = "QC 1";
			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}

			}
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			}

		}

		public void Association_Page_Employee_filter10() {
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			aselect_drop_dwon.click();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			aselect_drop_dwon.click();
			P_Clear_all.click();
			aEmp.click();
			Time_sleep();
			acSearch.sendKeys("MT 2");
			Time_sleep();
			String J = "MT 2";

			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}

			}
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);

			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			}

		}

		public void Association_Page_Employee_filter11() {
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital1");
			aselect_drop_dwon.click();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests1");
			aselect_drop_dwon.click();
			P_Clear_all.click();
			aEmp.click();
			Time_sleep();
			acSearch.sendKeys("MT Intern 2");
			Time_sleep();
			String J = "MT Intern 2";

			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						js.executeScript("arguments[0].click()", Employee_select);
						a_Search_Chek.click();
						Time_sleep();
						break;

					}
				}

			}
			try {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);
			} catch (StaleElementReferenceException e) {
				js.executeScript("arguments[0].click()", P_check);
				clselect.moveToElement(save).perform();
				js.executeScript("arguments[0].click()", save);

			}
			String actual = (alert.getText());
			String expected = "Employees Associated with QA_Tests1 Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			}

		}

		public void Employee_Association_save() throws InterruptedException, AWTException {
			Time_sleep();
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital");
			Time_sleep();
			aselect_drop_dwon.click();
			Time_sleep();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests");
			Time_sleep();
			aselect_drop_dwon.click();
			Time_sleep();
			aEmp.click();
			acSearch.sendKeys("MT Intern 2");
			Time_sleep();
			Actions clselect = new Actions(driver);
			clselect.moveToElement(aeselect).perform();
			aeselect.click();
			a_Search_Chek.click();
			Actions subaction = new Actions(driver);
			subaction.moveToElement(P_check).perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", P_check);
			subaction.moveToElement(save).perform();
//			Time_sleep();
//			Actions clselect=new Actions(driver);
//			clselect.moveToElement(aeselect).perform();
//			aeselect.click();
//			a_Search_Chek.click();
//			Actions subaction=new Actions(driver);
//			subaction.moveToElement(aSRor).perform();
////			aSRor.click();
//			Time_sleep();
//			subaction.moveToElement(P_ancheck_first).perform();
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click()", P_ancheck_first);
//			//P_ancheck_first.click();
//			Time_sleep();
//			subaction.moveToElement(Save).perform();
//			Save.click();
//			Time_sleep();
//			clselect.moveToElement(aeselect).perform();
//			aeselect.click();
//			a_Search_Chek.click();
//			subaction.moveToElement(P_ancheck_first).perform();
//			js.executeScript("arguments[0].click()", P_ancheck_first);
//			Time_sleep();
//			subaction.moveToElement(Save).perform();
//			//Save.click();
//			Time_sleep();
//			String actual=(alert.getText());
//			String expected="Employees Associated with ROR Successfully";
//			
//			if (actual==expected) {
//			     Assert.assertEquals(actual, expected);
//			}

		}

		public void Association_Page() throws InterruptedException, AWTException {
			Time_sleep();
			Altos_Icon.click();
			aClick_Association.click();
			aClient_Name.click();
			aClient_Name.sendKeys("Ganesh_Hospital");
			Time_sleep();
			aselect_drop_dwon.click();
			Time_sleep();
			aSub_Client.click();
			aSub_Client.sendKeys("QA_Tests");
			Time_sleep();
			aselect_drop_dwon.click();

//			acSearch.sendKeys("a");
//			Actions clselect=new Actions(driver);
//			clselect.moveToElement(aeselect).perform();
//			aeselect.click();
//			a_Search_Chek.click();
			Boolean selecting = select_seq.isSelected();
			for (WebElement xyz : a_Select_Check) {
				Time_sleep();
				xyz.click();
				if (selecting == true) {
					a_Search_Chek.click();
					Actions subaction = new Actions(driver);
					subaction.moveToElement(P_check).perform();
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].click()", P_check);
					// P_check.click();
					String actual = (alert.getText());
					String expected = "Employee MT Intern 1 DeAssociated From ROR Successfully";
					String expected1 = "Employees Associated with ROR Successfully";
					if (actual == expected) {
						Assert.assertEquals(actual, expected);
					} else if (actual == expected1) {
						Assert.assertEquals(actual, expected1);
					}
					Time_sleep();

				}

				else if (selecting != true) {

					a_Search_Chek.click();
					P_check.click();
					String actual = (alert.getText());
					String expected = "Employee MT Intern 1 DeAssociated From ROR Successfully";
					String expected1 = "Employees Associated with ROR Successfully";
					if (actual == expected) {
						Assert.assertEquals(actual, expected);
					} else if (actual == expected1) {
						Assert.assertEquals(actual, expected1);
					}
					Time_sleep();

				}
				P_Clear_all.click();

			}

		}

		public void Association_Page_Employee_Wise() throws InterruptedException, AWTException {
			Time_sleep();
			Altos_Icon.click();
			aClick_Association.click();
			Employee_Wise_Association.click();
			Emp_Name.click();
			Emp_Name.sendKeys("Aarti  Salwan");
			Time_sleep();
			aselect_drop_dwon.click();
			Time_sleep();
			aaClient_name.click();
			aaClient_name.sendKeys("Ganesh_Hospital");
			Time_sleep();
			aselect_drop_dwon.click();
			Time_sleep();
			aSub_Client_name.click();
			aSub_Client_name.sendKeys("QA_Tests");
			Time_sleep();
			aselect_drop_dwon.click();
			Time_sleep();
			a_Search_Chek.click();
			Time_sleep();
			try {
				Actions subaction = new Actions(driver);
				subaction.moveToElement(P_check_first).perform();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", P_check_first);
			} catch (Exception e) {
				Actions subaction = new Actions(driver);
				subaction.moveToElement(P_ancheck_first1).perform();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", P_ancheck_first1);
				Save.click();
			}

			String actual = (alert.getText());
			String expected = "Employee MT Intern 1 DeAssociated From ROR Successfully";
			String expected1 = "Employees Associated with ROR Successfully";
			if (actual == expected) {
				Assert.assertEquals(actual, expected);
			} else if (actual == expected1) {
				Assert.assertEquals(actual, expected1);
			}

		}

	// Client Onboarding page

		public void Client_Onboarding_Create_New() {
			Altos_Icon.click();
			Time_sleep();
			Client_Onboarding.click();
			Time_sleep();
			Create_New_Onboarding.click();
			Time_sleep();
			Client_Type.click();
			Time_sleep();
			Selectf.click();
			Time_sleep();
			designation.clear();
			designation.sendKeys("Surgeon");
			MedicalDepartment.clear();
			MedicalDepartment.sendKeys("Neurology");
			Address.clear();
			Address.sendKeys("1 Andheri. 1.2 Bandra.");
			int c = 0;
			for (WebElement Client_Name : Input_TextBox) {
				c = c + 1;
				if (c == 2) {
					Client_Name.clear();
					Client_Name.sendKeys("GaneshHospital");
					break;

				}

			}
			int c1 = 0;
			for (WebElement Phone_No : Input_TextBox) {
				c1 = c1 + 1;
				if (c1 == 3) {
					Phone_No.clear();
					Phone_No.sendKeys("4567543524");
					break;

				}

			}
			int c2 = 0;
			for (WebElement Office_Phone_No : Input_TextBox) {
				c2 = c2 + 1;
				if (c2 == 4) {
					Office_Phone_No.clear();
					Office_Phone_No.sendKeys("9876543763");
					break;

				}

			}

			int c3 = 0;
			for (WebElement Additional_Phone_No : Input_TextBox) {
				c3 = c3 + 1;
				if (c3 == 5) {
					Additional_Phone_No.clear();
					Additional_Phone_No.sendKeys("9876543210");
					break;

				}

			}
			int c4 = 0;
			for (WebElement FAX_No : Input_TextBox) {
				c4 = c4 + 1;
				if (c4 == 6) {
					FAX_No.clear();
					FAX_No.sendKeys("1234567890");
					break;

				}

			}
			Address.sendKeys("Western Suburbs. 1.1 Andheri. 1.2 Bandra. ");
			sendFileToEmail.sendKeys("QA_Automation@gmail.com");
			sendStatusToEmail.sendKeys("QA_Automation@gmail.com");
			contactPerson.clear();
			contactPerson.sendKeys("8765764565");
			Business_Type.click();
			MT2.click();
			ROR.click();
			schedule.clear();
			schedule.sendKeys("schedule at 10 AM to 8 PM");
			Time_sleep();
			Actions subaction = new Actions(driver);
			subaction.moveToElement(save).perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", save);
			String actual = (alert.getText());
			Time_sleep();
			String expected = "Client added successfully";
			Assert.assertEquals(actual, expected);

		}

		public void Edit_Client_Onboarding() {
			Altos_Icon.click();
			Time_sleep();
			Client_Onboarding.click();
			Time_sleep();
			Edit.click();
			Time_sleep();
			Client_Type.click();
			Time_sleep();
			Selectf.click();
			Time_sleep();
			designation.clear();
			designation.sendKeys("Surgeon");
			MedicalDepartment.clear();
			MedicalDepartment.sendKeys("Neurology");
			Address.clear();
			Address.sendKeys("Andheri");
			int c = 0;
			for (WebElement Client_Name : Input_TextBox) {
				c = c + 1;
				if (c == 2) {
					Client_Name.clear();
					Client_Name.sendKeys("Apple_Hospital");
					break;

				}

			}
			int c1 = 0;
			for (WebElement Phone_No : Input_TextBox) {
				c1 = c1 + 1;
				if (c1 == 3) {
					Phone_No.clear();
					Phone_No.sendKeys("4567543521");
					break;

				}

			}
			int c2 = 0;
			for (WebElement Office_Phone_No : Input_TextBox) {
				c2 = c2 + 1;
				if (c2 == 4) {
					Office_Phone_No.clear();
					Office_Phone_No.sendKeys("9876543761");
					break;

				}

			}

			int c3 = 0;
			for (WebElement Additional_Phone_No : Input_TextBox) {
				c3 = c3 + 1;
				if (c3 == 5) {
					Additional_Phone_No.clear();
					Additional_Phone_No.sendKeys("9876543211");
					break;

				}

			}
			int c4 = 0;
			for (WebElement FAX_No : Input_TextBox) {
				c4 = c4 + 1;
				if (c4 == 6) {
					FAX_No.clear();
					FAX_No.sendKeys("1234567891");
					break;

				}

			}
			Address.clear();
			Address.sendKeys("Western Suburbs. 1.1 Andheri. 1.2 Bandra. ");
			sendFileToEmail.clear();
			sendFileToEmail.sendKeys("QA_Automation@gmail.com");
			sendStatusToEmail.clear();
			sendStatusToEmail.sendKeys("QA_Automation@gmail.com");
			contactPerson.clear();
			contactPerson.sendKeys("8765764565");
			Business_Type.click();
			schedule.clear();
			schedule.sendKeys("schedule at 10 AM to 8 PM");
			Time_sleep();
			Actions subaction = new Actions(driver);
			subaction.moveToElement(Save).perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", Save);
			String actual = (alert.getText());
			Time_sleep();
			String expected = "Client Apple_Hospital updated successfully";
			Assert.assertEquals(actual, expected);

		}

		public void Sub_Client_Add_Onboarding() {
			Altos_Icon.click();
			Time_sleep();
			Client_Onboarding.click();
			Time_sleep();
			expand_more.click();
			Time_sleep();
			Create_New_sub.click();
			Time_sleep();
			Client_Type_Sub.click();
			Time_sleep();
			Selectf.click();
			Time_sleep();
			designation.clear();
			designation.sendKeys("Surgeon");
			MedicalDepartment.clear();
			MedicalDepartment.sendKeys("Neurology");
			Address.clear();
			Address.sendKeys("1 Andheri. 1.2 Bandra.");
			Time_sleep();
			subClientName.sendKeys("QA_Tests");
			Time_sleep();
			locationName.sendKeys("Mumbai");
			int c = 0;
			for (WebElement Client_Name : Input_TextBox) {
				c = c + 1;
				if (c == 2) {
					Client_Name.clear();
					Client_Name.sendKeys("1234567890");
					break;

				}

			}
			int c1 = 0;
			for (WebElement Phone_No : Input_TextBox) {
				c1 = c1 + 1;
				if (c1 == 3) {
					Phone_No.clear();
					Phone_No.sendKeys("4567543524");
					break;

				}

			}
			int c2 = 0;
			for (WebElement Office_Phone_No : Input_TextBox) {
				c2 = c2 + 1;
				if (c2 == 4) {
					Office_Phone_No.clear();
					Office_Phone_No.sendKeys("9876543763");
					break;

				}

			}
			Address.sendKeys("Western Suburbs. 1.1 Andheri. 1.2 Bandra. ");

//		Business_Type_Sub.click();
//		MT2.click();
//	    ROR.click();
//	    Time_sleep();
//	    Business_Type_Sub.click();  
			schedule.clear();
			schedule.sendKeys("Test the QA Automation 10 PM to 9 AM");
			Time_sleep();

			fileFormatTypes.click();
			for (WebElement option1 : Option) {
				option1.click();
			}
			Time_sleep();
			sendFileToEmail.sendKeys("QA_Automation@gmail.com");
			sendStatusToEmail.sendKeys("QA_Automation@gmail.com");
			Time_sleep();
			Actions subaction = new Actions(driver);
			subaction.moveToElement(businessType).perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", businessType);
			ROR1.click();
			// businessType.click();
//	    for ( WebElement mat_option_text1 : option_text)
//		{
//	    	Time_sleep();
//	    	mat_option_text1.click();
//	    	
//		}

			Actions Nsubaction = new Actions(driver);
			Nsubaction.moveToElement(Notes).perform();
			// JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", Notes);
			Time_sleep();
			Notes.sendKeys(" The world relies on text messaging to communicate immediate notifications.");

			Time_sleep();
			Actions Ssubaction = new Actions(driver);
			Ssubaction.moveToElement(Submit).perform();
			// JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", Submit);
			String actual = (alert.getText());
			Time_sleep();
			Assert.assertTrue(true);

		}

		public void Client_Delet_Onboarding() {
			Altos_Icon.click();
			Time_sleep();
			Client_Onboarding.click();
			Time_sleep();
			expand_more.click();
			Time_sleep();
			// Eidit_Icon.click();
			Delete.click();
			Time_sleep();
			String actual = (alert.getText());
			Time_sleep();
			String expected = "DELETE Request successful.";
			Assert.assertEquals(actual, expected);

		}

		public void Sub_Client_Edit_Onboarding() {
			Altos_Icon.click();
			Time_sleep();
			Client_Onboarding.click();
			Time_sleep();
			expand_more.click();
			Time_sleep();
			Time_sleep();
			Eidit_Icon.click();
			Time_sleep();
			Time_sleep();
			designation.clear();
			designation.sendKeys("Surgeon_Genral");
			MedicalDepartment.clear();
			MedicalDepartment.sendKeys("Neurology");
			Address.clear();
			Address.sendKeys("1 Andheri. 1.2 Bandra.");
			subClientName.clear();
			subClientName.sendKeys("QA_Tests1");
			locationName.sendKeys("Pune");
			int c = 0;
			for (WebElement Client_Name : Input_TextBox) {
				c = c + 1;
				if (c == 2) {
					Client_Name.clear();
					Client_Name.sendKeys("1234567890");
					break;

				}

			}
			int c1 = 0;
			for (WebElement Phone_No : Input_TextBox) {
				c1 = c1 + 1;
				if (c1 == 3) {
					Phone_No.clear();
					Phone_No.sendKeys("4567543524");
					break;

				}

			}
			int c2 = 0;
			for (WebElement Office_Phone_No : Input_TextBox) {
				c2 = c2 + 1;
				if (c2 == 4) {
					Office_Phone_No.clear();
					Office_Phone_No.sendKeys("9876543766");
					break;

				}

			}
			Address.sendKeys("Western Suburbs. 1.4 Andheri. 1.2 Bandra. ");
			schedule.clear();
			schedule.sendKeys("Test the QA Automation 9 PM to 9 AM");
			Time_sleep();
	//  Actions Ssubaction=new Actions(driver);
//		Ssubaction.moveToElement(Submit).perform();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", Submit);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Time_sleep();

			int cn = 0;
			int E = 0;
			for (WebElement edit : Edits) {

				js.executeScript("window.scrollBy(0,350)", "");
				E = E + 1;
				Time_sleep();
				if (E == 1) {
					edit.click();
					cn = cn + 1;
					Time_sleep();
					for (WebElement Checkboxs : Checkbox) {
						cn = cn + 1;
						if (cn == 7) {
							Checkboxs.click();
							Time_sleep();
							fromFolder.sendKeys("QA_Automation@gmail.com");
						}
						if (cn == 8) {
							Checkboxs.click();
							Time_sleep();
							toFolder.sendKeys("QA_Automation@gmail.com");
							check_circle.click();
							break;
						}
					}
				}
			}

			Actions Ssubaction = new Actions(driver);
			Ssubaction.moveToElement(Submit).perform();
			js.executeScript("arguments[0].click()", Submit);
			Assert.assertTrue(true);

		}

		public void Sub_Client_Delete_Onboarding() {
			Altos_Icon.click();
			Time_sleep();
			Client_Onboarding.click();
			Time_sleep();
			expand_more.click();
			Time_sleep();
			// Eidit_Icon.click();
			Sub_Delete.click();
			Time_sleep();
			String actual = (alert.getText());
			Time_sleep();
			String expected = "DELETE Request successful.";
			Assert.assertEquals(actual, expected);

		}

	// // Email page
		public void Send_Email() {
			Altos_Icon.click();
			Time_sleep();
			Email_page.click();
			Time_sleep();
			Client_Name.click();
			Client_Name.sendKeys("Ganesh_Hospital");
			Selectf.click();
			Time_sleep();
			Sub_Client_Name.click();
			Sub_Client_Name.sendKeys("QA_Tests");
			Selectf.click();
			a_Search_Chek.click();
			Time_sleep();
			Send_Email.click();
			String actual = (alert.getText());
			Time_sleep();
			String expected = "DELETE Request successful.";
			Assert.assertEquals(actual, expected);

		}

	//Client Template
		public void Uplode_client_Template() {
			
			Time_sleep();
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			Client_Template_page.click();
			Create_New.click();
			client_Name.click();
			client_Name.sendKeys("Ganesh_Hospital");
			aselect_drop_dwon.click();
			clselect.moveToElement(templateType).perform();
			js.executeScript("arguments[0].click()", templateType);
			Time_sleep();
			CommonUtility.jsClick(driver,Report_Structure_Template);
			Time_sleep();
			//clselect.moveToElement(subClient_Name).perform();
			//js.executeScript("arguments[0].click()", subClient_Name);
			//aselect_drop_dwon.click();
			String projectDirectory = System.getProperty("user.dir");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			clselect.moveToElement(Browse_File).perform();
			//Browse_File.click();
			Browse_File.sendKeys(projectDirectory + "\\TestData\\Report_Structure_Template.docx");
			Time_sleep();
			Yes.click();
			Time_sleep();
			trigger.click();
			trigger.sendKeys("Ganesh_Hospital");
			aselect_drop_dwon.click();
			//subclienttemplate.sendKeys(" QA_Tests1 ");
			//CommonUtility.jsClick(driver, select_clint);
			//Time_sleep();
			CommonUtility.jsClick(driver, templatedownarrow);
			Time_sleep();
			CommonUtility.findAndClickElementByKeyword(Dropdown_template, "Report Structure Template");
			Time_sleep();
			CommonUtility.jsClick(driver, search);
			Time_sleep();
			CommonUtility.jsClick(driver, Client_temp_edit);
			Time_sleep();
			clselect.moveToElement(templateType).perform();
			js.executeScript("arguments[0].click()", templateType);
			Time_sleep();
			CommonUtility.jsClick(driver, Tagged_Document_Templatename);
			Time_sleep();
			CommonUtility.jsClick(driver,Job_type_type_dropdown);
			Time_sleep();
			CommonUtility.findAndClickElementByKeyword(dropdown7, "ROR");
			//CommonUtility.jsClick(driver, aselect_drop_dwon);
			Time_sleep();
			Count.clear();
			Count.sendKeys("1000");
			//js.executeScript("arguments[0].click()", subClient_Name);
			//aselect_drop_dwon.click();
			String projectDirectory1 = System.getProperty("user.dir");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Browse_File.sendKeys(projectDirectory1 + "\\TestData\\Dr. Wilker newTagged_Document_Template.docx");
			Time_sleep();
			trigger.sendKeys("Ganesh_Hospital");
			Time_sleep();
			aselect_drop_dwon.click();
			//CommonUtility.jsClick(driver, templatedownarrow);
			Time_sleep();
			CommonUtility.findAndClickElementByKeyword(Dropdown_template, " Tagged Document Template ");
			Time_sleep();
		CommonUtility.jsClick(driver, search);
			Time_sleep();
			//Time_sleep();
			//verified.click();
			// aselect_drop_dwon.click();
			
			

		}

		public void Uplode_Tagged_Document_Template() {
			Time_sleep();
			Actions clselect = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Altos_Icon.click();
			Client_Template_page.click();
			Create_New.click();
			client_Name.click();
			client_Name.sendKeys("Ganesh_Hospital");
			aselect_drop_dwon.click();
			clselect.moveToElement(templateType).perform();
			js.executeScript("arguments[0].click()", templateType);
			Time_sleep();
			CommonUtility.jsClick(driver, Tagged_Document_Template2);
			Time_sleep();
			CommonUtility.jsClick(driver,Job_type_type_dropdown);
			aselect_drop_dwon.click();
			Time_sleep();
			Count.clear();
			Count.sendKeys("1000");
			//js.executeScript("arguments[0].click()", subClient_Name);
			//aselect_drop_dwon.click();
			String projectDirectory = System.getProperty("user.dir");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Browse_File.sendKeys(projectDirectory + "\\TestData\\Dr. Wilker newTagged_Document_Template.docx");
			Time_sleep();
			trigger.click();
			trigger.sendKeys("Ganesh_Hospital");
			aselect_drop_dwon.click();
			search.click();
			Time_sleep();
			verified.click();

		}

		public void Filter_allfield_workitempage() {
			Altos_button.click();
			Time_sleep();
			work_item_button.click();
			Time_sleep();
			Actions clselect = new Actions(driver);
			driver.navigate().refresh();
			Time_sleep();
			String wor_item = work_item1.getText();
			Time_sleep();
			work_item_box1.sendKeys(wor_item);
			Time_sleep();
			String J = wor_item;
			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {
						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;
					}
				}
			}
			client_box1.sendKeys("Ganesh_Hospital");
			Time_sleep();
			String J1 = "Ganesh_Hospital";
			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J1.equalsIgnoreCase(b)) {
						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J1.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;
					}
				}
			}
			subclient1.sendKeys(" QA_Tests1 ");
			//CommonUtility.jsClick(driver, select_clint);
			String patient_name = patient_name2.getText();
			Patient_name.sendKeys(patient_name);
			Time_sleep();
			String J3 = patient_name;
			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J3.equalsIgnoreCase(b)) {
						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J3.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;
					}
				}
			}
			Actions Ssubaction = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Ssubaction.moveToElement(DownArrow1).perform();
			js.executeScript("arguments[0].click()", DownArrow1);
			CommonUtility.findAndClickElementByKeyword(Dropdown_Element1, "pdf");
			Ssubaction.moveToElement(DownArrow2).perform();
			js.executeScript("arguments[0].click()", DownArrow2);
			CommonUtility.findAndClickElementByKeyword(Priroty_dropdown, "Super Stat");
			CommonUtility.findAndClickElementByKeyword(Priroty_dropdown, "search_button1");
			//search_button1.click();
			Time_sleep();
			Time_sleep();
			Assert.assertTrue(true);
		}

		public void Filter_allfield_jobPage() {
			driver.navigate().refresh();
			Actions clselect = new Actions(driver);
			BC = new BaseClass();
			Altos_Icon.click();
			Time_sleep();
			Jobs_Page.click();
			Time_sleep();
			CommonUtility.jsClick(driver, Job_Id);
			//Job_Id.click();
			Job_Id.sendKeys(BC.Job_id);
			Time_sleep();
			option.click();
			Time_sleep();
			client_box1.sendKeys("Ganesh_Hospital");
			Time_sleep();
			String J1 = "Ganesh_Hospital";
			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J1.equalsIgnoreCase(b)) {
						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J1.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;
					}
				}
			}
			subclient1.sendKeys(" QA_Tests ");
			CommonUtility.jsClick(driver, select_clint);
			Time_sleep();
			CommonUtility.moveToElement(driver, Job_patient_name);
			String patient_name = Job_patient_name.getText();
			System.out.println(patient_name);
			Time_sleep();
			Job_patient.sendKeys(patient_name);
			Time_sleep();
			String J3 = patient_name;
			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J3.equalsIgnoreCase(b)) {
						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J3.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						CommonUtility.jsClick(driver, Employee_select);
						Time_sleep();
						break;
					}
				}
			}
			Time_sleep();
			CommonUtility.jsClick(driver, Dropdown_button_job);
			CommonUtility.findAndClickElementByKeyword(Dropdown_Element1,"ROR");
			Time_sleep();
			CommonUtility.jsClick(driver, Job_priority_downarrow);
			CommonUtility.findAndClickElementByKeyword(Priroty_dropdown,"Super Stat");
			Time_sleep();
			CommonUtility.jsClick(driver, Job_status_downarrow);
			CommonUtility.findAndClickElementByKeyword(status_dropdown,"Job Created");
			Time_sleep();
			// *[@class='mat-select-arrow-wrapper ng-tns-c127-14']
			search_button1.click();
			Time_sleep();
			Time_sleep();
			CommonUtility.jsClick(driver, expand_more);
			Time_sleep();
			CommonUtility.jsClick(driver, expand_less);
			Assert.assertTrue(true);
		}

		public void Create_new_workItem1() {
			Altos_Icon.click();
			BC = new BaseClass();
			System.out.println(Helper.getCurrentDataTime());
			WorkItem_Icon.click();
			System.out.println(Helper.getCurrentDataTime());
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			CreateNew_WorkItem.click();
			ClientName.sendKeys("Ganesh_Hospital");
			Time_sleep();
			select_clint.click();
			Time_sleep();
			// ClientName_First.click();
			Sub_ClientName.click();
			Time_sleep();
			Sub_ClientName_First.click();
			Time_sleep();
			String projectDirectory = System.getProperty("user.dir");
			Actions subaction = new Actions(driver);
			Random rand = new Random();
			int rand_int = rand.nextInt(1000);
			String str5 = "" + rand_int;
			Path path = Paths.get(str5);
			File f = new File(projectDirectory + "\\TestData\\Upload_File1.pdf");
			File s = new File(projectDirectory + "\\TestData\\Files\\" + path + ".pdf");
			// BC.s1=s;
			try {
				Files.copy(f.toPath(), s.toPath());

			} catch (IOException e) {
				e.printStackTrace();
			}
			if (f.exists()) {
				System.out.println(f.renameTo(s));
			} else {
				System.out.println("File doesn't exists");
			}
			subaction.moveToElement(Browse_File).perform();
			js.executeScript("arguments[0].click()", Browse_File);
			Time_sleep();
			System.out.println(s);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Browse_File.sendKeys("" + s);
			Time_sleep();
			Eidit_Icon.click();
			Priority.click();
			Super_Stat.click();
			check_circle.click();
			Time_sleep();
			Time_sleep();
			CreateWork_Items.click();
			Time_sleep();
			driver.navigate().refresh();
		}

		public void Merge_workitem() {
			driver.navigate().refresh();
			Time_sleep();
			checkbox.click();
			checkbox1.click();
			Actions Ssubaction = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Ssubaction.moveToElement(Merge_button).perform();
			js.executeScript("arguments[0].click()", Merge_button);
			Time_sleep();
			Ssubaction.moveToElement(Merge_WorkItem).perform();
			js.executeScript("arguments[0].click()", Merge_WorkItem);
			Time_sleep();
			Ssubaction.moveToElement(Yes2_button).perform();
			js.executeScript("arguments[0].click()", Yes2_button);
			Time_sleep();
			driver.navigate().refresh();
			Ssubaction.moveToElement(Undo_button).perform();
			js.executeScript("arguments[0].click()", Undo_button);
			Time_sleep();
			Ssubaction.moveToElement(Yes2_button).perform();
			js.executeScript("arguments[0].click()", Yes2_button);
			Time_sleep();
			Assert.assertTrue(true);
		}

		public void Split_workitem() {
			Time_sleep();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Actions subaction = new Actions(driver);
			checkbox.click();
			Time_sleep();
			split_button.click();
			Time_sleep();
			CommonUtility.moveToElement(driver, page_add_box);
			page_add_box.clear();
			page_add_box.sendKeys("2");
			subaction.moveToElement(add1_button).perform();
			js.executeScript("arguments[0].click()", add1_button);
			Time_sleep();
			Split_Work_Item.click();
			Time_sleep();
			driver.navigate().refresh();
			// CommonUtility.performClickAction(driver, DownArrow2);
			// Time_sleep();
			// CommonUtility.findAndClickElementByKeyword(Priroty_dropdown, "Super Stat");
			Time_sleep();
			subaction.moveToElement(search_button1).perform();
			js.executeScript("arguments[0].click()", search_button1);
			Time_sleep();
			subaction.moveToElement(Undo_button).perform();
			js.executeScript("arguments[0].click()", Undo_button);
			Time_sleep();
			Yes2_button.click();
			Time_sleep();
			driver.navigate().refresh();
			Assert.assertTrue(true);
		}

		public void Edit_and_Delete_workitem() {
			Altos_Icon.click();
			BC = new BaseClass();
			System.out.println(Helper.getCurrentDataTime());
			WorkItem_Icon.click();
			driver.navigate().refresh();
			Time_sleep();
			CommonUtility.jsClick(driver, Edit_button);
			Time_sleep();
			CommonUtility.jsClick(driver, Plus_button);
			Time_sleep();
			CommonUtility.moveToElement(driver, Add_Name_button);
			Add_Name_button.sendKeys("Automation");
			Time_sleep();
			CommonUtility.moveToElement(driver, Last_Name_button);
			Last_Name_button.sendKeys("Tester");
			Time_sleep();
			CommonUtility.scrollVertically(driver, 1000);
			CommonUtility.moveToElement(driver, save1);
			CommonUtility.jsClick(driver, save1);
			CommonUtility.moveToElement(driver, downarrow);
			Time_sleep();
			CommonUtility.jsClick(driver, downarrow);
			Time_sleep();
			CommonUtility.findAndClickElementByKeyword(Dropdown_Element6, "MT");
			Time_sleep();
			CommonUtility.jsClick(driver, check_Circle);
			Time_sleep();
			CommonUtility.jsClick(driver, ExpandMore);
			CommonUtility.initializeDriverWithImplicitWait();
			CommonUtility.jsClick(driver, expand_less);
			Time_sleep();
			driver.navigate().refresh();
			CommonUtility.moveToElement(driver, deleteworkitem);
			CommonUtility.jsClick(driver, deleteworkitem);
			Time_sleep();
			reasonbox.sendKeys("DELETE");
			CommonUtility.jsClick(driver, Yes2_button);
			Assert.assertTrue(true);
		}

		public void pdf_workitem() {
			Altos_button.click();
			work_item_button.click();
			driver.navigate().refresh();
			Time_sleep();
			String parent = driver.getWindowHandle();
			System.out.println(parent);
			CommonUtility.initializeDriverWithImplicitWait();
			Time_sleep();
			CommonUtility.jsClick(driver, work_item1);
			Time_sleep();
			Set<String> as = driver.getWindowHandles();
			System.out.println(as);
			for (String as1 : as) {
				if (!as1.equals(parent)) {
					driver.switchTo().window(as1);
					CommonUtility.jsClick(driver, page1_button);
					Time_sleep();
					Time_sleep();
					CommonUtility.jsClick(driver, Zoom_Out1);
					Time_sleep();// Get the size (dimensions) of the
					Dimension size = pageContent.getSize();
					int width = size.getWidth();
					int height = size.getHeight();
					System.out.println("Page width: " + width);
					System.out.println("Page height: " + height);
					Assert.assertEquals(width, 2187, "Text assertion passed");
					Time_sleep();
					page1_button.click();
					Time_sleep();
					CommonUtility.jsClick(driver, Zoom_in1);

					Time_sleep();// Get the size (dimensions) of the page content Dimension
					Dimension size1 = pageContent.getSize();
					int width1 = size1.getWidth();
					int height1 = size1.getHeight();
					System.out.println("Page width: " + width1);
					System.out.println("Page height: " + height1);
					Assert.assertEquals(width1, 2431, "Text assertion passed");
					Time_sleep();
					CommonUtility.performClickAction(driver, clockwise_button);
					Time_sleep();
					Alert.click();
					String alertText = alert.getText();
					System.out.println("Alert Text: " + alertText);
					Assert.assertEquals(alertText, "File rotate successfully", "Text assertion passed");
					Time_sleep();
					page1_button.click();
					CommonUtility.performClickAction(driver, Anticlock_rotate);
					Time_sleep();
					Alert.click();
					String alertText1 = alert.getText();
					System.out.println("Alert Text: " + alertText1);
					Assert.assertEquals(alertText1, "File rotate successfully", "Text assertion passed");
					Time_sleep();
					CommonUtility.moveToElement(driver, page1_button);
					page1_button.click();
					tab.click();
					Time_sleep();
					driver.switchTo().window(as1);
					Time_sleep();
					input_num.sendKeys(Keys.BACK_SPACE);
					Time_sleep();
					input_num.sendKeys("3");
					input_num.sendKeys(Keys.ENTER);
					Time_sleep();
					CommonUtility.moveToElement(driver, next_button);
					CommonUtility.performClickAction(driver, next_button);
					Time_sleep();
					input_num.sendKeys(Keys.ARROW_RIGHT);
					input_num.sendKeys(Keys.BACK_SPACE);
					Time_sleep();
					input_num.sendKeys("1");
					input_num.sendKeys(Keys.ENTER);
					Time_sleep();
					CommonUtility.jsClick(driver, Show_OCR);
					Time_sleep();
					// Simulate pressing the "Page Up" key twice
					element3.click();
					element3.sendKeys(Keys.PAGE_UP);
					element3.sendKeys(Keys.PAGE_UP);
					Time_sleep();
					CommonUtility.moveToElement(driver, page2_button);
					CommonUtility.jsClick(driver, page2_button);
					Time_sleep();
					Zoom_Out.click();
					Time_sleep();
					// Get the size (dimensions) of the page content
					Dimension size3 = pageContent.getSize();
					int width3 = size3.getWidth();
					int height3 = size3.getHeight();
					System.out.println("Page width: " + width3);
					System.out.println("Page height: " + height3);
					Assert.assertEquals(width3, 2187, "Text assertion passed");
					Time_sleep();
					CommonUtility.moveToElement(driver, page2_button);
					CommonUtility.jsClick(driver, page2_button);
					Time_sleep();
					Zoom_in.click();
					Time_sleep();
					// Get the size (dimensions) of the page content
					Dimension size4 = pageContent.getSize();
					int width4 = size4.getWidth();
					int height4 = size4.getHeight();
					System.out.println("Page width: " + width4);
					System.out.println("Page height: " + height4);
					Assert.assertEquals(width4, 2431, "Text assertion passed");
					Time_sleep();
					CommonUtility.moveToElement(driver, page2_button);
					Time_sleep();
					CommonUtility.jsClick(driver, page2_button);
					CommonUtility.jsClick(driver, Auto_renew);
					String text5 = Assert_Auto_renew.getText();
					Time_sleep();
					Assert.assertEquals(text5, "OCR Processed has Started Successfully", "Text assertion passed");
					Time_sleep();
					CommonUtility.jsClick(driver, page2_button);
					CommonUtility.jsClick(driver, Auto_renew);
					CommonUtility.jsClick(driver, tab2);
					Time_sleep();
					driver.switchTo().window(as1);
					Time_sleep();
					CommonUtility.jsClick(driver, Show_Both);
					Time_sleep();
					input_num.sendKeys(Keys.ARROW_RIGHT);
					input_num.sendKeys(Keys.BACK_SPACE);
					input_num.sendKeys("3");
					input_num.sendKeys(Keys.ENTER);
					Time_sleep();
					CommonUtility.jsClick(driver, Navigate_Back);
					Time_sleep();
					CommonUtility.jsClick(driver, Show_OCR);
					Time_sleep();
					CommonUtility.jsClick(driver, Show_Blank);
					Time_sleep();
					CommonUtility.Scrollup();
					String text7 = blank_page.getText();
					Time_sleep();
					Assert.assertEquals(text7, "This page is blank.", "Text assertion passed");
					CommonUtility.jsClick(driver, Show_PDF);
					Time_sleep();
					element3.click();
					element3.sendKeys(Keys.PAGE_UP);
					element3.sendKeys(Keys.PAGE_UP);
					Time_sleep();
					String page51 = page5.getText();
					Assert.assertEquals(page51, "Page : 5", "Text assertion passed");
					Time_sleep();
					CommonUtility.jsClick(driver, Show_Both);
				}
			}
			Time_sleep();
			Assert.assertTrue(true);
		}

		public void Run_All_fuction() {
			Altos_button.click();
			Import_button.click();
			RunAll_button.click();
			Yes1_button.click();
			Time_sleep();
			Assert.assertTrue(true);
		}

		public void Pause_All_fuction() {
			Altos_button.click();
			Import_button.click();
			PauseAll_button.click();
			Yes1_button.click();
			Time_sleep();
			Assert.assertTrue(true);
		}

		public void Stop_All_fuction() {
			Altos_button.click();
			Import_button.click();
			StopAll_button.click();
			Yes1_button.click();
			Time_sleep();
			Assert.assertTrue(true);
		}

		public void Filter_by_import_fuction() {
			Altos_button.click();
			Import_button.click();
			driver.navigate().refresh();
			Client_Name1.sendKeys("Ganesh_Hospital");
			select_clint.click();
			SubClient_Name1.sendKeys("QA_Tests1");
			select_clint.click();
			// Dropdown1.click();
			CommonUtility.jsClick(driver, Dropdown1);
			CommonUtility.findAndClickElementByKeyword(Dropdown_Element1, "FTP");
			CommonUtility.jsClick(driver, Dropdown2);
			CommonUtility.findAndClickElementByKeyword(Dropdown_Element2, "No");
			RunAll_button.click();
			Time_sleep();
			Yes1_button.click();
			Time_sleep();
			CommonUtility.jsClick(driver, Dropdown3);
			CommonUtility.findAndClickElementByKeyword(Dropdown_Element3, "Completed");
			search_button.click();
			Time_sleep();
			try {
				if (DeleteClient.isDisplayed()) {
					CommonUtility.jsClick(driver, DeleteClient);
					CommonUtility.jsClick(driver, Yes_Delete_button);
				} else {
					System.out.println("element is not exist1");
				}
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("element is not exist");
			}

			Assert.assertTrue(true);
		}

		public void Create_new_fuction_import_page() throws InterruptedException {
			Altos_button.click();
			Import_button.click();
			Time_sleep();
			Create_new_button.click();
			Time_sleep();
			JavascriptExecutor j1 = (JavascriptExecutor) driver;
			j1.executeScript("window.scrollBy(0,1000)");
			Time_sleep();
			Actions clselect = new Actions(driver);
			ClientName_box.sendKeys("Ganesh_Hospital");
			Time_sleep();
			String J = "Ganesh_Hospital";
			try {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {
						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						j1.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						break;

					}
				}
			} catch (StaleElementReferenceException e) {
				for (WebElement Employee_select : Employee_name) {
					String b = Employee_select.getText().trim();
					if (J.equalsIgnoreCase(b)) {

						System.out.println(b);
						clselect.moveToElement(Employee_select).perform();
						Time_sleep();
						j1.executeScript("arguments[0].click()", Employee_select);
						Time_sleep();
						break;
					}
				}
			}
			SubClient_name.sendKeys(" QA_Tests1 ");
			JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
			select_clint.click();
			jsExecutor1.executeScript("arguments[0].click();", Down_arrow_button);
			String option = " Dropbox "; // Replace with the actual text.
			for (int i = 0; i < Connection_string_dropdoewn.size(); i++) {
				System.out.println(Connection_string_dropdoewn.get(i).getText());
				System.out.println(Connection_string_dropdoewn.size());
				if (Connection_string_dropdoewn.get(i).getText().contains("FTP")) {
					Connection_string_dropdoewn.get(i).click();
					break;
				}
			}
			save_button.click();
			Time_sleep();
			Assert.assertTrue(true);
		}

		public void Filter_client_fuction() {
			CommonUtility.jsClick(driver, Altos_button);
			Import_button.click();
			Time_sleep();
			CommonUtility.scrollVertically(driver, 1000);
			ClientName_box.sendKeys("Ganesh_Hospital");
			select_clint.click();
			SubclientName_box.sendKeys("QA_Tests1");
			select_clint.click();

			Search_button.click();
			Time_sleep();
			// String text = element.getText();
			// System.out.println(text);
			// String expectedText = "Ganesh_Hospital";
			// Assert.assertTrue(text.contains(expectedText), "Ganesh_Hospital");
			Time_sleep();
			Assert.assertTrue(true);
		}

		public void Staus_log_dropdown_fuction() {
			Altos_button.click();
			Import_button.click();
			Time_sleep();
			driver.navigate().refresh();
			CommonUtility.scrollVertically(driver, 1000);
			CommonUtility.jsClick(driver, DowArrow_button);
			CommonUtility.findAndClickElementByKeyword(dropdownElement, "Success");
			CommonUtility.jsClick(driver, Search_button);
			String text = element1.getText();
			System.out.println(text);
			String expectedText = "Success";
			Assert.assertTrue(text.contains(expectedText), "Success");
			CommonUtility.moveToElement(driver, element1);
			Time_sleep();
			Assert.assertTrue(true);
		}
	

	public void revertjob_() {
		BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();

	}

	public void Edit_and_Delete_workitem1() {
		driver.navigate().refresh();
		Time_sleep();
		CommonUtility.jsClick(driver, Edit_button);
		Time_sleep();
		CommonUtility.jsClick(driver, Plus_button);
		Time_sleep();
		CommonUtility.moveToElement(driver, Add_Name_button);
		Add_Name_button.sendKeys("Automation");
		Time_sleep();
		CommonUtility.moveToElement(driver, Last_Name_button);
		Last_Name_button.sendKeys("Tester");
		Time_sleep();
		CommonUtility.scrollVertically(driver, 1000);
		CommonUtility.moveToElement(driver, save1);
		CommonUtility.jsClick(driver, save1);
		CommonUtility.moveToElement(driver, downarrow);
		Time_sleep();
		CommonUtility.jsClick(driver, downarrow);
		Time_sleep();
		CommonUtility.findAndClickElementByKeyword(Dropdown_Element6, "MT");
		Time_sleep();
		CommonUtility.jsClick(driver, check_Circle);
		Time_sleep();
		CommonUtility.jsClick(driver, ExpandMore);
		CommonUtility.initializeDriverWithImplicitWait();
		CommonUtility.jsClick(driver, expand_less);
		Time_sleep();
		driver.navigate().refresh();
		Assert.assertTrue(true);
	}

	public void Add_Task_NEW_ROR1() {
		BC = new BaseClass();
		Altos_Icon.click();
		Jobs_Page.click();
		Job_Id.click();
		Job_Id.sendKeys(BC.Job_id);
		option.click();
		Search.click();
		// Associated.click();
		// Search.click();
		Time_sleep();
		Job_ID.click();
		for (WebElement Job_IDList1 : Job_IDList) {
			Job_IDList1.click();
			break;
		}
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		Time_sleep();
		Actions Ssubaction = new Actions(driver);
		Ssubaction.moveToElement(Add3).perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Add3);
		Time_sleep();
		CommonUtility.Scrolldown();
		CommonUtility.jsClick(driver, selct_workitemID1);
		Time_sleep();
		// act.doubleClick(selct_workitemID1).build().perform();
		selct_workitemID.click();
		// Edit_IconJob.click();
		Add3.click();
		selct_workitemID1.click();
		Time_sleep();
		// act.doubleClick(selct_workitemID1).build().perform();
		selct_workitemID.click();
		// Edit_IconJob.click();
		Member.clear();
		Member.sendKeys("2");
		option.click();
//	for (WebElement MemberList11 : MemberList1 )
//	{
//		MemberList11.click();
//		break;
//	}
		Time_sleep();
		Ssubaction.moveToElement(check_circle).perform();
		js.executeScript("arguments[0].click()", check_circle);
		Time_sleep();
		logout_Icon.click();
		Time_sleep();
		LOG_OUT.click();
		Time_sleep();
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}