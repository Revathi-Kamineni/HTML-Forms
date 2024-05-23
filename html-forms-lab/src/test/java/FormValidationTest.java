// // // import org.junit.jupiter.api.AfterEach;
// // // import org.junit.jupiter.api.Assertions;
// // // import org.junit.jupiter.api.BeforeEach;
// // // import org.junit.jupiter.api.Test;
// // // import org.openqa.selenium.By;
// // // import org.openqa.selenium.WebDriver;
// // // import org.openqa.selenium.WebElement;
// // // import org.openqa.selenium.chrome.ChromeDriver;
// // // import org.openqa.selenium.chrome.ChromeOptions;
// // // import org.openqa.selenium.edge.EdgeDriver;
// // // import org.openqa.selenium.firefox.FirefoxDriver;
// // // import org.openqa.selenium.ie.InternetExplorerDriver;
// // // import org.openqa.selenium.support.ui.ExpectedConditions;
// // // import org.openqa.selenium.support.ui.WebDriverWait;
// // // import org.openqa.selenium.support.ui.Select;


// // // import io.github.bonigarcia.wdm.WebDriverManager;

// // // import java.io.File;

// // // public class FormsTest {

// // //     private WebDriver webDriver;
// // //     private WebDriverWait wait;
    
// // //     @BeforeEach
// // //     public void setUp() {
// // //         WebDriverManager.chromedriver().setup();
// // //         ChromeOptions chromeOptions = new ChromeOptions();
// // //         chromeOptions.addArguments("headless");
// // //         webDriver = new ChromeDriver(chromeOptions);
// // //         wait = new WebDriverWait(webDriver, 10);
// // //         File file = new File("src/main/java/com/example/Forms.html");
// // //         String path = "file://" + file.getAbsolutePath();
// // //         webDriver.get(path);
// // //     }

   
// // //     @Test
// // //     public void testValidFormSubmission() {
// // //         // Fill out the form
// // //         WebElement nameField = webDriver.findElement(By.id("name"));
// // //         nameField.sendKeys("John Doe");

// // //         WebElement emailField = webDriver.findElement(By.id("email"));
// // //         emailField.sendKeys("johndoe@example.com");

// // //         WebElement passwordField = webDriver.findElement(By.id("password"));
// // //         passwordField.sendKeys("password123");

// // //         Select genderSelect = new Select(webDriver.findElement(By.id("gender")));
// // //         genderSelect.selectByValue("male");

// // //         WebElement birthdateField = webDriver.findElement(By.id("birthdate"));
// // //         birthdateField.sendKeys("2000-01-01");

// // //         WebElement termsCheckbox = webDriver.findElement(By.id("terms"));
// // //         termsCheckbox.click();

// // //         // Submit the form
// // //         webDriver.findElement(By.cssSelector("input[type='submit']")).click();

// // //         // Wait for success message
// // //         WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("successMessage")));

// // //         // Assert success message is displayed
// // //         Assertions.assertTrue(successMessage.isDisplayed());
// // //     }

// // //     @AfterEach
// // //     public void tearDown() {
// // //         webDriver.quit();
// // //     }
// // // }


// // // class BrowserUtils {
// // //     public static String getBrowserName() {
// // //         WebDriver driver = null;
// // //         try {
// // //             // Attempt to set up WebDriverManager for Chrome
// // //             WebDriverManager.chromedriver().setup();
// // //             driver = new ChromeDriver();
// // //             return "chrome";
// // //         } catch (Exception eChrome) {
// // //             // If Chrome setup fails, try setting up for Firefox
// // //             try {
// // //                 WebDriverManager.firefoxdriver().setup();
// // //                 driver = new FirefoxDriver();
// // //                 return "firefox";
// // //             } catch (Exception eFirefox) {
// // //                 // If Firefox setup fails, try setting up for Edge
// // //                 try {
// // //                     WebDriverManager.edgedriver().setup();
// // //                     driver = new EdgeDriver();
// // //                     return "edge";
// // //                 } catch (Exception eEdge) {
// // //                     // If Edge setup fails, try setting up for Internet Explorer
// // //                     try {
// // //                         WebDriverManager.iedriver().setup();
// // //                         driver = new InternetExplorerDriver();
// // //                         return "ie";
// // //                     } catch (Exception E) {
// // //                         // If none of the above work, you can handle it accordingly
// // //                         return "Cannot Detect Browser!";
// // //                     }
// // //                 }
// // //             }
// // //         } finally {
// // //             if (driver != null) {
// // //                 driver.quit();
// // //             }
// // //         }
// // //     }
    
// // // }

// // import org.junit.jupiter.api.Test;
// // import org.openqa.selenium.By;
// // import org.openqa.selenium.WebDriver;
// // import org.openqa.selenium.WebElement;
// // import org.openqa.selenium.chrome.ChromeDriver;

// // import static org.junit.jupiter.api.Assertions.assertEquals;

// // public class RegistrationFormTest {
// //     @Test
// //     public void testRequiredFields() {
// //       //  System.setProperty("webdriver.chrome.driver");
// //         WebDriver driver = new ChromeDriver();
// //         driver.get("src/main/java/com/example/Forms.html");

// //         WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
// //         submitButton.click();

// //         String alertText = driver.switchTo().alert().getText();
// //         assertEquals("Please fill in all required fields.", alertText);

// //         driver.quit();
// //     }

// //     @Test
// //     public void testEmailFormat() {
// //       //  System.setProperty("webdriver.chrome.driver");
// //         WebDriver driver = new ChromeDriver();
// //         driver.get("src/main/java/com/example/Forms.html");

// //         WebElement nameInput = driver.findElement(By.id("name"));
// //         nameInput.sendKeys("John Doe");

// //         WebElement emailInput = driver.findElement(By.id("email"));
// //         emailInput.sendKeys("invalidemail");

// //         WebElement passwordInput = driver.findElement(By.id("password"));
// //         passwordInput.sendKeys("password123");

// //         WebElement genderSelect = driver.findElement(By.id("gender"));
// //         genderSelect.sendKeys("Male");

// //         WebElement birthdateInput = driver.findElement(By.id("birthdate"));
// //         birthdateInput.sendKeys("1990-01-01");

// //         WebElement termsCheckbox = driver.findElement(By.id("terms"));
// //         termsCheckbox.click();

// //         WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
// //         submitButton.click();

// //         String alertText = driver.switchTo().alert().getText();
// //         assertEquals("Please enter a valid email address.", alertText);

// //         driver.quit();
// //     }

// //     // Add more test cases as needed
// // }

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

public class FormValidationTest {

    private WebDriver webDriver;

    @BeforeEach
    public void setUp() {
        String browserName = BrowserUtils.getWebDriverName();

        switch (browserName) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("headless");
                webDriver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("-headless");
                webDriver = new FirefoxDriver(firefoxOptions);
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--headless");
                webDriver = new EdgeDriver(edgeOptions);
                break;

            case "ie":
                WebDriverManager.iedriver().setup();
                InternetExplorerOptions ieOptions = new InternetExplorerOptions();
                ieOptions.addCommandSwitches("-headless");
                webDriver = new InternetExplorerDriver(ieOptions);
                break;

            default:
                throw new IllegalArgumentException("Unsupported browser: " + browserName);
        }
    }

    File file = new File("src/main/java/com/revature/Forms.html");
    String path = "file://" + file.getAbsolutePath();

    @Test
    public void testFormSubmission() {

        webDriver.get(path);

        // Locate the form elements and fill them out
        webDriver.findElement(By.id("name")).sendKeys("John Doe");
        webDriver.findElement(By.id("email")).sendKeys("john.doe@example.com");
        webDriver.findElement(By.id("password")).sendKeys("password123");
        webDriver.findElement(By.id("gender")).sendKeys("Male");
        webDriver.findElement(By.id("birthdate")).sendKeys("1990-01-01");
        webDriver.findElement(By.id("terms")).click();

        // Submit the form
        webDriver.findElement(By.xpath("//input[@type='submit']")).click();

        // Validate the form submission
        assertTrue(webDriver.getCurrentUrl().contains("success"), "Form should be submitted successfully");
    }

    @Test
    public void testFormValidation() {

        webDriver.get(path);

        // Locate and fill out the name field
        WebElement nameField = webDriver.findElement(By.id("name"));
        nameField.sendKeys("Jane Doe");
        nameField.clear();
        nameField.sendKeys("Jane Doe");

        // Locate and fill out the email field
        WebElement emailField = webDriver.findElement(By.id("email"));
        emailField.sendKeys("jane.doe@example.com");
        emailField.clear();
        emailField.sendKeys("jane.doe@example.com");

        // Locate and fill out the password field
        WebElement passwordField = webDriver.findElement(By.id("password"));
        passwordField.sendKeys("password123");
        passwordField.clear();
        passwordField.sendKeys("password123");

        // Locate and select gender
        WebElement genderField = webDriver.findElement(By.id("gender"));
        genderField.sendKeys("Female");

        // Locate and fill out the birthdate field
        WebElement birthdateField = webDriver.findElement(By.id("birthdate"));
        birthdateField.sendKeys("1995-05-15");

        // Locate and check the terms checkbox
        WebElement termsCheckbox = webDriver.findElement(By.id("terms"));
        termsCheckbox.click();

        // Ensure all form elements are filled out correctly
        assertEquals("Jane Doe", nameField.getAttribute("value"));
        assertEquals("jane.doe@example.com", emailField.getAttribute("value"));
        assertEquals("password123", passwordField.getAttribute("value"));
        assertEquals("Female", genderField.getAttribute("value"));
        assertEquals("1995-05-15", birthdateField.getAttribute("value"));
        assertTrue(termsCheckbox.isSelected());

        // Submit the form
        webDriver.findElement(By.xpath("//input[@type='submit']")).click();

        // Validate the form submission
        assertTrue(webDriver.getCurrentUrl().contains("success"), "Form should be submitted successfully");
    }

    @AfterEach
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}

class BrowserUtils {
    public static String getWebDriverName() {
        String[] browsers = { "chrome", "firefox", "edge", "ie" };

        for (String browser : browsers) {
            try {
                switch (browser) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        new ChromeDriver().quit();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        new FirefoxDriver().quit();
                        break;
                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        new EdgeDriver().quit();
                        break;
                    case "ie":
                        WebDriverManager.iedriver().setup();
                        new InternetExplorerDriver().quit();
                        break;
                }
                return browser;
            } catch (Exception e) {
                continue;
            }
        }
        return "Unsupported Browser";
    }
}
