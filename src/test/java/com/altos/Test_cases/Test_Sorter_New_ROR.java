package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingSorter_Page;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.ConfingLoginData;
import com.altos.Utility.*;

public class Test_Sorter_New_ROR extends BaseClass
{
	@Test
	public void loginApp()
	{
		logger=report.createTest("Verify that the sorter able to Loging");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_page= PageFactory.initElements(driver, CommonUtility.class);
		Loging_page.loginAltos(ConfigLogin.getSortar_ID(), ConfigLogin.getPassword());
		logger.pass("The sorter Loging shows Success");
	}

	@Test(dependsOnMethods = {"loginApp",})
	public void CreatTask_Sorter() 
	
	{
		logger=report.createTest("Verify that the sorter Create New subtask");
		logger.info("Starting Applicaton");
		LogingSorter_Page LogingTL_page= PageFactory.initElements(driver, LogingSorter_Page.class);
		LogingTL_page.CreatTask_Sorter();
		logger.pass("The sorter Create New subtask shows Success");
	}
	
//	@Test(dependsOnMethods = {"CreatTask_Sorter",})
//	public void CompleteTask_Sorter() 
//	
//	{
//		logger=report.createTest("Verify that the sorter Complete subtask");
//		logger.info("Starting Applicaton");
//		LogingSorter_Page LogingTL_page= PageFactory.initElements(driver, LogingSorter_Page.class);
//		LogingTL_page.CompleteTask_Sorter();
//		logger.pass("The sorter Complete subtask shows Success");
//	}

}
