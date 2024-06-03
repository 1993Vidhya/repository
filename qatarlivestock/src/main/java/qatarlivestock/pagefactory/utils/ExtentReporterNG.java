package qatarlivestock.pagefactory.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG

{

	static ExtentReports extent;
	static ExtentSparkReporter htmlReporter;

	public static ExtentReports getReporterObject()

	{

		String path = System.getProperty("user.dir") + "//testreports//Android_Testing_result.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("Android Test Automation Result");

		reporter.config().setDocumentTitle("Test Results");

		htmlReporter = new ExtentSparkReporter("extentReport.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "Vidhya Vijayan");
		
		extent.setSystemInfo("Device Name", " Pixel-4");

		extent.flush();

		return extent;

	}

}
