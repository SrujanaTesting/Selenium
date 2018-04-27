package seleniumprojectsweek2homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		//driver.findElementById("dropdown1").sendKeys("UFT/QTP");
		
		/*Select dd =new Select(driver.findElementById("dropdown1"));
		
		List<WebElement> options = dd.getOptions();
		
		System.out.println(options.size());
		
		dd.selectByIndex(options.size()-2);*/
		
		//Selecting multiple drop down values
		
		Select dd1 =new Select(driver.findElementByXPath("//select[@id='dropdown1']/following::select[5]"));
		
		List<WebElement> options1 = dd1.getOptions();
		
		System.out.println(options1.size());
		
		dd1.selectByIndex(options1.size()-2);
		
		dd1.selectByIndex(options1.size()-1);
	}

}
