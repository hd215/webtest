package webtest.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;


@DefaultUrl("http://www.github.com")
public class GitHubPage extends PageObject {

    @FindBy(xpath = "//*[contains(text(),'Why GitHub?')]")
    WebElementFacade whyGithubButton;

    @FindBy(xpath = "//*[contains(text(),'Documentation')]")
    WebElementFacade documentationButton;

    @FindBy(name = "q")
    WebElementFacade searchField;

    @Step("Open Why GitHub list")
    public void openWhyGitHub() {
        whyGithubButton.waitUntilClickable().click();
    }

    @Step("Open Documentation")
    public void openDocumentation() {
        documentationButton.waitUntilClickable().click();
    }

    @Step("Search repo")
    public void searchRepo(String request) {
        searchField.waitUntilClickable().click();
        searchField.type(request);
        searchField.sendKeys(Keys.ENTER);
    }
}
