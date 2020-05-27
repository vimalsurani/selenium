package WebdriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tours4funDemo {
		

		public static void main(String[] args) throws InterruptedException {
		

			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=null;
			driver=new ChromeDriver();
			driver.get("https://www.tours4fun.com/");
			driver.manage().window().maximize();
			
			Actions a = new Actions(driver);
		    a.moveToElement(driver.findElement(By.xpath("//*[@id='navigation-destination']"))).build().perform();
		  
		    driver.findElement(By.linkText("Los Angeles")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//*[@id='js-list-product']/div[1]/div[2]/a")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//*[@id='check-availibility']")).click();
		    Thread.sleep(5000);
	
		    
		  
			
			List<WebElement> allDates=driver.findElements(By.xpath("//*[@id='price-form']/div[5]/div/div[3]/div[4]/div"));
			
			for(WebElement ele:allDates)
			{
				
				String date=ele.getText();
				
				if(date.equalsIgnoreCase("20"))
				{
					ele.click();
					break;
				}
		    
			}
		    
		    
		    
		    
		    
			/*driver.get("http://www.tours4fun.com/tours/los-angeles/");
			
	        //* Login Page
			List<WebElement> w1 = driver.findElements(By.xpath("//*[@class='list-product-item-title list_item_title js-tour-name']"));
			for (WebElement webElement : w1) {
				System.out.println("____________" + webElement.getText());
			}
			driver.findElement(By.xpath("//*[@class='page_link next_page']")).click();
			List<WebElement> w2 = driver.findElements(By.xpath("//*[@class='list-product-item-title list_item_title js-tour-name']"));
			for (WebElement webElement1 : w2) {
				System.out.println("____________" + webElement1.getText());
			}
		    */
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		
		   /*
		    driver.findElement(By.xpath("//*[@id='navigation-deals']")).click();
			driver.get("https://www.tours4fun.com/8-day-usa-and-canada-east-coast-bus-tour-package.html");
			driver.findElement(By.xpath("//*[@class='js-no-saveing']")).click();
					
			
			List <WebElement> l1=driver.findElements(By.tagName("a"));
			System.out.println("No of Links"+l1.size());
			for(int i=0;i<l1.size();i++){			
			System.out.println(l1.get(i).getText());
			}
			
	
			driver.get("https://www.tours4fun.com/subscriber.html");
			
			List <WebElement> l2=driver.findElements(By.tagName("a"));
			System.out.println("No of Links"+l2.size());
			for(int i=0;i<l2.size();i++){			
			System.out.println(l2.get(i).getText());
			}
			
			
			List <WebElement> l3=driver.findElements(By.xpath("//*[@type='text']"));
			System.out.println("No of Textbox including password "+l3.size());
			
			for(int i=0;i<l3.size();i++){
				System.out.println(l3.get(i).getAttribute("value name"));
				
			}
			
			
			*/
			
		}	
			
		
}
