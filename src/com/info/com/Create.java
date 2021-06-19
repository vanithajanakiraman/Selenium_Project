package com.info.com;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.POM.com.Mini_NewProject;
import com.base1.com.Base_Class1;


public class Create extends Base_Class1{
    public static WebDriver driver;


	public static void main(String[] args) throws IOException {
		
		
		driver=browserLaunch("chrome");
		   implicitWait(5);

		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		   implicitWait(5);

		Mini_NewProject mp=new Mini_NewProject(driver);
		   implicitWait(5);

	    enterValues(mp.getMail(), "vanitha81@gmail.com");
	   implicitWait(5);
	   enterValues(mp.getPasswd(), "vanijn");
	    implicitWait(5);
	   	clickOnElement(mp.getSubmit());
	    implicitWait(5);
		clickOnElement(mp.getHome());
		 implicitWait(10);
	 	  mouseAction(mp.getWomendress(),"movetoelement");
		   implicitWait(3);
		   mouseAction(mp.getDress1(),"movetoelement");
		   implicitWait(5);
		   clickOnElement(mp.getSummer());
		   implicitWait(10);
			  implicitWait(10);
			  clickOnElement(mp.getImgView());
			   implicitWait(20);
			   frameindex(0);
			   implicitWait(10);
			   implicitWait(30);
			   
			   driver.switchTo().parentFrame();
			   implicitWait(30);
			   clickOnElement(mp.getClose());
			   clickOnElement(mp.getImage());
			   implicitWait(10);
			   clickOnElement(mp.getAddqnty());
			   implicitWait(10);
			   clickOnElement(mp.getAddqnty());
			   clickOnElement(mp.getColor());
			   implicitWait(10);
			   selectDrop(mp.getSize(),"3");
			   implicitWait(10);
			   clickOnElement(mp.getSubmit1());
			   implicitWait(10);
		      clickOnElement(mp.getCheckout());      
		      implicitWait(20);
			screenShot("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumDay7_Projct\\ScreenShot\\summary4.png");
		 implicitWait(10); 
		clickOnElement(mp.getContine());
		implicitWait(10);
		clickOnElement(mp.getTshirt());
		implicitWait(10);
  	clickOnElement(mp.getQuickview());
   implicitWait(30);
	frameindex(0);
	implicitWait(30);
				 
	clickOnElement(mp.getImg());
	 implicitWait(25);
	driver.switchTo().defaultContent();
	clickOnElement(mp.getClose1());
					
	implicitWait(40);
	//implicitWait(20);

	clickOnElement(mp.getTshirt1());
	 implicitWait(10);
	enterValues(mp.getQuantity(),"1");
						
	implicitWait(10);
								 
	selectDrop(mp.getSize1(),"2");
	implicitWait(10);
	clickOnElement(mp.getClor());
	implicitWait(10); 
	clickOnElement(mp.getSubmit2());
	implicitWait(10);
   clickOnElement(mp.getCheckot());      
    implicitWait(10);
  //  implicitWait(10);
    screenShot("C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\SeleniumDay7_Projct\\\\ScreenShot\\\\summary4.png");
    clickOnElement(mp.getCheckout2());
    implicitWait(10);
    enterValues(mp.getMsg(),"sucessfully placed order");
    implicitWait(10);
    clickOnElement(mp.getCheckout3());
    implicitWait(10);
    clickOnElement(mp.getAgree());
    implicitWait(10);
    clickOnElement(mp.getCheckout4());
    implicitWait(10);
    clickOnElement(mp.getPay());
    implicitWait(10);
    clickOnElement(mp.getConfirm());
    implicitWait(10);
    screenShot("C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\SeleniumDay7_Projct\\\\ScreenShot\\\\orderplaced4.png");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
