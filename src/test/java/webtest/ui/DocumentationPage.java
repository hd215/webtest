package webtest.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


@DefaultUrl("https://github.com/features#documentation")
public class DocumentationPage extends PageObject {

    @FindBy(xpath = "//*[@id='documentation']/div/h2")
    WebElementFacade descriptionPageText;

    @Step("Verify description")
    public void verifyDescription(String description) {
        String text = descriptionPageText.waitUntilVisible().getText();
        Assert.assertEquals(text, description);
    }

}
