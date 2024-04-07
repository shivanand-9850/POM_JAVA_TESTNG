package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;

public class Test_JobsPage  extends BaseClass {
	@Test
	public void loginAltos_TL() {

		logger = report.createTest(" Verify that the TL able to Loging");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_page= PageFactory.initElements(driver, CommonUtility.class);
		Loging_page.loginAltos(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The TL Loging shows Success");
	}

	@Test(dependsOnMethods = { "loginAltos_TL", }, priority = 0)
	public void Create_new_Jobs() {
		logger = report.createTest(" Verify run all fuctionality in import page");
		logger.info("Starting Applicaton");
		LogingTL_page Loging_TL = PageFactory.initElements(driver, LogingTL_page.class);
		Loging_TL.Run_All_fuction();
		logger.pass("run all fuctionality  is Complete shows Success");

	}

}
