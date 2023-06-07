import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigationTest {


    static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @BeforeEach
    public void navigateHomePage() {
        driver.get("https://prodtest2.prounlimited.com/login.html");
    }

    public WebElement getWebElement(String Xpath) {
        return driver.findElement(By.xpath(Xpath));
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
