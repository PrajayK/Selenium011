package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XAndYaxisFacebook 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int xaxis=driver.findElement(By.id("email")).getLocation().getX();
		int yaxis=driver.findElement(By.id("email")).getLocation().getY();
		System.out.println(xaxis+"px");
		System.out.println(yaxis+"px");
	}	

}