package com.sgtesting.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {
	public static WebDriver oBrowser=null;
	public static pagedemo oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
	     createuser();
	     modifyuser();
	     deleteuser();
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
	private static void createuser()
	{
		try
		{
			oPage.getUSERS().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("richard");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("sam");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("xxx@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName().sendKeys("demo");
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("qwe123");
			Thread.sleep(2000);
			oPage.getpasswordCopy().sendKeys("qwe123");
			Thread.sleep(2000);
			oPage.getCreateUser().click();
			Thread.sleep(2000);
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser()
	{
		try
		{
			oPage.getUSERS().click();
			Thread.sleep(2000);
			oPage.getuserNameSpan().click();
			oPage.getlastName().clear();
			Thread.sleep(2000);
			oPage.sendlastName().sendKeys("lord");
			Thread.sleep(2000);
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			oPage.getloaddelete().click();
			Thread.sleep(3000);
			oPage.getDeleteUser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
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
