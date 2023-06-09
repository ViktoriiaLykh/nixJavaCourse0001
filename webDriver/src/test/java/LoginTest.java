import org.example.HomePage;
import org.example.InvalidUserCredentials;
import org.example.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.example.ValidUserCredentials.VALID_USER;

public class LoginTest {


    private static WebDriver driver;
    private static LoginPage loginPage;

    @BeforeAll
    public static void setUp() { // TODO В таком случае можно было бы чистить куки перед или после выполнения теста ++ //добавила очистку куки в BeforeEach
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @BeforeEach
    public void navigateLoginPage() {
        driver.get(LoginPage.LOGIN_PAGE_URL);
        driver.manage().deleteAllCookies();
    }

    @Test
    public void testValidLogin() {
        HomePage homePage = loginPage.loginAsUser(VALID_USER);
        homePage.verifyUserLoggedIn(); // TODO Ничего не мешает использовать матчер в файле пейдж обжекта ++
    }

    @ParameterizedTest
    @EnumSource(InvalidUserCredentials.class)
    public void testInvalidLogin(InvalidUserCredentials credentials) { // TODO Тест может использовать датапровайдер для тестирования и неверного логина и пароля
            loginPage.loginAsUserWithWrongCredentials(credentials)
                    .checkLoginValidationError()
                    .verifyUserNotLoggedIn();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}