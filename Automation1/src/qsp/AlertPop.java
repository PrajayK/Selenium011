package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//Button[@class='btn btn-primary']")).click();
		Alert a = driver.switchTo().alert();
		String text =a.getText();
		a.dismiss();
		System.out.println(text);
		driver.findElement(By.xpath("//Button[@class='btn btn-danger']")).getText();

		driver.close();
}
}
