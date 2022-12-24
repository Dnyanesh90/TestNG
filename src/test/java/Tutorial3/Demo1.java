package Tutorial3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method");
	}

	@Test
	public void d1() {
		System.out.println("D1 test cases in Demo1  class");
	}

	@Test
	public void d2() {
		System.out.println("D2 test cases in Demo1  class");
	}

	@Test
	public void d3() {
		System.out.println("D3 test cases in Demo1  class");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("After  Method");
		System.out.println("---------------------------");
	} 
		
	}


