package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/admin/Desktop/hotel.html");
	WebElement mtrListBox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListBox);
	List<WebElement> ListOptions = s.getOptions();
	TreeSet<String> al=new TreeSet<String>();
	for(WebElement opt :ListOptions) {
		al.add(opt.getText());
	}
	System.out.println("MTR all Options in Alphabetical order");
	for(String MTROptions : al) {
		System.out.println(MTROptions);
	}
	driver.close();
}
}

