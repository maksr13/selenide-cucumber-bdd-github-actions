package pages;

import org.openqa.selenium.By;

public class CreateAnAccountPage {
    public By firstNameField = By.cssSelector("#firstname");
    public By lastNameField = By.cssSelector("#lastname");
    public By emailField = By.cssSelector("#email_address");
    public By passwordField = By.cssSelector("#password");
    public By passwordConfirmField = By.cssSelector("#password-confirmation");
    public By passwordStrengthMeter = By.cssSelector("#password-strength-meter");
}
