package Selenium_day4_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Radio {
	public static void main(String args[]) throws InterruptedException {


		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");

		//		Your most favorite browser
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:2']")).click();


		//		UnSelectable
		driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();


		//		Find the default select radio button
		driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c']//following::label[text()='Safari'][2]")).click();


		//		Select the age group (only if not selected)
		driver.findElement(By.xpath("//label[text()='41-60 Years']")).click();
		driver.close();


	}

}
