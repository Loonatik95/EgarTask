package task.framework.screens;

import org.openqa.selenium.By;

public class HomePage extends AbstractPage {

    private By searchDirectory = By.name("q");
    private By basket = By.xpath("//span[text()='Корзина']");
    private By badgeSearch = By.xpath("//input[@class='button_search']");
    private By putBuyButton = By.xpath("//div[@class='catalog-item-store']/a");
    private By priceProduct = By.xpath("//div[@class='catalog-item-price']");
    private By nameProduct = By.xpath("//div[@class='catalog-item-title']//a");

    public HomePage searchProduct(String product){
        browseActions.type(searchDirectory, product)
                .click(badgeSearch);
        return this;
    }

    public WishListPage clickBasketButton(){
        browseActions.click(basket);
        return new WishListPage();
    }


    public HomePage clickToBuyProductByIndex(int index){
        browseActions.click(putBuyButton, index);
        return this;
    }

    public String getProductTextByIndex(int index){
        return browseActions.getText(nameProduct, index);
    }

    public String getProductPriceByIndex(int index){
        return browseActions.getText(priceProduct, index);
    }


}