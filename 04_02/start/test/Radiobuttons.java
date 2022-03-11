import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement button1 = driver.findElement(By.id("radio-button-1"));
        button1.click();
        WebElement button2 = driver.findElement(By.cssSelector("input[value='option2']"));
        button2.click();
        WebElement button3 = driver.findElement(By.cssSelector("input[value='option3']"));
        button3.click();
        //Using Xpath if there is no values or ids
        //driver.findElement(By.xpath("/html/body/div/div[3]/input");
        WebDriver driver1 = new ChromeDriver();

        driver1.get("https://formy-project.herokuapp.com/checkbox");
        WebElement checkbox1 = driver1.findElement(By.id("checkbox-1"));
        checkbox1.click();
        WebElement checkbox2 = driver1.findElement(By.id("checkbox-2"));
        checkbox2.click();
        WebElement checkbox3 = driver1.findElement(By.id("checkbox-3"));
        checkbox3.click();

        driver.quit();
    }
}
