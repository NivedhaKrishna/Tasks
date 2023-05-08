package Selenium_day4_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Selenium {
	public static void main(String agrs[]) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		//  Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");

		//	Maximise the window
		driver.manage().window().maximize();

		//	Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//	Create New Account--> //a[@class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"]
		driver.findElement(By.xpath("//div[@class='_6ltg'][2]")).click();

		//	Sign Up
		//	First Name 
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("selenium");

		//	last Name 
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Testty");
		//  Mobile No

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nivedhakrishnan03@gmail.com");

		//	Re-enter password --> reg_email_confirmation__

		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("nivedhakrishnan03@gmail.com");

		//	New Password 
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("testnew@123");

		//	Dob day
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select selday = new Select(day);
		selday.selectByVisibleText("3");

		//	Dob month
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select selmonth = new Select(month);
		selmonth.selectByVisibleText("May");

		//	Dob year
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select selyear = new Select(year);
		selyear.selectByVisibleText("1999");

		//	Gender
		driver.findElement(By.className("_58mt")).click();

		//	SignUp

		driver.findElement(By.xpath("//button[@name='websubmit']")).click();	











	}
}
