package Tutorial4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	@BeforeSuite
	public void setup() {
		System.out.println("Before Suite ");
	}

	@AfterSuite
	public void tearDown() {
		System.out.println("After Suite ");
	}

	@BeforeTest
	public void a1() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void a2() {
		System.out.println("After Test");
	}

	@BeforeClass
	public void b1() {
		System.out.println("Before class");
	}

	@AfterClass
	public void b2() {
		System.out.println("After Class");
	}

	@BeforeMethod
	public void c1() {
		System.out.println("Before Method ");
	}

	@AfterMethod
	public void c2() {
		System.out.println("After Method");
	}

	@Test
	public void d1() {
		System.out.println("D1 method in  Demo1 class");
	}
	
	
	@Test
	public void d2() {
		System.out.println("D1 method in  Demo1 class");
	}

}
