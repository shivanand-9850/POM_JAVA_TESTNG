package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingMT_page;
import com.altos.Page_object.LogingTL_page;
import com.altos.Page_object.LogingTL_page1;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;

public class Subtask_cases extends BaseClass {
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
	public void Create_new_Jobs() throws InterruptedException {
		logger = report.createTest(" Verify the revert job/subtaskpage in import page");
		logger.info("Starting Applicaton");
		LogingTL_page1 Loging_TL = PageFactory.initElements(driver, LogingTL_page1.class);
		Loging_TL.Create_new_workItem1();
		Loging_TL.Edit_and_Delete_workitem1();
		Loging_TL.Create_job_onJobPage();
		Loging_TL.Add_workItem();
		Loging_TL.Add_Task_NEW_ROR1();

		logger.pass("revert job/subtaskpage  is Complete shows Success");

	}

	@Test(priority = 1)
	public void loginAltos_Sorter() {
		logger = report.createTest(" Verify that the MT able to Loging");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_MT = PageFactory.initElements(driver, CommonUtility.class);
		Loging_MT.loginAltos(ConfigLogin.getSortar_ID(), ConfigLogin.getPassword());
		logger.pass("The MT Loging shows Success");

	}

	@Test(dependsOnMethods = { "loginAltos_Sorter", }, priority = 2)
	public void Revert_Job() {
		logger = report.createTest("Verify that the sorter Complete subtask");
		logger.info("Starting Applicaton");
		LogingMT_page LogingMT_page = PageFactory.initElements(driver, LogingMT_page.class);
		//LogingMT_page.Edit_and_preview();
		LogingMT_page.revert_job();
		//LogingMT_page.Dulicate_unduplicate_task();
		logger.pass("The MT2 Complete subtask shows Success");
	}

}
