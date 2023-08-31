package listnerss;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ScreenshotListener implements ITestListener {

    private WebDriver driver;

    public void onTestFailure(ITestResult result) {
        Object testClass = result.getInstance();
        driver = ((YourTestClass) testClass).getDriver();
        if (driver instanceof TakesScreenshot) {
            captureScreenshot(result.getName());
            System.out.println(result.getName());
        }
    }

    private void captureScreenshot(String testName) {
        if (driver != null) {
          //  byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            // Save or process the screenshotBytes as needed
        	try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File destinationFile = new File("./target/capture.png");
                Files.copy(screenshotFile.toPath(), destinationFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
                Reporter.log("Screenshot saved: " + destinationFile.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

