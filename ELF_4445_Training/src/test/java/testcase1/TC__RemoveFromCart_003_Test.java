package testcase1;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BasePage;
import base.Basescript;
import genriclibrary.BooksPage;
/***
 * @author User
 */ 
public class TC__RemoveFromCart_003_Test extends Basescript {
	
	@Test
	public void remove() {
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
			
			//select Product From cart
			base.getRemovefromcart().click();
			Reporter.log("Product is Selected");
			
			//Remove Product From cart
			base.getUpdateshoppingcart().click();
			Reporter.log("Product is removed from shoppingcart",true);
			
				
			
			//Check Item remove from  Cart
//			if(driver.findElement(By.xpath("//h1[text()='Shopping cart']/../..//a[text()='Computing and Internet']")).isDisplayed())
//					{
//				       Reporter.log("Product is remove from Cart",true);
//				
//					}else {
//						Reporter.log("Product is not remove Cart",true);
//					}
			  
			
}
	

}
