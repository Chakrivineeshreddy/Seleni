package task;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Itera {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("name")).sendKeys("Harish");
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		driver.findElement(By.id("email")).sendKeys("harishjohn@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12234");
		driver.findElement(By.id("address")).sendKeys("flat no:1 hyderbad");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.id("male")).click();
		List<WebElement> days=driver.findElements(By.xpath("//input[@class='form-check-input']"));
		for(int i=3;i<days.size()-2;i++)
		{
			days.get(i).click();
			
		}
////		driver.findElement(By.id("tuesday")).click();
////		driver.findElement(By.id("friday")).click();
		WebElement dropdown= driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(2);
		driver.findElement(By.xpath("//label[@for='1year']")).click();
		List<WebElement> tools=driver.findElements(By.xpath("//label[@class='custom-control-label']"));
		//System.out.println(tools.size());

		for(WebElement too:tools)
		{
			if(!(too.getText().equals("Selenium Webdriver")||too.getText().equals("TestNG")))
			{
				too.click();
			}
		}

		
//		driver.findElement(By.xpath("//label[text()='Selenium Webdriver']")).click();
//		driver.findElement(By.xpath("//label[text()='TestNG']")).click();
		driver.findElement(By.id("inputGroupFile02")).click();
		Robot robo=new Robot();
		robo.delay(3000);
		StringSelection upload=new StringSelection("C:\\Users\\chakr\\Desktop\\Chakrivineesh(MT-01196).docx\\");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upload, upload);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		

		
		
	}

}
	
