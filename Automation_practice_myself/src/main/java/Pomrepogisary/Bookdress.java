package Pomrepogisary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookdress {
	
WebDriver driver;
	
	public Bookdress(WebDriver driver)
	{	
	PageFactory.initElements(driver, this);
	}	     
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="(//a[@title='Evening Dresses'])[2]")
	private WebElement evevingdress;
	
	@FindBy(xpath="//img[@itemprop='image']")
	private WebElement clickdress;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement framehandle;
	
	@FindBy(xpath="//input[@id='quantity_wanted']")
	private WebElement quantity;
	
	@FindBy(xpath="//select[@id='group_1']")
	private WebElement size;
	
	@FindBy(xpath="//p[@id='add_to_cart']")
	private WebElement addtocart ;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement winhandlecheckout ;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement summarychechout ;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email ;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password ;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement sign ;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement checkoutosign ;
	
	public WebElement getDress() {
		return dress;
	}

	public WebElement getEvevingdress() {
		return evevingdress;
	}

	public WebElement getClickdress() {
		return clickdress;
	}

	public WebElement getFramehandle() {
		return framehandle;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getWinhandlecheckout() {
		return winhandlecheckout;
	}

	public WebElement getSummarychechout() {
		return summarychechout;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSign() {
		return sign;
	}

	public WebElement getCheckoutosign() {
		return checkoutosign;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCheckoutoshipping() {
		return checkoutoshipping;
	}

	public WebElement getChosepayment() {
		return chosepayment;
	}

	public WebElement getConfirmorder() {
		return confirmorder;
	}

	@FindBy(xpath="//input[@id='cgv']")
	private WebElement checkbox ;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement checkoutoshipping ;
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	private WebElement chosepayment ;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmorder ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
