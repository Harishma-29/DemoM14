package demo;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test (groups="smoke")
	public void addTest()
	{
		
		System.out.println("add");
		System.out.println("sub");
		System.out.println("div");
	}

}
