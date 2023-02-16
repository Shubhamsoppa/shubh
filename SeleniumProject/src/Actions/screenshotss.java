package Actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotss {
	public static WebDriver driver;

	public void screenShot(String name) throws IOException {

		TakesScreenshot scrnsht = (TakesScreenshot) driver;
		File source = scrnsht.getScreenshotAs(OutputType.FILE);
		File destin = new File("C:\\Users\\mis\\Pictures\\Screenshots"+name+".png");
		FileHandler.copy(source, destin);
	}
}