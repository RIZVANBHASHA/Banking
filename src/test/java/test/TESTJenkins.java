package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TESTJenkins {

	@Test(priority = 1)
	public void rizvan()
	{
		Reporter.log("Rizvan",true);
	}

	@Test(priority = 2)
	public void bhasha()
	{
		Reporter.log("Bhasha",true);
	}
	
	@Test
	public void anjum()
	{
		Reporter.log("Anjum",true);
	}

}
