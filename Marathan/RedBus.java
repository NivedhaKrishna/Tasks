package Marathan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		


		WebElement cityFrom = driver.findElement(By.xpath("//input[@id='src']"));
		cityFrom.sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();

		Thread.sleep(1000);

		WebElement cityTo = driver.findElement(By.xpath("//input[@id='dest']"));
		cityTo.sendKeys("Bangalore" );
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		
		driver.findElement(By.xpath("//td[text()='12']")).click();
		
	
		
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		
		Thread.sleep(2000);

		WebElement busCount = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		
		System.out.println("Bus Found: "+busCount.getText());
		
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER'][1]")).click();
		
		//span[@class='f-bold busFound']

		WebElement busSecCount = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		
		System.out.println("After sleeper Bus Found: "+busSecCount.getText());
		
		
		System.out.println("Page title is : " + driver.getTitle());
		
		

	}
}
