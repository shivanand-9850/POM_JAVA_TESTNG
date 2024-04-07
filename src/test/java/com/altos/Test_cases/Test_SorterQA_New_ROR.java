package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingSorter_Page;
import com.altos.Utility.ConfingLoginData;
import com.altos.Utility.*;
public class Test_SorterQA_New_ROR extends BaseClass
{
	@Test
	public void loginApp()
	{
		logger=report.createTest("Verify that the sorterQA able to Loging");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_page= PageFactory.initElements(driver, CommonUtility.class);
		Loging_page.loginAltos(ConfigLogin.getSortarQA_ID(), ConfigLogin.getPassword());
		logger.pass("The sorterQA Loging shows Success");
	}

	@Test(dependsOnMethods = {"loginApp",})
	public void AssignTask_New_ROR() 
	
	{
		logger=report.createTest("Verify that the sorterQA Assign and Complete subtask");
		logger.info("Starting Applicaton");
		LogingSorter_Page LogingTL_page= PageFactory.initElements(driver, LogingSorter_Page.class);
		LogingTL_page.AssignTask_New_ROR();
		logger.pass("The sorterQA Assign and Complete subtask shows Success");
	}
	

}
