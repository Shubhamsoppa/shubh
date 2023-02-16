package Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkingframe extends screenshotss  {
	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\chromedriver_win32.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit .SECONDS);
		
		WebElement iframe=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);       //switching frame to frame
		
	//	WebDriverWait wa= new WebDriverWait(driver, 60);
	//	wa.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));   ///using explicit wait-dynamic wait-(thread.sleep not used)
		
		WebElement source=driver.findElement(By.cssSelector("#slider span"));
		Actions act= new Actions(driver);
		act.clickAndHold(source).build().perform();
		
		Thread.sleep(1000);
		act.moveToElement(source,550,0).release().build().perform();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(1000);
		
		checkingframe ob = new checkingframe();
		ob.screenShot("Velocity");
		driver.quit();
		
	
	}

}
