package Selenium_day8Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement srch =driver.findElement(By.xpath("//input[@name=\"field-keywords\"]"));
		srch.sendKeys("oneplus 9 pro");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label=\"oneplus 9 pro\"]")).click();
		WebElement fproduct = driver.findElement(By.xpath("//span[@class=\"a-price-whole\"]"));

		System.out.println("Oneplus first product mrp: "+fproduct.getText());

		WebElement frate = driver.findElement(By.xpath("//span[@class=\"a-size-base s-underline-text\"]"));
		System.out.println("OnePlus first product rating: "+frate.getText());

		driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).click();

		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles.size());
		List<String> handle = new ArrayList<String>(allWindowHandles);
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);
		//Screenshot
		TakesScreenshot ts =((TakesScreenshot) driver) ;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\Amazon\\screenshot.png");   
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot capture");
		Thread.sleep(2000);
		//Add to card
		driver.findElement(By.xpath("//span[@id=\"submit.add-to-cart\"]")).click();
		System.out.println("clicked");
	
		Thread.sleep(4000);
		WebElement sub = driver.findElement(By.xpath("//span[@id=\"attach-accessory-cart-subtotal\"]"));

		System.out.println("Mobile SubTotal is: "+sub.getText());
		driver.quit();




	}
}
