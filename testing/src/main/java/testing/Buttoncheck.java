package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttoncheck {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.id("checkbox")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement element=driver.findElement(By.id("ch"));
		wait.until(ExpectedConditions.elementToBeSelected(element));
		//element.click();
		System.out.println(element.isSelected());

	}

}
