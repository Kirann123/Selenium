package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	
	public WebDriver driver;
	public String url = "http://183.82.103.245/nareshit/login.php";
	
	//***** TestData
	
	//       DT   VAR      VV
	
	public String un = "nareshit";
	public String pw = "nareshit";
	public String FN = "Kiran";
	public String LN = "Selenium";
	
	
	
	
	//****** Objects
	
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout   = "Logout";
	public String frame_emp = "rightMenu";
	public String btn_Add = "//input[@value='Add']";
	public String txt_EFN = "txtEmpFirstName";
	public String txt_ELN = "txtEmpLastName";
	public String btn_save = "btnEdit";
	public String name_Emp = "//*[@id=\"standardView\"]/table/tbody/tr[1]/td[3]/a";
	public String btn_edit_save = ("EditMain");
	public String checkbox = "chkLocID[]";
	public String btn_del = "//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";

	

}
