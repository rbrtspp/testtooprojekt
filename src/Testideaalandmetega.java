import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testideaalandmetega {
    WebDriver driver;

    public void launchBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Roberta\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.lhv.ee/et/liising#monthly-payment");

        var inputField1 = driver.findElement(By.id("price"));
        inputField1.clear();
        inputField1.sendKeys("7500");

        var inputField2 = driver.findElement(By.id("interest_rate"));
        inputField2.sendKeys("6");
    }

    public static void main(String[] args) {
        Testideaalandmetega obj = new Testideaalandmetega();
        obj.launchBrowser();
    }
}