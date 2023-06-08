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
import java.time.LocalDate;

import static org.example.UserCredentials.VALID_USER;

public class SearchRequestTest {

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
    public void testRequestSearch() { // TODO Ассерты переносим в пейдж обжект. Кто генерит эксепшен? ++

        LocalDate fromDate = LocalDate.of(2023, 5, 31);
        LocalDate toDate = LocalDate.of(2023, 6, 2);
        String requestNumber = "23497937";

        HomePage homePage = loginPage.loginAsUser(VALID_USER); // TODO - Юзера можно вынести в отдельный класс или енам. Он используется в нескольких местах ++
        homePage.verifyUserLoggedIn();

        RequestPage requestPage = homePage.navigateRequestPage();
        requestPage.verifyUserOnPage();

        requestPage.openAdvancedSearch(); // TODO - Не похоже на пейдж обжект паттерн ++

        requestPage.enterRequestNumber(requestNumber);

        requestPage.selectDateCreatedFilter();

        requestPage.openDataPickerFromDate();
        // TODO Такие переменные обьявляются обычно в начале тестового сценария для простоты внесения изменений ++
        requestPage.selectDate(fromDate);

        requestPage.openDataPickerToDate();
        // TODO Такие переменные обьявляются обычно в начале тестового сценария для простоты внесения изменений ++
        requestPage.selectDate(toDate);

        requestPage.clickSearchButton();
        requestPage.checkDateInSearchResult(fromDate, toDate);
        requestPage.checkInputRequestNumberInSearchResult(requestNumber);// TODO - "23497937" должно быть обьявлено переменной и использовано) ++
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
