package Tutorial2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	@BeforeMethod
	public void setup() {
		System.out.println("Before Method");//1  4 7
	}

	@Test
	public void login() {
		System.out.println("login test casee");//
	}
	
	@Test(priority=1)
	public void homepage() {
		System.out.println("Home page test case");//
	}

	@Test(priority=2)
	public void contactpage() {
		System.out.println("contact page test case");//
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("After Method");//3  6 9
		System.out.println("-------------------------------");
	}

}
