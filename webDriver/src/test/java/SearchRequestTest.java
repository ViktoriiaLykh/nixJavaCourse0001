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

import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void testRequestSearch() throws InterruptedException {
        HomePage homePage = loginPage.loginUser("aaron.sharp@cigna.com", "qa!23456");
        assertTrue(homePage.isSuccessLogin());

        RequestPage requestPage = homePage.navigateRequestPage();
        assertTrue(driver.getCurrentUrl().contains(RequestPage.PAGE_URL));
        assertTrue(requestPage.getRequestText().isDisplayed());

        requestPage.getAdvancedSearch().click();
        requestPage.enterRequestNumber("23497937");
        requestPage.selectDateCreatedFilter();

        requestPage.getDataPickerFromDate().click();
        LocalDate fromDate = LocalDate.of(2023, 5, 31);
        requestPage.selectDate(fromDate);

        requestPage.getDataPickerToDate().click();
        LocalDate toDate = LocalDate.of(2023, 6, 2);
        requestPage.selectDate(toDate);

        requestPage.getSearchButton().click();
        assertTrue(requestPage.testInputDate(fromDate, toDate));
        assertTrue(requestPage.testInputRequestNumber("23497937"));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
