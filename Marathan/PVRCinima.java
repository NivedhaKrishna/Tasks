package Marathan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PVRCinima {

	public static void main(String[] args) throws InterruptedException {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
	
			driver.get("https://www.pvrcinemas.com/");
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
			
			WebElement genre =driver.findElement(By.xpath("//select[@name='genre']"));
			
			Thread.sleep(2000);
			Select genreOption = new Select(genre);
			genreOption.selectByVisibleText("ANIMATION");

			
			WebElement lang =driver.findElement(By.xpath("//select[@name='lang']"));
			Thread.sleep(2000);
			Select langOption = new Select(lang);
			langOption.selectByVisibleText("ENGLISH");
			
			
			driver.findElement(By.xpath("//button[text()='Apply']")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
			
			
			driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
			
			
			WebElement cinima = driver.findElement(By.xpath("//select[@id='cinemaName']"));
			
//			PVR Heritage RSL ECR Chennai
			Thread.sleep(2000);
			Select cinimaOption = new Select(cinima);
			cinimaOption.selectByVisibleText("PVR Heritage RSL ECR Chennai");
			
			
			WebElement timing = driver.findElement(By.xpath("//select[@name='timings']"));
			Thread.sleep(2000);
			Select timeOption = new Select(timing);
			timeOption.selectByVisibleText("09:00 AM - 12:00 PM");
			
			
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Nivedha");
			
			
			driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("6382926671");
			
			
			driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("AC");
			
			
			driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='17']")).click();
			
			
			driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("3");
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nivedhakrishnan03@gmail.com");
			
			
			WebElement food =driver.findElement(By.xpath("//select[@name='food']"));
			Thread.sleep(2000);
			Select foodOption = new Select(food);
			foodOption.selectByVisibleText("Yes");
			
			
			driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
			
			
			driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='RESEND OTP']//following::button[text() ='CANCEL'][2]")).click();
			
			
			WebElement alert =driver.findElement(By.xpath("//div[@class='swal2-modal swal2-show']"));
			System.out.println("Alert Message: "+alert.getText());
			

			System.out.println("Page title is : " + driver.getTitle());

			driver.close();


			
			
			
	}

	
}
