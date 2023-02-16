package waitss;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explictwaits {
	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("WebDriver.chrome.driver", "C:\\\\Users\\\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		WebElement iframe=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);       
		
		WebDriverWait wa= new WebDriverWait(driver,Duration.ofSeconds(60));
		wa.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));   ///using explicit wait-dynamic wait-(thread.sleep not used)
		
		WebElement source=driver.findElement(By.cssSelector("#slider span"));
		Actions act= new Actions(driver);
		act.clickAndHold(source).build().perform();
		act.moveToElement(source,550,0).release().build().perform();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Download")).click();
		wa.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Download Builder']")));
		
		WebElement verify = driver.findElement(By.xpath("//*[text()='Download Builder']"));
		String text = verify.getText();
		System.out.println(text);
		driver.quit();
	}
}
