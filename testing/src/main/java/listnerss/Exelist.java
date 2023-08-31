package listnerss;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IExecutionListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Exelist extends Exemp implements IExecutionListener,ITestListener{
	//WebDriver driver; 
	
	public void onExecutionStart()
	{
		WebDriver driver; 
		//long endTime= System.currentTimeMillis();
		System.out.println("Start of execution");
		
	}
	
	public void onExecutionFinish(ITestResult result)
	{
//		System.out.println("123456y");
//		 Object testClass = result.getInstance();
//		driver = ((Exemp) testClass).getDriver();
//		String url=driver.getCurrentUrl();
//		assertEquals("http://admin.hospiol.com/admin/admin/dashboard", url);
//		driver.close();
		//long startTime= System.currentTimeMillis();
		
		System.out.println("End of execution");
		//driver.quit();
	}

	

}
