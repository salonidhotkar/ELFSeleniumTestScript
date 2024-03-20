package demowebshope;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BasePage;
import base.Basescript;
import genriclibrary.CreditCardPage;
import genriclibrary.Excellib;
/***
 * @author 
 */

public class TC_CreditCard_007_Test extends Basescript {
	@Test
	public void Creditcard() {
		Excellib lib=new Excellib();
		SoftAssert softassert=new SoftAssert();
		
		String cardholdername = lib.readStringData("Sheet2", 0, 1);
		String cardnumber = lib.readStringData("Sheet2", 1, 1);
		
		BasePage base=new BasePage(driver);
		CreditCardPage card=new CreditCardPage(driver);
		
		
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
		base.getTermofservice().click();
		Reporter.log("clicked on termodservice",true);
		
		
		//Click on "Checkout" button
		base.getCheckout().click();
		Reporter.log("Clicked on Checkout",true);
			
		//Click on "billingContinue" button	
		card.getContinuebilling().click();
		Reporter.log("Clicked on billingContinue",true);
		
		
		
		//Click on ShippingAddressContinue button
		card.getContinueshipping().click();
		Reporter.log("clicked on ShippingAddressContinue",true);
		
		// click on continue button of shippingmethod
		card.getContinuemethod().click();
	    Reporter.log("clicked on ShippingMethod",true);
	    
	  //to click on credit card checkbox paymentmethod
	  	card. getCreditcard().click();
	  	Reporter.log("Clicked on creditcardrediobutton",true);
	  		
		
		//click on continue button of paymethod method
	    card.getPaymentclick().click();
	    Reporter.log("clicked on creditcard",true);
	    
//	    card.getCardholdername().sendKeys("saloni");
//	    Reporter.log(" Cardholder name Entered",true);
//		
//	    card.getCardnumber().sendKeys("5314625640123");
//	    Reporter.log("cardnumber Entered",true);
//	    
//	    card.getCardcode().sendKeys("123");
//	    Reporter.log("CardCode Entered");
	    
	  //to click on continue button of payment info
		card.getPaymentbutton().click();
		Reporter.log("Clicked on paymentbutton",true);
		
		//to click on confirm button
		card.getConfirm().click();
		Reporter.log("Clicked on confirbutton",true);
	}

}
