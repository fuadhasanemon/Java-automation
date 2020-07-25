package LICT.test;

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
	

@FindBy(xpath="//a[contains(text(),'Login')]")
public WebElement click_login;

@FindBy(id="input-email")
public WebElement type_email;

@FindBy(id="input-password")
public WebElement type_password;

@FindBy(xpath="//input[@class='btn btn-primary']")
public WebElement click_loginButton;

@FindBy(xpath="//span[contains(text(),'My Account')]")
public WebElement click_myAccountButton;

@FindBy(linkText="Logout")
public WebElement click_logouttButton;

@FindBy(xpath="//span[contains(text(),'My Account')]")
public WebElement click_my_account;

@FindBy(linkText="Register")
public WebElement click_register;

@FindBy(id="input-firstname")
public WebElement first_name;

@FindBy(id="input-lastname")
public WebElement last_name;

@FindBy(id="input-email")
public WebElement email_name;

@FindBy(id="input-telephone")
public WebElement telephone_number;

@FindBy(id="input-password")
public WebElement password_number;

@FindBy(id="input-confirm")
public WebElement confirm_password;

@FindBy(xpath="//input[@name='agree']")
public WebElement check_box;

@FindBy(xpath="//input[@class='btn btn-primary']")
public WebElement continue_button;




public void myAccount() {
	click_myAccount.click();
	
}

public void check_login() {
	click_login.click();
	
}

public void typeEmail() {
	type_email.sendKeys("sabbir682018@gmail.com");
}

public void typePassword() {
	type_password.sendKeys("12345678");
}

public void click_Login() {
	click_loginButton.click();
}

public void click_myAccount_button() {
	click_myAccountButton.click();
}

public void click_logout() {
	click_logouttButton.click();
}

public void my_new_account() {
	click_my_account.click();
}

public void my_registration() {
	click_register.click();
}

public void register_account() {
	first_name.sendKeys("Fuad");
	last_name.sendKeys("Emon");
	email_name.sendKeys("fuadhasanemon8@gmail.com");
	telephone_number.sendKeys("123456789");
	password_number.sendKeys("0011");
	confirm_password.sendKeys("0011");
	check_box.click();
	continue_button.click();
	
	
	
}



}
