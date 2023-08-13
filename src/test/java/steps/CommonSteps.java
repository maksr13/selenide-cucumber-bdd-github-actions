package steps;

import com.codeborne.selenide.Condition;
import helpers.Common;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class CommonSteps {

    @When("^I open the app$")
    public void iOpenTheApp() {
        open(Common.getAppUiUrl());
    }

    @When("^I click button (.*)$")
    public void iClickButtonXxx(String button) {
        BasePage basePage = new BasePage();
        if (button.equalsIgnoreCase("Submit")) {
            $(basePage.submitButton).click();
        } else {
            throw new IllegalArgumentException(String.format("Unsupported button name - '%s'", button));
        }
    }

    @Then("^I click link with text (.*)$")
    public void iClickLinkWithTextXxx(String text) {
        BasePage basePage = new BasePage();
        $$(basePage.link).find(Condition.text(text)).click();
    }

    @Then("^I should see page title wrapper with text (.*)$")
    public void iShouldSeePageTitleWrapperWithTextXxx(String text) {
        BasePage basePage = new BasePage();
        $(basePage.pageTitleWrapper).shouldHave(Condition.exactText(text)).shouldHave(Condition.visible);
    }

    @Then("^I should see message success with text (.*)$")
    public void iShouldSeeMessageSuccessWithTextXxx(String text) {
        BasePage basePage = new BasePage();
        $(basePage.messageSuccess).shouldHave(Condition.exactText(text)).shouldHave(Condition.visible);
    }

    @Then("^I should see box content with text (.*)$")
    public void iShouldSeeBoxContentWithTextXxx(String text) {
        BasePage basePage = new BasePage();
        $(basePage.boxContent).shouldHave(Condition.text(Common.getUniqueResult(text))).shouldHave(Condition.visible);
    }
}
