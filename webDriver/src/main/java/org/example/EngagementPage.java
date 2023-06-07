package org.example;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class EngagementPage {

    public static final String PAGE_URL = "manager/workforce";

    private final WebDriver driver;

    public EngagementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h3//span[text () = 'Engagements']")
    private WebElement engagementText;
}
