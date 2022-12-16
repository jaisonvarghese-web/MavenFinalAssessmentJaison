package com.ict.pages.jaison;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ict.utilities.jaison.PageUtility;


public class LoginPage {
	
	
	    WebDriver driver;
	    
	 	@FindBy(name="txtUsername")
	    private WebElement username;
	    
	    @FindBy(name="txtPassword")
	    private WebElement password;
	    
	    @FindBy(name="btnSubmit")
	    private WebElement loginButton;

	    public LoginPage(WebDriver driver)
		{
		    this.driver=driver;
		    PageFactory.initElements(driver, this);
		 }
	    
	    
	    public void loginCredentials(String usernames,String pass) throws InterruptedException
	    {
	    	
	    	PageUtility.sentLoginData(username,usernames);
	    	PageUtility.sentLoginData(password,pass);
	    	PageUtility.clickButton(loginButton);
	    
	    	
	    	
	    }
	    
	    
	    
	    

}
