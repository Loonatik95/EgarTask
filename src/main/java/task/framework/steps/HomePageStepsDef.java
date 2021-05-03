package task.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import task.framework.screens.HomePage;
import task.framework.screens.WishListPage;

public class HomePageStepsDef {
    private HomePage homePage = new HomePage();
    private String expectedProductName;
    private String expectedProductPrice;
    private WishListPage wishListPage = new WishListPage();
    @And("^I search (.*) product$")
    public void searchProduct(String name){
        homePage.searchProduct(name);
    }

    @And("I pick {int} searched product")
    public void pickSearchedProduct(int product) {
        homePage.clickToBuyProductByIndex(product);
        expectedProductName = homePage.getProductTextByIndex(product);
        expectedProductPrice = homePage.getProductPriceByIndex(product);
    }

    @And("I go to basket")
    public void goToBasket() {
        homePage.clickBasketButton();
    }

    @Then("I check {int} product in basket")
    public void iCheckProductInBasket(int prod) {
        Assert.assertEquals(wishListPage.getPriceProduct(prod), expectedProductPrice, "Not key");
        Assert.assertEquals(wishListPage.getNameProduct(prod), expectedProductName, "Not expected");
    }
}
