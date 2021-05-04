package task.framework.steps;

import io.cucumber.java.en.And;
import task.framework.screens.HomePage;

public class HomePageStepsDef {
    private HomePage homePage = new HomePage();

    @And("^I search (.*) product$")
    public void searchProduct(String name) {
        homePage.searchProduct(name);
    }

    @And("I go to basket")
    public void goToBasket() {
        homePage.clickBasketButton();
    }
}
