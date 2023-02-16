package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattributes{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//*[text()='Demo Home']//parent::div")).getAttribute("class");
	//	System.out.print("check");
		
		Thread.sleep(2000);
		driver.findElement(By.id("isAgeSelected")).click();
	//	driver.findElement(By.id("isAgeSelected")).click();
	//	driver.findElement(By.id("isAgeSelected")).click();

		String shubh = driver.findElement(By.id("txtAge")).getAttribute("style");
		System.out.println(shubh);
		if(shubh.contains("block"));
		System.out.println("checkbox is checked");
		driver.quit();
		
	}
}
