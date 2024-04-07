package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingMT_page;
import com.altos.Page_object.LogingQA_page;
import com.altos.Page_object.LogingQC_Page;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Test_ImportPage_TL extends BaseClass {
	@Test
	public void loginAltos_TL() {

		logger = report.createTest(" Verify that the TL able to Loging");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_page= PageFactory.initElements(driver, CommonUtility.class);
		Loging_page.loginAltos(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The TL Loging shows Success");
	}

	@Test(dependsOnMethods = { "loginAltos_TL", }, priority = 3)
	public void Run_All_functionality() {
		logger = report.createTest(" Verify run all fuctionality in import page");
		logger.info("Starting Applicaton");
		LogingTL_page Loging_TL = PageFactory.initElements(driver, LogingTL_page.class);
		Loging_TL.Run_All_fuction();
		logger.pass("run all fuctionality  is Complete shows Success");

	}

	@Test(dependsOnMethods = { "loginAltos_TL", }, priority = 1)
	public void Pause_All_functionality() {
		logger = report.createTest(" Verify pause all fuctionality in import page");
		logger.info("Starting Applicaton");
		LogingTL_page Loging_TL = PageFactory.initElements(driver, LogingTL_page.class);
		Loging_TL.Pause_All_fuction();
		logger.pass("pause all fuctionality  is Complete shows Success");
	}

	@Test(dependsOnMethods = {"loginAltos_TL", }, priority = 2)
	public void Stop_All_functionality() {
		logger = report.createTest(" Verify stop all fuctionality in import page");
		logger.info("Starting Applicaton");
		LogingTL_page Loging_TL = PageFactory.initElements(driver, LogingTL_page.class);
		Loging_TL.Stop_All_fuction();
		logger.pass("stop all fuctionality  is Complete shows Success");

	}

	@Test(dependsOnMethods = { "loginAltos_TL", }, priority = 0)
	public void Create_new_functionality_import_page() throws InterruptedException {
		logger = report.createTest(" Verify the Create new functionality on the import page.");
		logger.info("Starting Applicaton");
		LogingTL_page Loging_TL = PageFactory.initElements(driver, LogingTL_page.class);
		Loging_TL.Filter_by_import_fuction();
		Loging_TL.Create_new_fuction_import_page();
		logger.pass("Create New functionality is Complete shows Success");

	}

	@Test(dependsOnMethods = { "loginAltos_TL" }, priority = 5)
	public void Log_filter_functionality_import_page() {
		logger = report.createTest(" Verify the log filter functionality on the import page.");
		logger.info("Starting Applicaton");
		LogingTL_page Loging_TL = PageFactory.initElements(driver, LogingTL_page.class);
		Loging_TL.Filter_client_fuction();
		logger.pass("log filter functionality is Complete shows Success");

	}

	@Test(dependsOnMethods = { "loginAltos_TL", }, priority = 4)
	public void Log_filter_functionality_by_status_field() {
		logger = report.createTest(" Verify the log status_filter functionality on the import page.");
		logger.info("Starting Applicaton");
		LogingTL_page Loging_TL = PageFactory.initElements(driver, LogingTL_page.class);
		Loging_TL.Staus_log_dropdown_fuction();
		logger.pass("log status_filter functionality is Complete shows Success");

	}

	@Test(dependsOnMethods = { "loginAltos_TL", }, priority = 6)
	public void filter_by_import_functionality_and_Delete_client() throws InterruptedException {
		logger = report.createTest(" Verify the filter functionality of import & Delete client.");
		logger.info("Starting Applicaton");
		LogingTL_page Loging_TL = PageFactory.initElements(driver, LogingTL_page.class);
		// Loging_TL.Create_new_fuction_import_page();
		Loging_TL.Filter_by_import_fuction();
		logger.pass("filter functionality of import & delete client is Complete shows Success.");

	}
}
