package Testing;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testingtime {

	
	 @BeforeClass
		
		public void beforeClass()
		{
			System.out.println("Beforeclass");
		SoftAssert s = new SoftAssert();
		Assert.fail();
			
		}
	 @AfterClass
	 
	 public void afterClass()
	 
	 {
		 
		 System.out.println("AfterClass");
	 }
    @Test 
    
    public void test()
    
    {
    	
    	System.out.println("Test");
    }
 
    public void method()
    {
    	
    	System.out.println("MethodA");
    }

}


