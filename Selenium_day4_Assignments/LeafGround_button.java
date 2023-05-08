package Selenium_day4_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_button {
	public static void main(String args[]) throws InterruptedException {


		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");

		//		Click and Confirm title	
		driver.findElement(By.xpath("//span[text()='Click']")).click();

		driver.navigate().back();

		//		Confirm if the button is disabled.
		driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();

		//		Find the position of the Submit button
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt94']")).click();

		//		Find the Save button color
		driver.findElement(By.xpath("//span[text()='Save']")).click();

		//		Find the height and width of this button
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']")).click();

		//		Mouse over and confirm the color changed
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt100']")).click();

		//		Click Image Button and Click on any hidden button
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt102:imageBtn']")).click();

		//		Image isEnable
		driver.findElement(By.xpath("//div[@class='ui-overlaypanel-content']")).isEnabled();

		driver.findElement(By.xpath("//h5[text()= 'Click Image Button and Click on any hidden button']")).click();

		//		How many rounded buttons are there?

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Primary']")).click();

		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt108']")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt109']")).click();

		driver.findElement(By.xpath("//span[text()='Info']")).click();

		driver.close();

	}

}
