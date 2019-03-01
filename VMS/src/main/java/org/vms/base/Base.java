package org.vms.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	
	public WebDriver driver;
	//public Properties prop;
	
	@BeforeMethod
	public void browserInitiate() throws IOException{
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.navigate().to("http://192.168.0.116/#/authentication/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		/*File file = new File(System.getProperty("user.dir")+"/or.properties");
		FileInputStream fs = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fs);*/			
	}
	
	@AfterMethod
	public void browserClose(){
		
		driver.close();
	}
}
