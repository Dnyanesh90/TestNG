package Tutorial1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo6 {
	@Test
	public void setUp()
	{
		Assert.assertEquals("setup", "setup");
	}
	
	@Test(dependsOnMethods= {"setUp"})
	public void loginfunctionality()
	{
		Assert.assertEquals("login", "login");
	}
	
	@Test(dependsOnMethods= {"loginfunctionality"})
	public void validateHomePageLogo()
	{
		boolean actuallogo=true;
		Assert.assertEquals(actuallogo, true);
	}
	
	@Test(dependsOnMethods= {"validateHomePageLogo"})
	public void validateUseronPIM()
	{
		String actualUrl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
	
		Assert.assertEquals(actualUrl.contains("pim"), true);
		
	}
	
	

}
