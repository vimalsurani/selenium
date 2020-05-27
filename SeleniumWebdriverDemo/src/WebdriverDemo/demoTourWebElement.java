package WebdriverDemo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoTourWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		//* Mercury Welcome Page
		//* No of Links Home Page
		List <WebElement> l1=driver.findElements(By.tagName("a"));
		System.out.println("No of Links present on page"+l1.size());
		for(int i=0;i<l1.size();i++){
			System.out.println(l1.get(i).getText());	
			}

		//* Login Page
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("*[name='password']")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		//* Mercury Reservation Page
		//* No of Links 
		List <WebElement> l2=driver.findElements(By.tagName("a"));
		System.out.println("No of Links "+l2.size());
		for(int i=0;i<l2.size();i++){
			System.out.println(l2.get(i).getText());			
			}
		
		//* No of Button
	    List<WebElement> l3=driver.findElements(By.xpath("//*[@type='radio']"));		
	    System.out.println("No of Button "+l3.size());
		for(int i=0;i<l3.size();i++){
			System.out.println(l3.get(i).getAttribute("value"));
		}
	
		//* Passengers Drop Down
		WebElement w1=driver.findElement(By.xpath("//*[@name='passCount']"));
		List <WebElement> l4=w1.findElements(By.tagName("option"));	
		System.out.println("No of Passengers "+l4.size());
		for(int i=0;i<l4.size();i++){
		    System.out.println(l4.get(i).getText());
		}
		
		//* Departing From Drop Down
		WebElement w2=driver.findElement(By.xpath("//*[@name='fromPort']"));
		List <WebElement> l5=w2.findElements(By.tagName("option"));	
		System.out.println("Departing From "+l5.size());
		for(int i=0;i<l5.size();i++){
			System.out.println(l5.get(i).getText());
		}		
		
		//* Departing Month From Drop Down
		WebElement w3=driver.findElement(By.xpath("//*[@name='fromMonth']"));
		List <WebElement> l6=w3.findElements(By.tagName("option"));	
		System.out.println("Departing Month "+l6.size());
		for(int i=0;i<l5.size();i++){
			System.out.println(l6.get(i).getText());
		}		
		
		//* Departing Day From Drop Down
		WebElement w4=driver.findElement(By.xpath("//*[@name='fromDay']"));
		List <WebElement> l7=w4.findElements(By.tagName("option"));	
		System.out.println("Departing Day "+l7.size());
		for(int i=0;i<l7.size();i++){
		    System.out.println(l7.get(i).getText());
	    }		
		
		//* Arriving In From Drop Down
		WebElement w5=driver.findElement(By.xpath("//*[@name='toPort']"));
		List <WebElement> l8=w5.findElements(By.tagName("option"));	
		System.out.println("Arriving In "+l8.size());
		for(int i=0;i<l8.size();i++){
		    System.out.println(l8.get(i).getText());
	    }		
		
		//* Arriving Month From Drop Down
		WebElement w6=driver.findElement(By.xpath("//*[@name='toMonth']"));
		List <WebElement> l9=w6.findElements(By.tagName("option"));	
		System.out.println("Arriving Month "+l9.size());
		for(int i=0;i<l9.size();i++){
		    System.out.println(l9.get(i).getText());
	    }		
		
		//* Arriving Day From Drop Down
		WebElement w7=driver.findElement(By.xpath("//*[@name='toDay']"));
		List <WebElement> l10=w7.findElements(By.tagName("option"));	
		System.out.println("Arriving Day "+l10.size());
		for(int i=0;i<l10.size();i++){
	        System.out.println(l10.get(i).getText());
	    }
		
		//* Airline Drop Down
		WebElement w8=driver.findElement(By.xpath("//*[@name='airline']"));
		List <WebElement> l11=w8.findElements(By.tagName("option"));	
		System.out.println("Preferences Airline  "+l11.size());
		for(int i=0;i<l11.size();i++){
	        System.out.println(l11.get(i).getText());
	    }
		
		driver.findElement(By.name("findFlights")).click();
		
		
		//* No of Links Flight Page 
		List <WebElement> l12=driver.findElements(By.tagName("a"));
		System.out.println("No of Links present on page"+l12.size());
		for(int i=0;i<l12.size();i++){
			System.out.println(l12.get(i).getText());
		}	

        //* No of Button
	    List<WebElement> l13=driver.findElements(By.xpath("//*[@type='radio']"));		
	    System.out.println("No of Button "+l13.size());
		for(int i=0;i<l13.size();i++){
			System.out.println(l13.get(i).getAttribute("value"));
		}
		
		driver.findElement(By.name("reserveFlights")).click();
		
		//* Mercury Purchase Page
		
		//* No of Links 
		List <WebElement> l14=driver.findElements(By.tagName("a"));
		System.out.println("No of Links present on page"+l14.size());
		for(int i=0;i<l14.size();i++){
			System.out.println(l14.get(i).getText());
		}	
		
		// No of Text Box
	    List <WebElement> l15=driver.findElements(By.xpath("//*[@maxlength='60' or @type='TEXT']"));
		System.out.println("No of Textbox "+l15.size());
		for(int i=0;i<l15.size();i++){
			System.out.println(l15.get(i).getAttribute("name"));
		}
		
		//* Meal Drop Down
		WebElement w9=driver.findElement(By.xpath("//*[@name='pass.0.meal']"));
		List <WebElement> l16=w9.findElements(By.tagName("option"));	
		System.out.println("Meal Name  "+l16.size());
		for(int i=0;i<l16.size();i++){
	        System.out.println(l16.get(i).getText());
	    }	
		
		//* Credit Card Type Drop Down
	    WebElement w10=driver.findElement(By.xpath("//*[@name='creditCard']"));
	    List <WebElement> l17=w10.findElements(By.tagName("option"));	
	    System.out.println("Credit Card Type "+l17.size());
	    for(int i=0;i<l17.size();i++){
	        System.out.println(l17.get(i).getText());
	    }
		
	    //* Expiration Month Drop Down
	    WebElement w11=driver.findElement(By.xpath("//*[@name='cc_exp_dt_mn']"));
	    List <WebElement> l18=w11.findElements(By.tagName("option"));	
	    System.out.println("Expiration Month "+l18.size());
	    for(int i=0;i<l18.size();i++){
	        System.out.println(l18.get(i).getText());
	    }
		
	    //* Expiration Year Drop Down
  	    WebElement w12=driver.findElement(By.xpath("//*[@name='cc_exp_dt_yr']"));
	    List <WebElement> l19=w12.findElements(By.tagName("option"));	
	    System.out.println("Expiration Year "+l19.size());
	    for(int i=0;i<l19.size();i++){
	        System.out.println(l19.get(i).getText());
	    }
		
        //* Billing Address Country Drop Down
  	    WebElement w13=driver.findElement(By.xpath("//*[@name='billCountry']"));
	    List <WebElement> l20=w13.findElements(By.tagName("option"));	
	    System.out.println("Billing Address Country "+l20.size());
	    for(int i=0;i<l20.size();i++){
	        System.out.println(l20.get(i).getText());
	    }
	   
        //* Delivery Address Country Drop Down
	    WebElement w14=driver.findElement(By.xpath("//*[@name='delCountry']"));
	    List <WebElement> l21=w14.findElements(By.tagName("option"));	
	    System.out.println("Delivery Address Country "+l21.size());
	    for(int i=0;i<l21.size();i++){
	        System.out.println(l21.get(i).getText());
	    }
	   
	    //*Passengers	
	    driver.findElement(By.xpath("//*[@name='passFirst0']")).sendKeys("Vimal");	
	    driver.findElement(By.xpath("//*[@name='passLast0']")).sendKeys("Patel");
	    driver.findElement(By.xpath("//*[@name='pass.0.meal']")).sendKeys("Diabetic");
	 		
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
