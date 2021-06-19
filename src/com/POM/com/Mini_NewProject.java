package com.POM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mini_NewProject {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement mail;
	

	@FindBy(xpath="//input[@id='passwd']")
     private WebElement passwd;
	
	@FindBy(id="SubmitLogin")
	private WebElement submit;
	
	



	@FindBy(xpath="//a[@class='home']")
	private WebElement home;
	
	@FindBy(xpath="(//a[@class='sf-with-ul'])[1]")
	private WebElement womendress;
	
	@FindBy(xpath="(//a[text()='Dresses'])[1]")
	private WebElement dress1;
	
	@FindBy(xpath="(//a[text()='Summer Dresses'])[1]")
	private WebElement summer;
	
	
	@FindBy(xpath="(//i[@class='icon-eye-open'])[1]")
	private WebElement imgView;
	
	@FindBy(xpath="//a[@title='Close']")
	private WebElement close;
	
	@FindBy(xpath="(//img[@itemprop='image'])[1]")
	private WebElement image;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement addqnty;
	
	@FindBy(xpath="//a[@id='color_13']")
	private WebElement color;
	
	@FindBy(xpath="//select[@id='group_1']")
	private WebElement size;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement submit1;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement checkout;
	
	@FindBy(xpath="//a[@title='Continue shopping']")
	private WebElement contine;
	
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement tshirt;
	
	@FindBy(xpath="//a[@class='quick-view-mobile']")
	private WebElement quickview;
	
	@FindBy(xpath="//img[@id='thumb_3']")
	private WebElement img;
	
	@FindBy(xpath="//a[@title='Close']")
	private WebElement close1;
	
	@FindBy(xpath="//body[@id='category']")
	private WebElement tshirt1;
	
	@FindBy(xpath="//input[@id='quantity_wanted']")
	private WebElement quantity;
	
	@FindBy(xpath="//select[@id='group_1']")
	private WebElement size1;
	
	@FindBy(xpath="//a[@id='color_13']")
	private WebElement clor;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement submit2;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement checkot;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkout2;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement msg;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement checkout3;
	
	@FindBy(xpath="//input[@id='cgv']")
	private WebElement agree;
	
	@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement checkout4;
	
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement pay;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement confirm;
	
	 public Mini_NewProject(WebDriver driver2)
	 {
	this.driver = driver2;
		 PageFactory.initElements(driver, this);
		 	 }

	public static WebDriver getDriver() {
			return driver;
	}


	public WebElement getMail() {
		return mail;
	}


	public WebElement getPasswd() {
		return passwd;
	}
	public WebElement getSubmit() {
		return submit;
	}

	


	public WebElement getHome() {
		return home;
	}


	public WebElement getWomendress() {
		return womendress;
	}


	public WebElement getDress1() {
		return dress1;
	}


	public WebElement getSummer() {
		return summer;
	}

	public WebElement getImgView() {
		return imgView;
	}


	public WebElement getClose() {
		return close;
	}


	public WebElement getImage() {
		return image;
	}

	public WebElement getAddqnty() {
		return addqnty;
	}


	public WebElement getColor() {
		return color;
	}

	public WebElement getSize() {
		return size;
	}


	public WebElement getSubmit1() {
		return submit1;
	}


	public WebElement getCheckout() {
		return checkout;
	}


	public WebElement getContine() {
		return contine;
	}


	public WebElement getTshirt() {
		return tshirt;
	}



	public WebElement getQuickview() {
		return quickview;
	}



	public WebElement getImg() {
		return img;
	}


	public WebElement getClose1() {
		return close1;
	}



	public WebElement getTshirt1() {
		return tshirt1;
	}



	public WebElement getQuantity() {
		return quantity;
	}



	public WebElement getSize1() {
		return size1;
	}



	public WebElement getClor() {
		return clor;
	}



	public WebElement getSubmit2() {
		return submit2;
	}



	public WebElement getCheckot() {
		return checkot;
	}



	public WebElement getCheckout2() {
		return checkout2;
	}



	public WebElement getMsg() {
		return msg;
	}



	public WebElement getCheckout3() {
		return checkout3;
	}



	public WebElement getAgree() {
		return agree;
	}



	public WebElement getCheckout4() {
		return checkout4;
	}



	public WebElement getPay() {
		return pay;
	}



	public WebElement getConfirm() {
		return confirm;
	}



	
	
}
