package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclickanddoubleclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\\\Users\\\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement target=driver.findElement(By.xpath("//*[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		
		Thread.sleep(2000);
		
		WebElement target1 =driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
		Actions act1 = new Actions(driver);
		act1.doubleClick(target1).perform();
	}	

}
