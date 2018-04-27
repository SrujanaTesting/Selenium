package seleniumweek2day1classwork;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrames {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Thread.sleep(3000);

		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter name");
		name=scan.next();

//		driver.switchTo().alert().sendKeys(name);
//		driver.switchTo().alert().accept();

		String name1 = driver.findElementById("demo").getText();
		if(name1.contains(name))
			System.out.println("text is verified");
		else
		System.out.println("text not verified");
		

		
	

	}

}
