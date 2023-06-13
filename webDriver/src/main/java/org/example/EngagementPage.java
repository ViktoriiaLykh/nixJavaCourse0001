package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EngagementPage extends BasePage<EngagementPage> {

    public EngagementPage(WebDriver driver) {
        super(driver, "manager/workforce", "//h3//span[text () = 'Engagements']");
        PageFactory.initElements(driver, this);
    }

}

