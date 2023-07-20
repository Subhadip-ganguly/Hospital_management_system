package testscripts_library;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import generic_library.Excel;
import generic_library.Launch;
import pom_library.LoginPom;


public class Testcase01 extends Launch
{

	@Test
	public void tc1() throws Exception
	{
		String un=Excel.fetch(1, 0);
		String pass=Excel.fetch(1, 1);
		String exp=Excel.fetch(1, 2);
		
		LoginPom p=new LoginPom(driver);
		p.setEmail(un);
		p.setPassword(pass);
		p.clickLogin();
		String act = driver.getTitle();
		
		assertEquals(exp, act);
		
		
	}
}
