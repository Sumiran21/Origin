package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
        
        driver.findElement(By.name("UserFirstName")).sendKeys("John");
        driver.findElement(By.name("UserLastName")).sendKeys("Wick");
        driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
        driver.findElement(By.name("UserFirstName")).sendKeys("John");
        
        Select titledrop = new Select (driver.findElement(By.name("UserTitle")));
        titledrop.selectByVisibleText("IT Manager");
        
        
        Select employeedrop = new Select (driver.findElement(By.name("CompanyEmployees")));
        employeedrop.selectByVisibleText("201 - 500 employees");
        
        Select countrydrop = new Select (driver.findElement(By.name("CompanyCountry")));
        countrydrop.selectByVisibleText("United Kingdom");
        
        driver.findElement(By.xpath("//*[text()='Online training and live onboarding webinars']")).click();
        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
        driver.findElement(By.name("start my free trial")).click();
        
        WebElement actualerror = driver.findElement(By.xpath("//*[text()='Enter a valid phone number']"));
       
        String errortext = actualerror.getText();
        System.out.println("error message: " + errortext);
     
       

	}

}
