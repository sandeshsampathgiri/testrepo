/*Author: Sandesh Sampathgiri
 * */
 
package Test;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ATest {
	
	@Test
	public void one()
	{
		Assert.assertTrue(false);
		
	}
	
	
	@Test
	public void two()
	{
		Assert.assertTrue(true);
	}

}
