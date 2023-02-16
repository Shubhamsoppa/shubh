package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkingselenium {

	public static void 	m1() throws InterruptedException {
		System.setProperty("webdriver. chrome.driver","C:\\Users\\chromedriver_win32.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.youtube.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	    driver.get("https://www.facebook.com");
		driver.close();
		driver.quit();
 
	}
}
