package learningjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		driver.findElementByName("q").sendKeys("bags");
		driver.findElementByClassName("vh79eN").click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.numberOfElementsToBe(By.className("_1vC4OE"), 40));
		List<WebElement> bagsPrices = driver.findElementsByClassName("_1vC4OE");
		List<Integer> prices=new ArrayList<>();
		for(WebElement bagsPrice:bagsPrices)
		{
			prices.add(Integer.parseInt(bagsPrice.getText().replaceAll("[₹,]","")));
		}
		Collections.sort(prices);
		
		System.out.println("The lowest price is "+prices.get(0)+ " The High price is "+prices.get(prices.size()-1));
		List<WebElement> discountPrices = driver.findElementsByClassName("_3auQ3N");
		List<Integer> discounts=new ArrayList<>();
		for(WebElement discountPrice:discountPrices)
		{
			discounts.add(Integer.parseInt(discountPrice.getText().replaceAll("[₹,]","")));
		}
		Collections.sort(discounts);
		System.out.println("The lowest price is "+discounts.get(0)+ " The High price is "+discounts.get(discounts.size()-1));
	}

}
