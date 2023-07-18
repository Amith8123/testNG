package testNGSamplesB834;

import org.testng.annotations.Test;

public class SampleTest3 {
  @Test(groups="featureone")
  public void testOne() {
	  System.out.println("Test31 is Sample3");
  }
  @Test(groups="featuretwo")
  public void testTwo() {
	  System.out.println("Test32 is Sample3");
  }
  @Test
  public void testThree() {
	  System.out.println("Test33 is Sample3");
  }
  @Test
  public void testFour() {
	  System.out.println("Test34 is Sample3");
  }
  
}
