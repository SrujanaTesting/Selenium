package seleniumprojects.week1.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnFindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximise the url
		driver.manage().window().maximize();

		//Load the url
		driver.get("https://www.google.com/?gfe_rd=cr&dcr=0&ei=nzelWoyiLuvx8Aeq8JTwDA");
		
		driver.findElementByClassName("gsfi").sendKeys("srujana",Keys.ENTER);
		Thread.sleep(7000);
		
		//driver.findElementByXPath("(//div[text()='srujana'])[2]").click();
		
		List<WebElement> list = driver.findElementsByPartialLinkText("rujana");
		System.out.println(list.size());
		
		
		
		

	}

}
