package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule {
	@BeforeClass
	public void OpenBrowser() {
		Reporter.log("Open Browser",true);
	}
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("Close Browser",true);
	}
	@BeforeMethod
	public void Login() {
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void LogOut() {
		Reporter.log("LogOut",true);
	}
	@Test(priority=1, invocationCount=3)
	public void CreateCustomer() {
		Reporter.log("CreateCustomer",true);
	}
	@Test
	public void DeleteCustomer() {
		Reporter.log("DeleteCustomer",true);
	}
	@Test
	public void ModifyCustomer() {
		Reporter.log("ModifyCustomer",true);
	}
	

}
