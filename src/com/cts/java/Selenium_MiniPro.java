package com.cts.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_MiniPro {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Java_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
	
         
	   	WebElement mail=driver.findElement(By.xpath("//input[@id='email']"));
	   	WebElement passwd = driver.findElement(By.xpath("//input[@id='passwd']"));

		
	   	 String str1="vanitha81@gmail.com";
	     String str2="vanijn";
		  
	    mail.sendKeys("vanitha@gmail.com");
		String attribute1= mail.getAttribute("value");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   System.out.println(attribute1);
     //  mail.clear();     
	//	WebElement mail1=driver.findElement(By.xpath("//input[@id='email']"));		  
	//String mailid = mail.getText();  
		   		
	   	passwd.sendKeys("vanijn");
	  	String attribute2 = passwd.getAttribute("value");
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 	System.out.println(attribute2);	   	   	
	  // passwd.clear();
  
  //    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 	//WebElement submit = driver.findElement(By.id("SubmitLogin"));
 	//submit.click();
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		          
     if(str1.equalsIgnoreCase(attribute1) && str2.equalsIgnoreCase(attribute2)) 
		{
   		System.out.println("The MailId and Password entered are correct");
 		WebDriverWait wait=new WebDriverWait(driver,15);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitLogin"))).click();

				}
     
     else if (str1!=attribute1 && str2.equalsIgnoreCase(attribute2)) {

   	 WebDriverWait wait=new WebDriverWait(driver,15);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitLogin"))).click();
      	 System.err.println("The Mailid entered is incorrect");


	}
     else if(str1.equalsIgnoreCase(attribute1) && str2!=attribute2)
     {
  		System.err.println("The pwd entered is inCorrect");

 		WebDriverWait wait=new WebDriverWait(driver,15);
 	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitLogin"))).click();

     }
    	
				
		else 
		 {
			WebDriverWait wait=new WebDriverWait(driver,15);
		 	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitLogin"))).click();

			System.err.println("both are incorrect");
		}	
     		
     		
	}
	
}
