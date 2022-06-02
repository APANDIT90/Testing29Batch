package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Testingtime2 {

	@BeforeClass
	
	public void beofreclass()
	{
		System.out.println("Beofre class1");
		
	}
	
	@AfterClass
	
	public void aftergroup()
	
	{
		
		System.out.println("After Group1");
	}
@Test 
    
    public void test()
    
    {
    	
    	System.out.println("Test");
    }
	
}
