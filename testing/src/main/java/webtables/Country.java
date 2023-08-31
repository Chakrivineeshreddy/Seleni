package webtables;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Country {
	WebDriver driver;
//	  @Test
//	  public void f() throws Exception {
//		  
//		  
//	WebDriver driver;
//		  
//		  
//		  driver = new ChromeDriver();
//		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		  
//		  driver.get("https://demo.guru99.com/test/web-table-element.php"); // By using Xpath with index we have to find elements in web tables
//		  
//		 //no.of columns
//		  List col =driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
//		  System.out.println("No col's are :" + col.size());
//		  
//		  List rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
//		  System.out.println("No Rows are : "+ rows.size() );
//	  }
		  
	  @Test
		  public void webtabletest () throws Throwable {
	 
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.manage().window().maximize();
		  
		  driver.get("https://cosmocode.io/automation-practice-webtable/");
		  Thread.sleep(3000);
//		  JavascriptExecutor js=(JavascriptExecutor)driver;
//		  js.executeScript("window.scrollBy(0,1700)");
		  
		  List<WebElement> rows = driver.findElements(By.xpath("//*[@id='countries']/tbody/tr"));
		  int rowCount= rows.size();
		  //System.out.println(rowCount);
		  
		  String beforeXpathcountry ="//*[@id='countries']/tbody/tr[";
		  String afterXpathcountry  = "]";
		  String beforeXpathcheck ="//*[@id='countries']/tbody/tr[";
		  String afterXpathcheck  = "]/td[1]/input";
		  
		  for (int i =2; i<rowCount;i++ ) {
			  String ActualXpath= beforeXpathcountry + i + afterXpathcountry;
			  
			   WebElement element = driver.findElement(By.xpath(ActualXpath));
			  // System.out.println(element.getText());
			   
	
			   if(element.getText().contains("India"))
			   {
				   String actualcheck=beforeXpathcheck+i+afterXpathcheck;
				   WebElement check=driver.findElement(By.xpath(actualcheck));
				   check.click();
				   System.out.println(element.getText());
				   break;
			   }
			   
		  }
		  
		  
			
		  }
	}

		  
		  
	  




