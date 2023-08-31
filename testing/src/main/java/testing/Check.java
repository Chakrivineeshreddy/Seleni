package testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Check {
@Test
	public void check1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());
		driver.close();
		//driver.get("http://poojastore.marolix.com/");

	}

}
