package ngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
/*	private String mani= "hii";
	public String getMani() {
		return mani;
	}
	public void setMani(String mani) {
		this.mani = mani;
	}*/
	public Loginpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	@FindBy(id="Userid")
	WebElement username;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(css="input[value='Sign-in']")
	WebElement signin;
	public void Username(String strusername){
		username.sendKeys(strusername);
	}
	public void Password(String strpassword){
		password.sendKeys(strpassword);
	}
	public void Clicksignin(){
		signin.click();
	}
	public void logining(String strusername,String strpassword){
		//System.out.println("hi mani");
		this.Username(strusername);
		this.Password(strpassword);
		this.Clicksignin();
		
	}
                        
}