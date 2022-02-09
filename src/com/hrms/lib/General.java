package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.utility.Log;

public class General extends Global{
	
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","G:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened"); // java Console
		Log.info("Application Opened"); // log4j -- logfile
		
	}
		
		
	
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		//System.out.println("Login Completed"); //java
		Log.info("Login Completed"); // log4j
		
		
	}
	
	public void enterFrame() {
		driver.switchTo().frame(frame_emp);
		//System.out.println("Entered Frame");
		Log.info("Entered Frame");
	}
	
	public void add_emp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(FN);
		driver.findElement(By.name(txt_ELN)).sendKeys(LN);
		driver.findElement(By.id(btn_save)).click();
		//System.out.println(" New Emp Added");
		Log.info("New Emp Added"); // log4j
		
	}
	
	public void editEmp() {
		driver.findElement(By.xpath(name_Emp)).click();
		driver.findElement(By.name(btn_edit_save)).click();
		driver.findElement(By.name(txt_EFN)).clear();
		driver.findElement(By.name(txt_ELN)).clear();
		driver.findElement(By.name(txt_EFN)).sendKeys(FN);
		driver.findElement(By.name(txt_ELN)).sendKeys(LN);
		driver.findElement(By.name(btn_edit_save)).click();
		System.out.println("Employee Edited");
	}
	
	
	public void del_emp(){
		driver.findElement(By.name(checkbox)).click();
		driver.findElement(By.xpath(btn_del)).click();
		System.out.println("Deleted Employee");
		
	}
	
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit From Frame");
	}
	
	
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
	}
	
		public void closeApplication() {
			driver.close();
			System.out.println("Logout Completed");
		
	}
		
	

	}

