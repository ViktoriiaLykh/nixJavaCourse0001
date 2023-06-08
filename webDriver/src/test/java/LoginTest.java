import org.example.HomePage;
import org.example.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.example.UserCredentials.INVALID_USER;
import static org.example.UserCredentials.VALID_USER;

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

    @Test
    public void testInvalidLogin() { // TODO Тест может использовать датапровайдер для тестирования и неверного логина и пароля
        // в данном случае эту роль может выполнять UserCredentials? или использовать дата провайдер в этом тесте чтобы проверить несколько значений?
        //если да, то UserCredentials не должен хранить инвалидные данные?

        HomePage homePage = loginPage.loginAsUser(INVALID_USER);
        loginPage.checkLoginValidationError();
        homePage.verifyUserNotLoggedIn();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}