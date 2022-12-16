package com.ict.base.jaison;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


public class BaseClass {
	
	public static Properties properties;
	public static WebDriver driver;
	
	@BeforeTest
	public void onSetup() throws Exception{
		
		properties = new Properties();
		File file =new File(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		FileInputStream inputStream ;
		inputStream = new FileInputStream(file);
		properties.load(new InputStreamReader(inputStream,Charset.forName("UTF-8")));
		if(properties.getProperty("browser").equals("chrome"))
        {
             driver= new ChromeDriver();    
        }
		else if (properties.getProperty("browser").equals("ff")) {
		
        
            driver=new FirefoxDriver();
        }
        else if (properties.getProperty("browser").equals("cc"))
            {
                driver=new EdgeDriver();
            }
		
		 driver.get(((Properties) properties).getProperty("url"));
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		BaseClass.driver = driver;
	}

}
