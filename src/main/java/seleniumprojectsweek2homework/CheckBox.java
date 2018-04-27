package seleniumprojectsweek2homework;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[1]").click();
		driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[2]").click();
		boolean b=driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[1]").isSelected();
		
		if(b==true)
			
			driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[1]").click();

		System.out.println(b);
		/*if(driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[1]").getText()=="Java")
		{
			System.out.println("true");
	
		}
		else
			System.out.println("false");*/
	}

}
