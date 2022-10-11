package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
public void verifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	String aTitle = driver.getTitle();
	String eTitle = "Soogle";
	//Assert.assertEquals(aTitle, eTitle);
	SoftAssert s=new SoftAssert();
	s.assertEquals(aTitle, eTitle);
	/*if(aTitle.equals(eTitle)) {
		System.out.println("Pass");		
	}
	else {
		System.out.println("Failed");	
	}*/
	driver.close();
	s.assertAll();
}
}
