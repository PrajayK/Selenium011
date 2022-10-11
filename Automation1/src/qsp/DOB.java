package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/");
		driver.findElement(By.name("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();

		WebElement monthList= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));		
		Select s1=new Select(monthList);
		s1.selectByVisibleText("Nov");

		WebElement yearList= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));		
		Select s2=new Select(yearList);
		s2.selectByVisibleText("1996");

		driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']//td/a)[19]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9552915394");
		Thread.sleep(1000);
		driver.findElement(By.id("renew_policy_submit")).click();
		String text = driver.findElement(By.id("policynumberError")).getText();
		System.out.println(text);

		if(text.contains("valid "))
		{
			System.out.println("Text is displayed");
		}
		else{
			System.out.println("Text is not displayed");
		}	
		driver.close();
	}

}
