package genriclibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopPage extends BasePage {

	public TopPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(linkText = "50's Rockabilly Polka Dot Top JR Plus Size")
	private WebElement polkaDotTop;

	public WebElement getPolkaDotTop() {
		return polkaDotTop;
	}

	
	

}
