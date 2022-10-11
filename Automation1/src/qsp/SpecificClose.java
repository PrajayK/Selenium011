package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificClose {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com");
			driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
			driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
			Set<String> allWH=driver.getWindowHandles();
			System.out.println("List Of Browsers:");
			for(String wh:allWH)
			{
				driver.switchTo().window(wh);
				String title=driver.getTitle();
				System.out.println(title);
			}
			System.out.println();
			//Close specific browser
			System.out.println("Enter Specific browser name:");
			Scanner sc=new Scanner(System.in);
			String browser=sc.next();
			for(String wh:allWH)
			{
				driver.switchTo().window(wh);
				String title=driver.getTitle();
				if(browser.contains(title))
				{
					driver.close();
				}
				else
				{
					
				}
			}
		}
	}
