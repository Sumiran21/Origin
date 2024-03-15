package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoCiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
        
        
        WebElement product = driver.findElement(By.xpath("(//*[text()='select your product type'])[2]"));
        product.click();
        driver.findElement(By.xpath("(//*[text()='Credit Card'])[2]")).click();
         
        //Select producttype = new Select (product);      --- no select tagname in html
        //producttype.selectByVisibleText("Credit Card");
        
        driver.findElement(By.id("citiCard1")).sendKeys("4545");
        driver.findElement(By.id("citiCard2")).sendKeys("5656");
        driver.findElement(By.id("citiCard3")).sendKeys("8887");
        driver.findElement(By.id("citiCard4")).sendKeys("9998");
        driver.findElement(By.id("cvvnumber")).sendKeys("123");
        driver.findElement(By.id("bill-date-long")).click();
        
        Select yeardrop = new Select (driver.findElement(By.className("ui-datepicker-year")));
        yeardrop.selectByValue("2022");
        
        Select monthdrop = new Select (driver.findElement(By.className("ui-datepicker-month")));
        monthdrop.selectByValue("4");
        
        driver.findElement(By.xpath("//a[text()='14']")).click();
        driver.findElement(By.xpath("//div[@class='colCTA']")).click();
        
        WebElement validation = driver.findElement(By.xpath("//li[text()='• Please accept Terms and Conditions ']"));
        String validationMessage = validation.getText();
        System.out.println("validation message: "+ validationMessage);
        
        
        
           

	}

}
