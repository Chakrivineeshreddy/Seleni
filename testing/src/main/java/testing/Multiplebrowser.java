package testing;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiplebrowser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser=sc.next();
		if(browser.equals("chrome"))
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.nextgenerationautomation.com/post/selenium-coding-exercises");
		}
		else if(browser.equals("edge"))
		{
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}
	

	}

}
