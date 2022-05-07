package com.sgtesting.acttime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createcustomer {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		 modifycustomer();
		deletecustomer();
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
		private static void createCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
				
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Vedav");			
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void modifycustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("java");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
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
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
				Thread.sleep(2000);
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
