package WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("vimalpatel@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("vimalpatel");
		driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("Vimal");
		driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys("Patel");
		driver.findElement(By.xpath("//*[@id='u_0_r']")).sendKeys("97524901662");
		driver.findElement(By.xpath("//*[@id='u_0_w']")).sendKeys("123456");
				
		driver.findElement(By.xpath("//*[@id='day']")).sendKeys("25");
		driver.findElement(By.xpath("//*[@id='month']")).sendKeys("Aug");
		driver.findElement(By.xpath("//*[@id='year']")).sendKeys("1990");
		driver.findElement(By.xpath("//*[@id='u_0_7']")).click();
		driver.findElement(By.xpath("//*[@id='u_0_13']")).click();
	
	}

}
