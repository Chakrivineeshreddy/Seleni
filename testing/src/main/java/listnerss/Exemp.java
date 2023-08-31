package listnerss;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exemp {
	WebDriver driver;
@Test
public void Ch() throws Throwable
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://hospiol.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='theme_btn theme_btn_bg'][1]")).click();
	driver.findElement(By.id("email")).sendKeys("abhishek@marolix.com");
	
	driver.findElement(By.id("password")).sendKeys("Reset@123");
	
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(2000);
	//String url=driver.getCurrentUrl();
	//assertEquals("http://admin.hospiol.com", url);
	
	//driver.close();
	//driver.findElement(By.className("topuser-image")).click();
	
}

public WebDriver getDriver() {
    return driver;
}
}
