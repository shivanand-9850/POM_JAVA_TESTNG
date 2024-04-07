package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;

public class Test_Create_Job_On_JobPage extends BaseClass {

	@Test
	public void loginApp() {
		logger = report.createTest("Loging TL");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_page = PageFactory.initElements(driver, CommonUtility.class);
		Loging_page.loginAltos(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The TL Loging shows Success");
	}

	@Test(dependsOnMethods = { "loginApp", })
	public void Create_job_onJobPage() throws InterruptedException

	{
		logger = report.createTest("the TL Create New Work-Item");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page = PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Create_job_onJobPage();
		logger.pass("The TL Create New Work-Item shows Success");
	}

	@Test(dependsOnMethods = { "Create_job_onJobPage", })
	// @Test(dependsOnMethods = {"loginApp",})
	public void Add_workItem() throws InterruptedException

	{
		logger = report.createTest("the TL Create New Work-Item");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page = PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Add_workItem();
		logger.pass("The TL Create New Work-Item shows Success");
	}

//	@Test(dependsOnMethods = { "Add_workItem", })
//	// @Test(dependsOnMethods = {"loginApp",})
//	public void Add_Task()
//
//	{
//		logger = report.createTest("Add_workItem");
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page = PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Add_Task();
//		logger.pass("The TL Create New Work-Item shows Success");
//	}

}
