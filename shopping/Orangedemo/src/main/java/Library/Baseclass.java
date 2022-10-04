package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class Baseclass {
	
	 
     public WebDriver driver;      
    
	
		@BeforeSuite	
		public void opendatabase() {
		System.out.println("Open database");		
		}
		
		
		@BeforeClass
	    @Parameters("Browser")
		public void lunchbrowser(String browser) throws Exception {
		System.out.println("luncher browser");	
		
	
//		String BROWSER = dt.getdatafile("Browser");
//		System.out.println(BROWSER);
//		
		if (browser.equalsIgnoreCase("Chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) 
		{
			driver = new FirefoxDriver();
		}
		    else {
			System.out.println("Invalid browser");
		}

//		String URL = dt.getdatafile("url");
//		System.out.println(URL);		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		}	
		
		
		@BeforeMethod
		public void LoginApplication() throws Throwable
		{
			
			System.out.println("LoginApplication");
		}
					
		@AfterMethod
		public void LogoutApplication()
		{
			System.out.println("Logout Application");
			
		}	
			
		@AfterClass
		public void closebrowser() {
			System.out.println("close browser");			
			driver.quit();
		}
					
		@AfterSuite	
		public void closedatabase() {
		System.out.println("Close database");		
		}

	

}
