package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttonenable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.id("enable-button")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement element=driver.findElement(By.id("disable"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		//element.click();
		System.out.println(element.isEnabled());
		
		

	}

}
