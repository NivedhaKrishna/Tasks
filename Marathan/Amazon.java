package Marathan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);



		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Bags");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() =' for boys']")).click();


		WebElement text = driver.findElement(By.xpath("//span[text() ='1-48 of over 50,000 results for']"));

		System.out.println(text.getText());
		String expText =  "1-48 of over 50,000 results for";


		System.out.println("Results: "+expText.substring(13, 20));



		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and text()='American Tourister']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and text()='Safari']")).click();

		//span[@class='a-button-text a-declarative']
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();


		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();

		//First element is changing so common element in safari
		Thread.sleep(5000);
		WebElement bagname = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base' and text()='Safari']//following::span[contains(text(),'Laptop')]"));
		System.out.println("The Bagname of the first product"+bagname.getText());

		WebElement cost = driver.findElement(By.xpath("//span[@class='a-offscreen' and contains(text(),'2,149')]"));
		System.out.println("Cost of the first Product"+cost.getText());


		System.out.println("Page title is : " + driver.getTitle());

		driver.close();


	}
}
