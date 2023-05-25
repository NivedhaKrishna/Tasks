package Selenium_day8Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf_Handle {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();

		//Open
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println("Open Button Tap");
		String currentwindow = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("Open Window Size: "+allWindows.size());
		for(String ec:allWindows) {
			System.out.println(ec);

		}

		List<String> li = new ArrayList<String>(allWindows);
		driver.switchTo().window(li.get(1));	
		driver.close();
		driver.switchTo().window(currentwindow);


		//Open Multiple
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		System.out.println("Open Multiple Button Tap");
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println("Open Multiple Window Size: "+allWindow.size());	 
		List<String> lis = new ArrayList<String>(allWindow);

		for (String eachHandle : lis) {
			if (!eachHandle.equals(currentwindow)) {
				driver.switchTo().window(eachHandle).close();
			}
		}
		driver.switchTo().window(currentwindow);


		//Close Window
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		System.out.println("Close Window Button Tap");

		Set<String> allWindo = driver.getWindowHandles();
		System.out.println("Close Window Size: "+allWindo.size());	 
		List<String> list = new ArrayList<String>(allWindo);

		for (String eachHandle : list) {
			if (!eachHandle.equals(currentwindow)) {
				driver.switchTo().window(eachHandle).close();
			}
		}
		driver.switchTo().window(currentwindow);



		//Open with delay
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		System.out.println("Open with delay Tap");
		Thread.sleep(2000);
		Set<String> allWind = driver.getWindowHandles();	 
		List<String> lists = new ArrayList<String>(allWind);
		System.out.println("Open with delay Window Size: "+allWind.size());	 
		for (String eachHandle : lists) {
			if (!eachHandle.equals(currentwindow)) {
				driver.switchTo().window(eachHandle).close();
			}
		}
		driver.switchTo().window(currentwindow);





	}
}
