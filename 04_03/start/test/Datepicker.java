import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("03/12/2020");
        date.sendKeys(Keys.RETURN);

        driver.quit();
    }
}