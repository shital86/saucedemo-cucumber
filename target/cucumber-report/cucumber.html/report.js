$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4493981800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with credential username \"Satandard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I filter the products by Price \"high to low\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter details firstname \"firstName\", lastName \"lastName\" and zipPostalCode \"Zip/PostalCode\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 206623600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Satandard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 64
    }
  ],
  "location": "HomePageStep.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 305214900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.iClickOnLoginButton()"
});
formatter.result({
  "duration": 191114500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "high to low",
      "offset": 32
    }
  ],
  "location": "HomePageStep.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 279871600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 120757400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.iOpenShoppingCart()"
});
formatter.result({
  "duration": 78586000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.iGoToCheckout()"
});
formatter.result({
  "duration": 72665000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 27
    },
    {
      "val": "lastName",
      "offset": 49
    },
    {
      "val": "Zip/PostalCode",
      "offset": 78
    }
  ],
  "location": "HomePageStep.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 280089500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.iClickOnContinueButton()"
});
formatter.result({
  "duration": 69986100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.iClickOnFinishButton()"
});
formatter.result({
  "duration": 64515300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 44285900,
  "status": "passed"
});
});