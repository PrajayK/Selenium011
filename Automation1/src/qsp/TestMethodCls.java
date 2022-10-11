package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public  void validLoginPage() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/sample.html");
		LoginPage1 l=new LoginPage1(driver);
		l.setCheckBox();

	}

}
