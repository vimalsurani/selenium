package WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redditDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		/*
		//* Sign In Page
		driver.findElement(By.xpath("//*[@class='signin']")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("vimalsurani");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("vimalsurani");
		driver.findElement(By.xpath("//*[@name='proceed']")).click();
		driver.findElement(By.xpath("//*[@class='create-new-account']/a")).click();
		*/
		
		//* Create Account Page
		driver.findElement(By.xpath("//*[@title='Create Rediffmail Account']")).click();
		driver.findElement(By.xpath("//*[starts-with(@name,'name')]")).sendKeys("Vimal Patel");
		driver.findElement(By.xpath("//*[starts-with(@name,'login')]")).sendKeys("VimalPatel");
		driver.findElement(By.xpath("//*[starts-with(@name,'btnchkavail')]")).click();
		driver.findElement(By.xpath("//*[starts-with(@name,'passwd')]")).sendKeys("VimalPatel");
		driver.findElement(By.xpath("//*[starts-with(@name,'confirm_passwd')]")).sendKeys("VimalPatel");
		driver.findElement(By.xpath("//*[starts-with(@name,'altemail')]")).sendKeys("vimal.patel@gmail.com");
		driver.findElement(By.xpath("//*[starts-with(@name,'mobno')]")).sendKeys("9724901662");
		driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Day')]")).sendKeys("11");
		driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Month')]")).sendKeys("SEP");
		driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Year')]")).sendKeys("2020");
		driver.findElement(By.xpath("//*[@value='f']")).click();
		driver.findElement(By.xpath("//*[starts-with(@name,'country')]")).sendKeys("Anguilla");
		driver.findElement(By.xpath("//*[@class='captcha']")).sendKeys("78595");
		//*driver.findElement(By.xpath("//*[@id='Register']")).click();
		driver.navigate().back();
		
		/*
		
		driver.findElement(By.xpath("//*[@class='navbar cor_margin']/ul/li[2]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@class='navbar cor_margin']/ul/li[3]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@class='navbar cor_margin']/ul/li[4]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@class='navbar cor_margin']/ul/li[5]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@class='navbar cor_margin']/ul/li[6]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@class='navbar cor_margin']/ul/li[7]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@class='navbar cor_margin']/ul/li[8]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@class='navbar cor_margin']/ul/li[9]/a")).click();
		driver.navigate().back();
		
		
		*/
		
		
	}
	
}
