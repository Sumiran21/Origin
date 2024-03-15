package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeddyBuddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.medibuddy.in/");
        
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.className("coperate")).click();
        driver.findElement(By.linkText("Learn More")).click();
        driver.findElement(By.linkText("skip")).click();
        driver.findElement(By.linkText("Login using Username & Password")).click();
        driver.findElement(By.id("username")).sendKeys("John");
        driver.findElement(By.className("submitbtn")).click();
        
        driver.findElement(By.id("password")).sendKeys("John123");
        driver.findElement(By.xpath("//img[@class='show-password m-t-15 cursor-pointer']")).click();
        
        
        
        
        

	}

}
