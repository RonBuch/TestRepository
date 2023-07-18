import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class Test {

    private WebDriver driver;




    @BeforeEach
    public void start () throws InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("unexpectedAlertBehaviour", "dismiss");
        driver = new ChromeDriver();
        System.out.println(((HasCapabilities) driver).getCapabilities());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }

    @org.junit.jupiter.api.Test
    public void myFirstTest ( ){
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[@jscontroller = 'Y9t9Sc']")).click();
        driver.findElement(By.id("K32")).click();
    }

    @AfterEach
    public void close () {
        driver.quit();
        driver = null;
    }

}
