package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingQA_page;
import com.altos.Page_object.LogingQC_Page;
import com.altos.Utility.ConfingLoginData;
import com.altos.Utility.*;

public class Test_completetask_QC1_New_ROR extends BaseClass
{
	
	@Test
	public void loginAltos_QC() 
	{
		logger=report.createTest(" Verify that the QC able to Loging");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_QC= PageFactory.initElements(driver, CommonUtility.class);
		Loging_QC.loginAltos(ConfigLogin.getQC_ID(), ConfigLogin.getPassword());
		logger.pass("The QC Loging shows Success");
		
		
	}
	@Test(dependsOnMethods = {"loginAltos_QC",})
	public void Complete_QA1_Task() 
	
	{
		logger=report.createTest("Verify that the QC Complete subtask");
		logger.info("Starting Applicaton");
		LogingQC_Page LogingQC_Page = PageFactory.initElements(driver, LogingQC_Page .class);
		LogingQC_Page.Complete_QC1_Task();
		logger.pass("The QC Complete subtask shows Success");
	}

}
