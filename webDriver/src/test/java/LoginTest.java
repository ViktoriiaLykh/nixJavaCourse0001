import org.example.HomePage;
import org.example.LoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    private static WebDriver driver;
    private static LoginPage loginPage;

    @BeforeAll
    public static void setUp() { // TODO В таком случае можно было бы чистить куки перед или после выполнения теста
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
    public void testValidLogin() {
        HomePage homePage = loginPage.loginUser("aaron.sharp@cigna.com", "qa!23456");
        assertTrue(homePage.isSuccessLogin()); // TODO Ничего не мешает использовать матчер в файле пейдж обжекта
    }

    @Test
    public void testInvalidLogin() { // TODO Тест может использовать датапровайдер для тестирования и неверного логина и пароля
        HomePage homePage = loginPage.loginUser("aaron.sharp@cigna.com", "qa!11111");
        boolean isErrorDisplayed = loginPage.getLoginValidationError().isDisplayed();
        assertTrue(isErrorDisplayed); // TODO Ассерты переносим в пейдж обжект
        assertFalse(homePage.isSuccessLogin());
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}