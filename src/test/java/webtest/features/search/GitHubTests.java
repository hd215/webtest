package webtest.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import webtest.ui.DocumentationPage;
import webtest.ui.GitHubPage;
import webtest.ui.SearchPage;


@RunWith(SerenityRunner.class)
public class GitHubTests {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    GitHubPage gitHubPage;
    DocumentationPage documentaionPage;
    SearchPage searchPage;

    @Before
    public void openStartPage() {
        gitHubPage.open();
    }

    @Test
    public void documentationVerifyDescription() {
        gitHubPage.openWhyGitHub();
        gitHubPage.openDocumentation();
        documentaionPage.verifyDescription("Documentation alongside your code");
    }

    @Test
    public void searchTest() {
        gitHubPage.searchRepo("pornHub");
        searchPage.verifyCountRepoOnPage(10);
    }
}

