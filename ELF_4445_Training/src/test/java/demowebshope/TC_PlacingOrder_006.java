package demowebshope;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BasePage;
import base.Basescript;
import genriclibrary.PlacingOrderPage;
/***
 * @author User
 */
public class TC_PlacingOrder_006 extends Basescript {
	
	@Test
	public void placingorder() {
	BasePage base=new BasePage(driver);
	PlacingOrderPage order=new PlacingOrderPage(driver);
	// Click on a Category(Books)
	base.getBooks().click();
	Reporter.log("Clicked on Books", true);

	// Select the product
    base.getComputingInternetlinkEX().click();
	Reporter.log("Clicked on ComputingInternet", true);
	
	//Click on Addtocart button
	base.getAddtocartlink().click();
	Reporter.log("Clicked on AddToCart",true);

	//Click on "Shopping cart" button
	base.getShoppingcart().click();
	Reporter.log("Clicked on ShoppingCart",true);
	
	//Select on " I agree with the terms of service and I adhere to them" checkbox
	order.getTermofservice().click();
	Reporter.log("clicked on termofservice",true);
	
	
	//Click on "Checkout" button
	order.getCheckout().click();
	Reporter.log("Clicked on Checkout",true);
		
	//Click on "billingContinue" button	
	order.getContinuebilling().click();
	Reporter.log("Clicked on billingContinue",true);
	
	
	
	//Click on ShippingAddressContinue button
	order.getContinueshipping().click();
	Reporter.log("clicked on ShippingAddressContinue",true);
	
	//to click on shippingmethod
	order.getContinuemethod().click();
    Reporter.log("clicked on ShippingMethod",true);
	
	
	
	//click on cash on delevery
	order.getPaymentmethod().click();
	Reporter.log("clicked on CashonDelevery",true );
	
//	base.getContinuemethod().click();
//	Reporter.log("Clicked on PaymentmethodContinue",true);
	//click on paymentmethod Continue
//	base.getPaymentclick().click();
//	Reporter.log("Clicked on Paymentradiobutton",true);
	
	//
	order.getPaymentclick().click();
	Reporter.log("Clicked on payment continue button",true);
	
	order.getPaymentbuttoninfo().click();
	Reporter.log("clicked on paymentinfo continue button",true );
	
	//click on conform
	order.getConfirm().click();
	Reporter.log("Clicked on Conformbutton",true);
	
	//order conformation msg
	Reporter.log("Your order has been successfully processed!",true);
		
	}

}
