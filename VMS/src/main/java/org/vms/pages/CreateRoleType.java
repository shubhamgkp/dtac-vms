package org.vms.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.vms.utility.TakeScreenShot;

public class CreateRoleType {
	@FindBy(xpath="//span[text()='Role Type']")
	WebElement roleType;
	
	@FindBy(xpath="//a[text()='Create Role Type']")
	WebElement createRoleType;
	
	@FindBy(xpath="//input[@id='roletypecode']")
	WebElement roleTypeCode;
	
	@FindBy(xpath="//input[@id='roletypename']")
	WebElement roleTypeName;
	
	@FindBy(xpath="//input[@formcontrolname='viewPermission']")
	List<WebElement> roleList;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	
	public WebDriver driver;
	
	public CreateRoleType(WebDriver driver) {

		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}

	
	/*public void roleType(String roleCode,String roleName) throws InterruptedException, IOException {
		
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
	}*/
	
	public void RoleType() {
		
		roleType.click();
		
		
	}
	
	public void CreateRole()
	{
		createRoleType.click();
	}
	
	public void RoleTypeCode(String RoleTypeCode)
	{
		roleTypeCode.sendKeys(RoleTypeCode);
	}
	
	public void RoleTypeName(String RoleTypeName)
	{
		roleTypeName.sendKeys(RoleTypeName);
	}
	
	public void RList()
	{
		roleList.get(3).click();
	}
	public void Button()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.xpath("//button[text()='Submit']"));
		js.executeScript("arguments[0].scrollIntoView();",element);
		submit.click();
	}
	
	
	
	
	
}
