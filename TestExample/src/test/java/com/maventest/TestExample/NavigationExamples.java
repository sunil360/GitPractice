package com.maventest.TestExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class NavigationExamples {
	
	WebDriver driver;
	
  @BeforeClass
  public void NavigateTo()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunilk\\workspace\\TestExample\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.navigate().to("http://www.uftHelp.com");
		driver.manage().window().maximize();
		System.out.println("Browser Navigated to **http://www.uftHelp.com**");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='readmore']/a[@href='http://www.ufthelp.com/2017/08/how-to-install-ie-browser-on-mac-os.html']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
  @Test(priority=2)
  public void NavigateToForward() {
	  
	  driver.navigate().forward();
	  System.out.println("Browser Navigated to Forward");
	  
  }
  
  @Test(priority=1)
  public void Refresh()
  {
	  driver.navigate().refresh();
	  System.out.println("Browser gets refreshed");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  
  @Test(priority=0)
  public void NavigateToBack()
  {
	  driver.navigate().back();
	  System.out.println("Browser navigated to backward");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
}
