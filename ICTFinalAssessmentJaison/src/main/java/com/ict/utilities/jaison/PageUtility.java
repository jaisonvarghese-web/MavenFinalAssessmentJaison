package com.ict.utilities.jaison;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageUtility {
	
	public static void sentLoginData(WebElement login,String values)
	{
		login.clear();
		login.sendKeys(values);
        
        
	}
	public static void clickButton(WebElement login) throws InterruptedException
	{
		Thread.sleep(3000);
		login.click();
		
	}
	  public static void actionClick(WebDriver driver,WebElement element) throws InterruptedException
	    {
		    
	    	Actions action = new Actions(driver);
	    	action.moveToElement(element).click().build().perform();
	    	
	    }
	
	public static void displayed(WebElement display) throws InterruptedException
	{
		Thread.sleep(3000);
		display.isDisplayed();
	}
	
	public static void sendInput(WebElement element,String input)
    {
        element.sendKeys(input);
    }
	
public static void selectChkBox(WebElement ele) {
		
		if(!ele.isSelected())
		{
			ele.click();
		}
		
	}

	
}
