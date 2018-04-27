package seleniumprojects.week1.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		//set the system properties
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");


		//Open the browser
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		//maximise the url
		driver.manage().window().maximize();

		//Load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//provide the login details
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		Thread.sleep(5000);
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("DemoSalesManager");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("DemoSalesManager");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("DemoSalesManager");
		
		//driver.findElementByClassName("smallSubmit").click();
		
		Select dd=new Select(driver.findElementById("createLeadForm_dataSourceId"));
		
		dd.selectByVisibleText("Employee");
		
		Select dd1=new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		
		List<WebElement> allOptions=dd1.getOptions();
		
		dd1.selectByIndex(allOptions.size()-2);
		
		}

}
