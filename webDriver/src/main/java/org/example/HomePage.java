package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    public static final String PAGE_URL = "manager/home";

    private final WebDriver driver;

    @FindBy(xpath = "//a[@aria-label = 'Requests']")
    private WebElement requestButton;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public RequestPage navigateRequestPage() {
        requestButton.click();
        return new RequestPage(driver);
    }

    public HomePage verifyUserLoggedIn() {
        assertTrue(driver.getCurrentUrl().contains(PAGE_URL));
        return this;
    }

}
