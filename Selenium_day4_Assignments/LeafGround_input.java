package Selenium_day4_Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_input {

	public static void main(String args[]) throws InterruptedException {


		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");

		Thread.sleep(2000);
		//DOB Variable 
		String month ="June";
		String day = "2";


		//Just Press Enter and confirm error message*		
		WebElement confirm = driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']"));
		confirm.sendKeys(Keys.ENTER);
		WebElement errorMessage = driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
		String act = errorMessage.getText(); 
		System.out.println("Error message is: "+ act);
		String exp = "Age is mandatory";
		if(exp.contains(act)) 
		{
			System.out.println("Error message is displayed, Test Case Passed");
		}else
		{
			System.out.println("Test Case Failed");
		};


		//Type your name
		WebElement name = driver.findElement(By.xpath("//input[@name='j_idt88:name']"));
		name.sendKeys("Nivedha Krishnan");

		//Append Country to this City.		
		WebElement location =driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']"));
		location.clear();
		location.sendKeys("Cuddalore");

		//Verify if text box is disabled
		driver.findElement(By.xpath("//input[@name='j_idt88:j_idt93']")).isEnabled();

		//Clear the typed text.
		WebElement clearType = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']"));
		clearType.clear();
		clearType.sendKeys("Cleared");

		//Retrieve the typed text.
		WebElement retrieve = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']"));
		System.out.println("Retrieve the Text: "+retrieve.getAttribute("value"));
		retrieve.clear();
		retrieve.sendKeys("value retrieved");

		//Type email and Tab. Confirm control moved to next element.
		WebElement email =driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']"));
		email.sendKeys("nivedhakrishnan03@gmail.com");


		//Type about yourself 
		driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("Work More to get better");	


		//Text Editor
		driver.findElement(By.xpath("//div[@id=\"j_idt88:j_idt103_editor\"]//div[@class=\"ql-editor ql-blank\"]")).sendKeys("Text Editor is working");	

		//Click and Confirm Label Position Changes
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).sendKeys("Nivedha");	

		//		Type your name and choose the third option

		driver.findElement(By.xpath("//input[@name='j_idt106:auto-complete_input']")).sendKeys("Nivedha");	

		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//span[@id='j_idt106:auto-complete_panel']"));

		for (WebElement option : options) {
			if (option.getText().contains("Nivedha")) {
				option.click();
				break;
			}
		}
		//	Type random number (1-100) and confirm slider moves correctly
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));



		for (int i = 1; i <=33 ; i++) {

			slider.sendKeys(Keys.ARROW_RIGHT);

		}
		//Click and Confirm Keyboard appears
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt122']")).sendKeys("Hi");


		WebElement close =	driver.findElement(By.xpath("//button[text()='Close']"));
		close.isEnabled();




		// Type number and spin to confirm value changed
		WebElement spin = driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-up ui-corner-tr ui-button ui-widget ui-state-default ui-button-text-only']"));
		spin.click();


		//Type random number (1-100) and confirm slider moves correctly

		driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("Text based Completed");




		Thread.sleep(2000);
		//Type your DOB (mm/dd/yyyy) and confirm date chosen

		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).sendKeys(Keys.ENTER);

		//	month Text
		while(true) {
			String text = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(text.equals(month)) {
				break;
			}
			else {
				//	moving button
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			}

			List<WebElement> myElements = driver.findElements(By.xpath("//a[@class=' ui-state-default']"));
			for(WebElement e : myElements) {
				if(e.getText().equals(day)) {
					e.click();
				}

			}
		}
		driver.close();

	}

}

