package HIghLevel;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B11_Array {
	
	public WebDriver driver;
	
  @Test
  public void functinality() throws Exception{
	  
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  Thread.sleep(3000);
	  
	  String str = driver.findElement(By.xpath("(//ul[@role='listbox'])[1]")).getText();
	  Thread.sleep(3000);
	  
	  System.out.println(str);
	  System.out.println(str.length());
	  
	  String a[] = str.split("\n");
	  
	  System.out.println(a.length);
	  
	  for (int i=0; i<a.length; i++) {
		  
		  if(a[i].equalsIgnoreCase("selenium sulfide")) 
		  {
			  driver.findElement(By.name("q")).clear();
			   Thread.sleep(3000);
			  driver.findElement(By.name("q")).sendKeys(a[i]);
				  Thread.sleep(3000);
				  System.out.println(a[i]);
				  
				  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		break;
		  }
		  
		  
		  driver.findElement(By.name("q")).clear();

			Thread.sleep(3000);

		  
		  driver.findElement(By.name("q")).sendKeys(a[i]);
			Thread.sleep(3000);
	  }
		  
	  
	  
	  
	//textarea[@id='APjFqb']
  }
  @BeforeTest
  public void beforeTest() {
  
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.get("http://google.com");
  driver.manage().window().maximize();
	  
  }
  
  

  @AfterTest
  public void afterTest() {
  }

}
