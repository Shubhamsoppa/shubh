package seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\\\Users\\\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.cssSelector(".oxd-form-actions.orangehrm-login-action button"));
		login.click();
		
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		Thread.sleep(1000);
	/*	WebElement scroll=driver.findElement(
				By.xpath("//*[text()='dommy ']//parent::div//following-sibling::div//*[contains(text(),'10')]//parent::div//preceding-sibling::div//span//i"));
				
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("argument[0].scrollIntoView();", scroll);
        js.executeScript("argument[0].click();", scroll);
        */
		
		List<WebElement> checkbox= driver.findElements(By.xpath("//*[@class='oxd-table-card']//span//i"));
		for(WebElement checkboxs:checkbox) {
		checkboxs.click();
		}
	}
}