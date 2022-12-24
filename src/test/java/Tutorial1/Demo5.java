package Tutorial1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo5 {
	@Test
	public void xyz()
	{
		Assert.assertEquals(12, 12);
	}
	
	@Test(dependsOnMethods={"xyz"})
	public void a()
	{
		System.out.println("a method");
	}
	
	@Test(dependsOnMethods={"a"})
	public void pqr()
	{
		System.out.println("pqr method");
	}
	

}
