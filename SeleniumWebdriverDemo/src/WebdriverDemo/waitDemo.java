package WebdriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@title='Create Rediffmail Account']")).click();
		
	  
		// Explicit WebDriver Wait
		WebDriverWait wait = new WebDriverWait(driver,200);
		driver.findElement(By.xpath("//*[@id='country']")).sendKeys("India");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select")));
		driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select")).sendKeys("Delhi");
     
		// Explicit Fluent Wait
		FluentWait <WebDriver> fwait = new FluentWait<WebDriver> (driver)
				.withTimeout(20,TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='country']")).sendKeys("India");
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select")));
		driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select")).sendKeys("Delhi");
		
	}

}











