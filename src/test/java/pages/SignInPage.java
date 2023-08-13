package pages;

import org.openqa.selenium.By;

public class SignInPage {
    public By emailField = By.cssSelector("#email");
    public By passwordField = By.cssSelector("#pass");
    public By signInButton = By.cssSelector("button.login");
}
