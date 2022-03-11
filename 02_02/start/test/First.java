import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");
        driver.findElement(By.name("btnK")).click();

    }
}
