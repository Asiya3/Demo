package TestngCases;

import org.testng.annotations.Test;

public class DependMethod4 {

	@Test(dependsOnMethods="L1")
	
	public void K1()
	{
		System.out.println("K1 is running");
	}
	
	
	//@Test
	public void L1()
	{
		System.out.println("K1 is running");
	}
	
}
