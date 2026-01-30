package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberGuessTest {

    @Test
    public void sampleTest() {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:/path/to/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com"); // Optional if web-based test

        System.out.println("Selenium test ran successfully");

        driver.quit();
    }
}
