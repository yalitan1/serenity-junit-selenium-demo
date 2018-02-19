package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.SearchResultsPage;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSteps {

    HomePage homePage;
    SearchResultsPage searchResultsPage;

    @Step
    public void open_homepage() {
        homePage.open();
    }

    @Step
    public void search_for_term(String term) {
        homePage.enterSearchTerm(term);
        homePage.search();
    }

    @Step
    public void should_see_search_result_contains(String term) {
        String itemName = searchResultsPage.getItemName();
        assertThat(itemName).isEqualTo(term);
    }
}
