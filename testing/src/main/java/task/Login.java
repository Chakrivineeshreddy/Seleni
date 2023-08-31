package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSfugyKsB9bOEN4KkbIrPqNB8id4f1aStHnTXGA_WGiNTbQJ3A/viewform");
		

	}

}
