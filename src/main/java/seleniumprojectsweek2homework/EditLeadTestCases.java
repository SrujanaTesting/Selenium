package seleniumprojectsweek2homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLeadTestCases {

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
		
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("a");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//WebDriverWait-Selenium
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		//Thread.sleep(3000);-Java Explicit wait
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		System.out.println(driver.getTitle());
		
		/*String title1=driver.getTitle();
		String title = driver.findElementByXPath("//title[text()='View Lead | opentaps CRM']").getText();
		System.out.println(title);
		if(title1.equals(title))
				System.out.println("title verified");
		else
				System.out.println("title not verified");*/
		
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("test2");
		driver.findElementByXPath("//input[@value='Update']").click();
		WebElement changedName = driver.findElementById("viewLead_companyName_sp");
		System.out.println(changedName.getText());
		if(changedName.getText().startsWith("test1"))
			System.out.println("verified and updated");
		else
				System.out.println("not verified ");		
		driver.close();
	}

}
