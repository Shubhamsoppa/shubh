package seleniumprogram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class handlingdropdown {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("WebDriver.chrome.driver","C:\\\\Users\\\\chromedriver_win32.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfb%20sign%7C&placement=&creative=589460569891&keyword=fb%20sign&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-296321047089%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiA_P6dBhD1ARIsAAGI7HAuxR2Ef2vlNUtJEEYNNL3ZglZk0nL0FW-Zlec0Ai9mRFMq8MDVfUMaAlfYEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	/*	driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("shubham");
		driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("soppa");
		driver.findElement(By.cssSelector("[name='reg_email__']")).sendKeys("8275924420");
		driver.findElement(By.cssSelector("[name='reg_passwd__']")).sendKeys("143143");
		
		List<WebElement> days =driver.findElements(By.xpath("//*[@id='day']//option"));
		for(WebElement day:days)
			if(day.getText().equals("28"))
		 day.click();
		
		List<WebElement> months =driver.findElements(By.xpath("//*[@id='month']//option"));
		for(WebElement month:months)
			if(month.getText().equals("Nov"))
		 month.click();
		
		List<WebElement> years =driver.findElements(By.xpath("//*[@id='year']//option"));
		for(WebElement year:years)
			if(year.getText().equals("1995"))
		 year.click();
		
		WebElement btn =driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		btn.click();
		Thread.sleep(1000);
		System.out.println(btn.isSelected());
		driver.findElement(By.cssSelector("[type='submit']")).click();*/
		
		Thread.sleep(1000);
		WebElement year= driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("1995");
		
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		Select m= new Select(month);
		m.selectByIndex(0);
		
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		Select d= new Select(day);
		d.selectByVisibleText("28");
	}
	
}
