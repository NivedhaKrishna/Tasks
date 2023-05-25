package Selenium_day8Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//Login -> UserName, Password, LoginButton
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//CRM
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]  ")).click();
		//Contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//Merge Contacts 
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//From Contact 
		driver.findElement(By.xpath("//input[@name='ComboBox_partyIdFrom']//following::img[@alt='Lookup'][1]")).click();
		Thread.sleep(3000);
		//Window Handle
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        List<String> handle = new ArrayList<String>(allWindowHandles);
        driver.switchTo().window(handle.get(1));
        String cTitle = driver.getTitle();
        System.out.println(cTitle);

		//Contact List
        WebElement listcontact = driver.findElement(By.xpath("//a[@class='linktext']"));
        listcontact.click();
		driver.switchTo().window(mainWindowHandle);
		String pTitle = driver.getTitle();
        System.out.println(pTitle);
	
		Thread.sleep(3000);
		//Contact To
		driver.findElement(By.xpath("//input[@name='ComboBox_partyIdFrom']//following::img[@alt='Lookup'][2]")).click();
		
		//Window Handles
        Set<String> allWindowHandle = driver.getWindowHandles();
        System.out.println(allWindowHandle.size());
        List<String> handles = new ArrayList<String>(allWindowHandle);
        driver.switchTo().window(handles.get(1));
        System.out.println(driver.getTitle());
		
		//Contact List
        List<WebElement> count = driver.findElements(By.xpath("//a[@class='linktext']"));
        count.get(2).click();
       

		driver.switchTo().window(mainWindowHandle);
		System.out.println(driver.getTitle());
		//Merge
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println("Alert Text: "+a.getText());
		a.accept();
		
		
		


	}

	
}

