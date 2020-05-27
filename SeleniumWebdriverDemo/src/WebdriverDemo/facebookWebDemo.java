package WebdriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookWebDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	/*	
		//* No of Links.
		//*WebElement w1=driver.findElement(By.xpath("//*[@class='gradient']"));
		List <WebElement> l1=driver.findElements(By.tagName("a"));
		System.out.println("No of Links "+l1.size());
		for(int i=0;i<l1.size();i++){
			System.out.println(l1.get(i).getText());
		}	
		
    //*[@type='text' or @type='password']
		
		//* No of Textbox including password		
		
		//*WebElement w2=driver.findElement(By.xpath("//*[@class='gradient']"));
		List <WebElement> l2=driver.findElements(By.xpath("//*[@type='text' or @type='password']"));
		System.out.println("No of Textbox including password "+l2.size());
		
		for(int i=0;i<l2.size();i++){
			System.out.println(l2.get(i).getAttribute("name"));
			
		}
		
		
		//* No of Textbox password
		
		//*WebElement w3=driver.findElement(By.xpath("//*[@class='gradient']"));
		List <WebElement> l3=driver.findElements(By.xpath("//*[@type='password']"));
		System.out.println("No of Textbox password "+l3.size());
		
		for(int i=0;i<l3.size();i++){
			System.out.println(l3.get(i).getAttribute("name"));
		}
	
		
		//* No of  Button
		
		/
		List <WebElement> l4=driver.findElements(By.xpath("*//*[@type='submit']"));
		System.out.println("No of Button "+l4.size());
		for(int i=0;i<l4.size();i++){
			System.out.println(l4.get(i).getAttribute("name"));
		}
		*/
		
		//* No of  Month
		
		WebElement w1=driver.findElement(By.xpath("//*[@id='month']"));
		List <WebElement> l5=w1.findElements(By.tagName("option"));	
		System.out.println("No of Month "+l5.size());
		for(int i=0;i<l5.size();i++){
		System.out.println(l5.get(i).getText());
		
		}
		//* No of  Day
		
		WebElement w2=driver.findElement(By.xpath("//*[@id='day']"));
		List <WebElement> l6=w2.findElements(By.tagName("option"));	
		System.out.println("No of day "+l6.size());
		for(int i=0;i<l6.size();i++){
		System.out.println(l6.get(i).getText());
		
		}
		
		//* No of  Year
		
		WebElement w3=driver.findElement(By.xpath("//*[@id='year']"));
		List <WebElement> l7=w3.findElements(By.tagName("option"));	
		System.out.println("No of Year "+l7.size());
		for(int i=0;i<l7.size();i++){
		System.out.println(l7.get(i).getText());
		
		}
	
		
	}

}
