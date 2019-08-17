package com.vcentry.tnstc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vcentry.tnstc.initialiser.Initialiser;

public class RegPage extends Initialiser{

	public static void enterUsername(String Username){
		 getElementByName("REGPAGE_TYPE_USERNAME_XPATH").sendKeys(Username);
	}
	public static void enterPassword(String Password){
		getElementByName("REGPAGE_TYPE_PASSWORD_XPATH").sendKeys(Password);
	}
	public static void enterCPassword(String CPassword){
		getElementByName("REGPAGE_TYPE_CONFIRMPWD_XPATH").sendKeys(CPassword);
	}
	public static void enterSecQuestion(String SecQ){
		 WebElement sq=getElementByName("REGPAGE_SELECT_SQ_XPATH");
		  Select s=new Select(sq);
		  s.selectByVisibleText(SecQ);;
	}
	public static void enterSecAnswer(String SecAnswer){
		getElementByName("REGPAGE_TYPE_SA_XPATH").sendKeys(SecAnswer);
	}
}
