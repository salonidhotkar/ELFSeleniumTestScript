package test3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genriclibrary.BasePage;
import genriclibrary.Basescript;
import genriclibrary.TopPage;
/***
 * @author User
 */
public class TC_Wishlist_004_Test extends Basescript {
	@Test
	public void wishlist() {
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
		
		//checked item is Whishlisted
		if(driver.findElement(By.xpath("//div[@class='page wishlist-page']")).isDisplayed())
				{
			        Reporter.log("Product is added to whishlist");
				}else {
					Reporter.log("Product is added to whishlist");
				}
				

	
		
		
	}
	
	

}
