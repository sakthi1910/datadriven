package com.vcentry.tnstc.initialiser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialiser {
    /**
     * @author sailajamon
     * declare environment variables
     */
	public static FileInputStream envfis=null;
	public static Properties envprop=null;
	/**
	 * @author sailajamon
	 * declare locator variables
	 */
	public static FileInputStream locatorfis=null;
	public static Properties locatorprop=null;
	public static WebDriver wd=null;
	public static void initialize() throws IOException{
	
		envfis= new FileInputStream(new File(System.getProperty("user.dir")+File.separator+""+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"tnstc"+File.separator+"config"+File.separator+"env.properties"));
	    envprop= new Properties();
		envprop.load(envfis);
		
		locatorfis= new FileInputStream(new File(System.getProperty("user.dir")+File.separator+""+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"tnstc"+File.separator+"config"+File.separator+"locator.properties"));
	    locatorprop= new Properties();
		locatorprop.load(locatorfis);
		if (wd==null){
			if(envprop.getProperty("BROWSER").equals("FIREFOX")){
				 wd= new FirefoxDriver();
		}
		
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//wd.manage().deleteAllCookies();
		
	}
	
	public static WebElement getElementByName(String name){
		 return wd.findElement(By.xpath(locatorprop.getProperty(name)));
		
		 
	}
}
