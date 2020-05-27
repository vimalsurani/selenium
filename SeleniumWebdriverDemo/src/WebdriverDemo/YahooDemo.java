package WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		driver.get("https://yahoo.com/");
		
		driver.findElement(By.xpath("//*[@id='header-profile-menu']/a")).click();
		driver.findElement(By.xpath("//*[@class='bottom-links-container']/p/a")).click();
		
	}

}


