package Input;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;



public class Inputform {
   
	
	    
	    public static void main(String[] args) throws InterruptedException {
	    	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhagpand\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		
		driver.findElementByXPath("//li[@class='tree-branch']//a[contains(text(),'Input Forms')]").click();
	    driver.findElementByXPath("//li[@class='tree-branch']//ul//li//a[contains(text(),'Simple Form Demo')]").click();
    
          Thread.sleep(5000);
          
         driver.findElementByXPath("//input[@id='user-message']").sendKeys("Hello World");
         driver.findElementByXPath("//button[contains(text(),'Show Message')]").click();
    }
	    
	    
	 
    
	     
	    
    
    
    

}
