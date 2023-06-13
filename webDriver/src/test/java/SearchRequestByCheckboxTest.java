import org.example.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.example.ValidUserCredentials.VALID_USER;

public class SearchRequestByCheckboxTest {

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
    public void testRequestSearchByCheckbox() {
        loginPage.loginAsUser(VALID_USER)
                .verifyUserLoggedIn()
                .navigateRequestPage()
                .verifyUserOnPage() // TODO На какой пейдже? ++ обсудили на созвоне
                //сделала парент класс и в наслдениках сделала конструкторы с url и элементами хедера
                //был ещё вариант хранить в енам и передавать в метод, но подумала что вариант с конструкторами лучше) Как лучше в данном случае?
                .openAdvancedSearch()
                .disableAllTypeOfRequestsCheckboxes()// TODO Название метода не совсем отражает его действие. Этот метод просто кликает ++ //переписала селектор, теперь в лист попадают только заранее активные чекбоксы. метод использует только активные
                .enablePayrollTypeOfRequestsCheckbox() // TODO Название метода не совсем отражает его действие. Этот метод просто кликает ++ // тоже переписала селектор
                .clickSearchButton()
                .checkPayrollTypeOfRequestsInSearchResults();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}