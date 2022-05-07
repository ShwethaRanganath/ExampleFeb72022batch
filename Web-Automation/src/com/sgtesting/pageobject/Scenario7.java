package com.sgtesting.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7 {
	public static WebDriver oBrowser=null;
	public static pagedemo oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		 createproject();
		 createtask();
		 deletetask();
		 deleteproject();
		deletecustomer();
		logout();
	    closeApplication();
}
	private static void launchBrowser()
	{
		try
		{
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
	private static void createproject()
	{
		try
		{
			oPage. getproject().click();
			Thread.sleep(2000);
			oPage.newproject().click();
			Thread.sleep(2000);
			oPage.getprojectname().sendKeys("project1");
			Thread.sleep(2000);
			oPage.getcreateproject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createtask()
	{
		try
		{
			oPage.gettast().click();
			Thread.sleep(2000);
			oPage.getaddtask().click();
			Thread.sleep(2000);
			oPage.getnewtask().sendKeys("Task1");
			Thread.sleep(2000);
			oPage.gettaskbutton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletetask()
	{
		try
		{
			oPage.getdeltask().click();
			Thread.sleep(2000);
			oPage.getdelaction().click();
			Thread.sleep(2000);
			oPage.getdelbutton().click();;
			Thread.sleep(2000);
			oPage.getdelconfirm().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try
		{
			oPage.getdeleteproject().click();
			Thread.sleep(2000);
			oPage.getdeleteaction().click();
			Thread.sleep(2000);
			oPage.getdeletebutton().click();
			Thread.sleep(2000);
			oPage.getconfirmdelete().click();
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
