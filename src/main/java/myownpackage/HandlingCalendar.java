package myownpackage;

import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendar{
	@Test
	public void handlingCalendar(){
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("KBC",Keys.TAB);
		driver.findElementByXPath("//input[@title='Select Departure date for availability']").click();
		WebElement calender = driver.findElementById("divCalender");
		List<WebElement> rows = calender.findElements(By.xpath("//table[@class='WithBorder']/tbody/tr"));
		System.out.println(rows.size());
		List<WebElement> sections = rows.get(0).findElements(By.xpath("//table[@class='WithBorder']/tbody/tr/td"));
		System.out.println(sections.size());

		String monthYear,date;
		System.out.println("enter date and monthYear");
		Scanner scan=new Scanner(System.in);
		monthYear=scan.next();
		date=scan.next();

	for(int i=0;i<sections.size();i++) {
			List<WebElement> rows1 = sections.get(i).findElements(By.tagName("tr"));
			System.out.println(rows1.size());
			for(int j=0;j<rows1.size();j++) 
			{
				if(j==2)
					continue;
				List<WebElement> columns = rows1.get(j).findElements(By.tagName("td"));
								
				
			
				for(int k=0;k<columns.size();k++)
				{
					//System.out.println(columns.get(k).getText());
					if(columns.get(k).getText().equals(monthYear)) 
					{
					if(columns.get(k).getText().equals(date))
						columns.get(k).click();
					
					
				}
				}
				
			}
		}

	}
}


