package ram.pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data
{
     public static Map<String,String> getdata() throws IOException
     {
    	 Map<String,String> testdata=new HashMap<String,String>();
    	 Workbook book;
    	 try {
			   FileInputStream file=new FileInputStream("./files/newfile1.xlsx");
			    book=new XSSFWorkbook(file);
			   Sheet sheet=book.getSheetAt(0);
			   int lastrow=sheet.getLastRowNum();
		     	for(int i=0;i<lastrow;i++)
			     {
				  Row row=sheet.getRow(i);
				  Cell cell=row.getCell(0);
				  String key=cell.getStringCellValue().trim();		
				  Cell cel=row.getCell(1);
				  String value=cel.getStringCellValue().trim();	
				  testdata.put(key, value);
			     }
					
		    }
    	 catch (FileNotFoundException e) 
    	 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
		return testdata; 	 
     }
     
     public static List<Map<String,String>> getMapdata() throws IOException
     {
    	 List<Map<String,String>> data=null;
    	// Map<String,String> testdata1=null;
    	 Workbook book;
    	 try {
			   FileInputStream file=new FileInputStream("./files/newfile1.xlsx");
			    book=new XSSFWorkbook(file);
			    //book.getSheetAt(0).getRow(1).get
			   Sheet sheet=book.getSheetAt(0);
			  // int lastrow=sheet.getLastRowNum();
			   int allcell=sheet.getRow(0).getLastCellNum();
		     	for(int i=0;i<allcell;i++)
			     {
				  Row row=sheet.getRow(0);
		     	  Cell cell=row.getCell(i);
		     	  String value =cell.getStringCellValue();
		     	  System.out.println(value);
		         }
			 }
    	 catch (FileNotFoundException e) 
    	 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
		return data;
    	 
     }
}
