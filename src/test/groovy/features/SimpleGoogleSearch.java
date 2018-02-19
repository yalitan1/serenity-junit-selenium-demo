package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.GoogleSteps;

@RunWith(SerenityRunner.class)
public class SimpleGoogleSearch {
    @Managed(driver="firefox", uniqueSession = true)
    WebDriver driver;

    @Steps
    GoogleSteps googleSteps;

    @Test
    public void search_for_serenity_bdd() {
        googleSteps.open_homepage();
        googleSteps.search_for_term("serenity bdd");
        googleSteps.should_see_search_result_contains("Serenity BDD - Automated Acceptance Testing with Style");

    }
}
