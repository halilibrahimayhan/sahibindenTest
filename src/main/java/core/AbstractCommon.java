package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class AbstractCommon {
    public static WebDriver driver;
    public void createBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //String url="http://192.168.1.34:5555/wd/hub";
        String url="http://localhost:4444/wd/hub";
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

    public void quitBrowser()
    {
        System.out.println("Title is: "+driver.getTitle());
        driver.quit();
    }

}
