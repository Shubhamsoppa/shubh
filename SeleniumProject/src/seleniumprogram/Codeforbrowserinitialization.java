package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Codeforbrowserinitialization extends checkingselenium {

	static WebDriver driver;

	public static WebDriver browserInit(String browser) {
		System.setProperty("webdriver. chrome.driver", "C:\\Users\\chromedriver_win32.exe");
		System.setProperty("webdriver. edge.driver", "C:\\Users\\edgedriver_win64.exe");

		if (browser.equals("chrome"))
			driver = new ChromeDriver();
		if (browser.equals("edge"))
			driver = new EdgeDriver();
		return driver;
	}
}
