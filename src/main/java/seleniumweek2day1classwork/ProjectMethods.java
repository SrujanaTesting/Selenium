package seleniumweek2day1classwork;

import java.io.IOException;

import org.testng.annotations.*;

import testngweek.LearningExcelInteraction;

public class ProjectMethods extends SeMethods {
	@Parameters({"url","password"})
	@BeforeMethod//(groups= {"All"})
	public void login(String url,String password){
		startApp("chrome",url);
		type(locateElement("id","username"),"DemoSalesManager");
		type(locateElement("id","password"),password);
		click(locateElement("class","decorativeSubmit"));
		click(locateElement("link","CRM/SFA"));
		//click(locateElement("link","Leads"));
	}
	@AfterMethod//(groups= {"All"})
	public void closeapp()
	{
		closeBrowser();	
	}
	@DataProvider(name="getData")
	public Object[][] getData() throws IOException
	{
		LearningExcelInteraction lExcel=new LearningExcelInteraction();
		Object[][] data = lExcel.readExcel();
		


		return data;
		
	}
	
	

}
