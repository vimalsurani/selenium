package WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoaut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		
        //* Login Page
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("*[name='password']")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		//*  Flight Details
		driver.findElement(By.xpath("//*[@value='oneway']")).click();
		driver.findElement(By.cssSelector("*[name='passCount']")).sendKeys("2");
		driver.findElement(By.xpath("//*[@name='fromPort']")).sendKeys("London");
		driver.findElement(By.xpath("//*[@name='fromMonth']")).sendKeys("August");
		driver.findElement(By.xpath("//*[@name='fromDay']")).sendKeys("20");
		driver.findElement(By.xpath("//*[@name='toPort']")).sendKeys("San Francisco");
		driver.findElement(By.xpath("//*[@name='toMonth']")).sendKeys("November");
		driver.findElement(By.xpath("//*[@name='toDay']")).sendKeys("19");
		
		//*Preferences
		driver.findElement(By.xpath("//*[@value='Business']")).click();
		driver.findElement(By.xpath("//*[@name='airline']")).sendKeys("Unified Airlines");
		driver.findElement(By.name("findFlights")).click();
		
		driver.findElement(By.cssSelector("input[value='Pangea Airlines$362$274$9:17']")).click();
		driver.findElement(By.cssSelector("input[value='Unified Airlines$633$303$18:44']")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
		//*Passengers
		driver.findElement(By.xpath("//*[@name='passFirst0']")).sendKeys("Vimal");
		driver.findElement(By.xpath("//*[@name='passLast0']")).sendKeys("Patel");
		driver.findElement(By.xpath("//*[@name='pass.0.meal']")).sendKeys("Diabetic");
		
		driver.findElement(By.xpath("//*[@name='passFirst1']")).sendKeys("Patel");
		driver.findElement(By.xpath("//*[@name='passLast1']")).sendKeys("Vimal");
		driver.findElement(By.xpath("//*[@name='pass.1.meal']")).sendKeys("Diabetic");
		
		
		//*Credit Card
		driver.findElement(By.xpath("//*[@name='creditCard']")).sendKeys("Visa");
		driver.findElement(By.xpath("//*[@name='creditnumber']")).sendKeys("4111111111111111");
		driver.findElement(By.xpath("//*[@name='cc_exp_dt_mn']")).sendKeys("05");
		driver.findElement(By.xpath("//*[@name='cc_exp_dt_yr']")).sendKeys("2010");
		driver.findElement(By.xpath("//*[@name='cc_frst_name']")).sendKeys("Vimal");
		driver.findElement(By.xpath("//*[@name='cc_mid_name']")).sendKeys("B");
		driver.findElement(By.xpath("//*[@name='cc_last_name']")).sendKeys("Patel");
		
		//*Billing Address
		driver.findElement(By.xpath("//*[@name='ticketLess']")).click();
		driver.findElement(By.xpath("//*[@name='billAddress1']")).sendKeys("1325 Borregas Ave.");
		driver.findElement(By.xpath("//*[@name='billAddress2']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@name='billCity']")).sendKeys("Sunnyvale");
		driver.findElement(By.xpath("//*[@name='billState']")).sendKeys("CA");
		driver.findElement(By.xpath("//*[@name='billZip']")).sendKeys("94089");
		driver.findElement(By.xpath("//*[@name='billCountry']")).sendKeys("3");
		
		//*Delivery Address
		
		driver.findElement(By.cssSelector("*[name='delAddress1']")).sendKeys("1325 Borregas Ave.");
		driver.findElement(By.cssSelector("*[name='delAddress2']")).sendKeys("Sant Kabir Road");
		driver.findElement(By.cssSelector("*[name='delCity']")).sendKeys("Sunnyvale");		
		driver.findElement(By.cssSelector("*[name='delState']")).sendKeys("CA");
		driver.findElement(By.cssSelector("*[name='delZip']")).sendKeys("94089");
		driver.findElement(By.cssSelector("*[name='delCountry']")).sendKeys("3");	
		
		driver.findElement(By.name("buyFlights")).click();
	}
	
}
				