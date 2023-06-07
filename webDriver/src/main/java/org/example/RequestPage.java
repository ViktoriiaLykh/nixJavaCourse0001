package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Getter
public class RequestPage {

    public static final String PAGE_URL = "manager/postings";

    private final WebDriver driver;

    public RequestPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h3//span[text () = 'Requests']")
    private WebElement requestText;

    @FindBy(xpath = "//span[text () = 'Advanced']")
    private WebElement advancedSearch;

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
    private WebElement requestNumber;

    public void enterRequestNumber(String requestNumber) {
        searchTextField.click();
        searchTextField.sendKeys(requestNumber);
    }

    public void selectDateCreatedFilter() {
        dateRangeDropdown.click();
        dateCreatedOption.click();
    }

    public void selectDate(LocalDate date) {
        String monthAbbreviation = Month.of(date.getMonthValue()).name().substring(0, 3);

        WebElement openDateSelector = driver.findElement(By.xpath(("//button[@aria-label=\"Choose month and year\"]")));
        openDateSelector.click();

        WebElement chooseYear = driver.findElement(By.xpath(("//div[text () = ' " + date.getYear() + " ']")));
        chooseYear.click();

        WebElement chooseMonth = driver.findElement(By.xpath(("//div[text () = ' " + monthAbbreviation + " ']")));
        chooseMonth.click();

        WebElement chooseDay = driver.findElement(By.xpath(("//div[text () = ' " + date.getDayOfMonth() + " ']")));
        chooseDay.click();
    }

    public boolean testInputDate(LocalDate fromDate, LocalDate toDate) throws InterruptedException {
        Thread.sleep(2000); // any other options?
        List<WebElement> searchResultDates = driver.findElements(By.xpath("//td[5]"));
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
}
