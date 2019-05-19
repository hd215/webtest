package webtest.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;

public class SearchPage extends PageObject {

    @FindBy(xpath = "//ul[@class='repo-list']/li")
    List<WebElementFacade> repoList;

    @Step("Verify count repo on page")
    public void verifyCountRepoOnPage(int count) {
        repoList.get(0).waitUntilClickable();
        int size = repoList.size();
        Assert.assertTrue(size == count);
    }
}
