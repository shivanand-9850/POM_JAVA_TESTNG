package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingQA_page;
import com.altos.Utility.ConfingLoginData;
import com.altos.Utility.*;
public class Test_completetask_QA2_New_ROR extends BaseClass
{
	
	@Test
	public void loginAltos_QA() 
	{
		logger=report.createTest("Verify that the QA2 able to Loging");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_QA1= PageFactory.initElements(driver, CommonUtility.class);
		Loging_QA1.loginAltos(ConfigLogin.getQA2_ID(), ConfigLogin.getPassword());
		logger.pass("The QA2 Loging shows Success");
		
		
	}
	@Test(dependsOnMethods = {"loginAltos_QA",})
	public void Complete_QA2_Task() 
	
	{
		logger=report.createTest("Verify that the QA2 Complete subtask");
		logger.info("Starting Applicaton");
		LogingQA_page LogingQA_page = PageFactory.initElements(driver, LogingQA_page .class);
		LogingQA_page.Complete_QA2_Task();
		logger.pass("The QA2 Complete subtask shows Success");
	}

}
