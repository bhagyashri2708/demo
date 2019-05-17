package Input;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;




public class table {
   
	
	    public static void main(String[] args) throws InterruptedException {
	    	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhagpand\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		
		driver.findElementByLinkText("Table").click();
		
		driver.findElementByLinkText("Table Pagination").click();
		
		
		
		
	   
	    }}
    
    
    


