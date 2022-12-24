package Tutorial1;

import org.testng.annotations.Test;

public class Demo8 {
	@Test(invocationCount=2)
	public void xyz() 
	{
		System.out.println("xyz method");
	}
	@Test(invocationCount=2)
	public void pqr() 
	{
		System.out.println("pqr method");
	}
	@Test(enabled=false)
	public void abc() 
	{
		System.out.println("abc method");
	}
	@Test(invocationCount=2)
	public void jkl() 
	{
		System.out.println("jkl method");
	}

}
