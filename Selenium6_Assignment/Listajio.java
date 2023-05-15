package Selenium6_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listajio {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(chromeOptions);

	//  Load the URL https://en-gb.facebook.com/
	driver.get("https://www.ajio.com/");
	
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	
	
	driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Bags",Keys.ENTER);
	
	driver.findElement(By.xpath("//label[@for='Men']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	
	
	WebElement Itemcount = driver.findElement(By.xpath("//div[@class='length']"));
	System.out.println("Category Item Men: "+Itemcount.getText());

	String count = "695 Items Found";
	System.out.println("Category Item Men + Fashion Bags: "+count.substring(0, 3));
	List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='brand']"));
	System.out.println("BrandName :  "+myElements.size());

	for(WebElement e : myElements) {
		String s =e.getText();
		System.out.println("BrandName : "+s);
	}
	
	
	List<WebElement> myElement = driver.findElements(By.xpath("//div[@class='nameCls']"));
	System.out.println("BagName :  "+myElement.size());
	for(WebElement ed : myElement) {
		
		String s =ed.getText();
		
		System.out.println("BagName :  "+s);
		

	}
	

}
}
