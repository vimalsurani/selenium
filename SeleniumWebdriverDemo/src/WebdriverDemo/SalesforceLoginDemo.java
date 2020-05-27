package WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceLoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
		//*[@id='username'] 
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
		//*[@id='password']
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
		//#Login
		driver.findElement(By.cssSelector("#Login")).click();
	}
	

}
