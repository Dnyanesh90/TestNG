package Tutorial2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Demo1 {
	@Test(priority=-200)
	public void xyz() 
	{
		System.out.println("xyz method");
	}
	@Test(priority=10)
	public void pqr() 
	{
		System.out.println("pqr method");
	}
	@Test(priority=-110)
	public void abc() 
	{
		System.out.println("abc method");
	}
	@Test(priority=200)
	public void jkl() 
	{
		System.out.println("jkl method");
	}

}
