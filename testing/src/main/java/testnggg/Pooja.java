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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pooja {
	WebDriver driver;
	@Test(dataProvider ="log",dataProviderClass =Poojadata.class  )
	
	public void Dataset(String user,String pass) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(user);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pword']")).sendKeys(pass);
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		String url=driver.getCurrentUrl();
		assertEquals("http://poojastore.marolix.com/Admin/Dashboard", url,"Failed test case due to credentials");
		//assertEquals(null, false)
	}
//	@DataProvider(name="logdata")
//	
//	public Object[][] logindata() 
//	{
//		Object[][] data=new Object[3][2];
//		data[0][0]="pooja132@gmail.com";
//		data[0][1]="1234";
//		data[1][0]="pooja@gmail";
//		data[1][1]="jhvsefj";
//		data[2][0]="";
//		data[2][1]="";
//		return data;
//	}
	@AfterMethod
	public void close() {driver.quit();}

}
