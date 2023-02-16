package seleniumprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reusebllitydynamictable extends Codeforbrowserinitialization{
	public void m13() {
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.cssSelector(".oxd-form-actions.orangehrm-login-action button"));
		login.click();	
	}
	public void m2(String fName ,String lName) {
		driver.findElement(
				By.xpath("//*[text(),'"+ fName +"']//parent::div//following-sibling::div//*[contains(text(),'"+ lName +"')]//parent::div//preceding-sibling::div//span//i")).click();;
	}
	public static void main(String[] args) throws InterruptedException {
		Codeforbrowserinitialization.browserInit("chrome");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		reusebllitydynamictable SHU= new reusebllitydynamictable();
		SHU.m13();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	
		SHU.m2("dommy ", "10");
		}

}
