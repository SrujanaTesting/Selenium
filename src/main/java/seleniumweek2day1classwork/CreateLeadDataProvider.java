package seleniumweek2day1classwork;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

	public class CreateLeadDataProvider extends SeMethods
	{
		//@Test(groups="smoke")
		@Test(dataProvider="fetchdata")
		public void createlead(String cname, String fname, String lname)
		{
			
			startApp("chrome", "http://leaftaps.com/opentaps/control/main");
			
			type(locateElement("id", "username"), "DemoSalesManager");

			type(locateElement("id", "password"), "crmsfa");
			
			click(locateElement("class", "decorativeSubmit"));
			
			click(locateElement("link","CRM/SFA"));
			
			click(locateElement("link","Leads"));
			
			click(locateElement("link","Create Lead"));
			
			type(locateElement("id", "createLeadForm_companyName"), cname);
			
			type(locateElement("id", "createLeadForm_firstName"), fname);
			
			type(locateElement("id", "createLeadForm_lastName"), lname);
			
			click(locateElement("class","smallSubmit"));
			
			closeBrowser();
					
		}
			
		
		@DataProvider(name="fetchdata")
		public Object[][] getdata()
		{
			Object[][] data=new Object[2][3];
			data[0][0]="testleafc";
			data[0][1]="Shena";
			data[0][2]="M";
			
			data[1][0]="testleafa";
			data[1][1]="shalini";
			data[1][2]="A";
			
		return data;	
		}
		
		}
