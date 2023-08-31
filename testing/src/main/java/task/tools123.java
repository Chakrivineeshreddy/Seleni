package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tools123 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		List<WebElement> tools=driver.findElements(By.xpath("//label[@class='custom-control-label']"));
		//System.out.println(tools.size());
		
		for(WebElement too:tools)
		{
			if(too.getText().equals("Selenium Webdriver"))
			{
				too.click();
			}
		}
//		for(int j=4;j<=tools.size()-1;j++) 
//		{
//			
//			if()
//			{
//				tools.get(j).click();
//			}
//		}

	}

}
