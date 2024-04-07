package com.altos.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfingDataProvider 
{
	Properties pro;
	public ConfingDataProvider() 
	{
		
			File src=new File(".//Config//Config.properties");
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
		public String getDataFromConfig(String KeyTosearch)
		{
			return pro.getProperty(KeyTosearch);
			
		}
		public String getBrowser()
		{
			return pro.getProperty("Browser");
			
			
		}
		public String getStagingURL()
		{
			return pro.getProperty("uaturl");
			
		}
		
	}


