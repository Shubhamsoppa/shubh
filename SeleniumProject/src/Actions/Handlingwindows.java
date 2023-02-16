package Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\\\Users\\\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String winid1= driver.getWindowHandle();
		System.out.println("primary id: "+winid1);
		Thread.sleep(2000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		Set<String> allwinid =driver.getWindowHandles();
		for(String eachwinid:allwinid)
			System.out.println(eachwinid);
		driver.quit();
	}

}
