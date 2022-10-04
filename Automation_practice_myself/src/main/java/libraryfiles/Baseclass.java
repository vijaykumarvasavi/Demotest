package libraryfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {

         Notepaddata no = new Notepaddata();
        public WebDriver driver;

		@BeforeSuite
		public void openthedata()  {
		System.out.println("Open the data");
		}
		
		@BeforeClass
		public void lunchethebrowser () throws Exception {
		System.out.println("luncher the browser");
		
		String BROWSER = no.getnotefilepath("Browser");
		System.out.println(BROWSER);
		
		
		if (BROWSER.contains("Chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();
		}
		    else {
			System.out.println("Invalid browser");
		}
		
		String URL = no.getnotefilepath("url");
		System.out.println(URL);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
		
		}
		
	    
	    	
	    
		
		@AfterClass
		public void closethebrowser( ) {
		System.out.println("close the browser");	
		driver.quit();
		} 	
		
		@AfterSuite
		public void closethedata() {
		System.out.println("close the data");	
		}
		
		
		
	

}
