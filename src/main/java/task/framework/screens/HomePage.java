package task.framework.screens;

import org.openqa.selenium.By;

public class HomePage extends AbstractPage {

    private By searchDirectory = By.name("q");
    private By basket = By.xpath("//span[text()='Корзина']");
    private By badgeSearch = By.xpath("//input[@class='button_search']");


    public HomePage searchProduct(String product) {
        browseActions.type(searchDirectory, product)
                .click(badgeSearch);
        return this;
    }

    public WishListPage clickBasketButton() {
        browseActions.click(basket);
        return new WishListPage();
    }
}