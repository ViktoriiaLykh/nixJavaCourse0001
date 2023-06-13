package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class BasePage<T extends BasePage<T>> {

    final WebDriver driver;

    private final String pageUrl;
    private final String headerPath;

    public BasePage(WebDriver driver, String pageUrl, String headerPath) {
        this.driver = driver;
        this.pageUrl = pageUrl;
        this.headerPath = headerPath;
    }

    public T verifyUserOnPage() {
        assertTrue(driver.getCurrentUrl().contains(pageUrl));
        WebElement header = driver.findElement(By.xpath(headerPath));
        assertTrue(header.isDisplayed());
        return (T) this;
    };
}
