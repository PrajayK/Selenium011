package qsp;

import java.util.List;

import org.openqa.selenium.By nnnnnnnnnnnnnnnnnnnnnnnnnnp[]
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLink {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.116.1:8080/");
		/*List<WebElement> All = driver.findElements(By.xpath("//a"));
		int count = All.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		String text = All.get(i).getText();
		System.out.println(text);
		}*/
	}

}
