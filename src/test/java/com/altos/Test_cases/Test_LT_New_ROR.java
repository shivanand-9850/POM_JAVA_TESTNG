package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;

public class Test_LT_New_ROR extends BaseClass
{
	@Test
	public void loginApp()
	{
		logger=report.createTest("Loging TL");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_page= PageFactory.initElements(driver, CommonUtility.class);
		Loging_page.loginAltos(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The TL Loging shows Success");
	}

	@Test(dependsOnMethods = {"loginApp",})
	public void Create_job_onJobPage() throws InterruptedException 
	
	{
		logger=report.createTest("Verify that the Create job on Job Page");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Create_job_onJobPage();
		logger.pass("The Create job on Job Page shows Success");
	}
	
	@Test(dependsOnMethods = {"Create_job_onJobPage",})
	public void Add_workItem() 
	
	{
		logger=report.createTest("Verify thta the Add workItem");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Add_workItem();
		logger.pass("The Add workItem Success");
	}
	//@Test(dependsOnMethods = {"Add_workItem",})
	@Test(dependsOnMethods = {"loginApp",})
	public void Add_Task_NEW_ROR()
	
	{
		logger=report.createTest("Verify thta the Add Task");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Add_Task_NEW_ROR();
		logger.pass("The Add Task shows Success");
	}
//	@Test(dependsOnMethods = {"loginApp",})
//	//@Test(dependsOnMethods = {"Add_Task",})
//	public void AssignTask_New_ROR() 
//	
//	{
//		logger=report.createTest("Verify thta the Add Task");
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.AssignTask_New_ROR();
//		logger.pass("The Add Task shows Success");
//	}
}
