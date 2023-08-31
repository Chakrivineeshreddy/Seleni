package equarz;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EquarzLogin {
	WebDriver driver;
	@BeforeMethod
	public void url() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://e-quarz.com/admin/auth/login");
	}
	@Test(dataProvider ="logdata",dataProviderClass = Equarzlogdata.class)
	public void login(String username,String password) throws Throwable 
	{
	    //login credentials
	    driver.findElement(By.id("signinSrEmail")).sendKeys(username);
	    driver.findElement(By.id("signupSrPassword")).sendKeys(password);
	    Thread.sleep(15000);
	    driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn--primary']")).click();
	    String url=driver.getCurrentUrl();
	    AssertJUnit.assertEquals(url, "http://e-quarz.com/admin");
	}
	@AfterMethod
	public void shutdown()
	{
		driver.close();
	}
	

}
