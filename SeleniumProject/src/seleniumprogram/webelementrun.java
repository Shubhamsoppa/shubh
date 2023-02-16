package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementrun {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver. chrome.driver","C:\\Users\\chromedriver_win32.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("8275924220");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("28111995");
	
		WebElement clicklogin = driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		clicklogin.click();
		
		
	}

}
