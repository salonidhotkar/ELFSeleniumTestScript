package testcase1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BasePage;
import base.Basescript;
import genriclibrary.BooksPage;
/***
 * @author User
 */
public class TC_AddToShoppingCart_002_Test extends Basescript {
	

	

	@Test
	public void AddtoShoppingCart() {	
		
		BasePage base=new BasePage(driver);
		
		BooksPage bookspage=new BooksPage(driver);
		
		//Click on a Category(Books)
		base.getBooks().click();
		Reporter.log("Clicked on Books",true);
		
		//Select the product
		bookspage.getComputingInternetlink().click();
		Reporter.log("Clicked on ComputingInternet",true);
		
		//Click on Addtocart button
		base.getAddtocartlink().click();
		Reporter.log("Clicked on AddToCart",true);
		
		//Click on "Shopping cart" button
		base.getShoppingcart().click();
		Reporter.log("Clicked on ShoppingCart",true);
		
		
		//Check Item added to Cart
		if(driver.findElement(By.xpath("//h1[text()='Shopping cart']/../..//a[text()='Computing and Internet']")).isDisplayed())
				{
			       Reporter.log("Product is Displayed in Cart",true);
			
				}else {
					Reporter.log("Product is not Displayed in Cart",true);
				}
		
		
		
		
		
		
	}

}
