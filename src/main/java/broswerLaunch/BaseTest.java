package broswerLaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {	

	protected static  WebDriver driver;

String browser;

     @Test
     public void Launching() {
    	 
    	 if(driver==null) {
    	 WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.get("https://mvnrepository.com/");
    	 driver.quit();
    	 }else if(driver!=null) {
    		 driver=new SafariDriver();
    		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	 driver.get("https://mvnrepository.com/");
        	 driver.quit();
    	 }

     }


    	 
    	 
}  
    	 
    	 
    	 
    	 
    	 
     
	
	
	

