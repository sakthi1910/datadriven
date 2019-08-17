package com.vcentry.tnstc.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vcentry.inputreader.inputReader;
import com.vcentry.tnstc.initialiser.Initialiser;
import com.vcentry.tnstc.pages.RegPage;

public class RegPageTest extends Initialiser {
	@Test(dataProvider="RegPageTest")
  public void validateRegPage(String tcname,String username, String Password, String CPassword, String SecQuestion, String SecAnswer) throws IOException{
	  initialize();
	  wd.get(envprop.getProperty("URL"));
	 /* WebElement username=wd.findElement(By.xpath("//input[@name='txtUserLoginID']"));
		username.sendKeys("mk195.75");
		WebElement password=wd.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("sairam123");
		WebElement confirmpwd=wd.findElement(By.xpath("//input[@name='txtConfirmPassword']"));
		confirmpwd.sendKeys("sairam123");
		WebElement sq= wd.findElement(By.xpath("//select[@name='txtSecretQuestion']"));
		Select s= new Select(sq);
		s.selectByIndex(2);
		WebElement sa= wd.findElement(By.xpath("//input[@name='txtSecretAnswer']"));
		sa.sendKeys("fasfa");*/
	  
	 /* WebElement username=wd.findElement(By.xpath(locatorprop.getProperty("REGPAGE_TYPE_USERNAME_XPATH")));
		username.sendKeys("mk195.75");
		WebElement password=wd.findElement(By.xpath(locatorprop.getProperty("REGPAGE_TYPE_PASSWORD_XPATH")));
		password.sendKeys("sairam123");
		WebElement confirmpwd=wd.findElement(By.xpath(locatorprop.getProperty("REGPAGE_TYPE_CONFIRMPWD_XPATH")));
		confirmpwd.sendKeys("sairam123");
		WebElement sq= wd.findElement(By.xpath(locatorprop.getProperty("REGPAGE_SELECT_SQ_XPATH")));
		Select s= new Select(sq);
		s.selectByIndex(2);
		WebElement sa= wd.findElement(By.xpath(locatorprop.getProperty("REGPAGE_TYPE_SA_XPATH")));
		sa.sendKeys("fasfa");*/
	 /* getElementByName("REGPAGE_TYPE_USERNAME_XPATH").sendKeys("mk195.75");
	  getElementByName("REGPAGE_TYPE_PASSWORD_XPATH").sendKeys("sairam123");
	  getElementByName("REGPAGE_TYPE_CONFIRMPWD_XPATH").sendKeys("sairam123");
	  WebElement sq=getElementByName("REGPAGE_SELECT_SQ_XPATH");
	  Select s=new Select(sq);
	  s.selectByIndex(2);
	  getElementByName("REGPAGE_TYPE_SA_XPATH").sendKeys("fakf");*/
	  
	  RegPage.enterUsername(username);
	  RegPage.enterPassword(Password);
	  RegPage.enterCPassword(CPassword);
	  RegPage.enterSecQuestion(SecQuestion);
	  RegPage.enterSecAnswer(SecAnswer);
	  
  }
	@DataProvider(name="RegPageTest")
	public static Object[][] getData() throws Exception{
		if(inputReader.RunModeVerification("RegPageTest")){
		 Object[][] data= inputReader.selectSingleDataOrMulitiData("RegPageTest");
		/*data[0][0]="vcentrya";
		data[0][1]="vcentry123";
		data[0][2]="vcentry123";
		data[0][3]="High school name?";
		data[0][4]="cbdahdbvk"; 
		
		data[1][0]="vcentryb";
		data[1][1]="vcentry523";
		data[1][2]="vcentry523";
		data[1][3]="High school name?";
		data[1][4]="cbdahdbgk"; 
		
		data[2][0]="vcentryc";
		data[2][1]="vcentry623";
		data[2][2]="vcentry623";
		data[2][3]="High school name?";
		data[2][4]="cbdahdbyk";*/
		return data; 
		 
	}
		return null;
	}
	
}
