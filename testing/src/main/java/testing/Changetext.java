package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Changetext {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.id("populate-text")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		System.out.println(driver.findElement(By.id("h2")).isDisplayed());
		

	}

}
