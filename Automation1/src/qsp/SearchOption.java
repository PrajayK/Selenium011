package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Option");
		String option = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		HashSet <String> hs=new HashSet<String>();
		Select s=new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		int Counter = 0;
		for(int i=0;i<count;i++)
		{
			String text = allOptions.get(i).getText();
			if(option.equals(text))
			{
				Counter++;
			}
		}
		if(Counter==0)
		{
			System.out.println(option+"Is Not Present"); 
		}
		if(Counter==1)
		{
			System.out.println(option+"Is Present Without Duplicatess"); 
		}
		if(Counter>2)
		{
			System.out.println(option+"Is Present With Duplicatess"); 
		}
driver.close();
}
}

