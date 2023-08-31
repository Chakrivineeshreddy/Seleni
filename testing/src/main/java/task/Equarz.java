package task;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class Equarz {

	public static void main(String[] args) throws Throwable {
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
	    Thread.sleep(15000);
	    driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	    //categories
	    WebElement tv=driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
	    ac.moveToElement(tv).build().perform();
	    WebElement wash=driver.findElement(By.xpath("//span[text()='Kitchen storage & Containers']"));
	    ac.moveToElement(wash).build().perform();
	    driver.findElement(By.xpath("//a[@href='http://e-quarz.com/products?id=370&data_from=category&page=1']")).click();
	    //product selection
	    driver.findElement(By.xpath("//a[@href='http://e-quarz.com/product/signoraware-charger-stainless-steel-protein-shaker-bottle-for-pre-post-workout-water-bottle-leakproof-with-knob-500ml-mu']")).click();
	    //Add to cart button
	    driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	   // driver.findElement(By.xpath("//span[text()='Buy now']")).click();
	    //mycart Actions
	    WebElement mycart=driver.findElement(By.xpath("//a[@class='navbar-tool-text ml-2']"));
	    ac.moveToElement(mycart).build().perform();
	    //checkout button
	    driver.findElement(By.xpath("//a[@class='btn btn--primary btn-sm btn-block']")).click();
	    //shipping dropdown
	    WebElement shipping=driver.findElement(By.xpath("//select[@class='form-control']"));
	    Select sc=new Select(shipping);
	    sc.selectByIndex(1);
	    //Checkout
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	    WebElement check=driver.findElement(By.xpath("//a[@class='btn btn--primary pull-right']"));
	    wait.until(ExpectedConditions.elementToBeClickable(check));
	    check.click();
	    //shipping address checkbox
	    driver.findElement(By.id("same_as_shipping_address")).click();
	    //proceed to payment
	    driver.findElement(By.xpath("//i[@class='czi-arrow-right mt-sm-0 mx-1']")).click();
	    //cod button
	    driver.findElement(By.id("cod-for-cart")).click();
	    
	    
		

	}

}
