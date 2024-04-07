package com.altos.Test_cases;

import java.awt.AWTException;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;

public class Test_Create_Patient_Page extends BaseClass
{@Test
	public void loginApp()
	{
		logger=report.createTest("Loging TL");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_page= PageFactory.initElements(driver, CommonUtility.class);
		Loging_page.loginAltos(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The TL Loging shows Success");
	}
	@Test(dependsOnMethods = {"loginApp"})
	public void Create_Patient_Page() 
	{
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Create_Patient_Page();
		logger.pass("The TL Create New Work-Item shows Success");
		
	}
	@Test(dependsOnMethods = {"Create_Patient_Page"})
	public void Edit_Patient_Page() 
	{
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Edit_Patient_Page();
		logger.pass("The TL Create New Work-Item shows Success");
		
	}
	
//	@Test(dependsOnMethods = {"Edit_Patient_Page"})
//	public void Delete_Patient_Page() 
//	{
//		logger=report.createTest("Create Appoinment on patient page");
//		logger.info("Create appointment");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Delete_Patient_Page();
//		logger.pass("The TL Create New Work-Item shows Success");
//		
//	}
}
