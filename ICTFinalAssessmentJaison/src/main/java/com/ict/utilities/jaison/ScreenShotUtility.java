package com.ict.utilities.jaison;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {
	
	public static void takeScreenShot(WebDriver driver) throws IOException
    {
        
                
        File screenshots =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
        long unique=System.currentTimeMillis();
       // screenshots.getClass().getMethods().toString();
        FileUtils.copyFile(screenshots,new File(System.getProperty("user.dir")+"\\screenshots\\"+methodname+"_"+unique+".jpg"));
    }

}
