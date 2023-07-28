package Actitime.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	public static ExtentReports getReportObject() {
	String path=System.getProperty("user.dir")+"\\reports\\index.html";	
	//Extends Reports, 
	//ExtentSparkReporter  -> Report Configuraton
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("WebAutomation Result");
	reporter.config().setDocumentTitle("TestResult");
//	reporter.config().set
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Vishal Kumar Sah");
	return extent;
	}
}
