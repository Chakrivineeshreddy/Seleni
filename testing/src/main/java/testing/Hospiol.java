package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hospiol {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://hospiol.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='theme_btn theme_btn_bg'][1]")).click();
		driver.findElement(By.id("email")).sendKeys("abhishek@marolix.com");
		
		driver.findElement(By.id("password")).sendKeys("Reset@123");
		
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.className("topuser-image")).click();
		
		//driver.findElement(By.xpath("//a[@class='pull-right']")).click();
	}

}
