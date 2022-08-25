package testClass;

import org.testng.annotations.Test;

import basePackage.Baseclass;
import pages.SearchPage;

public class TC_001 extends Baseclass
{
	
	SearchPage home;
	
	@Test
	public void tc01()
	{
		home=new SearchPage(driver);
		home.clickOnStartPoint();
		home.clickOnDestination();
		home.searchBtn();
		home.printListTable();
	}

}
