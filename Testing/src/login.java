import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		
		WebElement myAccount = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a"));
		WebElement login = driver.findElement(By.xpath(//*[@id="top-links"]/ul/li[2]/ul/li[2]/a));
		
		
		
		myAccount.click();
		Thread.sleep(2000);
	}
	
}
