package seleniumweek2day1classwork;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class CreateLeads extends ProjectMethods {
	@Test(dataProvider="getData")
	public void createLeads(String firstName,String lastName,String emailId,String phoneNum,String companyName)
	{
		click(locateElement("link","Leads"));
		click(locateElement("link","Create Lead"));
		type(locateElement("id","createLeadForm_companyName"),companyName);
		type(locateElement("id","createLeadForm_firstName"),firstName);
		type(locateElement("id","createLeadForm_lastName"),lastName);
		click(locateElement("xpath","//input [@type ='submit']"));

	}
	

}
