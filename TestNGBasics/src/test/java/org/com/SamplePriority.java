package org.com;

import org.testng.annotations.Test;

public class SamplePriority {
	@Test(priority=2)
	public void tc1() {
		System.out.println("TC1---------------");
	}
	@Test(priority=0)
	public void tc2() {
		System.out.println("TC2---------------");
	}
	@Test(priority=-1)
	public void tc3() {
		System.out.println("TC3---------------");
	}
	@Test(priority=-3)
	public void tc4() {
		System.out.println("TC1---------------");
	}
	@Test(priority=1)
	public void tc5() {
		System.out.println("TC2---------------");
	}
	@Test(priority=7)
	public void tc6() {
		System.out.println("TC3---------------");
	}
	

}
