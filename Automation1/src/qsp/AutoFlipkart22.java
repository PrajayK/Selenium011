package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoFlipkart22
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone 13 pro max");
	Thread.sleep(4000);
	List<WebElement> s = driver.findElements(By.xpath("//span[contains(text(),'i phone')]/.."));
	int count = s.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String text = s.get(i).getText();
		System.out.println(text);
	}
	}

}


}
