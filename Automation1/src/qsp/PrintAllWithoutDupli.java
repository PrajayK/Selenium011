package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class PrintAllWithoutDupli {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args)
		{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> AllOptions = s.getOptions();
		TreeSet<String> ts=new TreeSet<String>();
		for(WebElement opt :AllOptions) {
			ts.add(opt.getText());
		}
		System.out.println("MTR all Options without Duplicate");
		for(String MTROptions : ts) {
			System.out.println(MTROptions);
		}
		driver.close();
	}
	}
