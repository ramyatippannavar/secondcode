package ram.pack1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTestNG
{
  @Test(dataProvider="data")
  public void f(String uname,String pass) 
  {
	  System.out.println(uname);
	  
	  System.out.println(pass);

  }
  @DataProvider()
  public Object[][] data()
  {
	  String[][] data = {{"name0","name"},{"hello","adnand"}};
	 
	  return data;
  }
}

