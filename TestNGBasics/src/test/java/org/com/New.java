package org.com;

import org.testng.Assert;
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
		String s1="JAVA";
		String s2="JAVA";
		Assert.assertEquals(s1,s2);
	}
    @Test
    public void tc12() {
		String s1="JAVA";
		String s2="JAVA2";
		Assert.assertEquals(s1,s2);
	}
    
    
    
    
}
