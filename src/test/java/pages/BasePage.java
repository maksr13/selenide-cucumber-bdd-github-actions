package pages;

import org.openqa.selenium.By;

public class BasePage {
    // Header selectors
    public By logedInText = By.cssSelector(".logged-in");
    public By customerMenuToggle = By.cssSelector(".page-header [data-action='customer-menu-toggle']");

    // Other selectors
    public By link = By.cssSelector("a");
    public By submitButton = By.cssSelector(".submit");
    public By boxContent = By.cssSelector(".box-content");
    public By messageSuccess = By.cssSelector("[data-ui-id='message-success']");
    public By messageError = By.cssSelector("data-ui-id='message-error']");
    public By pageTitleWrapper = By.cssSelector("[data-ui-id='page-title-wrapper']");
}
