package LICT.demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=0) 
	 public void Verify_myRegistration(){ 
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    reg reg=new reg(driver); 
	    reg.myRegistration();
	        
    }
	
	@Test(priority=1) 
	 public void Logout(){ 
	    reg logout=new reg(driver); 
	    logout.logOut();
	        
   }
	
	@Test(priority=2) 
	 public void Logoin(){ 
	    reg login=new reg(driver); 
	    login.loginSystem();
	        
  }
	@Test(priority=3) 
	 public void Search(){ 
	    reg search=new reg(driver); 
	    search.searchProducts();
	        
 }
	@Test(priority=4) 
	 public void WishList(){ 
	    reg wishlist=new reg(driver); 
	    wishlist.addToWishList();
	        
  }
	

    @AfterTest
    public void quit() {
   	 driver.quit();
    }
    

}


