package task;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhi {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("source")).sendKeys("Guduru");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Guduru (Nellore District)']")).click();
//		List<WebElement> gudur=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']"));
//		Thread.sleep(3000);
//		//System.out.println(gudur.size());
//		for(WebElement gud:gudur)
//		{
//			System.out.println(gud.getText());
//			
//			if(gud.getText().equals("Guduru (Nellore District)"))
//			{
//				//System.out.println(gud.getText());
//				gud.click();
//
//			}
//		}
		driver.findElement(By.id("destination")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//li[text()='Hyderabad']")).click();
		driver.findElement(By.id("datepicker1")).click();
		List<WebElement> date=driver.findElements(By.xpath("//td[@data-month='7']"));
		for(WebElement dat:date)
		{
			//System.out.println(dat.getText());
			if(dat.getText().equalsIgnoreCase("19"))
			{
				dat.click();
				break;
			}
		}
		Thread.sleep(3000);
		WebElement sear= driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']"));
		sear.click();
		//Filters
		driver.findElement(By.id("bustypeAC")).click();
		driver.findElement(By.id("Bustypes3")).click();
		//driver.findElement(By.id("startTime4")).click();
		List<WebElement> bus=driver.findElements(By.xpath("//div[@class='travele clearfix rSet ng-scope']"));
		List<WebElement> seat=driver.findElements(By.xpath("//a[@class='btn-seatselect book1']"));
		System.out.println(seat.size());
//		String bustext = "";
//		for(WebElement buses:bus)
//		{
////			bustext=bustext+buses.getText();
//			if(buses.getText().contains("VIKRAM TRAVELS"))
//			{
//			 driver.findElement(By.id("1615147596")).click();
//			}
//		}
//		//System.out.println(bustext);
//		//System.out.println(bus.size());
////		String[] bussplit = bustext.split(" ");
////		//String my="1360";
////		//System.out.println(bussplit);
////		for(int i=0;i<bussplit.length;i++)
////		{
////			if(bussplit[i].contains("VIKRAM"))
////			{
////			 driver.findElement(By.id("1615147596")).click();
////			}
////		}
//		//WebElement selectseat=driver.findElement(By.id("1615147596"));
////		for(String bu:bussplit)
////		{
////			if(bu.get.equals(my)) 
////			{
////				System.out.println("hello");
////			}
////		
////		}
//		
////		driver.findElement(By.id("1615147596")).click();
//		driver.findElement(By.id("UO10-7ZZ")).click();
//		WebElement boarding=driver.findElement(By.id("boardingpoint_id"));
//		Select sec=new Select(boarding);
//		sec.selectByIndex(1);
//		WebElement drop=driver.findElement(By.id("droppingpoint_id"));
//		Select dr=new Select(drop);
//		dr.selectByVisibleText("Kukatpally ( VAN PICKUP)-08:10");
//		Thread.sleep(5000);
//		//driver.findElement(By.id("btnEnable1")).click();
		
		
       
	}

}
