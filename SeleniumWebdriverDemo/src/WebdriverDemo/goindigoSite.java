package WebdriverDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class goindigoSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
        WebDriverWait wait = new WebDriverWait(driver,50);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='or-tab-content trip-tab-content']//div[5]"))));

		driver.findElement(By.xpath("//div[@class='or-tab-content trip-tab-content']//div[5]")).click();

	    
	  
	    
	    
	/*	driver.findElement(By.xpath("//*[@class='form-control or-src-city']")).click();
		
		
		
		List <WebElement> l1=driver.findElements(By.xpath("//*[@class='wrap']"));
		
		System.out.println("Auto Suggest List ::" + l1.size());
		
		for(int i = 0 ;i< l1.size();i++)
		{
			System.out.println(l1.get(i).getText());
			
			if(l1.get(i).getText().equals("BOM"))
			{
				l1.get(i).click();
				break;
			}
		}
        
	
	
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[3]/div[1]/div[2]/div/div/input")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 15);
		wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[3]/div[1]/div[2]/div/div/div/div/div[4]"))));
		driver.findElement(By.xpath("//*[@id="bookFlightTab]/form/div[3]/div[1]/div[2]/div/div/div/div/div[4]")).click(); 
		
		
		*/
		
	

}

}