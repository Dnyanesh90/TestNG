package Tutorial1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo7 {
	@Test(priority=1)
	public void setUp()
	{
		Assert.assertEquals("setup", "setup");
	}
	
	@Test(priority=2)
	public void loginfunctionality()
	{
		Assert.assertEquals("login", "login");
	}
	
	@Test(priority=3)
	public void validateHomePageLogo()
	{
		boolean actuallogo=true;
		Assert.assertEquals(actuallogo, true);
	}
	
	@Test(priority=4)
	public void validateUseronPIM()
	{
		String actualUrl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
	
		Assert.assertEquals(actualUrl.contains("pim"), true);
		
	}
	
	@Test(priority=5)
	public void addANewUserInPIM()
	{
		
	}
	
	@Test(priority=6)
	public void addMorePersonalDetails()
	{
		
	}
	
	@Test(priority=7)
	public void addMoreJobDetails()
	{
		
	}
	
	@Test(priority=8)
	public void searchUser()
	{
		
	}
	
	@Test(priority=9)
	public void deleteUser()
	{
		
	}

}
