package com.altos.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfingLoginData {

	Properties pro;
	public ConfingLoginData() {
		File src=new File(".\\Config\\Login.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro =new Properties();
			pro.load(fis);
		
		}
		catch (Exception e) 
		{
			System.out.println("Not able to load config file>>"+e.getMessage());
		}
		
		
	}
	
	public String getDataFromLogin(String KeyTosearch)
	{
		return pro.getProperty(KeyTosearch);
		
	}
	public String getTL_ID()
	{
		return pro.getProperty("TL_ID");
	}
	
	public String getSortar_ID()
	{
		return pro.getProperty("Sortar_ID");
		
		
	}
	public String getPassword()
	{
		return pro.getProperty("Password");
	}
	
	public String getMT_ID()
	{
		return pro.getProperty("MT_ID");
	}
	public String getMT1_ID()
	{
		return pro.getProperty("MT1_ID");
	}
	public String getMTassign_ID()
	{
		return pro.getProperty("MTassign_ID");
	}
	public String getMT2_ID()
	{
		return pro.getProperty("MT2_ID");
	}
	
	public String getQA_ID()
	{
		return pro.getProperty("QA_ID");
	}
	public String getQA1_ID()
	{
		return pro.getProperty("QA1_ID");
	}
	public String getQA2_ID()
	{
		return pro.getProperty("QA2_ID");
	}
	public String getQC_ID()
	{
		return pro.getProperty("QCassign_ID");
	}
	public String getQCassign_ID()
	{
		return pro.getProperty("QCassign_ID");
	}
	public String getPassword1()
	{
		return pro.getProperty("Password1");
	}
	public String getSortarQA_ID()
	{
		return pro.getProperty("SortarQA_ID");
	}

}
