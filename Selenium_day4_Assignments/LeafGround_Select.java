package Selenium_day4_Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Select {
	public static void main(String args[]) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");


		//Which is your favorite UI Automation tool?
		WebElement select =driver.findElement(By.xpath("//div[@class='col-12']//following::select[@class='ui-selectonemenu']"));
		select.click();
		Select automationtool = new Select(select);
		automationtool.selectByVisibleText("Selenium");

		//Choose your preferred country.
		driver.findElement(By.xpath("//div[@class='col-12']//following::div[@id='j_idt87:country']")).click();

		driver.findElement(By.xpath("//li[@id='j_idt87:country_3']")).click();

		Thread.sleep(2000);
		
		//		Confirm Cities belongs to Country is loaded
		WebElement n = driver.findElement(By.xpath("//div[@class='col-12']//following::div[@id='j_idt87:city']"));
		n.click();
		
		driver.findElement(By.xpath("//li[@data-label=\"Chennai\"]")).click();

		//		Choose the Course
		driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only')]")).click();

		driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']")).click();

		//		Choose language randomly
		driver.findElement(By.xpath("//div[@class='col-12']//following::div[@id='j_idt87:lang']")).click();

		driver.findElement(By.xpath("//li[@data-label='English']")).click();

		Thread.sleep(2000);
		
		//		Select 'Two' irrespective of the language chosen
		driver.findElement(By.xpath("//div[@class='col-12']//following::div[@id='j_idt87:value']")).click();

		driver.findElement(By.xpath("//li[@data-label='Two']")).click();
		driver.close();

	}
}







//options
//List<WebElement> title =driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']"));
//
//	
//	for(int i = 0;i < title.size();i++){
//		System.out.println(title.get(i).getText());
//		if(title.get(i).getText().equalsIgnoreCase("USA")) {
//			title.get(i).click();
//			break;
//		}
//	}