package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class CreateLead {
	
	public ChromeDriver driver;
	@Before
	public void before(Scenario sc)
	{
		System.out.println(sc.getName());
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");

	}
	
	@And("enter username as (.*)")
	public void enterUName(String uName)
	{
		driver.findElementById("username").sendKeys(uName);
	}

	@And("enter the password as (.*)")
	public void enterPwd(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@When("click on Login button")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("Login is successful")
	public void loginSuccess()
	{
		System.out.println("login is successful");
	}
	@When("click on CRM/SFA link")
	public void clickcrmsfa()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("click on Leads link")
	public void clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
	}
	@And("click on Create Lead link")
	public void clickCLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@Given("enter mandatory fields as (.*) (.*) (.*)")
	public void giveMandateFields(String companyName,String firstNAme,String lastNAme)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstNAme);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastNAme);
	}
	
	@When("click on create lead button")
	public void clickCLButton()
	{
		driver.findElementByXPath("//input [@type ='submit']").click();
	}
	
	@Then("lead is created successfully with the given details")
	public void clSuccess()
	{
		System.out.println("lead is created sucessfully");
	}
	
	@After
	public void closeBrowser(Scenario sc)
	{
		System.out.println(sc.getStatus());
		driver.close();
	}
}
