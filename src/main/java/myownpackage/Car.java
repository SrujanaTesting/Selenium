package myownpackage;

import org.testng.annotations.BeforeMethod;

public class Car extends Vehicle {
	@BeforeMethod(groups= {"All"})
	public void startApp() {
		openBrowser();
	}

}
