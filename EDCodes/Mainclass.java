package ngproject;


import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Mainclass {
WebDriver driver;
Loginpage loginpage;
Dashboardpage dashboardpage;
@BeforeTest
public void init(){
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.get("http://10.10.30.26/");
	driver.manage().window().maximize();
	//System.out.println("init working>>");
	loginpage = new Loginpage(driver);
	loginpage.logining("netstorm", "qa@netstorm");
	//loginpage.getMani();
	dashboardpage = new Dashboardpage(driver);
	dashboardpage.perform();
	
	
}
@Test
public void invokingg(){
	System.out.println("hiiiiii");
	loginpage = new Loginpage(driver);

	loginpage.logining("netstorm", "qa@netstorm");
	
	//dashboardpage = new Dashboardpage(driver);
		
	
	
}



}
