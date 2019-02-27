package org.vms.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;
	public Properties prop;

	public LoginPage(WebDriver driver, Properties prop) {

		this.driver=driver;	
		this.prop=prop;
	}

	public void Login(String login, String pass) {

		driver.findElement(By.xpath("//input[@name='loginid']")).sendKeys(login);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='Login']")).click();		
	}
}
