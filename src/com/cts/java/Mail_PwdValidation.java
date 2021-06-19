package com.cts.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Mail_PwdValidation {
		    static boolean isValidMail(String attr1) {
				String emailregex="^(?=.{10,30})+[a-zA-Z0-9+_.-]+@[a-z+(?=..m*n]+$";
		       // Pattern pat = Pattern.compile(emailregex);
		      //  if (attr1 == null)
		       //     return false;
		        return attr1.matches(emailregex);
		    }
			
			static boolean isValidPwd(String attr2) {
				//String pwdregex1= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,50}$" ;
				String pwdregex1="^(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[0-9])"+"(?=.*[@#$%^&+=])"+"(?=.\\S+$).{10,}$";
		      //  Pattern pat = Pattern.compile(pwdregex1);
		     //   if (email == null)
		       //     return false;
		        return attr2.matches(pwdregex1);
		    }
			
		  
		    public static void main(String[] args)
		    {
		        	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Java_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
 	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	   	WebElement passwd = driver.findElement(By.xpath("//input[@id='passwd']"));
	   	
	   	email.sendKeys("vanitha81@gmailcom");
		String attribute1= email.getAttribute("value");
	   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   System.out.println(attribute1);
    System.out.println(isValidMail(attribute1));
	   	
	   //	String email = "contribute@geeksforgeeks.org";
        if (isValidMail(attribute1))
        {
            System.out.println("Email Address is Valid");}
        else
        {
            System.out.println("Email Address is not Valid");
    }
 	  // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        
    	passwd.sendKeys("vaniJn@76$");
	  	String attribute2 = passwd.getAttribute("value");
	  // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 	System.out.println(attribute2);	
		   System.out.println(isValidPwd(attribute2));

	 	
	 	 if (isValidPwd(attribute2))
	        {
	            System.out.println("Password is Valid");}
	        else
	        {
	            System.out.println("Password is not Valid");
	    }
        
	}

}
