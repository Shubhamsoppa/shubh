package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\\\Users\\\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//NAME LOCATOR//
	/*	Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.cssSelector(".oxd-form-actions.orangehrm-login-action button"));
		login.click();*/
		
		//XPATH LOCATOR//
	/*	Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		login.click();*/
		
	    // XPATH LOCATOR BY CONTAINS//
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(
				By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		login.click();
	}
}
