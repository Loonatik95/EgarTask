package task.framework.steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import task.framework.screens.WishListPage;

public class WishListStepsDef {
    private WishListPage wishListPage = new WishListPage();

    @Then("I check {int} product in basket")
    public void iCheckProductInBasket(int prod) {
        prod--;
        Assert.assertEquals(wishListPage.getPriceProduct(prod), Variable.getExpectedProductPrice()
                , "Item has not correct price. Should be" + Variable.getExpectedProductPrice()
                        + "but found" + wishListPage.getPriceProduct(prod));

        Assert.assertEquals(wishListPage.getNameProduct(prod), Variable.getExpectedProductName()
                , "Item has not correct name. Should be" + Variable.getExpectedProductName()
                        + "but found" + wishListPage.getNameProduct(prod));
    }
}
