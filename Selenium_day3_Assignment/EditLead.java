package Selenium_day3_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.id("label")).click();
		Thread.sleep(2000);


		//		id=
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		WebElement elementDescription  =driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Description is Entered");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Department is Entered");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nivedhakrishnan03@gmail.com");	
		WebElement element  = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		element.click();
		Select sec = new Select(element);
		sec.selectByVisibleText("New York");driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("important note is noted");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String titles = driver.getTitle();
		System.out.println("title of the page" +titles);





	}


}
