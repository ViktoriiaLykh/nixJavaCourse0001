import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SearchRequestTest {


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
    public void testRequestSearch() {

        WebElement usernameFiled = getWebElement("//input[@id=\"usernamefield\"]");
        usernameFiled.click();
        usernameFiled.sendKeys("aaron.sharp@cigna.com");

        WebElement passwordField = getWebElement("//input[@id=\"passwordfield\"]");
        passwordField.click();
        passwordField.sendKeys("qa!23456");

        WebElement loginButton = getWebElement("//button[@id=\"loginButton\"]");
        loginButton.click();


        String managerHomeLink = driver.getCurrentUrl();
        boolean isManagerHomeLink = managerHomeLink.contains("manager/home");
        Assertions.assertTrue(isManagerHomeLink);


        WebElement requestButton = getWebElement("//a[@aria-label = 'Requests']");
        requestButton.click();


        String managerRequestLink = driver.getCurrentUrl();
        boolean isManagerRequestLink = managerRequestLink.contains("manager/postings");
        Assertions.assertTrue(isManagerRequestLink);

        WebElement requestText = getWebElement("//h3//span[text () = 'Requests']");
        boolean isEnabledRequestText = requestText.isDisplayed();
        Assertions.assertTrue(isEnabledRequestText);

        WebElement advancedSearch = getWebElement("//span[text () = 'Advanced']");
        advancedSearch.click();

        WebElement searchTextField = getWebElement("//input[@formcontrolname=\"searchText\"]");
        searchTextField.click();
        searchTextField.sendKeys("23497937");

        WebElement dateRangeDropdown = getWebElement("//mat-select[@formcontrolname=\"dateRange\"]");
        dateRangeDropdown.click();

        WebElement dateCreatedOption = getWebElement("//span[text () = 'Date Created']");
        dateCreatedOption.click();

        WebElement dataPickerFromDate = getWebElement("//div[input[@formcontrolname=\"dateFrom\"]]/..//button[@aria-label=\"Open calendar\"]");
        dataPickerFromDate.click();

        WebElement chooseFromDate = getWebElement("//button[@aria-label=\"Choose month and year\"]");
        chooseFromDate.click();

        WebElement chooseFromYear = getWebElement("//div[text () = ' 2023 ']");
        chooseFromYear.click();

        WebElement chooseFromMonth = getWebElement("//div[text () = ' JUN ']");
        chooseFromMonth.click();

        WebElement chooseFromDay = getWebElement("//div[text () = ' 1 ']");
        chooseFromDay.click();

        WebElement dataPickerToDate = getWebElement("//div[input[@formcontrolname=\"dateTo\"]]/..//button[@aria-label=\"Open calendar\"]");
        dataPickerToDate.click();

        WebElement chooseToDate = getWebElement("//button[@aria-label=\"Choose month and year\"]");
        chooseToDate.click();

        WebElement chooseToYear = getWebElement("//div[text () = ' 2023 ']");
        chooseToYear.click();

        WebElement chooseToMonth = getWebElement("//div[text () = ' JUN ']");
        chooseToMonth.click();

        WebElement chooseToDay = getWebElement("//div[text () = ' 1 ']");
        chooseToDay.click();

        WebElement searchButton = getWebElement("//span[text() = 'Search']");
        searchButton.click();

        WebElement requestNumber = getWebElement("//a[text () = '23497937']");
        boolean isCorrectRequestNumber = requestNumber.isDisplayed();
        Assertions.assertTrue(isCorrectRequestNumber);

        WebElement requestDateCreated = getWebElement("//td[text () = '06/01/2023']");
        boolean isCorrectRequestDateCreated = requestDateCreated.isDisplayed();
        Assertions.assertTrue(isCorrectRequestDateCreated);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
