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

public class SampleTwo {
	WebDriver driver;
	//@BeforeMethod
	@BeforeTest(enabled=false)
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
  @Test(enabled=false)
 	  public void cypressSearch() {
			 // WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				WebElement srcbox=driver.findElement(By.name("q"));
				srcbox.sendKeys("Cypress");
				srcbox.submit();
				Assert.assertEquals(driver.getTitle(), "Cypress - Google Search");
				System.out.println(driver.getCurrentUrl());
		}
  
 // @AfterMethod
  @AfterTest(enabled=false)
  public void terminate() {
	  driver.close();
  }
		  
  }

