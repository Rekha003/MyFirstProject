package com.Focus.Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest implements ActionConstants
{
	WebDriver driver;
	
	public void Precondition()
	{
		System.setProperty(chrome_Key, chrome_Value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.actitime.com/");
		
	}
	public void postCondition() {
		driver.close();
	}

}
