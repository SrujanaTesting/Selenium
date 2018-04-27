package seleniumprojects.week1.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set the system properties
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				
				//Open the browser
				//ChromeDriver driver = new ChromeDriver();
				FirefoxDriver driver=new FirefoxDriver();
				
				//maximise the url
				driver.manage().window().maximize();

				//Load the url
				driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
				
				driver.findElementByLinkText("Sign up").click();
				
				driver.findElementById("userRegistrationForm:gender:1").click();
				
				driver.findElementById("userRegistrationForm:maritalStatus:1").click();;
				
				Select dd = new Select(driver.findElementById("userRegistrationForm:countries"));
				
				//dd.selectByVisibleText("India");
				
				List<WebElement> countryOptions = dd.getOptions();
				
				driver.findElementByXPath("//option[text()='Egypt']").click();
				
				
				for(WebElement options:countryOptions)
				{
					//System.out.println(options.getText());
					//String countries=options.getText();
					String countires=new String(options.getText());
				
					if(countires.startsWith("E"))
					{
						//System.out.println("true");
						//driver.findElementByXPath("//option[text()='Egypt']").click();
						
					}
				}
				//This is to auto populate the state name after entering pincode value.
				
				//driver.findElementById("userRegistrationForm:pincode").sendKeys("522007",Keys.TAB);
				
				Thread.sleep(10000);
				
				

	}

}
