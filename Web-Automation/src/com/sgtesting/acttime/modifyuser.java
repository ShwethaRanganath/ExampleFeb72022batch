package com.sgtesting.acttime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class modifyuser
{
	private static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Llibrary\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(4000); 
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("Shwetha");
			oBrowser.findElement(By.name("lastName")).sendKeys("Gowda");
			oBrowser.findElement(By.name("email")).sendKeys("abc@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("testing");
			oBrowser.findElement(By.name("password")).sendKeys("qwe123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("qwe123");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Gowda, Shwetha']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_firstNameField\"]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("firstName")).sendKeys("Ranganath");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda, Shwetha']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();		
		}
	}

	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
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
