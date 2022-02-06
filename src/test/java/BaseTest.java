import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(TestResultLogger.class)
public class BaseTest{
    static WebDriver driver;

    @BeforeAll
    public static void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        String url="http://192.168.1.34:5555/wd/hub";
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setPlatform(Platform.WINDOWS);
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        options.merge(desiredCapabilities);

        try{
            driver =new RemoteWebDriver((new URL(url)),options);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
        driver.manage().window().maximize();


    }

    @AfterAll
    public void tearDown(){
        System.out.println("Title is: "+driver.getTitle());
        driver.quit();
    }

}
