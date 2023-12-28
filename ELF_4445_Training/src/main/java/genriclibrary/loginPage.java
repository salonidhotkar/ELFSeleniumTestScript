package genriclibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BasePage  {

	public loginPage(WebDriver driver) {
		super(driver);
	}
	  
     @FindBy(linkText = "Log in")
     private WebElement login;
     
	public WebElement getLogin() {
		return login;
	}
	}
	
	
