import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class NavigationTest {

    static WebDriver driver = new ChromeDriver(); // TODO Все комменты к предыдущему файлу применимы и здесь.

    public WebElement getWebElement(String Xpath) {
        return driver.findElement(By.xpath(Xpath));
    }

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Viktoria\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://prodtest2.prounlimited.com/login.html");
    }

    @Test
    public void testNavigation() {
        WebElement usernameFiled = getWebElement("//input[@id=\"usernamefield\"]");
        usernameFiled.click();
        usernameFiled.sendKeys("aaron.sharp@cigna.com");


        WebElement passwordField = getWebElement("//input[@id=\"passwordfield\"]");
        passwordField.click();
        passwordField.sendKeys("qa!23456");


        WebElement loginButton = getWebElement("//button[@id=\"loginButton\"]");
        loginButton.click();


        String managerHomeLink = driver.getCurrentUrl();
        boolean expectedManagerHomeLink = managerHomeLink.contains("manager/home");
        Assertions.assertTrue(expectedManagerHomeLink);


        WebElement requestButton = getWebElement("//a[@aria-label = 'Requests']");
        requestButton.click();


        String managerRequestLink = driver.getCurrentUrl();
        boolean expectedManagerRequestLink = managerRequestLink.contains("manager/postings");
        Assertions.assertTrue(expectedManagerRequestLink);

        WebElement requestText = getWebElement("//h3//span[text () = 'Requests']");
        boolean isEnabledRequestText = requestText.isDisplayed();
        Assertions.assertTrue(isEnabledRequestText);

        WebElement engagementButton = getWebElement("//a[@aria-label='Engagements']");
        engagementButton.click();

        String managerEngagementLink = driver.getCurrentUrl();
        boolean expectedManagerEngagementLink = managerEngagementLink.contains("manager/workforce");
        Assertions.assertTrue(expectedManagerEngagementLink);

        WebElement engagementText = getWebElement("//h3//span[text () = 'Engagements']");
        boolean isEnabledEngagementText = engagementText.isDisplayed();
        Assertions.assertTrue(isEnabledEngagementText);

    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

}
