import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Liam");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Gallagher");
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Player Manager");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-3"));
        driver.findElement(By.cssSelector("option[value='2']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("12/04/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
        String alertText = alert.getText();
        assertEquals("The form was successfully submitted!", alertText);



        driver.quit();
    }

    private static void assertEquals(String s, String alertText) {
        if (s.equals(alertText)){
            System.out.println("Form successfully submitted");
        }
        else System.out.println("Form not submitted");
    }
}
