package Selenium_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LanuchBrowser {

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






		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(element);

		sec.selectByVisibleText("Cold Call");
		//		id="createLeadForm_marketingCampaignId"
		WebElement element1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select s = new Select(element1);

		s.selectByVisibleText("Automobile");
		//		id="createLeadForm_ownershipEnumId"
		WebElement element2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select se = new Select(element2);
		se.selectByVisibleText("Corporation");

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		String title = driver.getTitle();
		System.out.println("title of the page" +title);


	}




}


