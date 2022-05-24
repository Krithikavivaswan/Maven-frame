package com.unittest;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.google.common.annotations.VisibleForTesting;

public class Sample {
	
	@Test
	public void tc1() {
System.out.println("Test 1");
	}
	@Ignore
@Test
 public void tc3() {
System.out.println("Test 3");
}
	
	@Test
	public void tc2() {
System.out.println("Test 2");
	}
	
	@Before
	public void befTc() {
System.out.println("TC started....");
Date d=new Date();
System.out.println(d);
		
	}
	
	@After
	public void aftTc() {
System.out.println("TC Ends.....");
Date d=new Date();
System.out.println(d);
	}
	
@BeforeClass
public static void befCls() {
System.out.println("Starts....");
	
}

@AfterClass
public static void aftcls() {

	System.out.println("Ends.......");
}
	
	
	
}
