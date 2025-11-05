package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ReusableMethods {

    public static void wait(int second){

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            System.out.println("Thread.sleep exception!");
        }
    }

    public static void titleIleWindowsGecisi(WebDriver driver, String hedefWinTitle){

        Set<String> acikWindwsWHD = driver.getWindowHandles();
        for(String eachWhd: acikWindwsWHD){

            driver.switchTo().window(eachWhd);

            if (driver.getTitle().equals(hedefWinTitle)){
                break;
            }

        }

    }

    public static String reportPictureAttach (String testName ) throws IOException {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("_yyMMdd_HHmmss");
        String date = localDateTime.format(format);

        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File tempFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        String filePath = System.getProperty("user.dir") + "/test-output/Screenshots/" + testName + ".html";
        File pictureFile = new File(filePath);

        FileUtils.copyFile(tempFile, pictureFile);
        return filePath;
    }
}
