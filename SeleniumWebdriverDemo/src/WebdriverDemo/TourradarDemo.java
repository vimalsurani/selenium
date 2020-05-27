package WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TourradarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		driver.get("https://www.tourradar.com/login");
		driver.findElement(By.xpath("//*[@class='b-lnk last']/a")).click();
	//* driver.findElement(By.xpath("//*[@class='marg-top-10']//div[2]/label")).click();
	//*	driver.findElement(By.xpath("//*[@id='g_oper_chosen']/a/span")).sendKeys("Taj Voyages Tours");
		
		driver.findElement(By.xpath("//*[@id='g_name']")).sendKeys("Vimal Patel");
		driver.findElement(By.xpath("//*[@id='g_email']")).sendKeys("vimal@gmail.com");
		driver.findElement(By.xpath("//*[@id='g_password_1']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='g_password_2']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='g_send']")).clear();
	}

}
