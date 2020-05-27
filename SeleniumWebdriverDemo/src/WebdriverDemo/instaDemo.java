package WebdriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class instaDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		// Implicitwait
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  /*	
	   // Explicit WebDriver Wait
		WebDriverWait wait = new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("vimalsurani");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("vimalsurani");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	  */
		
		
		// Explicit Fluent Wait
		FluentWait <WebDriver> fwait = new FluentWait<WebDriver> (driver)
				.withTimeout(20,TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS);
		
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("vimalsurani");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("vimalsurani");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		

   }
}