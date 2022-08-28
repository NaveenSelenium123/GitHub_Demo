package org.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New {
    @BeforeClass
	public void beforeClass() {
		System.out.println("Before Class----");
	}
    @AfterClass
    public void afterClass() {
		System.out.println("After Class-----");
	}
    @BeforeMethod
    public void beforeEachMethod() {
		System.out.println("Before Each Method");
	}
    @AfterMethod
    public void afterEachMethod() {
		System.out.println("After each method");
	}
    @Test
    public void tc1() {
		
	}
}
