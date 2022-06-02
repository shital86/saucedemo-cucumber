package com.saucedemo.steps;

import com.saucedemo.pages.CheckOutCompletePage;
import com.saucedemo.pages.CheckOutPage;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.InventoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStep {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
        System.out.println("This change is done by lalit");

    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password) {
        new HomePage().enterUserName("standard_user");
        new HomePage().enterPassWord("secret_sauce");

    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginBtn();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String hightolow)  {
        new InventoryPage().arrangeInventoryPageHighToLoe(hightolow);
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new InventoryPage().selectCostliestProductAndAddToTheBasket();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new InventoryPage().clickOnShoppingCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CheckOutPage().clickOnCheckOutButton();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstname, String lastname, String postalcode)  {
      new CheckOutPage().enterFirstname("Kim");
      new CheckOutPage().enterLastName("Marsh");
      new CheckOutPage().enterPostalCode("Nw3 2jj");

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinueBtn();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutPage().clickOnFinishBtn();
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
        String expectedMessage="THANK YOU FOR YOUR ORDER";
        String actualMessage=new CheckOutCompletePage().getThankYouText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
