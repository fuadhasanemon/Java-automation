package LICT.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class reg {
WebDriver driver;
	
	public reg(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")	
	public WebElement click_myAccount;
	
	@FindBy(linkText="Register")
	public WebElement click_register;
	
	@FindBy(id="input-firstname")
	public WebElement first_name;
	
	@FindBy(id="input-lastname")
	public WebElement last_name;
	
	@FindBy(id="input-email")
	public WebElement type_email;
	
	@FindBy(id="input-telephone")
	public WebElement type_telephone;
	
	@FindBy(id="input-password")
	public WebElement password;
	
	@FindBy(id="input-confirm")
	public WebElement confirm_password;
	
	@FindBy(xpath="//input[@name='agree']")
	public WebElement check_box;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	public WebElement continue_button;
	
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	public WebElement text;
	
	public void myRegistration() {
		
		click_myAccount.click();
		click_register.click();
		first_name.sendKeys("Fuad");
		last_name.sendKeys("Emon");
		type_email.sendKeys("fuademon88@gmail.com");
		type_telephone.sendKeys("01647335376");
		password.sendKeys("12345");
		confirm_password.sendKeys("12345");
		check_box.click();
		continue_button.click();
		text.getText();
		
	}
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	public WebElement continue_button1;
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	public WebElement my_account;
	
	@FindBy(linkText="Logout")
	public WebElement loggout_button;
	
	@FindBy(xpath="//h1[contains(text(),'Account Logout')]")
	public WebElement text_logout;
	
	public void logOut() {
		continue_button1.click();
		loggout_button.click();
		text_logout.getText();
	}
	
	@FindBy(linkText="Continue")
	public WebElement continue_btn2;
	
	@FindBy(xpath="//span[@class='caret']")
	public WebElement myaccount_btn1;
	
	@FindBy(linkText="Login")
	public WebElement login_btn2;
	
	@FindBy(id="input-email")
	public WebElement login_email;
	
	@FindBy(id="input-password")
	public WebElement login_password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	public WebElement login_btn3;
	
	public void loginSystem() {
		continue_btn2.click();
		myaccount_btn1.click();
		login_btn2.click();
		login_email.sendKeys("fuademon88@gmail.com");
		login_password.sendKeys("12345");
		login_btn3.click();
		
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement search_box;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	public WebElement search_icon;
	
	public void searchProducts() {
		search_box.sendKeys("MacBook");
		search_icon.click();
	}
	
	@FindBy(xpath="//img[@class='img-responsive']")
	public WebElement product;
	
	@FindBy(xpath="//button[@class='btn btn-default']//i[@class='fa fa-heart']")
	public WebElement wish_btn;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	public WebElement text_sms_wish;
	
	@FindBy(linkText="My Account")
	public WebElement go_myaccount;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'My Account')]")
	public WebElement btn_myaccount;
	
	@FindBy(xpath="//a[@class='list-group-item'][contains(text(),'Wish List')]")
	public WebElement wishlist_btn;
	
	public void addToWishList() {
		product.click();
		wish_btn.click();
		text_sms_wish.getText();
		go_myaccount.click();
		btn_myaccount.click();
		wishlist_btn.click();
	}

}


