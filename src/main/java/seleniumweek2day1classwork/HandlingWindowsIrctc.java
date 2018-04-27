package seleniumweek2day1classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsIrctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allWin =new ArrayList<String>();
		allWin.addAll(allWindows);
		driver.switchTo().window(allWin.get(1));
		System.out.println(driver.findElementByXPath("//div[@class='content-ele']/p[2]").getText());
		driver.switchTo().window(allWin.get(0));
		driver.findElementById("usernameId").sendKeys("srujana");

	}

}
