//https://github.com/Amith8123/testNG.git
package testNGSamplesB834;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScript {
	WebDriver driver;
	//@BeforeMethod
	@BeforeTest(enabled=false)
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
  @Test(enabled=false)
  //(alwaysRun=true,dependsOnMethods="cypressSearch")
  public void JavaTutorial() {
	 // WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement srcbox=driver.findElement(By.name("q"));
		srcbox.sendKeys("Java Tutorial");
		srcbox.submit();
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");

	  
	  
  }
  @Test(enabled=false)
  public void Selenium() {
	 // WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(driver.getTitle(), "Google Search");

		WebElement srcbox=driver.findElement(By.name("q"));
		srcbox.sendKeys("Selenium");
		srcbox.submit();
		System.out.println(driver.getCurrentUrl());
		//SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(driver.getTitle(), "Selenium - Google Search");

}
  //@AfterMethod
  @AfterTest(enabled=false)
  public void terminate() {
	  driver.close();
  }
  
}