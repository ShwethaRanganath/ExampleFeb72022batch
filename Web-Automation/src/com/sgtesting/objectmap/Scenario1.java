package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	public static WebDriver obrowser=null;
	public static Objectmap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		 minimize();
		 createuser();
		 deleteuser();
	}
	private static void launchBrowser()
	{
		String filename=null;
		try
		{
			//copy from objectmap property
			filename="D:\\JavaAutomation\\Web-Automation\\Objectmap\\Objectmap";
			//copy from driver properties
			System.setProperty("webdriver.chrome.driver", "D:\\JavaAutomation\\Web-Automation\\Llibrary\\Driver\\chromedriver.exe");
			obrowser=new ChromeDriver();
			objectmap=new Objectmap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void navigate()
	{
		try
		{
			obrowser.get("http://localhost/login.do");
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
			obrowser.findElement(objectmap.getLocator("loginusername")).sendKeys("admin");
			obrowser.findElement(objectmap.getLocator("loginpassword")).sendKeys("manager");
			obrowser.findElement(objectmap.getLocator("loginbutton")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try
		{
			obrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
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
			obrowser.findElement(objectmap.getLocator("userpageusers")).click();
			Thread.sleep(2000);
			obrowser.findElement(objectmap.getLocator("userpageadduser")).click();
			Thread.sleep(2000);
			obrowser.findElement(objectmap.getLocator("userpagefirstname")).sendKeys("Vedav");
			Thread.sleep(2000);
			obrowser.findElement(objectmap.getLocator("userpagelastname")).sendKeys("Gowda");
			Thread.sleep(2000);
			obrowser.findElement(objectmap.getLocator("userpagemail")).sendKeys("abc@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(objectmap.getLocator("userpageadmin")).sendKeys("demo");
			Thread.sleep(2000);
			obrowser.findElement(objectmap.getLocator("userpagepassword")).sendKeys("123456");
			Thread.sleep(2000);
			obrowser.findElement(objectmap.getLocator("userpageretypepwd")).sendKeys("123456");
			Thread.sleep(2000);
			obrowser.findElement(objectmap.getLocator("userpagecreateuser")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			//obrowser.findElement(objectmap.getLocator("deleteuserselect")).click();
			//Thread.sleep(2000);
			obrowser.findElement(objectmap.getLocator("deleteuserlist")).click();
			Thread.sleep(2000);
			obrowser.findElement(objectmap.getLocator("deleteuser1")).click();
			Thread.sleep(2000);
			obrowser.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}


