package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement dropdown= driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select sec=new Select(dropdown);
		//sec.selectByIndex(5);
		//sec.selectByVisibleText("Greece");
		sec.selectByValue("6");

	}

}
