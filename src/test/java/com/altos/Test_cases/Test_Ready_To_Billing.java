package com.altos.Test_cases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingQA_page;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.BrowserFactory;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingDataProvider;
import com.altos.Utility.ConfingLoginData;
import com.altos.Utility.ExcelDataProvider;

public class Test_Ready_To_Billing extends BaseClass
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
	public void Ready_For_Billing() 
	{
		
		logger=report.createTest(" Verify Ready_For Billing should be Complete");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingTL_page  LogingTL_page = PageFactory.initElements(driver,LogingTL_page .class);
		LogingTL_page.Ready_For_Billing();
		logger.pass(" The Ready For Billing is shows Success");
		
		
 }
	

}
