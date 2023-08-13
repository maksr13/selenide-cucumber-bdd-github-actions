package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateAnAccountPage;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;

public class CreateAnAccountSteps {

    @When("^I fill 'Create an Account' page with following data:$")
    public void iFillCreateAnAccountPageWithFollowingData(DataTable table) {
        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        for (Map<String, String> row : rows) {
            if (row.containsKey("firstName")) {
                $(createAnAccountPage.firstNameField).type(row.get("firstName"));
            }
            if (row.containsKey("lastName")) {
                $(createAnAccountPage.lastNameField).type(row.get("lastName"));
            }
            if (row.containsKey("email")) {
                $(createAnAccountPage.emailField).type(row.get("email"));
            }
            if (row.containsKey("password")) {
                $(createAnAccountPage.passwordField).type(row.get("password"));
            }
            if (row.containsKey("passwordConfirm")) {
                $(createAnAccountPage.passwordConfirmField).type(row.get("passwordConfirm"));
            }
        }
    }

    @Then("^I should see validation error (.*) for field (.*) on the 'Create an Account' page$")
    public void iShouldSeeValidationErrorXxxForFieldXxxOnTheCreateAnAccountPage(String error, String field) {
        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();
        if (field.equalsIgnoreCase("firstName")) {
            $(createAnAccountPage.firstNameField).sibling(0).shouldHave(Condition.exactText(error)).shouldHave(Condition.visible);
        } else if (field.equalsIgnoreCase("lastName")) {
            $(createAnAccountPage.lastNameField).sibling(0).shouldHave(Condition.exactText(error)).shouldHave(Condition.visible);
        } else if (field.equalsIgnoreCase("email")) {
            $(createAnAccountPage.emailField).sibling(0).shouldHave(Condition.exactText(error)).shouldHave(Condition.visible);
        } else if (field.equalsIgnoreCase("password")) {
            $(createAnAccountPage.passwordField).sibling(0).shouldHave(Condition.exactText(error)).shouldHave(Condition.visible);
        } else if (field.equalsIgnoreCase("passwordConfirm")) {
            $(createAnAccountPage.passwordConfirmField).sibling(0).shouldHave(Condition.exactText(error)).shouldHave(Condition.visible);
        } else {
            throw new IllegalArgumentException(String.format("Unsupported field - '%s'", field));
        }
    }

    @Then("^I should see password strength meter error with text (.*) on the 'Create an Account' page$")
    public void iShouldSeePasswordStrengthMeterErrorWithTextXxxOnTheCreateAnAccountPage(String error) {
        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();
        $(createAnAccountPage.passwordStrengthMeter).shouldHave(Condition.exactText(error)).shouldHave(Condition.visible);
    }
}
