package parallelExecution;

import org.testng.annotations.Test;

public class SampleOneTest {
  @Test
  public void testOne() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TestOne in SampleOne" +id);
	  
  }
  @Test
  public void testTwo() {
	  long id=Thread.currentThread().getId();
	  System.out.println("Testtwo in SampleOne" +id);
	  
  }
  @Test
  public void testthree() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TestThree in SampleOne" +id);
	  
  }
  @Test
  public void testFour() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TestFour in SampleOne" +id);
	  
  }
}
