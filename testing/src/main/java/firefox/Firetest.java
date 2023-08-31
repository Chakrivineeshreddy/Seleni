package firefox;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Firetest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		al.accept();
		driver.findElement(By.id("confirmButton")).click();
		al.dismiss();
		driver.findElement(By.id("promtButton")).click();
		al.sendKeys("hello");
		Thread.sleep(5000);
		al.accept();
	

	}

}
