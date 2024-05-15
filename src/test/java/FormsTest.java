import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;

public class FormsTest {

    private WebDriver webDriver;
    private WebDriverWait wait;
    
    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        webDriver = new ChromeDriver(chromeOptions);
        //wait = new WebDriverWait(webDriver, 10);
        File file = new File("src/main/java/com/example/Forms.html");
        String path = "file://" + file.getAbsolutePath();
        webDriver.get(path);
    }

   
    @Test
    public void testFormSubmission() {
        WebElement nameField = webDriver.findElement(By.id("name"));
        nameField.sendKeys("John Doe");

        WebElement emailField = webDriver.findElement(By.id("email"));
        emailField.sendKeys("johndoe@example.com");

        WebElement passwordField = webDriver.findElement(By.id("password"));
        passwordField.sendKeys("password123");

        Select genderSelect = new Select(webDriver.findElement(By.id("gender")));
        genderSelect.selectByValue("male");

        WebElement birthdateField = webDriver.findElement(By.id("birthdate"));
        birthdateField.sendKeys("2000-01-01"); // Format: YYYY-MM-DD

        WebElement termsCheckbox = webDriver.findElement(By.id("terms"));
        termsCheckbox.click();

        webDriver.findElement(By.cssSelector("input[type='submit']")).click();

        // Add wait for the success message to appear      
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("successMessage")));
        
        // Assertion (Modify based on your form's behavior)
        Assertions.assertTrue(((WebElement) successMessage).isDisplayed());
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}


class BrowserUtils {
    public static String getBrowserName() {
        WebDriver driver = null;
        try {
            // Attempt to set up WebDriverManager for Chrome
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            return "chrome";
        } catch (Exception eChrome) {
            // If Chrome setup fails, try setting up for Firefox
            try {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                return "firefox";
            } catch (Exception eFirefox) {
                // If Firefox setup fails, try setting up for Edge
                try {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    return "edge";
                } catch (Exception eEdge) {
                    // If Edge setup fails, try setting up for Internet Explorer
                    try {
                        WebDriverManager.iedriver().setup();
                        driver = new InternetExplorerDriver();
                        return "ie";
                    } catch (Exception E) {
                        // If none of the above work, you can handle it accordingly
                        return "Cannot Detect Browser!";
                    }
                }
            }
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
    
}

