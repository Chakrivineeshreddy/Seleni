import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class textconversion {
public static void main(String[] args) throws Throwable {
//	       ITesseract image=new Tesseract();
//	       image.setDatapath("C:\\Users\\chakr\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
//	       String str=image.doOCR(new File("C:\\Users\\chakr\\Downloads\\1_klTODXvF6Zjh3SRpOdIpbA.png"));
//	       System.out.println(str);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://e-quarz.com/");
	//Banner element
	driver.findElement(By.xpath("//button[@class='close __close']")).click();
	//signin elements
    WebElement log=driver.findElement(By.xpath("//a[@class='navbar-tool ml-md-3']"));
    Actions ac=new Actions(driver);
    ac.moveToElement(log).build().perform();
    driver.findElement(By.xpath("//i[@class='fa fa-sign-in mr-2']")).click();
    //login credentials
    driver.findElement(By.id("si-email")).sendKeys("chakrivineesh@gmail.com");
    driver.findElement(By.id("si-password")).sendKeys("Vishnu@1969");
    File captcha=driver.findElement(By.id("default_recaptcha_id")).getScreenshotAs(OutputType.FILE);
    File trg=new File("C:\\Users\\chakr\\Desktop\\Team 3.captch.png");
    FileHandler.copy(captcha, trg);
    ITesseract image=new Tesseract();
    image.setDatapath("C:\\Users\\chakr\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
    String cap=image.doOCR(trg);
    System.out.println(cap);
	    }
}

