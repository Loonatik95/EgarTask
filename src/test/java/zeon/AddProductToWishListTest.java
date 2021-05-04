package zeon;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import task.framework.screens.HomePage;
import task.framework.screens.SearchResultsPage;
import task.framework.screens.WishListPage;

public class AddProductToWishListTest extends SourceTest {
    private WishListPage wishListPage = new WishListPage();
    private String expectedProductPrice;
    private String expectedProductName;

    @BeforeClass
    public void addProduct() {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        int productIndex = 1;
        homePage.searchProduct("телефон");
        searchResultsPage.clickToBuyProductByIndex(productIndex);
        expectedProductName = searchResultsPage.getProductTextByIndex(productIndex);
        expectedProductPrice = searchResultsPage.getProductPriceByIndex(productIndex);
        homePage.clickBasketButton();

    }

    @Test
    public void checkPrice() {
        Assert.assertEquals(wishListPage.getPriceProduct(0), expectedProductPrice,
                "Item has not correct price. Should be" + expectedProductPrice
                        + "but found" + wishListPage.getPriceProduct(0));
    }

    @Test
    public void checkProductName() {
        Assert.assertEquals(wishListPage.getNameProduct(0), expectedProductName,
                "Item has not correct name. Should be" + expectedProductName
                        + "but found" + wishListPage.getNameProduct(0));
    }
}