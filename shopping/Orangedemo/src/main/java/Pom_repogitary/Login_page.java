package Pom_repogitary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Library.Baseclass;

public class Login_page extends Baseclass {
	
	
	WebDriver driver;
	
	public void Login_page(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usename;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submittedBt;
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	private WebElement BT;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="(//li[@class='oxd-topbar-body-nav-tab'])[2]")
	private WebElement reports;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsename() {
		return usename;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmittedBt() {
		return submittedBt;
	}

	public WebElement getBT() {
		return BT;
	}

	public WebElement getLogout() {   
		return logout;
	}

	public WebElement getReports() {
		return reports;
	}
	
	
	
	
	

}
