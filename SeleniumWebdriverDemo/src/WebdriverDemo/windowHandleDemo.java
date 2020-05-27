package WebdriverDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		driver.get("http://www.naukri.com");
		driver.manage().window().maximize();
		
		// driver.findElement(By.xpath("//*[@id='login_Layer']")).click();;
		
		driver.findElement(By.xpath("//*[@class='mActive']/a/div")).click();
		
		Thread.sleep(6000);
		
		Set <String> s1=driver.getWindowHandles();
		
		Iterator <String> t1=s1.iterator();
		
		String w1=t1.next();
		String w2=t1.next();
		String w3=t1.next();
		String w4=t1.next();
		
		System.out.print("Window w1 - " +w1 + "Window w2 - "+w2 + "Window w3 - "+w3 +"Window w4 - "+w4);
		
		Thread.sleep(5000);
		driver.switchTo().window(w3);
		driver.close();
		
		Thread.sleep(5000);
		driver.switchTo().window(w4);
		driver.close();
		
		driver.switchTo().window(w2);
		driver.findElement(By.xpath("//*[@id='skill']/div[1]/div[2]/input")).sendKeys("TCS");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='qsbFormBtn']")).click();
		driver.close();
        
		Thread.sleep(5000);
		driver.switchTo().window(w1);
		driver.findElement(By.xpath("//*[@id='qsb-keyword-sugg']")).sendKeys("ABC");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='root']/div[4]/div[1]/section/div/form/div[3]/button")).click();
		driver.close();
		
	}

}
