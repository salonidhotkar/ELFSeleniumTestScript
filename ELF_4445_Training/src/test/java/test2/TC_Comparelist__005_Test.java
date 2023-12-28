package test2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genriclibrary.BasePage;
import genriclibrary.Basescript;
import genriclibrary.CompareListpage;
/***
 * @author User
 */
public class TC_Comparelist__005_Test extends Basescript {
	
	@Test
	public void comparelist() {
		BasePage base = new BasePage(driver);
		CompareListpage list = new CompareListpage(driver);

		// click on a ApparalesandShoes
		base.getApparalesAndShoes().click();
		Reporter.log("Clicked on ApparalesAndShoes", true);

		// Select the product
		list.getRunningshoe().click();
		Reporter.log("Clicked on Blue and green Sneaker  ", true);

		// Click on "compare list" button
		base.getComparelist().click(); 
		Reporter.log("add to CompareList",true);

		WebElement compare = driver.findElement(By.linkText("Blue and green Sneaker"));
		if (compare.isDisplayed()) {
			Reporter.log("Product is added to Comparelist",true);
		}
	}
}
