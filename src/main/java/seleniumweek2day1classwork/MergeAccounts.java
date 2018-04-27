package seleniumweek2day1classwork;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeAccounts extends ProjectMethods{
	@Test
	public void mergeAccounts() throws InterruptedException {
		click(locateElement("xpath","//a[text()='Accounts']"));
		click(locateElement("xpath","//a[text()='Merge Accounts']"));
		click(locateElement("xpath","(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("xpath","(//div[@class='x-form-element']/input)[1]"),"11452");
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		String number=getText(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		System.out.println(number);
		clickWithoutSnap(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		switchToWindow(0);

		click(locateElement("xpath","(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath","(//div[@class='x-form-element']/input)[1]"),"11453");
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		wait.until(ExpectedConditions.elementToBeClickable(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		clickWithoutSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		switchToWindow(0);

		clickWithoutSnap(locateElement("xpath","//a[text()='Merge']"));
		acceptAlert();
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath","(//label[text()='Account ID:']/following::input)[1]"),number);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(4000);
		System.out.println(getText(locateElement("xpath","//div[text()='No records to display']")));
		closeBrowser();

	}

}
