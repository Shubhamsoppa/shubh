package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alarthandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\\\Users\\\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit .SECONDS);
		
		driver.findElement(By.name("alert")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.name("confirmation")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.name("prompt")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("shubham");
		driver.switchTo().alert().accept();
		
	}

}
