package com.sgtesting.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

private static WebDriver oBrowser=null;
public static void main(String[] args) {
	launchBrowser();
	navigate();
	//absoluteXPath();
	//relativeXPathUsingTagName();
	//relativeXPathUsingTagNameandIndex();
	 //relativeXPathUsingTagNameWithAttributeNameValue();
	 //relativeXPathUsingTagNameWithAttributeValueAlone();
	 //relativeXPathUsingTagNameWithMultipleAttributeNameValue();
	 relativeXPathUsingTagNameWithMultipleAttributeNameValueOROperator();
	}
private static void launchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver", "D:\\JavaAutomation\\Web-Automation\\Llibrary\\Driver\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}catch(Exception e)
	{
		e.printStackTrace();;
	}
}

private static void navigate()
{
	try
	{
		oBrowser.get("D:\\xpath\\Sample.html");
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void absoluteXPath()
{
	oBrowser.findElement(By.xpath("html//body//div//form//input")).sendKeys("DemoUser1");
	oBrowser.findElement(By.xpath("html//body//div//form//input[2]")).sendKeys("12345");
}
/**
 * case 1: Identify the Element using <tagname>
 * Syntax: //<tagname>
 */
private static void relativeXPathUsingTagName()
{
	oBrowser.findElement(By.xpath("//input")).sendKeys("shwetha");
}
/**
  *case2: identify the elements using <tagname> with index
  * Syntax: //<tagname>[index]
 */
private static void relativeXPathUsingTagNameandIndex()
{
	oBrowser.findElement(By.xpath("//input[2]")).sendKeys("678");
}

/**
 * case 3: Identify the Element using <tagname> with 
 * Attribute name and attribute value combination
 * Syntax: //<tagname>[@attributename='attributevalue']
 */
private static void relativeXPathUsingTagNameWithAttributeNameValue()
{
	oBrowser.findElement(By.xpath("//input[@id='uid1user1name1']")).sendKeys("vedav");
	oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("030320");
}
/**
 * case 4: Identify the Element using <tagname> with 
 * Attribute name and attribute value combination
 * Syntax: //<tagname>[@*='attributevalue']
 */
private static void relativeXPathUsingTagNameWithAttributeValueAlone()
{
	oBrowser.findElement(By.xpath("//input[@*='user1name1']")).sendKeys("arpitha");
	oBrowser.findElement(By.xpath("//input[@*='pass1word1']")).sendKeys("9876");
}
/**
 * case 5: Identify the Element using <tagname> with 
 * Multiple Attribute name and attribute value combination
 * Syntax: //<tagname>[@attributename='attributevalue'][@attributename='attributevalue']
 */
private static void relativeXPathUsingTagNameWithMultipleAttributeNameValue()
{
	oBrowser.findElement(By.xpath("//input[@name='pass1word1'][@id='pwd1pass1word1']")).sendKeys("asdfg");
}

/**
 * case 6: Identify the Element using <tagname> with 
 * Multiple Attribute name and attribute value combination using or operator
 * Syntax: //<tagname>[@attributename='attributevalue' or @attributename='attributevalue']
 */
private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueOROperator()
{
	oBrowser.findElement(By.xpath("//input[@name='user1name1' or @id='uid1user1name1']")).sendKeys("manu");
	oBrowser.findElement(By.xpath("//input[@name='submit1btn1' or @id='btn1submit1button1']")).click();
}
}