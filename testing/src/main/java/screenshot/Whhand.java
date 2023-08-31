package screenshot;

import java.time.Duration;
import java.util.Set;

import org.asynchttpclient.netty.request.NettyRequestSender;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whhand {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String window1=driver.getWindowHandle();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles=driver.getWindowHandles();
		for(String hand:handles)
		{
			System.out.println(hand);
			if(!window1.equals(hand))
			{
				driver.switchTo().window(hand);
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				driver.findElement(By.id("firstName")).sendKeys("hello");
			}
		}
		driver.switchTo().window(window1);
		driver.findElement(By.id("name")).sendKeys("122345");
		

	}

}
