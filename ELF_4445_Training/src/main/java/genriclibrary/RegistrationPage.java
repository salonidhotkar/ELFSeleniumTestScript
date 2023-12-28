package genriclibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(id="gender-male")
	private WebElement gendermalelink;
	
	@FindBy(id="gender-female")
	private WebElement genderfemalelink;
	
	@FindBy(id="FirstName")
	private WebElement firstnamelink;
	
	@FindBy(id="LastName")
	private WebDriver lastnamelink;
	
	@FindBy(id="Email")
	private WebElement emaillink;
	
	@FindBy(id="Password")
	private WebElement passwordlink;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpasswordlink;
	
	@FindBy(id="register-button")
	private WebElement registerbuttonlink;

	private WebElement getGendermalelink() {
		return gendermalelink;
	}

	private WebElement getGenderfemalelink() {
		return genderfemalelink;
	}

	private WebElement getFirstnamelink() {
		return firstnamelink;
	}

	private WebDriver getLastnamelink() {
		return lastnamelink;
	}

	private WebElement getEmaillink() {
		return emaillink;
	}

	private WebElement getPasswordlink() {
		return passwordlink;
	}

	private WebElement getConfirmpasswordlink() {
		return confirmpasswordlink;
	}

	private WebElement getRegisterbuttonlink() {
		return registerbuttonlink;
	}
	
	
	

}
