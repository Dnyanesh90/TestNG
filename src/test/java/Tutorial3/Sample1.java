package Tutorial3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample1 {
	@BeforeClass
	public void setup()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("After class");
	}
		
	@Test
	public void s1()
	{
		System.out.println("S1 test case in Sample2  class");
	}
	
	@Test
	public void s2()
	{
		System.out.println("S2 test case in Sample2 class");
	}


}
