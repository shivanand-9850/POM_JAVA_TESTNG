package com.altos.Test_cases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.altos.Utility.*;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingQA_page;
import com.altos.Page_object.LogingSorter_Page;
import com.altos.Utility.CommonUtility;
import com.altos.Utility.ConfingLoginData;
public class Test_CreatTask_Sorter_partial extends BaseClass
{@Test
	public void loginAltos() 
	{
		
		logger=report.createTest(" Verify that the MT able to Loging");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		CommonUtility Loging_TL= PageFactory.initElements(driver, CommonUtility.class);
		Loging_TL.loginAltos(ConfigLogin.getSortar_ID(), ConfigLogin.getPassword());
		logger.pass("The MT Loging shows Success");
		
		
	}
	@Test(dependsOnMethods = {"loginAltos",})
	public void CreatTask_Sorter_partial() 
		{
			
			logger=report.createTest(" MT Assign Task should be Complete");
			logger.info("Starting Applicaton");
			LogingSorter_Page Loging_MT= PageFactory.initElements(driver, LogingSorter_Page.class);
			Loging_MT.CreatTask_Sorter_partial();
			logger.pass("The MT Assign Task is Complete shows Success");
			
			
		}
}
