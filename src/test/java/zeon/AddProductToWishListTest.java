package zeon;

import org.testng.Assert;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;
        import task.framework.screens.HomePage;
        import task.framework.screens.WishListPage;

public class AddProductToWishListTest extends SourceTest {
    private WishListPage wishListPage = new WishListPage();
    private String expectedProductPrice;
    private String expectedProductName;

    @BeforeClass
    public void addProduct() {
        HomePage homePage = new HomePage();
        int productIndex = 1;
        homePage.searchProduct("телефон");
        homePage.clickToBuyProductByIndex(productIndex);
        expectedProductName = homePage.getProductTextByIndex(productIndex);
        expectedProductPrice = homePage.getProductPriceByIndex(productIndex);
        homePage.clickBasketButton();

    }

    @Test
    public void checkPrice() {
        Assert.assertEquals(wishListPage.getPriceProduct(0), expectedProductPrice, "Not key");
    }

    @Test
    public void checkProductName() {
        Assert.assertEquals(wishListPage.getNameProduct(0), expectedProductName, "Not expected");
    }
}