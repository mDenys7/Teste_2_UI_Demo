package br.sp.mdenys.steps;

import static br.sp.mdenys.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.sp.mdenys.pages.DemoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;




public class DemoSteps {
	
	private static DemoPage demoPage = new DemoPage();

	@Given("I acess the Home page")
	public static void iAcessTheHomePage() throws Throwable {
		getDriver().get("http://demo.cs-cart.com");
	}

	@And("Search for any product")
	public static void searchProduct() throws Throwable {
		demoPage.fillUpSearch("Apple Iphone 4S");
		demoPage.clickOnSearchIcon();
	}
	
	@And("Access this product on the table grid")
	public static void accessProduct() throws Throwable {
		demoPage.clickOnProductGrid();
	}
	@And("Add this product to the cart")
	public static void addProductCart() throws Throwable {
		demoPage.scrollToTitle();
		demoPage.clickOnAddToCartButton();
	}
	@And("Check the item on the cart and total price")
	public static void checkItemOnCartAndTotalPrice() throws Throwable {
		
		demoPage.scrollToSearch();
		demoPage.clickOnMyCartIcon();
		demoPage.colectProdutcNameAndTotalPrice();
	}
	
	@And("Do the Checkout")
	public static void doCheckout() throws Throwable {
		demoPage.clickProceedToCheckoutButton();
		demoPage.fillUpMandadoryFields("Test Test","06080008","test@gmail.com");
	}
	@And("Select the 'Phone Order' Payment")
	public static void selectPhoneOrder() throws Throwable {
		demoPage.clicPhoneOrderPaymentButton();
	}
	@And("Proceed with the order")
	public static void proceedOrder() throws Throwable {
		demoPage.termsAndConditionsCheckbox();
		demoPage.clickOnPlaceOrderButton();
	}
	
	
}
