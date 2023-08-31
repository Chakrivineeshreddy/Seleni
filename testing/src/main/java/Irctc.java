import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class Irctc {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String w1=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class='search_btn loginText ng-star-inserted']")).click();
		Set<String> handles=driver.getWindowHandles();
		for(String han:handles)
		{
			if(!w1.equals(han))
			{
				driver.switchTo().window(han);
				break;
			}
		}
		driver.findElement(By.id("disha-banner-close")).click();
		String str="vineesh286";
		driver.findElement(By.xpath("//input[@class='form-control input-box ng-pristine ng-valid ng-touched']")).sendKeys(str);
		driver.findElement(By.xpath("//input[@class='form-control input-box ng-untouched ng-pristine ng-valid']")).sendKeys("Vishnu@1969");
		File captcha=driver.findElement(By.xpath("//img[@class='captcha-img']")).getScreenshotAs(OutputType.FILE);
	    File trg=new File("C:\\Users\\chakr\\Desktop\\Team 3\\captch.png");
	    FileUtils.copyFile(captcha, trg);
	    ITesseract image=new Tesseract();
	    image.setDatapath("C:\\Users\\chakr\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
	    String cap=image.doOCR(trg);
	    driver.findElement(By.id("captcha")).sendKeys(cap);
	    System.out.println(cap);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();

	}

}
