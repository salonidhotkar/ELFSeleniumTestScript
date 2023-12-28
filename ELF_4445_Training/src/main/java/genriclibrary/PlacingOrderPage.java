package genriclibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlacingOrderPage extends BasePage {

	public PlacingOrderPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "checkout")
	private WebElement Checkout;

	public WebElement getCheckout() {
		return Checkout;
	}

	@FindBy(id = "termsofservice")
	private WebElement termofservice;

	public WebElement getTermofservice() {
		return termofservice;
	}

	@FindBy(xpath = "//div[@id='billing-buttons-container']/..//input[@value='Continue']")
	private WebElement Continuebilling;

	public WebElement getContinuebilling() {
		return Continuebilling;
	}

	@FindBy(xpath = "//div[@id='shipping-buttons-container']/..//input[@value='Continue']")
	private WebElement Continueshipping;

	public WebElement getContinueshipping() {
		return Continueshipping;
	}

	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']/..//input[@value='Continue']")
	private WebElement Continuemethod;

	public WebElement getContinuemethod() {
		return Continuemethod;
	}

	// to click on cod radiobutton
	@FindBy(id = "paymentmethod_0")
	private WebElement paymentmethod;

	public WebElement getPaymentmethod() {
		return paymentmethod;
	}

	@FindBy(xpath = "//div[@id='payment-info-buttons-container']/..//input[@value='Continue']")
	private WebElement paymentbuttoninfo;

	public WebElement getPaymentbuttoninfo() {
		return paymentbuttoninfo;
	}

	@FindBy(xpath = "//div[@id='confirm-order-buttons-container']/..//input[@value='Confirm']")
	private WebElement confirm;

	public WebElement getConfirm() {
		return confirm;
	}

	@FindBy(xpath = "//div[@id='payment-method-buttons-container']/..//input[@value='Continue']")
	private WebElement paymentclick;

	public WebElement getPaymentclick() {
		return paymentclick;
	}

}
	
    

