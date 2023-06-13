package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {

    public static final String LOGIN_PAGE_URL = "https://prodtest2.prounlimited.com/login.html";

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"usernamefield\"]")
    private WebElement usernameFiled;

    @FindBy(xpath = "//input[@id=\"passwordfield\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id=\"loginButton\"]")
    private WebElement loginButton;

    public HomePage loginAsUser(ValidUserCredentials credentials) { // TODO Метод лучше бы назвать как-то иначе (loginAsUser) ++
        usernameFiled.click();
        usernameFiled.sendKeys(credentials.getUserName());
        passwordField.click();
        passwordField.sendKeys(credentials.getPassword());
        loginButton.click();
        return new HomePage(driver);
    }

    public LoginPage loginAsUserWithWrongCredentials(InvalidUserCredentials credentials) {
        usernameFiled.click();
        usernameFiled.sendKeys(credentials.getUserName());
        passwordField.click();
        passwordField.sendKeys(credentials.getPassword());
        loginButton.click();
        return new LoginPage(driver);
    }

    public LoginPage checkLoginValidationError(String errorMessage) {
        WebElement loginError = driver.findElement(By.xpath("//div[@id=\"div_wand_validation_errors\"]//span[text () = '" + errorMessage + "']"));
        boolean isErrorDisplayed = loginError.isDisplayed();
        assertTrue(isErrorDisplayed);
        return this;
    }

    public LoginPage verifyUserNotLoggedIn() {
        assertTrue(driver.getCurrentUrl().contains(LOGIN_PAGE_URL));
        return this;
    }


}
