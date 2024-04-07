package com.altos.Test_cases;


import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;
public class Test_Association_Page extends BaseClass {
	
//	public void Log_out() 
//	{
//		LogingTL_page Loging_page= PageFactory.initElements(driver, LogingTL_page.class);
//		Loging_page.Log_out();
//	}
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
	@Test(dependsOnMethods = {"loginApp"})
	public void Association_Page_Employee_filter() throws InterruptedException, AWTException 
	{
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter();
		logger.pass("The TL Create New Work-Item shows Success");
	}
	@Test(dependsOnMethods = {"Association_Page_Employee_filter"})
	public void Association_Page_Employee_filter1() throws InterruptedException, AWTException 
	{
	
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter1();
		logger.pass("The TL Create New Work-Item shows Success");
		
	}
	
	@Test(dependsOnMethods = {"Association_Page_Employee_filter1"})
	public void Association_Page_Employee_filter2() throws InterruptedException, AWTException 
	{
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter2();
		logger.pass("The TL Create New Work-Item shows Success");
		
	}
	
	@Test(dependsOnMethods = { "Association_Page_Employee_filter2"})
	public void Association_Page_Employee_filter3() throws InterruptedException, AWTException 
	{
		
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter3();
		logger.pass("The TL Create New Work-Item shows Success");
		
	}
	@Test(dependsOnMethods = { "Association_Page_Employee_filter3"})
	public void Association_Page_Employee_filter4() throws InterruptedException, AWTException 
	{
		
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter4();
		logger.pass("The TL Create New Work-Item shows Success");
		
	}
	
	@Test(dependsOnMethods = { "Association_Page_Employee_filter4"})
	public void Association_Page_Employee_filter5() throws InterruptedException, AWTException 
	{
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter5();
		logger.pass("The TL Create New Work-Item shows Success");
		
	}
	
	@Test(dependsOnMethods = { "Association_Page_Employee_filter5"})
	public void Association_Page_Employee_filter6() throws InterruptedException, AWTException 
	{
	
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter6();
		logger.pass("The TL Create New Work-Item shows Success");
	
	}
	@Test(dependsOnMethods = { "Association_Page_Employee_filter"})
	public void Association_Page_Employee_filter7() throws InterruptedException, AWTException 
	{
		
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter7();
		logger.pass("The TL Create New Work-Item shows Success");
		
		
	}
	@Test(dependsOnMethods = { "Association_Page_Employee_filter7"})
	public void Association_Page_Employee_filter8() throws InterruptedException, AWTException 
	{
		
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter8();
		logger.pass("The TL Create New Work-Item shows Success");
		
	}
	@Test(dependsOnMethods = {"loginApp"})
	//@Test(dependsOnMethods = { "Association_Page_Employee_filter8"})
	public void Association_Page_Employee_filter9() throws InterruptedException, AWTException 
	{
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter9();
		logger.pass("The TL Create New Work-Item shows Success");
	
	}
	@Test(dependsOnMethods = { "Association_Page_Employee_filter9"})
	public void Association_Page_Employee_filter10() throws InterruptedException, AWTException 
	{
		
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter10();
		logger.pass("The TL Create New Work-Item shows Success");
	}
	@Test(dependsOnMethods = {"loginApp"})
	//@Test(dependsOnMethods = { "Association_Page_Employee_filter10"})
	public void Association_Page_Employee_filter11() throws InterruptedException, AWTException 
	{
		
		logger=report.createTest("Create Appoinment on patient page");
		logger.info("Create appointment");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Association_Page_Employee_filter11();
		logger.pass("The TL Create New Work-Item shows Success");
	}

//	@Test(dependsOnMethods = {"loginApp"})
//	//@Test(dependsOnMethods = {"Association_Page_Employee_filter"})
//	public void Employee_Association_save() throws InterruptedException, AWTException 
//	{
//		logger=report.createTest("Create Appoinment on patient page");
//		logger.info("Create appointment");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Employee_Association_save();
//		logger.pass("The TL Create New Work-Item shows Success");
//		
//	}
//	
//	@Test(dependsOnMethods = {"Employee_Association_save"})
//	public void Association_Page() throws InterruptedException, AWTException 
//	{
//		logger=report.createTest("Create Appoinment on patient page");
//		logger.info("Create appointment");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Association_Page();
//		logger.pass("The TL Create New Work-Item shows Success");
//		
//	}
//	
//	
//	@Test(dependsOnMethods = {"Association_Page"})
//	public void Association_Page_Employee_Wise() throws InterruptedException, AWTException 
//	{
//		logger=report.createTest("Create Appoinment on patient page");
//		logger.info("Create appointment");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Association_Page_Employee_Wise();
//		logger.pass("The TL Create New Work-Item shows Success");
//		
//	}
	
}
