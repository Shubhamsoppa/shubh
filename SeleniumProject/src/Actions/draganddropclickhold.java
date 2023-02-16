package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropclickhold {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\\\sele\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement drag = driver.findElements(By.cssSelector("#fourth a")).get(0);
		WebElement drop = driver.findElement(By.cssSelector("#amt7 li"));

		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();

		Thread.sleep(2000);
		Actions act1 = new Actions(driver);
		act1.clickAndHold(drag).perform();

		Thread.sleep(10000);
		act1.moveToElement(drop).release().build().perform();
	}
}
