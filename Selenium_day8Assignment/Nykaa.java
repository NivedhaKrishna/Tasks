package Selenium_day8Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(chromeOptions);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.nykaa.com/");
	driver.manage().window().maximize();
	
	//brand
	WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
	Actions brandac = new Actions(driver);
	brandac.moveToElement(brand).perform();
	
	
	//BrandSearch
	driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
	driver.findElement(By.xpath("//div[@class=\"css-150nd8c\"]//a[text()=\"L'Oreal Paris\"]")).click();
	
	//GetTitle
	System.out.println(driver.getTitle());
	
	//Sort By
	driver.findElement(By.xpath("//span[@class=\"sort-name\"]")).click();
	driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
	
	//Category
	driver.findElement(By.xpath("//span[text()='Category']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Hair']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class=\" css-1nozswx\"]//span[text()='Hair Care']")).click();
	driver.findElement(By.xpath("//span[text()='Shampoo']")).click();

	
	//Concern
	driver.findElement(By.xpath("//span[text()='Concern']")).click();
	driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	
	//Shampoo
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class=\"css-xrzmfa\"]")).click();
	
    Set<String> allWindowHandles = driver.getWindowHandles();
    System.out.println(allWindowHandles.size());
    List<String> handle = new ArrayList<String>(allWindowHandles);
    driver.switchTo().window(handle.get(1));
	
	//ml
	driver.findElement(By.xpath("//span[@class=\" css-d3w64v\"]//self::span[text()='180ml']")).click();
	WebElement rate = driver.findElement(By.xpath("//span[@class=\"css-1jczs19\"]"));
	System.out.println(rate.getText());
	
	//Add to the bag
	driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	//Cart Page
	driver.findElement(By.xpath("//div[@class=\"css-0 e1ewpqpu1\"]")).click();
	
	WebElement iframecount =driver.findElement(By.xpath("//iframe[@class=\"css-acpm4k\"]"));
	driver.switchTo().frame(iframecount);
	
	//Grand 
	WebElement Grand = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']"));
	System.out.println(Grand.getText());
	driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	driver.close();
}

}
