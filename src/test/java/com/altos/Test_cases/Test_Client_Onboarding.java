package com.altos.Test_cases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;
public class Test_Client_Onboarding extends BaseClass 
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
	public void Client_Onboarding_Create_New()
	
	{
		logger=report.createTest("the TL Create New Work-Item");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Client_Onboarding_Create_New();
		LogingTL_page.Filter_allfield_clientOnboarding();
		LogingTL_page.location_and_physicians_add();
		LogingTL_page.JOB_type_add_edit();;
		logger.pass("The TL Create New Work-Item shows Success");
	}
//	@Test(dependsOnMethods = {"loginApp"})
//	@Test(dependsOnMethods = {"Client_Onboarding_Create_New"})
//	public void Edit_Client_Onboarding()
//	
//	{
//		logger=report.createTest("the TL Create New Work-Item");
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Edit_Client_Onboarding();
//		logger.pass("The TL Create New Work-Item shows Success");
//	}
	
//	@Test(dependsOnMethods = {"Edit_Client_Onboarding"})
//	@Test(dependsOnMethods = {"Edit_Client_Onboarding"})
//	public void Client_Delet_Onboarding()
//	
//	{
//		logger=report.createTest("the TL Create New Work-Item");
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Client_Delet_Onboarding();
//		logger.pass("The TL Create New Work-Item shows Success");
//	}
	@Test(dependsOnMethods = {"Client_Onboarding_Create_New"})
	//@Test(dependsOnMethods = {"Edit_Client_Onboarding"})
	public void Sub_Client_Add_Onboarding()
	
	{
		logger=report.createTest("the TL Create New Work-Item");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Sub_Client_Add_Onboarding();
		logger.pass("The TL Create New Work-Item shows Success");
	}
	//@Test(dependsOnMethods = {"Sub_Client_Add_Onboarding"})
	//@Test(dependsOnMethods = {"Edit_Client_Onboarding"})
	@Test(dependsOnMethods = {"Sub_Client_Add_Onboarding"})
	public void Sub_Client_Edit_Onboarding()
	
	{
		logger=report.createTest("the TL Create New Work-Item");
		logger.info("Starting Applicaton");
		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
		LogingTL_page.Sub_Client_Edit_Onboarding();
		logger.pass("The TL Create New Work-Item shows Success");
	}
	
//	@Test(dependsOnMethods = {"Sub_Client_Edit_Onboarding"})
//	@Test(dependsOnMethods = {"Edit_Client_Onboarding"})
//	@Test(dependsOnMethods = {"loginApp"})
//	public void Sub_Client_Delete_Onboarding()
//	
//	{
//		logger=report.createTest("the TL Create New Work-Item");
//		logger.info("Starting Applicaton");
//		LogingTL_page LogingTL_page= PageFactory.initElements(driver, LogingTL_page.class);
//		LogingTL_page.Sub_Client_Delete_Onboarding();
//		logger.pass("The TL Create New Work-Item shows Success");
//	}
}
