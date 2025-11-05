package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    private Driver(){

    }


    public static WebDriver getDriver(){

        String usedBrowser = ConfigReader.getProperty("browser");

        if(driver == null){

            switch (usedBrowser){

                case "edge" :
                    driver = new EdgeDriver();
                    break;

                case "safari":
                    driver = new SafariDriver();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();

                default:
                    driver = new ChromeDriver();

            }


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        }

        return driver;
    }

    public static void quitDriver(){
        driver.quit();
        driver = null;
    }
}
