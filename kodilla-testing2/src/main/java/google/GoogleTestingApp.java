package google;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCHFIELD = "q";
    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "C:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
