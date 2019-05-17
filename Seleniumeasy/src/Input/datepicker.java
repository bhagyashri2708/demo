package Input;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;




public class datepicker {
   
	
	    public static void main(String[] args) throws InterruptedException {
	    	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhagpand\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		
		driver.findElementByLinkText("Date pickers").click();
		
		Thread.sleep(2000);
		driver.findElementByLinkText("Bootstrap Date Picker").click();
		
		driver.findElementByXPath("//input[@placeholder='Start date']").sendKeys("27081990");
		
		
		driver.findElementByXPath("//input[@placeholder='End date']").clear();
		driver.findElementByXPath("//input[@placeholder='End date']").sendKeys("27082019");
		
		
		driver.close();
		
		
		
	   
	    }}
    
    
    


