package com.sgtesting.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {
	public static WebDriver oBrowser=null;
	public static pagedemo oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		modifycustomer();
		deletecustomer();
		logout();
	    closeApplication();
}
	private static void launchBrowser()
	{
		try
		{
			//String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", "D:\\JavaAutomation\\Web-Automation\\Llibrary\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new pagedemo(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createcustomer()
	{
		try
		{
			oPage.gettotask().click();
			Thread.sleep(2000);
			oPage.getAddNew().click();
			Thread.sleep(2000);
			oPage.getcustomer().click();
			Thread.sleep(2000);
			oPage.getcustomername().sendKeys("Ambani");
			Thread.sleep(2000);
			oPage.getaddcustomer().click();
			Thread.sleep(2000);
	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	private static void modifycustomer()
	{
		try
		{
			oPage.getsetting().click(); 
			Thread.sleep(2000);
			oPage. getmodifycus().sendKeys("modification done");
			Thread.sleep(2000);
			oPage.getmodify().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try
		{
			oPage.getsetting1().click();
			Thread.sleep(3000);			
			oPage.getaction().click();
			Thread.sleep(2000);
		oPage.getdelete1().click();
			Thread.sleep(2000);
			oPage.perdelete().click();
		}catch(Exception e) 
		{
		e.printStackTrace();	
		}
	}
	private static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


