package org.example;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
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

    @FindBy(xpath = "//div[@id=\"div_wand_validation_errors\"]//span[text () = 'Invalid username / password']")
    private WebElement loginValidationError;

    public HomePage loginUser(String userName, String password) {
        usernameFiled.click();
        usernameFiled.sendKeys(userName);
        passwordField.click();
        passwordField.sendKeys(password);
        loginButton.click();
        return new HomePage(driver);
    }
}
