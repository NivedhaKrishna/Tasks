package Selenium_day4_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf_DeleteLead {
	public static void main(String args[]) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Login -> UserName, Password, LoginButton
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//CRM
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]  ")).click();
		//Lead
		driver.findElement(By.xpath("//a[text() ='Leads']")).click();
		//Find Lead
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("nivedhakrishnan03@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='linktext' and text()='12612']")).click();// to test this line use 12620,12627,12629 or 12677
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[text() ='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("12612");//Use sameCode here too
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//This will capture error message
		String actual_msg=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		    
		// Store message in variable
		String expect="No records to display";
		                
		// Verify error message
		if(actual_msg.contains(expect)) 
		{
		    System.out.println("Test Case Passed");
		}else
		{
		    System.out.println("Test Case Failed");
		};	

		driver.quit();
		
		

		
		
		
		
		
	}
}
