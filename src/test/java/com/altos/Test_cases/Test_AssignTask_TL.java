package com.altos.Test_cases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.BrowserFactory;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingDataProvider;
import com.altos.Utility.ConfingLoginData;
import com.altos.Utility.ExcelDataProvider;
import com.altos.Utility.Helper;
public class Test_AssignTask_TL extends BaseClass 
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
	
}
