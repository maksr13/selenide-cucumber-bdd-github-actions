import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true)
public class CukesFeaturesRunnerTest {

    @BeforeClass
    public static void executeBeforeTests() {
        Configuration.headless = true;
    }

    @AfterClass
    public static void executeAfterTests() {
        closeWebDriver();
    }
}
