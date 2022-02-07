package TestngCases;

import org.testng.annotations.Test;



public class CustomPriority3 {

	
	@Test(priority=2)
	
	public void F1()
	{
		System.out.println("F1 Running");
	}
	
	@Test(priority=1)
	
	public void k1()
	{
		System.out.println("K1 Running");
		
	}
	
	@Test(priority=3)
	
	public void s1()
	{
		System.out.println("s1 Running");
		
	}
	@Test(priority=5)
	
	public void z1()
	{
		System.out.println("z1 Running");
		
	}
	
	
	
}
