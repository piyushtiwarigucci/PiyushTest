package com.sopra.gucci.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sopra.gucci.core.testCore;

public class SignUp extends testCore{

	
		public synchronized MyAccount createAccount(String Email, String Password, String ConfirmPassword) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,50);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(object.getProperty("home_signIn"))));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(object.getProperty("home_signIn"))));
		driver.findElement(By.xpath(object.getProperty("home_signIn"))).click();
		
		driver.findElement(By.xpath(object.getProperty("createAccount_button"))).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(object.getProperty("createAccount_email"))));
		driver.findElement(By.xpath(object.getProperty("createAccount_email"))).sendKeys(Email);
		driver.findElement(By.xpath(object.getProperty("createAccount_password"))).sendKeys(Password);
		driver.findElement(By.xpath(object.getProperty("createAccount_confirmPassword"))).sendKeys(ConfirmPassword);
		
		driver.findElement(By.xpath(object.getProperty("createAccount_submit"))).click();
		
		return new MyAccount();
		
	}
	
	
}
