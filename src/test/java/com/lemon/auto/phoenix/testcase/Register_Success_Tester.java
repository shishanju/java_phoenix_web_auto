package com.lemon.auto.phoenix.testcase;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lemon.auto.phoenix.base.BastTester;
import com.lemon.auto.phoenix.base.Locator;
import com.lemon.auto.phoenix.util.ExcelUtil;
import com.lemon.auto.phoenix.util.LocatorUtil;

public class Register_Success_Tester extends BastTester {

	@BeforeMethod
	public void eforeMethod() {
		driver.get("http://www.baidu.com");
		
	}
	
	@Test(dataProvider="getDatas")
	public void test_success(String mobliephone, String password, String pwdconfirm) throws InterruptedException {
/*		getElement(By.id("")).sendKeys("");
		getElement(By.id("")).sendKeys("");
		getElement(By.id("")).sendKeys("");*/
//		HashMap<String, Locator> locatorMap = LocatorUtil.getPageMapByPageName("注册页面");
		
		getElement("手机号输入框").sendKeys(mobliephone);
		getElement("密码").sendKeys(password);
		getElement("验证码").sendKeys(pwdconfirm);
		Thread.sleep(2000);
		WebElement loginbtn = getElement("提示信息");
		Assert.assertNull(loginbtn);
		
	}
	
	@DataProvider
	public Object[][] getDatas() {
		Object[][] datas = ExcelUtil.readExcel("", 1);
		return datas;
	}
}
