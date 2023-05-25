package Selenium_day8Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.snapdeal.com/");
		driver.manage().window().maximize();


		//Go to Mens Fashion
		WebElement hoverele = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(hoverele).perform();
		Thread.sleep(2000);

		//Go to Sports Shoes
		WebElement subhover= driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(subhover).click().build().perform();

		//Get the count of the sports shoes
		WebElement shoecount = driver.findElement(By.xpath("//span[@class=\"category-name category-count\"]"));
		System.out.println("Shoe Count: "+shoecount.getText());

		//Training Shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		//Sort By
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//li[@data-index=\"1\"]//self::li[@data-sorttype=\"plth\"]")).click();

		//Check Sort
		//		List<WebElement> ele= driver.findElements(By.xpath("//span[@class=\"lfloat product-price\"]"));
		//		for(WebElement el: ele) {
		//			System.out.println("Check the product is sorted : "+el.getText());
		//		}

		//Price
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow btn btn-line btn-theme-secondary')]")).click();

		//Multicolor
		Thread.sleep(2000);
		WebElement color = driver.findElement(By.xpath("//label[@for='Color_s-Multi%20Color']"));

		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(color));
		firstResult.click();

		//cost and discount
		WebElement cost =driver.findElement(By.xpath("//span[@id=\"display-price-680798097097\"]"));
		System.out.println("Cost of the Product "+cost.getText());
		WebElement discount = driver.findElement(By.xpath("//div[@class=\"product-discount\"]//span"));
		System.out.println("discount of the product "+discount.getText());

		//First Result
		WebElement elee = driver.findElement(By.xpath("//img[@title=\"Figor Stylish/Comfortable Multi Color Training Shoes\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(elee).click().perform();

		//Screenshot
		TakesScreenshot ts =((TakesScreenshot) driver) ;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\Snaps\\screenshot.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot capture");
		driver.close();
		





	}
}
