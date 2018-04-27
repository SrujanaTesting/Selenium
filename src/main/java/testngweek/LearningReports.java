package testngweek;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.IOException;

import org.junit.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

public class LearningReports {
	@Test
	public void reportsLearn() throws IOException {
		//creates a new reports folder with html file inside it. 
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
		//The results.html file will be in read mode for the above statement but in order to make it as write mode we use this
		html.setAppendExisting(true);//if it is false else if we don't give this statement we cannot write into html file
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("TC002_EditLead", "Edit a Lead");
		test.assignAuthor("Gopi");
		test.assignCategory("Smoke");
		
		test.pass("Data DemoSalesManager Entered Succussfully"
				,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("Data crmsfa Entered Succussfully"
				,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.fail("Login Button is not clicked");
		
		extent.flush();
		
		
		
		}
}
	


