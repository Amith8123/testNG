package testNGSamplesB834;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class validLogin {
	WebDriver driver;
  @Test
  public void validLogins(){
	  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
		
		boolean isValidUser=driver.findElement(By.cssSelector("div.flash.success")) != null;
		Assert.assertTrue(isValidUser);
		
  }
  public Object[][] getData() throws IOException, CsvValidationException{
	  String path=System.getProperty("user.dir") + "//resources//dataFiles//userData.csv";
	CSVReader reader=new CSVReader(new FileReader(path));
	String cols[];
	ArrayList<Object> dataList= new ArrayList<Object>();
	while((cols=reader.readNext()) !=null){
		Object record[]= {cols[0], cols[1]};
		dataList.add(record);
	}
	  
	  return null;
	  
  }
		  Properties prop;
		@BeforeTest
		public void setup(){
			prop =new Properties();
			
		}
  
  }


