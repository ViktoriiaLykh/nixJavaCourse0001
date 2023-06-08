package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EngagementPage {

    public static final String PAGE_URL = "manager/workforce";

    private final WebDriver driver;

    public EngagementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h3//span[text () = 'Engagements']")
    private WebElement engagementHeader;

    public EngagementPage verifyUserOnPage() {
        assertTrue(driver.getCurrentUrl().contains(EngagementPage.PAGE_URL));
        assertTrue(engagementHeader.isDisplayed());
        return this;
    }
}

