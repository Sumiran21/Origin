package com.allianz.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
       
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getCurrentUrl();   //current URL
		System.out.println(title);
		
		String pagesource = driver.getPageSource();   //pagesource
		System.out.println(pagesource);
		
		
		
		
		
	}

}
