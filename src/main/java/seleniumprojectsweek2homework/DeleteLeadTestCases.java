package seleniumprojectsweek2homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLeadTestCases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximise the url
		driver.manage().window().maximize();

		//Load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//provide the login details
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Thread.sleep(5000);
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner']/span)[2]").click();
		driver.findElementByName("phoneCountryCode").clear();
		driver.findElementByName("phoneCountryCode").sendKeys("1");
		//driver.findElementByName("phoneAreaCode").sendKeys("044");
		driver.findElementByName("phoneNumber").sendKeys("98");
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		
		String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();

		
		System.out.println(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText());
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(4000);
		System.out.println(driver.findElementByXPath("//div[text()='No records to display']").getText());
		driver.close();
		//String errorMessage = driver.findElementByClassName("x-paging-info").getText();
		//System.out.println(errorMessage);
		

		
	}

}
