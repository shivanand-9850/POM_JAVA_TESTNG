package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;

public class Test_Add_Task extends BaseClass 
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
		public void Add_Task() 
		{
			logger=report.createTest(" TL Assign Task ");
			logger.info("Starting Applicaton");
			LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
			LogingTL_page.Add_Task();
			logger.pass("The TL Assign Task shows Success shows Success");
			//Loging_page.CreateNew_WorkItem();
			
		}
		
	
}
