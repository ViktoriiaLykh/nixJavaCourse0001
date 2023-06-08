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

import static org.example.UserCredentials.VALID_USER;

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
    public void testNavigation() { // TODO Ассерты переносим в пейдж обжект ++
        HomePage homePage = loginPage.loginAsUser(VALID_USER);
        homePage.verifyUserLoggedIn();

        RequestPage requestPage = homePage.navigateRequestPage();
        requestPage.verifyUserOnPage();

        EngagementPage engagementPage = requestPage.navigateEngagementPage(); // TODO А мы ведь находились на странице реквестов, а почему переходим опять с хоум пейджа? ++
        engagementPage.verifyUserOnPage();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
