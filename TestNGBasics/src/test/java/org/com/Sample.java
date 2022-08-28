package org.com;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Browser launch--------");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("close Browser");
	}
	@BeforeMethod
	public void beforeMethod() {
	Date d =new Date();
	System.out.println("Start Time "+d);
	}
	@AfterMethod
public void afterMethod() {
	Date d =new Date();
	System.out.println("End Time"+d);
}
	@Test
	public void tc1() {
		System.out.println("TC1---------------");
	}
	@Test
	public void tc2() {
		System.out.println("TC2---------------");
	}
	@Test
	public void tc3() {
		System.out.println("TC3---------------");
	}
}
