package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		String d = driver.getTitle();
		System.out.println(d);
		List<WebElement> s = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = s.size();
		for(int i=0;i<count;i++)
		{
			String text = s.get(i).getText();
			System.out.println(text);
			
		}
		driver.close();
	}
}
