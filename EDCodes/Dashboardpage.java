package ngproject;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
public class Dashboardpage {
	private WebDriver driver;
	public Dashboardpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[value='Show All']")
	WebElement showall;
	@FindBy(css=".smallcheckbox[value='616161']")
	WebElement checkbox;
	@FindBy(css="input[value='Dashboard']")
	WebElement dashboard;
	@FindBy(css="#Tier29Instance")
	WebElement node;
	
	@FindBy(xpath="//div[@id='flowMapDiv']/div[2]/ul/li/a[text()='DrillDown']")
	 WebElement drilldown;
    @FindBy(xpath="//li[@class='dropdown-submenu']/ul/li/a[contains(text(), 'Flowpaths By Response Time')]")
    WebElement flowpathsres;	
    @FindBy(xpath="//li[@class='dropdown-submenu']/ul/li/a[contains(text(), 'Top DB Calls')]")
    WebElement topdbcall;
    @FindBy(xpath="//li[@class='dropdown-submenu']/ul/li/a[contains(text(), 'DB Calls By URL')]")
    WebElement dbcallsurl;
    @FindBy(xpath="//li[@class='dropdown-submenu']/a[contains(text(), 'Top 10 Transactions By')]")
    WebElement top10transc;
    @FindBy(xpath="//ul[@class='dropdown-menu increaseWidth']/li/a[contains(text(),'TPS')]")
    WebElement tps1;
    @FindBy(xpath="//ul[@class='dropdown-menu increaseWidth']/li/a[text()='Response']")
    WebElement response1;
    @FindBy(xpath="//div[@id='forimage']/img")
    WebElement img;
    @FindBy(xpath="//li[@class='dropdown-submenu']/a[text()='Group']")
    WebElement group1;
    @FindBy(css="#lstGrp>li>a")
    WebElement ungrptier;
    @FindBy(css="[class='ui-dialog-titlebar-close']")
    WebElement close;
    @FindBy(xpath="//li/a[contains(text(), 'Rename Group')]")
    WebElement renamegrp;
    @FindBy(xpath="//div/button[contains(text(),'Cancel')]")
    WebElement close1;
    @FindBy(xpath="//li/a[text()='Show Dashboard']")
    WebElement showdb;
    @FindBy(xpath="//li/a[text()='Hide Dashboard']")
    WebElement hidedb;
    @FindBy(xpath="//li/a[contains(text(), 'Show Tier Info')]")
    WebElement showtxttier;
    @FindBy(xpath="//div//h6[@class='panel-title']/a")
    WebElement tier29;
    @FindBy(xpath="//div[@id='overView']/ul/li[2]/a")
    WebElement health;
    @FindBy(xpath="//button[@class='ui-dialog-titlebar-close']")
    WebElement close2;
    @FindBy(css="[id='settingImage']")
    WebElement settingimg;
    @FindBy(css="input[id='showNoConnection']")
    WebElement shownocon;
    @FindBy(css="input[id='showAllConnection']")
    WebElement showallcon;
    @FindBy(css="input[id='autoConnection']")
    WebElement autocon;
    @FindBy(css="input[id='currentValue']")
    WebElement curval;
    @FindBy(css="input[id='averageValue']")
    WebElement avgval;
    @FindBy(css="[id='tabularImg']")
    WebElement tablrview;
    @FindBy(xpath="//nav[@class='nav1']/ul/li/b/a")
    WebElement appflowmap;
    @FindBy(xpath="//ul[@id='appFlowmap']/li/a[text()='Edit Current Flow Map']")
    WebElement editcurflmap;
    @FindBy(xpath="//div[@class='ui-dialog-buttonset']/button[text()='Close']")
    WebElement close3;
    @FindBy(xpath="//ul/li/a[text()='Manage My Flow Maps']")
    WebElement mngmyflwmap;
    @FindBy(xpath="//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/div/button")
    WebElement close4;
    @FindBy(xpath="//td[@class='labelMsgLeft']/a[text()='Normal']")
    WebElement normal;
    @FindBy(xpath="//table[@id='transactionId']/tbody/tr[1]/td[4]")
    WebElement normalvalue;  
    @FindBy(xpath="//td[@class='labelMsgLeft']/a[text()='VerySlow']")
    WebElement veryslow;
    @FindBy(xpath="//table[@id='transactionId']/tbody/tr[2]/td[4]")
    WebElement veryslowvalue;
    @FindBy(xpath="//td[@class='labelMsgLeft']/a[text()='Slow']")
    WebElement slow;
    @FindBy(xpath="//table[@id='transactionId']/tbody/tr[3]/td[4]")
    WebElement slowvalue;
    @FindBy(css="#Tier6Server")
    WebElement node2;
  //  WebElement R=node;
   // public String[] nodes = {"node","node2"};	
	public void Signin()
	{
		showall.click();
		this.timefunction();
	}
	
	public void Checkbox()
	{
		checkbox.click();
		//this.timefunction();
	}
	
	public void Dashboard()
	{
		dashboard.click();
		//this.timefunction();
		
	}
	
	public void driverchange()
	{
		 for(String winHandle : driver.getWindowHandles())
		 		{
			    driver.switchTo().window(winHandle);
				driver.manage().window().maximize();
				}   
		 //this.timefunction();
	}
	public void  rightclickop(WebElement R)
	{ 
		//WebElement R=node;
		this.contextclick1(R);
	}
	public void flowpathsresponse()
	{
		flowpathsres.click();
		//this.timefunction();
		driver.navigate().back();
		//this.timefunction();
	}
	public void topdbcalls(WebElement R)
	{
		//WebElement R=node;
		this.contextclick1(R);
		topdbcall.click();
		//this.timefunction();
    	driver.navigate().back();
    	//this.timefunction();
		
	}
	public void dbcallsbyurl(WebElement R)
	{
		 //WebElement R=node;
		 this.contextclick1(R);
		//this.timefunction();
		dbcallsurl.click();
		driver.navigate().back();
		//this.timefunction();
	}
	public void tps(WebElement R)
	{ 
	//	WebElement R=node; 
		this.contextclick2(R);
		//this.timefunction();
		tps1.click();
		//this.timefunction();
		
	}
	public void response(WebElement R)
	{
		//WebElement R=node; 
		this.contextclick2(R);
		//this.timefunction();
		response1.click();
		//this.timefunction();
		img.click();
	}
	public void group(WebElement R)
	{
		this.contextclick3(R);
		//this.timefunction();
		ungrptier.click();
		//this.timefunction();
		close.click();
		//this.timefunction();
		
	}
	public void renamegroup(WebElement R)
	{
		 this.contextclick3(R);
		//this.timefunction();
		renamegrp.click();
		//this.timefunction();
		close1.click();
		//this.timefunction();
		
	}
	
	public void showdashboard(WebElement R)
	{
		//WebElement R= node;//r4   		
	    Actions builder = new Actions(driver); 
	    builder.contextClick(R).build().perform();
	    showdb.click();
	    this.timefunction();
	    //hide dashboard
	   // WebElement R1= node;//r41
	   // this.timefunction();      		
	    Actions builder1 = new Actions(driver); 
	    builder1.contextClick(R).build().perform();
	    this.timefunction();
	    hidedb.click();
	    this.timefunction();
	    
	    
	}
	public void showtexttier(WebElement R)
	{
		//WebElement R = node;//r5
	    //this.timefunction();      		
	    Actions builder = new Actions(driver); 
	    builder.contextClick(R).build().perform();
	    this.timefunction();
	    showtxttier.click();
	    tier29.click();
	    tier29.click();
	    health.click();
	    this.timefunction();
	    close2.click();
	    this.timefunction();
	    
		
	}
	//top right
	public void settingimage()
	{
		WebElement Imagetop = settingimg;
		Actions builder = new Actions(driver); 
       	builder.moveToElement(Imagetop).perform();
        settingimg.click();
       	this.timefunction();
    	shownocon.click();
        this.timefunction();
        showallcon.click();
        this.timefunction();
        autocon.click();
        this.timefunction();
       	curval.click();
        this.timefunction();
       	avgval.click();
        this.timefunction();
        
	}
	public void tabularview()
	{
		tablrview.click();
		this.timefunction();
		driver.navigate().back();
		this.timefunction();
	}
	public void applicationflowmap()
	{
		appflowmap.click();
		this.timefunction();
		editcurflmap.click();
		this.timefunction();
		close3.click();
		this.timefunction();
		/*appflowmap.click();
		this.timefunction();
		mngmyflwmap.click();
		this.timefunction();
		close4.click();
		this.timefunction();*/
	}
	public void transcationsccard()
	{
		normal.click();
		driver.navigate().back();
		normalvalue.click();
		driver.navigate().back();
		veryslow.click();
		driver.navigate().back();
		veryslowvalue.click();
		driver.navigate().back();
		slow.click();
		driver.navigate().back();
		slowvalue.click();
		driver.navigate().back();
		
		
	}
	public void perform(){ //this function call to all func's
		//node1
	
		this.Signin();
		this.Checkbox();
		this.Dashboard();
		this.driverchange();
		ArrayList<WebElement> al = new ArrayList<WebElement>();
		 al.add(node);
		 al.add(node2);
		 Iterator<WebElement> itr = al.iterator();
		 while (itr.hasNext()) {
		WebElement a=itr.next();
	
		this.rightclickop(a);
		
		this.flowpathsresponse();
		this.topdbcalls(a);
		//this.dbcallsbyurl();//problem coming
		this.tps(a);
		this.response(a);
		this.group(a);
		//this.renamegroup();//problem coming
		this.showdashboard(a);
		 }
	
		//this.showtexttier(node);//problem coming
		/*   
		//node2
		this.rightclickop(node2);
		this.flowpathsresponse();
		this.topdbcalls(node2);
		//this.dbcallsbyurl();//problem coming
		this.tps(node2);
		this.response(node2);
		this.group(node2);
		//this.renamegroup();//problem coming
		this.showdashboard(node2);
		*/
		
		//this.showtexttier(node);//problem coming
		//others
		this.settingimage();
		this.tabularview();
		this.applicationflowmap();
		this.transcationsccard();
	}
	
	public void contextclick1(WebElement R)
	{
		//WebElement R=node;//r1
	    //this.timefunction(); 
		// System.out.println("hi maniii");
	    Actions builder = new Actions(driver); 
	    builder.contextClick(R).build().perform();
	      WebElement Image1 = drilldown;
		  builder.moveToElement(Image1).perform();
		 //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Image1);
		  //JavascriptExecutor js = (JavascriptExecutor)driver;
		  //js.executeScript("arguments[0].perform();", Image1);
	
	}
	public void contextclick2(WebElement R)
	{
		//WebElement R = node;//r2
	    this.timefunction();      		
	    Actions builder = new Actions(driver); 
	    builder.contextClick(R).build().perform();
	    WebElement Image2 = top10transc;
	    builder.moveToElement(Image2).perform();
	}
	public void contextclick3(WebElement R)
	{
		//WebElement R = node;//r3
	    this.timefunction();      		
	    Actions builder = new Actions(driver); 
	    builder.contextClick(R).build().perform();
	    WebElement Image3=group1;
	    builder.moveToElement(Image3).perform();
	}
	public void  timefunction()
	{
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
