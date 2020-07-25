import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class number {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
//		WebElement myAccount = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a"));
//		WebElement Registration = driver.findElement(By.linkText("Register"));
//		WebElement input_Registration_FirstName =driver.findElement(By.id("input-firstname"));
//		WebElement myAccount2 = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a"));
		
		
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		
		myAccount.click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		input_Registration_FirstName.sendKeys("fuad");
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-lastname")).sendKeys("emon");
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-email")).sendKeys("fuad8@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-telephone")).sendKeys("01647335376");
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-password")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-confirm")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		Thread.sleep(2000);
		
		System.out.println("sucsesfully done registration !");
		
		
		
//       int num = 80;
//       if (num <60 && num <= 100)
//       {
//    	   System.out.println("fail");
//       }
//       else if (num >= 80)
//       {
//    	   System.out.println("star");
//       }
//       
//       else
//       {
//    	   System.out.println("pass");
//       }
	}
	

}
