/**
 * 
 */
package com.loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * @author SVSP595
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	By uid=By.name("txtUsername");
	By pass=By.xpath(".//*[@id='txtPassword']");
	By submit=By.id("btnSubmit");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	/*public void enterUid()
	{
		driver.findElement(uid).sendKeys("shfy019");
	}*/
	
	public void enterUid(String id)
	{
		driver.findElement(uid).sendKeys(id);
	}
	
	/*public void enterPass()
	{
		driver.findElement(pass).sendKeys("stfc@123");
	}
	*/
	public void enterPass(String pwd)
	{
		driver.findElement(pass).sendKeys(pwd);
	}
	public void Submit()
	{
		driver.findElement(submit).click();
	}
	
	

}
