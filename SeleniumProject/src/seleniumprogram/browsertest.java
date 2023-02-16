package seleniumprogram;

public class browsertest extends Codeforbrowserinitialization {
	
	public static void main(String[] args) throws InterruptedException {
		browserInit("edge");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		m1();
	}

}
