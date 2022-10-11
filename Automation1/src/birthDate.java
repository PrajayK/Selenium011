import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class birthDate {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create New Account")).click();
	WebElement dayListBox = driver.findElement(By.id("day"));
	Select d= new Select(dayListBox);
	WebElement monthListBox = driver.findElement(By.id("month"));
	Select m= new Select(monthListBox);
	WebElement yearListBox = driver.findElement(By.id("year"));
	Select y= new Select(yearListBox);
	d.selectByIndex(18);
	m.selectByValue("11");
	y.selectByVisibleText("1996");

	}

}
