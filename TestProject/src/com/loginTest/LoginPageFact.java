/**
 * 
 */
package com.loginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author SVSP595
 *
 */
public class LoginPageFact {
	
	WebDriver we;
	Actions ac;
	
	@FindBy(name="txtUsername")
	WebElement uid;
	
	@FindBy(how=How.XPATH,using=".//*[@id='txtPassword']")
	WebElement pass;
	
	@FindBy(how=How.ID,using="btnSubmit")
	WebElement submit;
	
	@FindBy(how=How.XPATH,using="html/body/form/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/div")
	WebElement unoBkExp;
	
	@FindBy(how=How.XPATH,using=".//*[@id='menu1_span1']")
	WebElement Exp;
	
	@FindBy(how=How.XPATH,using=".//*[@id='MenuForm']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/div")
	WebElement transc;
	
	@FindBy(how=How.XPATH,using=".//*[@id='menu2_span2']")
	WebElement emp_exp;
	
	public LoginPageFact(WebDriver we)
	{
		this.we=we;
	}
	
	public void login1(String id,String pwd)
	{
		uid.sendKeys(id);
		pass.sendKeys(pwd);
		submit.click();
		we.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	
	public void ExpEmp()
	{
		
		ac=new Actions(we);
		ac.moveToElement(unoBkExp);
		ac.build().perform();
		
		we.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		ac.moveToElement(Exp);
		ac.click().build().perform();
		
		we.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		ac.moveToElement(transc);
		ac.build().perform();
		
		we.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		ac.moveToElement(emp_exp);
		ac.click().build().perform();
		
	}

}
