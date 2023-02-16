package seleniumprogram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class boottrackcalender {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.chrome.driver","C:\\\\Users\\\\chromedriver_win32.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
/*	driver.findElement(By.id("datepicker1")).click();
	Thread.sleep(500);
	int i =0;
	while(i==0) {
	String monthyear= driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
	if(!(monthyear.equals("November 1995")))
	driver.findElement(By.xpath("//*[text()='Prev']")).click();
	else
		break;
	}
	driver.findElement(By.xpath("//*[text()='28']")).click();*/
	
	driver.findElement(By.id("datepicker2")).click();
	Thread.sleep(1000);
	driver.findElements(By.cssSelector("select[title='Change the year'] option")).get(0).click();
	WebElement year= driver.findElement(By.xpath("//*[@title='Change the year']" ));
    Select y = new Select(year);
	y.selectByVisibleText("1995");
	
	WebElement month= driver.findElement(By.xpath("//*[@title='Change the month']" ));
    Select m = new Select(month);
	m.selectByVisibleText("November");
	
	List<WebElement> dates= driver.findElements(By.xpath("//table//tr//td//a"));
	for(WebElement date:dates)
	if(date.getText().equals("28"))
		date.click();
	
	
	
	
	}
}
