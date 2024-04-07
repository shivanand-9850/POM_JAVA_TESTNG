package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;

public class Test_Merge_WorkItem extends BaseClass  
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

	@Test(dependsOnMethods = {"loginAltos_TL"})
	public void Merge_workItem() 
	{
		
		logger=report.createTest(" MT Assign Task should be Complete");
		logger.info("Starting Applicaton");
		LogingTL_page Merge_workItem= PageFactory.initElements(driver, LogingTL_page.class);
		Merge_workItem.Merge_workItem();
		logger.pass("The MT Assign Task is Complete shows Success");
		
		
	}

}
