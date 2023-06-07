import org.example.EngagementPage;
import org.example.HomePage;
import org.example.LoginPage;
import org.example.RequestPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NavigationTest {

    private static WebDriver driver;
    private static LoginPage loginPage;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @BeforeEach
    public void navigateLoginPage() {
        driver.get(LoginPage.LOGIN_PAGE_URL);
    }

    @Test
    public void testNavigation() {
        HomePage homePage = loginPage.loginUser("aaron.sharp@cigna.com", "qa!23456");
        assertTrue(homePage.isSuccessLogin());

        RequestPage requestPage = homePage.navigateRequestPage();
        assertTrue(driver.getCurrentUrl().contains(RequestPage.PAGE_URL));
        assertTrue(requestPage.getRequestText().isDisplayed());

        EngagementPage engagementPage = homePage.navigateEngagementPage();
        assertTrue(driver.getCurrentUrl().contains(EngagementPage.PAGE_URL));
        assertTrue(engagementPage.getEngagementText().isDisplayed());
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
