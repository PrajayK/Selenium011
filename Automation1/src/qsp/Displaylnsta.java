package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displaylnsta {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		boolean logo = driver.findElement(By.xpath("//img[@class='aXOnh  _9CDVW']")).isDisplayed();
		if(logo==true)
			System.out.println("displayed");
		else
			System.out.println("not displayed");
	}

}