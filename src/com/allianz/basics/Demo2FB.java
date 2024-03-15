package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();   //current URL
		System.out.println(url);
		
		String title = driver.getTitle();   //current URL
		System.out.println(title);
		
		String pagesource = driver.getPageSource();   //pagesource
		System.out.println(pagesource);

	}

}
