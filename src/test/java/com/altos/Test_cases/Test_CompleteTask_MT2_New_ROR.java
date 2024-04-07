package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingMT_page;
import com.altos.Utility.ConfingLoginData;
import com.altos.Utility.*;
public class Test_CompleteTask_MT2_New_ROR extends BaseClass
{
	
	@Test
	public void loginAltos_MT() 
	{
		logger=report.createTest(" Verify that the MT2 able to Loging");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_MT= PageFactory.initElements(driver, CommonUtility.class);
		Loging_MT.loginAltos(ConfigLogin.getMT2_ID(), ConfigLogin.getPassword());
		logger.pass("The MT2 Loging shows Success");
		
		
	}
	@Test(dependsOnMethods = {"loginAltos_MT",})
	public void Complete_MT2_Task() 
	
	{
		logger=report.createTest("Verify that the MT2 Complete subtask");
		logger.info("Starting Applicaton");
		LogingMT_page  LogingMT_page = PageFactory.initElements(driver, LogingMT_page .class);
		LogingMT_page.Complete_MT2_Task();
		logger.pass("The MT2 Complete subtask shows Success");
	}

}
