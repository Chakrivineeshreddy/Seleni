package task;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilovepdfc {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ilovepdf.com/word_to_pdf");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();

		Robot rb = new Robot();

		rb.delay(2000);
		
		
		StringSelection ss=new StringSelection("C:\\Users\\chakr\\Desktop\\Chakrivineesh(MT-01196).docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}