package WebdriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//*[@title='Create Rediffmail Account']")).click();
		/*
		driver.get("https://www.rediff.com");
		List <WebElement> l1=driver.findElements(By.tagName("a"));
		System.out.println("No of Links present on page"+l1.size());
		for(int i=0;i<l1.size();i++){
			System.out.println(l1.get(i).getText());
		}	
	    */	
		/*
		WebElement w1=driver.findElement(By.xpath("//*[@class='firstrow']"));
		List <WebElement> l2=w1.findElements(By.tagName("a"));
		for(int i=0;i<l2.size();i++){
			System.out.println(l2.get(i).getText());
		}	
		 */	
		
		
		List <WebElement> l3=driver.findElements(By.tagName("a"));
		System.out.println("No of Links"+l3.size());
		for(int i=0;i<l3.size();i++){			
		System.out.println(l3.get(i).getText());
		}
		
		
		
		List <WebElement> l4=driver.findElements(By.xpath("//*[@type='button']"));
		System.out.println("No of Button "+l4.size());
		for(int i=0;i<l4.size();i++){
		System.out.println(l4.get(i).getAttribute("type"));
		
		}
		
		List <WebElement> l5=driver.findElements(By.xpath("//*[@type='text']"));
		System.out.println("No of Text Box "+l5.size());
		
		for(int i=0;i<l5.size();i++){
		System.out.println(l5.get(i).getAttribute("type"));
		
		
	    }
	}	
}
