package genriclibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CreditCardPage extends BasePage {

	public CreditCardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
//		WebElement cardtype = driver.findElement(By.id("CreditCardType"));
//		Select cardtypeselect=new Select(cardtype);
//		cardtypeselect.selectByVisibleText("visa");
//		  Reporter.log("Clicked on Visa",true);
//		  driver.findElement(By.id("CardholderName")).sendKeys("saloni");
//		  Reporter.log("cardholder name Entered",true);
//		  driver.findElement(By.id("CardNumber")).sendKeys("5314625640123");
//		  Reporter.log("cardNumber Entered",true);
//		  WebElement MonthList = driver.findElement(By.id("ExpireMonth"));
//		  WebElement YearList = driver.findElement(By.id("ExpireYear"));
//		  
//		  Select monthselect=new Select(MonthList);
//		  
//		  Select yearselect=new Select(YearList);
//		  
//		  System.out.println(monthselect.isMultiple());
//		  monthselect.selectByVisibleText("7");
//		   yearselect.selectByValue("2030");
//		   
//		   driver.findElement(By.id("CardCode")).sendKeys("123");
//		   Reporter.log("CardCode is Entered",true);
//		
	}
    //click on continue button of billingaddress 
	@FindBy(xpath = "//div[@id='billing-buttons-container']/..//input[@value='Continue']")
	private WebElement Continuebilling;

	public WebElement getContinuebilling() {
		return Continuebilling;
	}
	
	
	//click on continue button of shipping address
	@FindBy(xpath = "//div[@id='shipping-buttons-container']/..//input[@value='Continue']")
	private WebElement Continueshipping;
	
	public WebElement getContinueshipping() {
		return Continueshipping;
	}
	
	//click on continue button of shippingmethod
	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']/..//input[@value='Continue']")
	private WebElement Continuemethod;
	 

	public WebElement getContinuemethod() {
		return Continuemethod;
	}
	
	// to click on credit card checkbox paymentmethod
	@FindBy(id = "paymentmethod_2")
	private WebElement creditcard;
	
	public WebElement getCreditcard() {
		return creditcard;
	}
	
	//click on continue button of paymethod method
	@FindBy(xpath ="//div[@id='payment-method-buttons-container']/..//input[@value='Continue']")
	private WebElement paymentclick;
	
	public WebElement getPaymentclick() {
		return paymentclick;
	}
	
	//to enter cardholdername
    @FindBy(id = "CardholderName")
	private WebElement Cardholdername;

	public WebElement getCardholdername() {
		return Cardholdername;
	}
    // to enter cardnumber
	@FindBy(id = "CardNumber")
	private WebElement cardnumber;

	public WebElement getCardnumber() {
		return cardnumber;
	}
     //to enter cardcode
	@FindBy(id = "CardCode")
	private WebElement cardcode;

	public WebElement getCardcode() {
		return cardcode;
	}
	//to click on continue button of payment info
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']/..//input[@value='Continue']")
	private WebElement paymentbutton;

	public WebElement getPaymentbutton() {
		return paymentbutton;
	}
	
	//to click on confirm button
	@FindBy(xpath ="//div[@id='confirm-order-buttons-container']/..//input[@value='Confirm']")
	private WebElement confirm;

	public WebElement getConfirm() {
		return confirm;
	}
	
	
	
	
}
