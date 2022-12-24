package Tutorial3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample2 {
	@BeforeTest
	public void b1()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void b2()
	{
		System.out.println("After Test");
	}
	
	
	
	@BeforeClass
	public void setup() {
		System.out.println("===================================");
		System.out.println("Before class");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("After class");
	}

	@BeforeMethod
	public void m1() {
		System.out.println("Before method in Sample 2 classs");
	}

	@AfterMethod
	public void m2() {
		System.out.println("After method in Sample 2 classs");
		System.out.println("---------------------------");
	}

	@Test
	public void s1() {
		System.out.println("S1 test case in Sample2  class");
	}

	@Test
	public void s2() {
		System.out.println("S2 test case in Sample2 class");
	}


}
