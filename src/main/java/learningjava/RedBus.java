package learningjava;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/search?fromCityName=Chennai&fromCityId=123&toCityName=Bangalore&toCityId=122&onward=23-Apr-2018&opId=0&busType=Any");
		/*driver.findElementById("src").sendKeys(Keys.ENTER,"Chennai");
		driver.findElementById("dest").sendKeys(Keys.ENTER,"Bangalore");
		driver.findElementByXPath("//label[text()='Onward Date']").click();
		driver.findElementByXPath("//div[@id='rb-calendar_onward_cal']//td[@class='current day']").click();
		driver.findElementById("search_btn").click();*/
		List<WebElement> serviceNames = driver.findElementsByClassName("service-name");
		Thread.sleep(6000);
		Set<String> uniqueServiceNames=new TreeSet<>();
		for(WebElement serviceName:serviceNames)
		{
			System.out.println(serviceName.getText());
			uniqueServiceNames.add(serviceName.getText());
		}
		System.out.println(uniqueServiceNames);
		
	}

}
