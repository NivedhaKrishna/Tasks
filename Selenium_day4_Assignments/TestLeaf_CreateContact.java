package Selenium_day4_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf_CreateContact {
	public static void main(String args[]) {
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

		//Create Contact

		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();

		//FirstName & LastName

		driver.findElement(By.id("firstNameField")).sendKeys("Local");

		driver.findElement(By.id("lastNameField")).sendKeys("Local");

		//Department & Description

		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Department Field is filled");

		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Description Field is filled");

		//Email & State/Province	

		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("nivedhakrishnan03@gmail.com");

		WebElement choose =driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));

		Select s = new Select(choose);

		s.selectByVisibleText("Guam");

		// Create Contact
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		// Edit Button

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		// Clear Description

		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();

		//		Important field
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Important Field is filled");

		//		Update Button
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		String titles = driver.getTitle();
		System.out.println("title of the page:   " +titles);

		driver.close();













	}
}
