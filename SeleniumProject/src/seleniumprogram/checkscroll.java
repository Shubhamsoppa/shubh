package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkscroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement shubh = driver.findElement(By.cssSelector("//*[@title='Meri Jaan Tune Mujhko Paagal Hai Kiya Mera Lagda Na Jiya Tere Bagair (Lyrics) Maan Meri Jaan - King']"));
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-3000)");
		driver.quit();
	}		
}
