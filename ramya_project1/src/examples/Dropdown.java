package examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ram.pack1.UtilityMethod;

public class Dropdown 
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-inforbars");
		driver=new ChromeDriver(op);
        driver.get("https://www.facebook.com");
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}
	
	@Test
	public void verifydropdown() throws Exception
	{
	  WebElement drop=driver.findElement(By.xpath("//*[@name='birthday_da']"));
	 
	  drop.click();
	  Select sel=new Select(drop);
      List<WebElement> list=sel.getOptions();
	  for(int i=0;i<list.size();i++)
	  {
	    WebElement all=list.get(i);
	   System.out.println(all.getText());
	   	
	  }
	}

	@AfterMethod()
	public void teardown(ITestResult res)
	{
		if(res.getStatus()==2)
		{
			
			UtilityMethod.capturesceenshot(driver, res.getName());
		}
		driver.quit();
	}
}

