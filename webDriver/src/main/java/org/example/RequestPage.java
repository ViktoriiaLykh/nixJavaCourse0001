package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RequestPage extends BasePage<RequestPage> {

    public RequestPage(WebDriver driver) {
        super(driver, "manager/postings", "//h3//span[text () = 'Requests']");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text () = 'Advanced']")
    private WebElement advancedSearchButton; // TODO - это кнопка или поле ввода или ссылка?) Из названия не понятно ++

    @FindBy(xpath = "//input[@formcontrolname=\"searchText\"]")
    private WebElement searchTextField;

    @FindBy(xpath = "//mat-select[@formcontrolname=\"dateRange\"]")
    private WebElement dateRangeDropdown;

    @FindBy(xpath = "//span[text () = 'Date Created']")
    private WebElement dateCreatedOption;

    @FindBy(xpath = "//div[input[@formcontrolname=\"dateFrom\"]]/..//button[@aria-label=\"Open calendar\"]")
    private WebElement dataPickerFromDate;

    @FindBy(xpath = "//div[input[@formcontrolname=\"dateTo\"]]/..//button[@aria-label=\"Open calendar\"]")
    private WebElement dataPickerToDate;

    @FindBy(xpath = "//span[text() = 'Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//tbody[@role=\"rowgroup\"]//a[1]")
    private WebElement requestNumber; // TODO - это счетчик реквестов? **
    // да, чтобы не писать в селектор номер реквеста, я беру первый номер реквеста на странице чтобы сравнить его с введённым в метод.
    // По моей логике, если я ввожу конкретный реквест, то и получить в результатах должна только 1.

    @FindBy(xpath = "//a[@aria-label='Engagements']")
    private WebElement engagementButton;

    @FindBy(xpath = "//button[@aria-label=\"Choose month and year\"]")
    private WebElement openDateSelector;

    @FindBy(xpath = "//td[5]")
    private List<WebElement> searchResultDates;

    @FindBy(xpath = "//h4[text() = 'Type of Requests']//..//span[input[@aria-checked=\"true\"]]")
    private List<WebElement> listEnabledTypeOfRequestsCheckboxes;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname=\"payroll\"]//span[@class = \"mat-checkbox-inner-container\"]")
    private WebElement disablePayrollTypeOfRequestsCheckbox;

    @FindBy(xpath = "//td[6]")
    private List<WebElement> searchResultTypeOfRequests;

    public RequestPage enterRequestNumber(String requestNumber) {
        searchTextField.click();
        searchTextField.sendKeys(requestNumber);
        return this;
    }

    public RequestPage selectDateCreatedFilter() {
        dateRangeDropdown.click();
        dateCreatedOption.click();
        return this;
    }

    public RequestPage selectDate(LocalDate date) { // TODO Это не пейдж обжект паттерн)  ++ //обсудили на созвоне
        String monthAbbreviation = Month.of(date.getMonthValue()).name().substring(0, 3);

        openDateSelector.click();

        WebElement chooseYear = driver.findElement(By.xpath(("//div[text () = ' " + date.getYear() + " ']")));
        chooseYear.click();

        WebElement chooseMonth = driver.findElement(By.xpath(("//div[text () = ' " + monthAbbreviation + " ']")));
        chooseMonth.click();

        WebElement chooseDay = driver.findElement(By.xpath(("//div[text () = ' " + date.getDayOfMonth() + " ']")));
        chooseDay.click();

        return this;
    }

    public RequestPage checkDateRangeInSearchResults(LocalDate fromDate, LocalDate toDate) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElements(searchResultDates));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        for (WebElement dateElement : searchResultDates) {
            LocalDate date = LocalDate.parse(dateElement.getText(), formatter);
            assertFalse(date.isBefore(fromDate) || date.isAfter(toDate));
        }
        return this;
    }

    public RequestPage disableAllTypeOfRequestsCheckboxes() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElements(listEnabledTypeOfRequestsCheckboxes));
        for (WebElement checkbox : listEnabledTypeOfRequestsCheckboxes) {
            checkbox.click();
        }
        return this;
    }

    public void checkPayrollTypeOfRequestsInSearchResults() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//td[6]"))));
        for (WebElement typeOfRequests : searchResultTypeOfRequests) {
            assertEquals("Payroll", typeOfRequests.getText());
        }
    }

    public RequestPage enablePayrollTypeOfRequestsCheckbox() {
        disablePayrollTypeOfRequestsCheckbox.click();
        return this;
    }

    public RequestPage checkInputRequestNumberInSearchResult(String requestInputNumber) {
        assertEquals(requestInputNumber, requestNumber.getText());
        return this;
    }

    public EngagementPage navigateEngagementPage() {
        engagementButton.click();
        return new EngagementPage(driver);
    }


    public RequestPage openAdvancedSearch() {
        advancedSearchButton.click();
        return this;
    }

    public RequestPage openDataPickerFromDate() {
        dataPickerFromDate.click();
        return this;
    }

    public RequestPage openDataPickerToDate() {
        dataPickerToDate.click();
        return this;
    }

    public RequestPage clickSearchButton() {
        searchButton.click();
        return this;
    }


}
