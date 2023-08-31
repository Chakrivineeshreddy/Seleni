package testnggg;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Datapro {
	WebDriver driver;
	@BeforeMethod
	public void url() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@Test(dataProvider = "deta",dataProviderClass = Dataaaaa.class)
	public void Dataset(String username,String password) throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(username);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pword']")).sendKeys(password);
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		String link=driver.getCurrentUrl();
		AssertJUnit.assertEquals("http://poojastore.marolix.com/Admin/Dashboard", link);
	
			
		
		
	}

}
