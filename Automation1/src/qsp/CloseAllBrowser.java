package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com");
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		driver.close();

}
}

