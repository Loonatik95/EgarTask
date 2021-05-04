package task.framework.steps;

import io.cucumber.java.en.And;
import task.framework.screens.SearchResultsPage;

public class SearchResultsStepsDef {
    private SearchResultsPage searchResultsPage = new SearchResultsPage();

    @And("I put {int} found product in the wishlist")
    public void pickSearchedProduct(int product) {
        searchResultsPage.clickToBuyProductByIndex(--product);
        Variable.setExpectedProductName(searchResultsPage.getProductTextByIndex(product));
        Variable.setExpectedProductPrice(searchResultsPage.getProductPriceByIndex(product));
    }
}
