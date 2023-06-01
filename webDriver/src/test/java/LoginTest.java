import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    static WebDriver driver = new ChromeDriver();

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
    public void testLogin() {
        var usernameFiled = getWebElement("//input[@id=\"usernamefield\"]");
        usernameFiled.click();
        usernameFiled.sendKeys("aaron.sharp@cigna.com");
        var passwordField = getWebElement("//input[@id=\"passwordfield\"]");
        passwordField.click();
        passwordField.sendKeys("qa!23456");
        var loginButton = getWebElement("//button[@id=\"loginButton\"]");
        loginButton.click();
        String managerHomeLink = driver.getCurrentUrl();
        boolean expectedManagerHomeLink = managerHomeLink.contains("manager/home");
        Assertions.assertTrue(expectedManagerHomeLink);
    }

    @Test
    public void testInvalidLogin() {
        WebElement usernameFiled = getWebElement("//input[@id=\"usernamefield\"]");
        usernameFiled.click();
        usernameFiled.sendKeys("aaron.sharp@cigna.com");
        WebElement passwordField = getWebElement("//input[@id=\"passwordfield\"]");
        passwordField.click();
        passwordField.sendKeys("qa!11111");
        WebElement loginButton = getWebElement("//button[@id=\"loginButton\"]");
        loginButton.click();
        WebElement errorMessage = getWebElement("//div[@id=\"div_wand_validation_errors\"]//span[text () = 'Invalid username / password']");
        boolean errorIsDisplayed = errorMessage.isDisplayed();
        Assertions.assertTrue(errorIsDisplayed);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}