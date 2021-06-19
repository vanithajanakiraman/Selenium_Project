package com.base1.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
//import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base_Class1 {

	public static WebDriver driver;
	//browserlaunch
public static WebDriver browserLaunch(String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Java_Selenium\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
	}
//	else if(browser.equalsIgnoreCase("firefox"))
//	{
		
//	}
	else
	{
		System.out.println("Invalid Browser");
	}
	driver.manage().window().maximize();
	return driver;
}
//sendkeys
public static void enterValues(WebElement element,String str)
{
	element.sendKeys(str);
}
//click method
public static void clickOnElement(WebElement element)
{
	element.click();
}
//Action 
	public static void mouseAction(WebElement element,String s)
{
	Actions act=new Actions(driver);
	if(s.equalsIgnoreCase("click"))
	{
		act.click(element).perform();
	}
	else if(s.equalsIgnoreCase("contextclick"))
	{
		act.contextClick(element).perform();
	}
	else if(s.equalsIgnoreCase("doubleclick"))
	{
		act.doubleClick(element).perform();
	}
	else if(s.equalsIgnoreCase("movetoelement"))
	{
		act.moveToElement(element).perform();
	}
}
	//dragandrop
	public static void dragandDrop(WebElement element,WebElement element1)
	{		Actions act=new Actions(driver);
		act.dragAndDrop(element, element1).perform();
	}
	//ismultiple
	public static void multiDrop(WebElement element)
	{
		Select s= new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	//getoptions
	public static void getOption(Select s,WebElement element)
	{
		List<WebElement> options = s.getOptions();
		for (WebElement elements : options)
      {
			String text = elements.getText();
			System.out.println(text);
		}
	}
	//getallselectedoptions
	public static void getAllSelectOptn(WebElement element,String str)
	{   Select s=new Select(element);
		s.selectByValue(str);
	List<WebElement> allSelOptions = s.getAllSelectedOptions();
	for (WebElement webElement : allSelOptions) 
	{
		String text = webElement.getText();
		System.out.println(text);
	}
	/*for (WebElement element1 : allSelOptions)
	{
		if(element1.getText().equals(str))
		{
			System.out.println(element1.getText());
		}
	}*/
	}
//getfirstselct
	public static void getFirstSelect(WebElement element,String Str)
	{
		Select s=new Select(element);
		WebElement firstSelOption = s.getFirstSelectedOption();
		System.out.println(firstSelOption.getText());
	}
//getext
	public static void geText(WebElement element)
	{
		Select s=new Select(element);
		int size = s.getOptions().size();
		System.out.println(size);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < size; i++) 
		{
			//if(i==1||i==3)
			//{}
			String text = options.get(i).getText();
			System.out.println(text);
		}
	}
	
	//robot class
	public static void robotAction(WebElement element,int n) throws AWTException
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
		Robot rob=new Robot();
		int i;
		
		for(i=0;i<n;i++)
		{
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		}
	}
//select
public static void selectDrop(WebElement element,String value)
{
	Select s= new Select(element);
	if(value.equals("index"))
	{
		
		s.selectByIndex(Integer.parseInt(value));
	}
	else if (value.equals("values")) 
	{
		s.selectByValue(value);
		
	}
	else if(value.equals("text"))
	{
		s.selectByVisibleText(value);
	}
}

//close
public static void closeCurrentPage()
{
	driver=new ChromeDriver();
	driver.close();
	
}
//quit
public static void quit()
{
	driver=new ChromeDriver();
	driver.quit();
}


//getUrl

public static void getUrl(String str)
{
	driver.get(str);
}

//getmethod
public static void getMethod(String str)
{
	if(str.equalsIgnoreCase("Url"))
	{
	driver.get(str);
	}
	else if(str.equalsIgnoreCase("title"))
	{
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	else if(str.equalsIgnoreCase("currentUrl"))
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	}
//navigation method
public static void navigateTo(String str)
{
    if(str.equalsIgnoreCase("to"))
    {
	driver.navigate().to(str);
    }
    else if(str.equalsIgnoreCase("back"))
    {
    	driver.navigate().back();
    	
    }
    else if(str.equalsIgnoreCase("forward"))
    {
    	driver.navigate().forward();
    }
    else if (str.equalsIgnoreCase("refresh"))
    {
    	driver.navigate().refresh();
    }
}
//waitconcept
public static void implicitWait(long a)
{
	driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	
		}

public static void explicitWait(WebElement element,long a)
{
	WebDriverWait wait=new WebDriverWait(driver,a);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
}
//Alert
public static void alert(WebElement element,String str)
{
	element.click();
	Alert alrt=driver.switchTo().alert();
	if(str.equalsIgnoreCase("accept"))
	{
	
		alrt.accept();
		element.click();
	}
	else if(str.equalsIgnoreCase("dismiss"))
	{
	alrt.dismiss();
	element.click();
}
	else if(str.equalsIgnoreCase("sendkeys"))
	{
		
		alrt.sendKeys(str);
	}
}
	
/*public static void confirmAccept(WebElement element)
{
	Alert alrt=driver.switchTo().alert();
	
		alrt.accept();					
		element.click();
}
public static void confirmDismiss(WebElement element)
	{
	Alert alrt=driver.switchTo().alert();
		alrt.dismiss();
		element.click();
	}
public static void promAlert(WebElement element)
{
Alert alrt=driver.switchTo().alert();
alrt.accept();
element.click();

}
public static void promSend(WebElement element,String str)
{
Alert alrt=driver.switchTo().alert();
alrt.sendKeys(str);
}*/

//frame
public static void framelement(WebElement element)
{
driver.switchTo().frame(element);
element.click();

}//frame
public static void frameindex(int a)
{
driver.switchTo().frame(a);
}
//isSelect
public static void isSelect(WebElement element)
{
boolean selected = element.isSelected();
System.out.println(selected);
}
//isdisplay
public static void isdisplay(WebElement element)
{
boolean dispalyed = element.isDisplayed();
System.out.println(dispalyed);
}
//isEnabled
public static void isEnabled(WebElement element)
{
boolean enabled = element.isEnabled();
System.out.println(enabled);
}
//windowhandle
public static void windowHandle(String str) throws InterruptedException
{
//driver.switchTo().window(str);
if(str.equalsIgnoreCase("parentwindow"))
{
String str1 = driver.getWindowHandle();
System.out.println(str1);
}
else if(str.equalsIgnoreCase("childwindow"))
{
	Set<String> handles= driver.getWindowHandles();
	Thread.sleep(2000);
	for (String str1: handles)
	{
		System.out.println(str1);
		String title = driver.switchTo().window(str1).getTitle();
		System.out.println(title);
	}
	}
else if(str.equalsIgnoreCase("title"))
{
	String str1 = driver.getWindowHandle();
	String title = driver.switchTo().window(str1).getTitle();
	System.out.println(title);
}
}
//JavaScriptExecutor scrollfunction
public static void scroll(WebElement element,String str)
{
JavascriptExecutor js=(JavascriptExecutor) driver;
if(str.equalsIgnoreCase("click"))
{
	js.executeScript("arguments[0].click();",element);
}
else if(str.equalsIgnoreCase("scrollIntoView"))
{
	js.executeScript("arguments[0].scrollIntoView();",element);
}
else if(str.equalsIgnoreCase("scroll"))
{
	js.executeScript("window.scrollBy(0,500);");
}
}
//Screenshot
public static void screenShot(String str) throws IOException
{
TakesScreenshot ts=(TakesScreenshot) driver;
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
File src=ts.getScreenshotAs(OutputType.FILE);
File destn =new File(str);
// File destn=new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumDay7_Projct\\ScreenShot\\pic.png");
FileUtils.copyFile(src, destn);
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,500);");

}
//getattribute
public static void getattribute(WebElement element,String str)
{
if(str.equalsIgnoreCase("value"))
{
String attr = element.getAttribute("value");
System.out.println(attr);
}
else if(str.equalsIgnoreCase("name"))
{
	String attr = element.getAttribute("name");
	System.out.println(attr);
}
}

}



