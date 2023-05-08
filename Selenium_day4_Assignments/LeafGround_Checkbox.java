package Selenium_day4_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Checkbox {
	public static void main(String args[]) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml");

		//	Basic Checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();


		//	Notification
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();


		//	Choose your favorite language(s)
		driver.findElement(By.xpath("//label[contains(@for,'j_idt87:basic')]")).click();


		//	Tri State Checkbox
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();


		//	Toggle Switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();


		//	Disable
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled();

		
		//	Select Multiple
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();


		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']//following::label[text()='Paris'][2]")).click();


		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']//following::label[text()='London'][2]")).click();


		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']//following::label[text()='Rome'][2]")).click();

		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		
		driver.close();








	}
}
