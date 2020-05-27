package Basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	
  @Test
  public void logininvalid() {
	  
	  System.out.println("Inside before -Logininvalid");
	  
	  
  }
  @BeforeMethod
  public void lunchApp() {
	  System.out.println("Inside before -LaunchApp");
  }

  @AfterMethod
  public void CloseBroswer() {
	  System.out.println("Inside before -CloseBroswer");
	  
  }

  @Test
  public void loginvalid() {
	  System.out.println("Inside before -Loginvalid");
  }
  
  @Test
  public void loginpwdCheck() {
	  System.out.println("Inside before -loginpwdCheck");
  }

}
