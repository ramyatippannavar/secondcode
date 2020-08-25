package ram.pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityMethod 
{
	
  public static void capturesceenshot(WebDriver driver,String screenshotname)
  {
	  TakesScreenshot tc=(TakesScreenshot)driver;
	  File src= tc.getScreenshotAs(OutputType.FILE);
	 // File dest =new File("/ramya_project1/screenshots/facebook.png");
	  try 
	  {
	FileUtils.copyFile(src, new File("./screenshots/jhssd.png"));
	}
	  catch (IOException e) 
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
}
