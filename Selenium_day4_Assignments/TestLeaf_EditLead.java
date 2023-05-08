package Selenium_day4_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf_EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//CRM
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]  ")).click();
		//Lead
		driver.findElement(By.xpath("//a[text() ='Leads']")).click();
		//Find Lead
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Name Field
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("TestLeaf");
		//Find Lead Button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture the code
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='linktext' and text()='11096']")).click();
		//Edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//update the company Name
		WebElement updateCompany = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		updateCompany.clear();
		updateCompany.sendKeys("Wipro");
		//update Button
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//close
		driver.close();
		
	}
}
