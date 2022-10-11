package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DemoB
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./chromedriver/geckodriver.exe");
	}
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("9552915394");
	driver.findElement(By.id("pass")).sendKeys("616615");
	driver.findElement(By.name("login")).submit();
	//driver.findElement(By.xpath("(//label[@class='lzcic4wl gs1a9yip br7hx15l h2jyy9rg n3ddgdk9 owxd89k7 rq0escxv j83agx80 a5nuqjux l9j0dhe7 k4urcfbm kbf60n1y b3i9ofy5'])[1]")).click();
	
	
	
	
	}

}
