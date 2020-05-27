package WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo {



		public static void main(String[] args) throws InterruptedException {
			
		
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();       // Launch Chrome browser
			//driver.get("http://newtours.demoaut.com"); // Lunch website
			//driver.manage().window().maximize();   // window maximize 
		
			//System.out.println(driver.getCurrentUrl()); 
			
			//System.out.println(driver.getPageSource());
			
			
			driver.manage().window().maximize();
	        driver.get("http://yahoo.com/");
	        driver.findElement(By.xpath("//*[@id='header-signin-link']")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("vimal.surani");
		   
			WebDriverWait wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@value='Next']")));
			
			driver.findElement(By.xpath("//*[@value='Next']")).click();
			
			
			
			
			
			
			
		    
		    /*
		    wd.findElement(By.xpath("//*[@name='userName']")).sendKeys("Admin");
			wd.findElement(By.cssSelector("*[name='password']")).sendKeys("mercury");
			wd.findElement(By.xpath("//*[@name='login']")).click();
	
			wd.findElement(By.cssSelector("*[value='oneway']")).click();
		  	
			wd.findElement(By.cssSelector("*[name='passCount']")).sendKeys("2");
		  
			wd.findElement(By.cssSelector("*[name='fromPort']")).sendKeys("London");	
			wd.findElement(By.cssSelector("*[name='fromMonth']")).sendKeys("May");
			wd.findElement(By.cssSelector("*[name='fromDay']")).sendKeys("20");
			wd.findElement(By.cssSelector("*[name='toPort']")).sendKeys("Paris");
			wd.findElement(By.cssSelector("*[name='toMonth']")).sendKeys("June");
			wd.findElement(By.cssSelector("*[name='toDay']")).sendKeys("25");
			wd.findElement(By.cssSelector("*[value='Business']")).click();
			wd.findElement(By.cssSelector("*[name='findFlights']")).click ();
			
			
			wd.findElement(By.cssSelector("input[value='Pangea Airlines$362$274$9:17']")).click();
		
			
			
			wd.findElement(By.cssSelector("*[name='reserveFlights']")).click();
			wd.findElement(By.cssSelector("*[name='passFirst0']")).sendKeys("Abhinav");
			wd.findElement(By.cssSelector("*[name='passLast0']")).sendKeys("Tripathi");
	
		 */ 
		    
		    
	}

}
