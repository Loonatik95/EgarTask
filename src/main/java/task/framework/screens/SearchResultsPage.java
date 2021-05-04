package task.framework.screens;

import org.openqa.selenium.By;

public class SearchResultsPage extends AbstractPage{

    private By putBuyButton = By.xpath("//div[@class='catalog-item-store']/a");
    private By priceProduct = By.xpath("//div[@class='catalog-item-price']");
    private By nameProduct = By.xpath("//div[@class='catalog-item-title']//a");

    public SearchResultsPage clickToBuyProductByIndex(int index) {
        browseActions.click(putBuyButton, index);
        return this;
    }

    public String getProductTextByIndex(int index) {
        return browseActions.getText(nameProduct, index);
    }

    public String getProductPriceByIndex(int index) {
        return browseActions.getText(priceProduct, index);
    }
}
