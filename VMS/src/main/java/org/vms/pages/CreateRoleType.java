package org.vms.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.vms.utility.TakeScreenShot;

public class CreateRoleType {
	
	public WebDriver driver;
	
	public CreateRoleType(WebDriver driver) {

		this.driver=driver;	
	}
	
	public void roleType(String roleCode,String roleName) throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//span[text()='Role Type']")).click();	
		driver.findElement(By.xpath("//a[text()='Create Role Type']")).click();
		driver.findElement(By.xpath("//input[@id='roletypecode']")).sendKeys(roleCode);
		
		driver.findElement(By.xpath("//input[@id='roletypename']")).sendKeys(roleName);
		
		List<WebElement> roleList=driver.findElements(By.xpath("//input[@formcontrolname='viewPermission']"));
		roleList.get(0).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.xpath("//button[text()='Submit']"));
		js.executeScript("arguments[0].scrollIntoView();",element);
		element.click();	
		TakeScreenShot.screenShot(driver);
	}
}
