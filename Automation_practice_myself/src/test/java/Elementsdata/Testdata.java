package Elementsdata;

import org.testng.annotations.Test;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pomrepogisary.Bookdress;
import libraryfiles.Baseclass;


public class Testdata extends Baseclass{
			
		@Test
		public void bookdress() throws Exception {
		
			
    	Bookdress bo = new Bookdress(driver);
		
	   WebElement des = bo.getDress();	
	   Actions act = new Actions(driver);
	   act.moveToElement(des).perform();		
	    
	    bo.getEvevingdress().click();
	    Thread.sleep(2000);
	    
	    bo.getClickdress().click();
	    Thread.sleep(2000);
	    
	    WebElement FRAME = bo.getFramehandle();
	    driver.switchTo().frame(FRAME);
	    Thread.sleep(2000);
	    	    
	    	    
	    WebElement selectnum = bo.getQuantity();
	    selectnum.clear();
	    selectnum.sendKeys("3");
	    Thread.sleep(2000);
	    
	    WebElement drop = bo.getSize();
	    Select se1= new Select(drop);
	    se1.selectByIndex(2);
	    Thread.sleep(3000);
	    
	    bo.getAddtocart().click();
	    Thread.sleep(2000);
	    
	    String maid = driver.getWindowHandle();
	    Set<String> allid = driver.getWindowHandles();
	    driver.switchTo().window(maid);
	    bo.getWinhandlecheckout().click();
	    Thread.sleep(2000);
	    
	    bo.getSummarychechout().click();
	    Thread.sleep(2000);
	    
	    bo.getEmail().sendKeys("vijaykumar11185057@gmail.com");
	    Thread.sleep(2000);
	    
	    bo.getPassword().sendKeys("Vijay@967");
	    Thread.sleep(2000);
	    
	    bo.getSign().click();
	    Thread.sleep(2000);
	    
	    bo.getCheckoutosign().click();
	    Thread.sleep(2000);
	    
	    bo.getCheckbox().click();
	    Thread.sleep(2000);
	    
	    bo.getCheckoutoshipping().click();
	    Thread.sleep(2000);
	    
	    bo.getChosepayment().click();
	    Thread.sleep(2000);
	    
	    bo.getConfirmorder().click();
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	    
	    
	    
		
		
			
	}
}
