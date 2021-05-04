package task.framework.screens;

import org.openqa.selenium.By;

public class WishListPage extends AbstractPage {

    private By nameProduct = By.xpath("//form[@id='fuckingBasket'][@class]//div[not(contains(@class,'hidden'))]/div[@class='cart-item-name']//a");
    private By priceProduct = By.xpath("//form[@id='fuckingBasket'][@class]//div[not(contains(@class,'hidden'))]/div[@class='cart-item-price']");


    public String getNameProduct(int index) {
        return browseActions.getText(nameProduct, index);
    }

    public String getPriceProduct(int index) {
        return browseActions.getText(priceProduct, index);
    }
}
