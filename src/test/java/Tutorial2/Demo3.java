package Tutorial2;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {
	
	@BeforeMethod
	public static void abc() {
		System.out.println("Before Method");
	}
	@Test(priority =2)
	public static void pqr() {
		System.out.println("x1 method in pass");
	}
	@Test(priority =1)
	public static void xyz() {
		System.out.println("y1 method in pass");
	}
	@Test(priority =3)
	public static void m1() {
		System.out.println("m1 method in pass");
	}
	@Test(priority =6)
	public static void a1() {
		System.out.println("a1 method in pass");
	}
	@Test(priority =5)
	public static void b1() {
		System.out.println("b1 method in pass");
	}
	@Test(priority =4)
	public static void c1() {
		System.out.println("c1 method in pass");
	}
	@AfterMethod
	public static void jkl() {
		System.out.println("After Method");
		System.out.println("------------");
	}
	

}
