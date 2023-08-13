package pages;

import org.openqa.selenium.By;

public class BasePage {
    public By link = By.cssSelector("a");
    public By submitButton = By.cssSelector(".submit");
    public By boxContent = By.cssSelector(".box-content");
    public By messageSuccess = By.cssSelector("[data-ui-id='message-success']");
    public By pageTitleWrapper = By.cssSelector("[data-ui-id='page-title-wrapper']");
}
