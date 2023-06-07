package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public static final String PAGE_URL = "manager/home";

    private final WebDriver driver;

    @FindBy(xpath = "//a[@aria-label = 'Requests']")
    private WebElement requestButton;

    @FindBy(xpath = "//a[@aria-label='Engagements']")
    private WebElement engagementButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public RequestPage navigateRequestPage() {
        requestButton.click();
        return new RequestPage(driver);
    }

    public EngagementPage navigateEngagementPage() {
        engagementButton.click();
        return new EngagementPage(driver);
    }

    public boolean isSuccessLogin() {
        return driver.getCurrentUrl().contains(PAGE_URL);
    }
}
