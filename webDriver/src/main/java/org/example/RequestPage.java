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

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RequestPage {

    public static final String PAGE_URL = "manager/postings";

    private final WebDriver driver;

    private final Object lock = new Object();

    public RequestPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h3//span[text () = 'Requests']")
    private WebElement requestHeader; // TODO - этот селектор по своей сути универсальный. И он не текст, а хэдер ++
    // поменяла на хедер, это проверка что хедер отображается нужный. Просто как доп проверка) не более

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

    public void enterRequestNumber(String requestNumber) {
        searchTextField.click();
        searchTextField.sendKeys(requestNumber);
    }

    public void selectDateCreatedFilter() {
        dateRangeDropdown.click();
        dateCreatedOption.click();
    }

    public void selectDate(LocalDate date) { // TODO Это не пейдж обжект паттерн)  ++ //обсудили на созвоне
        String monthAbbreviation = Month.of(date.getMonthValue()).name().substring(0, 3);

        openDateSelector.click();

        WebElement chooseYear = driver.findElement(By.xpath(("//div[text () = ' " + date.getYear() + " ']")));
        chooseYear.click();

        WebElement chooseMonth = driver.findElement(By.xpath(("//div[text () = ' " + monthAbbreviation + " ']")));
        chooseMonth.click();

        WebElement chooseDay = driver.findElement(By.xpath(("//div[text () = ' " + date.getDayOfMonth() + " ']")));
        chooseDay.click();
    }

    public boolean checkDateRangeInSearchResults(LocalDate fromDate, LocalDate toDate) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        wait.until(ExpectedConditions.visibilityOfAllElements(searchResultDates));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        for (WebElement dateElement : searchResultDates) {
            LocalDate date = LocalDate.parse(dateElement.getText(), formatter);
            if (date.isBefore(fromDate) || date.isAfter(toDate)) {
                return false;
            }
        }
        return true;
    }

    public boolean testInputRequestNumber(String requestInputNumber) {
        return requestInputNumber.equals(requestNumber.getText());
    }

    public EngagementPage navigateEngagementPage() {
        engagementButton.click();
        return new EngagementPage(driver);
    }

    public void verifyUserOnPage() {
        assertTrue(driver.getCurrentUrl().contains(RequestPage.PAGE_URL));
        assertTrue(requestHeader.isDisplayed());
    }

    public void openAdvancedSearch() {
        advancedSearchButton.click();
    }

    public void openDataPickerFromDate() {
        dataPickerFromDate.click();
    }

    public void openDataPickerToDate() {
        dataPickerToDate.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void checkDateInSearchResult(LocalDate fromDate, LocalDate toDate) {
        assertTrue(checkDateRangeInSearchResults(fromDate, toDate));
    }

    public void checkInputRequestNumberInSearchResult(String requestInputNumber) {
        assertTrue(testInputRequestNumber(requestInputNumber));
    }
}
