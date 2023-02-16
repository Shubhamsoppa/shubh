package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\\\Users\\\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement txt = driver.findElement(By.xpath("//h5[text()='Login']"));
		String returnstr=txt.getText();
		System.out.println(returnstr);
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		username.sendKeys("8275924220");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		password.sendKeys("28111995");
		
		WebElement login = driver.findElement(
				By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		login.click();
		
/*		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement hyperLink = driver.findElement(By.linkText("OrangeHRM, Inc"));
		hyperLink.click();
		Thread.sleep(1000);
	    WebElement hyperLink1 = driver.findElement(By.partialLinkText("OrangeHRM,"));
		hyperLink1.click();*/
		
	}
}
