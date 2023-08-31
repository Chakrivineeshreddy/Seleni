package listnerss;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.annotations.*;
import org.testng.xml.XmlTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YourTestClass implements ITest {

    private WebDriver driver;
    private String testName;

    @BeforeMethod
    public void setup(Method method, XmlTest xmlTest) {
    	WebDriverManager.chromedriver().setup();  
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        testName = xmlTest.getName() + "." + method.getName();
        System.out.println(xmlTest.getName());
        System.out.println("______________");
        System.out.println(method.getName());
    }

    @Test
    public void testMethod1() {
        driver.get("https://www.example.com");
        // Perform test actions
    }

    @Test
    public void testMethod2() throws Throwable {
    	
    	driver.get("http://hospiol.com/");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//a[@class='theme_btn theme_btn_bg'][1]")).click();
    	driver.findElement(By.id("email")).sendKeys("abhishek@marolix.com");
    	
    	driver.findElement(By.id("password")).sendKeys("Reset@123");
    	
    	driver.findElement(By.tagName("button")).click();
    	Thread.sleep(2000);
    	String url=driver.getCurrentUrl();
    	assertEquals("http://admin.hospiol.com", url);
    	
    	driver.close();
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public String getTestName() {
        return testName;
    }

    public WebDriver getDriver() {
        return driver;
    }
}

