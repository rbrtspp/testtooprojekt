import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Test0andmetega {
    WebDriver driver;

    public void launchBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Roberta\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.lhv.ee/et/liising#monthly-payment");
        
       
        var inputField1 = driver.findElement(By.id("price"));

        inputField1.clear();

        var inputField2 = driver.findElement(By.id("initial"));

        inputField2.clear();
        
        var inputField3 = driver.findElement(By.id("interest_rate"));

        inputField3.clear();
       
        var inputField4 = driver.findElement(By.id("reminder"));

        inputField4.clear();
        
       
    }

    public static void main(String[] args) {
        Test0andmetega obj = new Test0andmetega();
        obj.launchBrowser();
    }
}