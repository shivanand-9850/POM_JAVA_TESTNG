package com.altos.Test_cases;
import org.openqa.selenium.WebDriver;

import java.nio.file.FileAlreadyExistsException;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.*;

public class Test_CreateWorke_Item_TL extends BaseClass
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
	
	@Test(dependsOnMethods = {"loginApp"})
	public void CreateNew_WorkItem() throws FileAlreadyExistsException  
	
	{
		logger=report.createTest("the TL Create New Work-Item");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.CreateNew_WorkItem();
		logger.pass("The TL Create New Work-Item shows Success");
	}
	
	@Test(dependsOnMethods = {"CreateNew_WorkItem",})
	//@Test(dependsOnMethods = {"loginApp"})
	public void Assing_NEW_ROR() 
	{
		logger=report.createTest("Verify that TL can able to add a Task");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Assing_NEW_ROR();
		logger.pass("The TL can able to add a Task shows Success");
	}

//	@Test(dependsOnMethods = {"CreateNew_WorkItem"})
//	//@Test(dependsOnMethods = {"loginApp"})
//	public void CreateNew_Job() 
//	
//	{
//		logger=report.createTest("the TL Create New Work-Item");
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.CreateNew_Job();
//		logger.pass("The TL Create New Work-Item shows Success");
//	}
	

}
