package qsp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/admin/Desktop/hotel.html");
	WebElement mtrListBox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListBox);
	s.selectByIndex(1);
	s.selectByValue("p");
	s.selectByVisibleText("vada");
	

	}

}
