package Selenium_day4_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf_DuplicateLead {
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
		//Leads options
		driver.findElement(By.xpath("//a[text() ='Leads']")).click();
		//Find Lead
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();		
		//EMail Field
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("nivedhakrishnan03@gmail.com");
		//Click the Find Lead Button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture the first code
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='linktext' and text()='12600']")).click();
		//Duplicate Lead Button
		WebElement duplicate = driver.findElement(By.xpath("//a[text()='Duplicate Lead']"));
		duplicate.click();
		//title of the page
		String titles = driver.getTitle();
		System.out.println("title of the page" +titles);
		//create Lead Button
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(2000);
		//verify the data
		
		String actual_msg=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
	    
		String expect="Test";
		                
		if(actual_msg.contains(expect)) 
		{
		    System.out.println("Duplicate leadname same As caputured leadname");
		}else
		{
		    System.out.println("Duplicate leadname are not same As caputured leadname");
		};	
		
		driver.close();
		
	}
}
