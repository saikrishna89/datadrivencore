package com.datadriven.core.datadrivencore.testcases;

import org.testng.annotations.Test;

import com.datadriven.core.datadrivencore.BaseTest;

public class TestSuiteA extends BaseTest{

	@Test
	public void testA() {
		openBrowser("chrome");
	}
	
	@Test
	public void testB() {
		System.out.println("testB");
	}
}
