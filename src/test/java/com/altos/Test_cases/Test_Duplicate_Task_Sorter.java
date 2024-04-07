package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingSorter_Page;
import com.altos.Utility.*;

public class Test_Duplicate_Task_Sorter extends BaseClass
{
	@Test
	public void loginAltos_TL() 
	{
		
		logger=report.createTest(" Verify that the MT able to Loging");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_TL= PageFactory.initElements(driver, CommonUtility.class);
		Loging_TL.loginAltos(ConfigLogin.getSortar_ID(), ConfigLogin.getPassword());
		logger.pass("The MT Loging shows Success");
		
		
	}
	@Test(dependsOnMethods = {"loginAltos_TL",})
	public void Duplicate_Task() 
		{
			
			logger=report.createTest(" MT Assign Task should be Complete");
			logger.info("Starting Applicaton");
			LogingSorter_Page Loging_MT= PageFactory.initElements(driver, LogingSorter_Page.class);
			Loging_MT.CreatTask_Sorter_Duplicate();
			logger.pass("The MT Assign Task is Complete shows Success");
			
			
		}
		
//		@Test
//		public void Complete_QA_Task() 
//		{
//			
//			logger=report.createTest(" QA Assign Task should be Complete");
//			ConfingLoginData ConfigLogin = new ConfingLoginData();
//			logger.info("Starting Applicaton");
//			LogingMT_QA_QC_page  Loging_QA = PageFactory.initElements(driver, LogingMT_QA_QC_page .class);
//			Loging_QA.Complete_QA_Task(ConfigLogin.getQA_ID(), ConfigLogin.getPassword());
//			logger.pass("The QA Assign Task is Complete shows Success");
//			
//			
//	 }
//		@Test
//		public void Complete_QC_Task() 
//		{
//			
//			logger=report.createTest(" MT Assign Task should be Complete");
//			ConfingLoginData ConfigLogin = new ConfingLoginData();
//			logger.info("Starting Applicaton");
//			LogingMT_QA_QC_page  Loging_QC = PageFactory.initElements(driver, LogingMT_QA_QC_page.class);
//			Loging_QC.Complete_QC_Task(ConfigLogin.getQC_ID(), ConfigLogin.getPassword());
//			logger.pass("The MT Assign Task is Complete shows Success");
//			
//			
//	 }
		
}
