package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnamePwdHtWidth 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int h1 = driver.findElement(By.id("username")).getSize().getHeight();
		int w1=driver.findElement(By.id("username")).getSize().getWidth();
		int w2 = driver.findElement(By.name("pwd")).getSize().getWidth();
		 int h2=driver.findElement(By.name("pwd")).getSize().getHeight();
		if(h1==h2 &&w1==w2)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	

	}

}