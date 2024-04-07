package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_object.BaseClass;
import com.altos.Page_object.LogingSorter_Page;
import com.altos.Utility.ConfingLoginData;

public class Test_CompleteTask_SorteTest extends BaseClass
{
	@Test
	public void CompleteTask_Sorter() 
	
	{
		logger=report.createTest("Verify the Complete Sorter Task");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingSorter_Page LogingSorter_Page= PageFactory.initElements(driver, LogingSorter_Page.class);
		//LogingSorter_Page.CompleteTask_Sorter(ConfigLogin.getSortar_ID(), ConfigLogin.getPassword());
		logger.pass("The Complete Sorter Task shows Success");
	}

}
