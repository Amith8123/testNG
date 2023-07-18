package parallelExecution;

import org.testng.annotations.Test;

public class SampleTestThree {


	  @Test
	  public void testOne() {
		  long id=Thread.currentThread().getId();
		  System.out.println("TestOne in SampleTestThree" +id);
		  
	  }
	  @Test
	  public void testTwo() {
		  long id=Thread.currentThread().getId();
		  System.out.println("Testtwo in SampleTestThree" +id);
		  
	  }
	  @Test
	  public void testThree() {
		  long id=Thread.currentThread().getId();
		  System.out.println("TestThree in SampleTestThree" +id);
		  
	  }
	  @Test
	  public void testFour() {
		  long id=Thread.currentThread().getId();
		  System.out.println("TestFour in SampleTestThree" +id);
		  
	  }


}
