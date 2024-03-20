package test3;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BasePage;
import base.Basescript;
import genriclibrary.TopPage;
/***
 * @author User
 */
public class TC_RemoveFromWishlist_001_Test extends Basescript {
	
	@Test
	public void remove() {
		BasePage base=new BasePage(driver);
		TopPage top=new TopPage(driver);
		
		//Click on a Category ApparalesandShoes
		  base.getApparalesAndShoes().click();
		  Reporter.log("Clicked on ApparalesAndShoes",true);
				
		//Select the product
		top.getPolkaDotTop().click();
		Reporter.log("Clicked on 50's Rockabilly Polka Dot Top JR Plus Size ",true);
		
		//Click on "Add to wishlist" button
		base.getAddtowishlistbutton().click();
		Reporter.log("Added To Whishlist");
		
		//Click on "Wishlist" section link
		base.getWishlistLink().click();
		Reporter.log("Clicked on Wishlist",true);
		
//		//add to cart from Wishlist
//		base.getAddtocartlink().click();
//		Reporter.log("Product removed from Wishlist");
//		
//		base.getWhishlistaddtocart().click();
//		Reporter.log("Added to Cart From Wishlist",true);
		
		base.getAddtocartfromwishlist().click();
		Reporter.log("Clicked on  added to  cart checkbox",true);
		
		base.getAddtocartbuttonfromwishlist().click();
		Reporter.log("Product added to shoppingcart",true);
		
		//Check wishlist is empty
		Reporter.log("The wishlist is empty!",true);
	}
}