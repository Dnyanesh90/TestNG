package Tutorial3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method");
	}
	
	@BeforeClass
	public void a1()
	{
		System.out.println("Before class in Demo2 ");
	}

	@AfterClass
	public void a2()
	{
		System.out.println("After  class in Demo2 ");
	}
	
	
	@Test
	public void d1() {
		System.out.println("D1 test case sin Demo2  class");
	}

	@Test
	public void d2() {
		System.out.println("D2 test case sin Demo2  class");
	}

	@Test
	public void d3() {
		System.out.println("D3 test case sin Demo2  class");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("After  Method");
		System.out.println("---------------------------");
	}

}
