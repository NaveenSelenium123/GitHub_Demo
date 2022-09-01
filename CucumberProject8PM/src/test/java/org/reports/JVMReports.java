package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	public static void cucumberReport(String json) {
	File f=new File("C:\\Users\\navee\\OneDrive\\Desktop\\CucumberProject8PM\\target");
	Configuration c =new Configuration(f,"Cucumber 9 PM");
	c.addClassifications("Sprint number","5");
	c.addClassifications("Operating System","Windows");
	c.addClassifications("Windows","8");
	c.addClassifications("BrowserName","GoogleChrome");
	c.addClassifications("Version Number","100");
	List<String> l=new ArrayList<>();
	l.add(json);
	ReportBuilder builder =new ReportBuilder(l,c);
	builder.generateReports();
}
}