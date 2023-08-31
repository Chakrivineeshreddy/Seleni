package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dycdrop {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("iphone");
		List<WebElement> phone= driver.findElements(By.xpath("//div[@class='ClJ9Yb']"));
		for(WebElement ph:phone) 
		{
			//System.out.println(ph.getText());
			if(ph.getText().equals("Apple iPhone 14 Pro Max")) 
			{
				Thread.sleep(3000);
				ph.click();
			}
		}

	}

}
