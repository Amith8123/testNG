package parallelExecution;

import org.testng.annotations.Test;

public class SampleTestTwo {

	  @Test
	  public void testOne() {
		  long id=Thread.currentThread().getId();
		  System.out.println("TestOne in SampleTestTwo" +id);
		  
	  }
	  @Test
	  public void testTwo() {
		  long id=Thread.currentThread().getId();
		  System.out.println("Testtwo in SampleTestTwo" +id);
		  
	  }
	  @Test
	  public void testThree() {
		  long id=Thread.currentThread().getId();
		  System.out.println("TestThree in SampleTestTwo" +id);
		  
	  }
	  @Test
	  public void testFour() {
		  long id=Thread.currentThread().getId();
		  System.out.println("TestFour in SampleTestTwo" +id);
		  
	  }

}
