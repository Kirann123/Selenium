package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004 {
 //public static void main(String args[]) {
	@Test
	
	
	public void tc004() {
		
    DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
	obj.del_emp();
	obj.exitFrame();
	obj.logout();
	obj.closeApplication();
}
}
