package actions;




import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Calanderr {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("second_date_picker")).click();
//		String day="21";
//		String month="january";
//		String year="2024";
		while (true) {
			String calender = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String[] cal = calender.split(" ");
			String months = cal[0];
			String years = cal[1];
			if (months.equalsIgnoreCase("january") && years.equalsIgnoreCase("2024")) {
				break;

			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}

		}

		List<WebElement> day = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for (WebElement days : day) {
			if (days.getText().equalsIgnoreCase("25")) {
				days.click();
				break;
			}
		}
		//third calendar 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.id("fourth_date_picker")).click();
		WebElement mon=driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select date=new Select(mon);
		date.selectByVisibleText("Apr");
		WebElement yea=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select years=new Select(yea);
		years.selectByVisibleText("2025");
		List<WebElement> dayss = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for (WebElement days : dayss) {
			if (days.getText().equalsIgnoreCase("30")) {
				days.click();
				break;
			}
		}
	}

}
