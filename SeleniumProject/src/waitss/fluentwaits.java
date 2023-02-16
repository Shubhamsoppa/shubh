package waitss;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwaits {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	
	FluentWait fwait= new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(3))
			.ignoring(NoSuchElementException.class);
	driver.findElement(By.id("alert")).click();
	fwait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	driver.quit();
	
}
}
