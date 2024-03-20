package genriclibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CompareListpage extends BasePage {

	public CompareListpage(WebDriver driver) {
		super(driver);
		
	}
	 
	

	@FindBy(linkText = "Blue and green Sneaker")
	private WebElement runningshoe;



	public WebElement getRunningshoe() {
		return runningshoe;
	}

	
	
		

}
