package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlphabeticOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/admin/Desktop/hotel.html");
	WebElement mtrListBox = driver.findElement(By.id("mtr"));
	ArrayList <String> al=new ArrayList<String>();
	Select s=new Select(mtrListBox);
	List<WebElement> allOptions = s.getOptions();
	int count = allOptions.size();
	for(int i=0;i<count;i++)
	{
		String text = allOptions.get(i).getText();
		al.add(text);
	}
	Collections.sort(al);
	for(int i=0;i<al.size();i++)
	{
		String option = al.get(i);
		System.out.println(option);
		
	}
	driver.close();
}
}