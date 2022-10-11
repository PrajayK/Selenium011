package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainMethodc {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
@Test
	public  void validLogin() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(3000);
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin1", "manager1");
		Thread.sleep(4000);
		l.setLogin("admin", "manager");
	}

}
