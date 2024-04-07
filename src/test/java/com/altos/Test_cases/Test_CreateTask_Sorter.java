package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Utility.ConfingLoginData;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingSorter_Page;
import com.altos.Page_object.LogingTL_page;
import com.altos.Utility.*;

public class Test_CreateTask_Sorter extends BaseClass
{

		@Test
		public void loginApp()
		{
			
			logger=report.createTest("The Loging Sorter");
			ConfingLoginData ConfigLogin = new ConfingLoginData();
			logger.info("Starting Applicaton");
			CommonUtility Sorter_Page= PageFactory.initElements(driver, CommonUtility.class);
			Sorter_Page.loginAltos(ConfigLogin.getSortar_ID(), ConfigLogin.getPassword());
			logger.pass("The Sorter Loging shows Success");
			
		}
	
		
		@Test(dependsOnMethods = {"loginApp"})
		public void CreatTask_Sorter() 
		
		{
			logger=report.createTest("Verify the Creat Sorter Task ");
			logger.info("Starting Applicaton");
			LogingSorter_Page LogingSorter_Page= PageFactory.initElements(driver, LogingSorter_Page.class);
			LogingSorter_Page.CreatTask_Sorter();
			logger.pass("The Created Sorter task shows Success");
		}
		
		
		@Test(dependsOnMethods = {"CreatTask_Sorter"})
		public void CompleteTask_Sorter()
		
		{
			logger=report.createTest("Verify the Creat Sorter Task ");
			logger.info("Starting Applicaton");
			LogingSorter_Page LogingSorter_Page= PageFactory.initElements(driver, LogingSorter_Page.class);
			LogingSorter_Page.CompleteTask_Sorter();
			logger.pass("The Created Sorter task shows Success");
		}
		
	

}
