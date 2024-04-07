package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Page_object.LogingTL_page1;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;

public class Teste_Client_Template extends BaseClass {
	@Test
	public void loginApp() {
		logger = report.createTest("Loging TL");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_page = PageFactory.initElements(driver, CommonUtility.class);
		Loging_page.loginAltos(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The TL Loging shows Success");
	}

	@Test(dependsOnMethods = { "loginApp", })
	public void Uplode_Tagged_Document_Template()

	{
		logger = report.createTest("Verify that TL Uplode_Tagged_Document_Template");
		logger.info("Starting Applicaton");
		LogingTL_page1 LogingTL_page = PageFactory.initElements(driver, LogingTL_page1.class);
		LogingTL_page.Uplode_Tagged_Document_Template();
		logger.pass("The TL Create New Uplode_Tagged_Document_Template on Client template page shows Success");
	}

	@Test(dependsOnMethods = { "loginApp", })
	public void Add_Reported_Type_and_Uplode_client_Template()

	{
		logger = report.createTest("Verify that TL Create New Work-Item");
		logger.info("Starting Applicaton");
		LogingTL_page1 LogingTL_page = PageFactory.initElements(driver, LogingTL_page1.class);
		LogingTL_page.Uplode_client_Template();
		LogingTL_page.Add_Reported_type();
		logger.pass("Add_Reported_Type Successfully& Uplode_client_Template show success");
	}

}
