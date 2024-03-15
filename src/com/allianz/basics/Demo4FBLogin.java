package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//enter username as hello12345677@gmail.com
		
		driver.findElement(By.id("email")).sendKeys("hello12345677@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abcd");
		driver.findElement(By.name("login")).click();
		
		
	}

}
