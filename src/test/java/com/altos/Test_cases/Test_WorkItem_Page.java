package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingTL_page;
import com.altos.Page_object.LogingTL_page1;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;

public class Test_WorkItem_Page extends BaseClass {
	@Test
	public void loginAltos_TL() {

		{
			logger = report.createTest("Loging TL");
			ConfingLoginData ConfigLogin = new ConfingLoginData();
			logger.info("Starting Applicaton");
			CommonUtility Loging_page = PageFactory.initElements(driver, CommonUtility.class);
			Loging_page.loginAltos(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
			logger.pass("The TL Loging shows Success");
		}
	}

	@Test(dependsOnMethods = { "loginAltos_TL", }, priority = 0)
	public void Split_And_Merge() {
		logger = report.createTest("Split & merge of workitem");
		logger.info("Starting Applicaton");
		LogingTL_page1 Loging_TL = PageFactory.initElements(driver, LogingTL_page1.class);
		Loging_TL.Create_new_workItem1();
		Loging_TL.Split_workitem();
		Loging_TL.Create_new_workItem1();
		Loging_TL.Merge_workitem();
		logger.pass("Split & merge of workitem is Success");
	}

	@Test(dependsOnMethods = { "loginAltos_TL",},priority = 1)
	public void Edit_and_delelte_workitem() {
		logger = report.createTest("Edit & delete of workitem");
		logger.info("Starting Applicaton");
		LogingTL_page1 Loging_TL = PageFactory.initElements(driver, LogingTL_page1.class);
		Loging_TL.Edit_and_Delete_workitem();
		logger.pass("Edit & delete of workitem is Success");
	}

	@Test(dependsOnMethods = { "loginAltos_TL", },priority = 2)
	public void Filter_TL_Workitem() {
		logger = report.createTest("Filtering all field of workitem");
		logger.info("Starting Applicaton");
		LogingTL_page1 Loging_TL = PageFactory.initElements(driver, LogingTL_page1.class);
		Loging_TL.Filter_allfield_workitempage();
		logger.pass("Filtering all field of workitem is Success");

	}

	//@Test(dependsOnMethods = { "loginAltos_TL", }, priority = 3)
	//public void Pdf_workitem_Operation() {
		//logger = report.createTest("All operation of pdf is perform");
		//logger.info("Starting Applicaton");
		//LogingTL_page1 Loging_TL = PageFactory.initElements(driver, LogingTL_page1.class);
		// Loging_TL.Create_new_workItem1();
	//	Loging_TL.pdf_workitem();
		//logger.pass("All operation of pdf  perform is Success");
//	}

}
