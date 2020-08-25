package excel;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import ram.pack1.Excel_data;

public class Exceldatafrom_map 
{
  @Test
  public void f() 
  {
	  try 
	  {
		Map<String,String> data=Excel_data.getdata();
		for(Entry<String,String> map:data.entrySet())
		{
			System.out.println("key =" +map.getKey()   +"value ="+map.getValue());
		}
		
	  } 
	  catch (IOException e) 
	  {
		e.printStackTrace();
      }
  }
}
