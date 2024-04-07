package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;

public class Test_Create_Job_On_JobPage_New_ROR extends BaseClass {
	@Test
	public void loginApp() {
		logger = report.createTest("Loging TL");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_page = PageFactory.initElements(driver, CommonUtility.class);
		Loging_page.loginAltos(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The TL Loging shows Success");
	}

	@Test(dependsOnMethods = { "loginApp", }, priority = 0)
	public void Create_job_onJobPage() throws InterruptedException//govind

	{
		logger = report.createTest("Verify that TL Create (Create New Work-Item/filter all field/Addworkitem)");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page = PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Create_new_workItem1();
		LogingTL_page.Create_job_onJobPage();
		LogingTL_page.Filter_allfield_jobPage();
		LogingTL_page.Add_workItem();
		logger.pass("The TL (Create New Work-Item/filter all field/Addworkitem) on job Page shows Success");
	}

	//@Test(dependsOnMethods = { "Add_workItem", })
	@Test(dependsOnMethods = { "Create_job_onJobPage"})
	public void Add_Task_NEW_ROR()

	{
		logger = report.createTest("Verify that TL can able to add a Task");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page = PageFactory.initElements(driver, LogingTL_page.class);
		//LogingTL_page.Create_job_onJobPage();
		LogingTL_page.Add_Task_NEW_ROR();
		logger.pass("The TL can able to add a Task shows Success");
	}

}
