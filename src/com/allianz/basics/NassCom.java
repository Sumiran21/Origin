package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NassCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://nasscom.in/");
        
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.xpath("//li[text()='register']")).click();
        driver.findElement(By.id("edit-field-fname-reg-0-value")).sendKeys("admin");
        driver.findElement(By.id("edit-field-lname-0-value")).sendKeys("pass");
        driver.findElement(By.id("edit-mail")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("edit-field-company-name-registration-0-value")).sendKeys("Google");
        Select business  = new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
        business.selectByVisibleText("IT Consulting");
        
        
        
        

	}

}
