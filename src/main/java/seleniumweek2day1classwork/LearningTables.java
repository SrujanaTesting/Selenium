package seleniumweek2day1classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://erail.in/");
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS", Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("GNT", Keys.TAB);
		
		driver.findElementById("txtStationTo").click();
		if(driver.findElementById("chkSelectDateOnly").isSelected())
			driver.findElementById("chkSelectDateOnly").click();
		//driver.findElementByClassName("DataTable TrainList"));
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
	
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rowVal=rows.size();
		for(int i=0;i<rowVal;i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			//System.out.println(columns.size());
			System.out.println(columns.get(1).getText());
		}		
	}

}
