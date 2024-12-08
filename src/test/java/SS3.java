import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SS3 {
    WebDriver driver;
    String baseUrl = "https://www.demo.guru99.com/V4/";

    @BeforeTest
    public void prepare() {
        System.setProperty("web driver.gecko.driver", "D:\\geckodriver-v0.35.0-win32\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test (priority = 0)
    public void launchBrowser() {
        driver.get(baseUrl);
    }


    @Test (priority = 1)
    public void EnterUsername() {
        driver.findElement(By.name("uid")).sendKeys("mngr603525");
    }

    @Test (priority = 2)
    public void enterPassword() {
        driver.findElement(By.name("password")).sendKeys("A445500");
    }
    @Test (priority = 3)
    public void clickLogin() {
        driver.findElement(By.name("btnLogin")).click();
    }

}


