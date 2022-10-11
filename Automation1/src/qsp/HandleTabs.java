package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actiTime.com");
			driver.findElement(By.linkText("actiTIME Inc.")).click();
			Set<String> allWh = driver.getWindowHandles();
			int count = allWh.size();
			System.out.println(count);
			for(String wh:allWh) {
				Thread.sleep(2000);
				driver.switchTo().window(wh);
				System.out.println(wh);
				driver.close();
			}
}
}
