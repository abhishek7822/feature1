package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{
	WebDriver driver;
	@FindBy(xpath="(//*[@onblur='checkDOM()'])[1]") private WebElement source;
	@FindBy(xpath="//input[@id='a_FromSector_show']") private WebElement sendinfo;
	@FindBy(css="p[id=airportSurat]") private WebElement clickOnsource;
	@FindBy(xpath="(//*[@onblur='checkDOM()'])[2]") private WebElement findTarget;
	@FindBy(xpath="//span[text()='Mumbai(BOM)']") private WebElement clickOntarget;
	@FindBy(xpath="//button[text()=' Search']") private WebElement clickOnsearch;
	@FindBy(xpath="//*[@class='row no-margn fltResult ng-scope']")private List<WebElement> listTable;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnStartPoint()
	{
		source.click();
		sendinfo.sendKeys("Surat");
		clickOnsource.click();
	}
	public void clickOnDestination()
	{
		findTarget.click();
		clickOntarget.click();
	}
	public void searchBtn()
	{
		clickOnsearch.click();
		
	}
	public void printListTable()
	{

		for(WebElement list:listTable)
				{
					System.out.println(list.getText());
				}
	}

}
