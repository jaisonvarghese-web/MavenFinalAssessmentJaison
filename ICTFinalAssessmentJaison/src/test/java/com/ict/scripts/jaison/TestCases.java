package com.ict.scripts.jaison;

import java.io.IOException;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.ict.base.jaison.BaseClass;
import com.ict.constants.jaison.AutomationConstants;
import com.ict.pages.jaison.AddEmployee;
import com.ict.pages.jaison.LoginPage;
import com.ict.utilities.jaison.ExcelReadUtility;
import com.ict.utilities.jaison.ScreenShotUtility;



public class TestCases extends BaseClass {
	
LoginPage login;
AddEmployee emp;

	
	@Test(priority=2)
    public void loginWithValidData() throws IOException, InterruptedException
    {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        login = new LoginPage(getDriver());
        
        String userData=ExcelReadUtility.getCellData(0, 0);
        System.out.println(userData);
        String password = ExcelReadUtility.getCellData(0, 1);
        System.out.println(password);
        login.loginCredentials(userData, password);
        Assert.assertEquals(AutomationConstants.expectedValidUserName, userData);
        Assert.assertEquals(AutomationConstants.expectedValidPassword, password);
        
        String currURL = getDriver().getCurrentUrl();
        Assert.assertEquals(AutomationConstants.expectedURL,currURL );
        ScreenShotUtility.takeScreenShot(driver);
        
    }
	
	@Test(priority=1)
    public void loginWithInValidData() throws IOException, InterruptedException
    {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        login = new LoginPage(getDriver());
        
        String userData=ExcelReadUtility.getCellData(1, 0);
        System.out.println(userData);
        String password = ExcelReadUtility.getCellData(1, 1);
        System.out.println(password);
        login.loginCredentials(userData, password);
        Assert.assertEquals(AutomationConstants.expectedInValidUserName,userData);
        Assert.assertEquals(AutomationConstants.expectedInValidPassword, password);
        ScreenShotUtility.takeScreenShot(driver);
        
        
    }
	
	@Test(priority=3)
    public void clickEmployee() throws IOException, InterruptedException
    {
		
		
        emp = new AddEmployee(getDriver());
        emp.addEmployee();
        ScreenShotUtility.takeScreenShot(driver);
	
    }
	
	@Test(priority=5)
    public void EmployeeRegwithValidData() throws IOException, InterruptedException
    {
		
        emp = new AddEmployee(getDriver());
        
        String username =ExcelReadUtility.getCellData(2, 0);
        emp.setName(username);
        Assert.assertEquals(AutomationConstants.expname, username);
        
        String email =ExcelReadUtility.getCellData(2, 1);
        emp.setMail(email);
        Assert.assertEquals(AutomationConstants.expemail, email);
        
        String password = ExcelReadUtility.getCellData(2, 2);
        emp.setPassword(password);
        Assert.assertEquals(AutomationConstants.exppassword, password);
        
        String actualempId=ExcelReadUtility.getCellData(2, 3);
        emp.setempId(actualempId);
        Assert.assertEquals(AutomationConstants.expempid, actualempId);
	      
	      String actualpassword2=ExcelReadUtility.getCellData(2, 4);
	      emp.setPassword2(actualpassword2);
	      Assert.assertEquals(AutomationConstants.exppassword2, actualpassword2);
	      
	      String actualnumber=ExcelReadUtility.getCellData(2, 5);
	      emp.setNumber(actualnumber);
	      Assert.assertEquals(AutomationConstants.expnumber, actualnumber);

	      String actualdesignation=ExcelReadUtility.getCellData(2, 6);
	      emp.setDesignation(actualdesignation);
	      Assert.assertEquals(AutomationConstants.expdesignation, actualdesignation);
	      
	      String actualreportingTo=ExcelReadUtility.getCellData(2, 7);
	      emp.setreportingTo(actualreportingTo);
	      Assert.assertEquals(AutomationConstants.expreportingto, actualreportingTo);
	      
	      String actualmemberOf=ExcelReadUtility.getCellData(2, 8);
	      emp.setmemberOf(actualmemberOf);
	     Assert.assertEquals(AutomationConstants.expmemberof, actualmemberOf);
	      
	      String actualtype=ExcelReadUtility.getCellData(2, 9);
	      emp.setempType(actualtype);
	      Assert.assertEquals(AutomationConstants.exptype, actualtype);
	      
	     // emp.clickreportingStaff();
	      
	      String actualaddress=ExcelReadUtility.getCellData(2, 10);
	      emp.setAddress(actualaddress);
         Assert.assertEquals(AutomationConstants.expaddress, actualaddress);
	      
          emp.clickLogin();
          ScreenShotUtility.takeScreenShot(driver);
        
	
    }
	
	@Test(priority=4)
    public void EmployeeRegwithInValidData() throws IOException, InterruptedException
    {
		
        emp = new AddEmployee(getDriver());
        
        String username =ExcelReadUtility.getCellData(3, 0);
        emp.setName(username);
        //Assert.assertEquals(AutomationConstants.expname, username);
        
        String email =ExcelReadUtility.getCellData(3, 1);
        emp.setMail(email);
        Assert.assertEquals(AutomationConstants.expemail, email);
        
        String password = ExcelReadUtility.getCellData(3, 2);
        emp.setPassword(password);
        //Assert.assertEquals(AutomationConstants.exppassword, password);
        
        String actualempId=ExcelReadUtility.getCellData(3, 3);
        emp.setempId(actualempId);
        //Assert.assertEquals(AutomationConstants.expempid, actualempId);
	      
	      String actualpassword2=ExcelReadUtility.getCellData(3, 4);
	      emp.setPassword2(actualpassword2);
	      //Assert.assertEquals(AutomationConstants.exppassword2, actualpassword2);
	      
	      String actualnumber=ExcelReadUtility.getCellData(3, 5);
	      emp.setNumber(actualnumber);
	     // Assert.assertEquals(AutomationConstants.expnumber, actualnumber);

	      String actualdesignation=ExcelReadUtility.getCellData(3, 6);
	      emp.setDesignation(actualdesignation);
	      //Assert.assertEquals(AutomationConstants.expdesignation, actualdesignation);
	      
	      String actualreportingTo=ExcelReadUtility.getCellData(3, 7);
	      emp.setreportingTo(actualreportingTo);
	     // Assert.assertEquals(AutomationConstants.expreportingto, actualreportingTo);
	      
	      String actualmemberOf=ExcelReadUtility.getCellData(3, 8);
	      emp.setmemberOf(actualmemberOf);
	    // Assert.assertEquals(AutomationConstants.expmemberof, actualmemberOf);
	      
	      String actualtype=ExcelReadUtility.getCellData(3, 9);
	      emp.setempType(actualtype);
	     // Assert.assertEquals(AutomationConstants.exptype, actualtype);
	      
	     // emp.clickreportingStaff();
	      
	      String actualaddress=ExcelReadUtility.getCellData(3, 10);
	      emp.setAddress(actualaddress);
        // Assert.assertEquals(AutomationConstants.expaddress, actualaddress);
	      
          emp.clickLogin();
          
          ScreenShotUtility.takeScreenShot(driver);
        
	
    }
	

}
