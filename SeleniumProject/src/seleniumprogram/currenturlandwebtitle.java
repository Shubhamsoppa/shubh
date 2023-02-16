package seleniumprogram;

public class currenturlandwebtitle extends Codeforbrowserinitialization{
	
	public void checkingtitlepage(String Title) {
		String titleofpage = driver.getTitle();
		
		if(titleofpage.equals(Title))
			System.out.println("test is pass");
		else
			System.out.println("test is fail");
	}
	
		public void checkingurl(String Url) {
			String urlofpage = driver.getCurrentUrl();
			
			if(urlofpage.equals(Url))
			    System.out.println("test is pass");
			else
				System.out.println("test is fail");		
			}
		public static void main(String[] args) {
			browserInit("chrome");
			driver.get("https://www.instagram.com");
			driver.manage().window().maximize();
			
			currenturlandwebtitle shubh = new currenturlandwebtitle();
			shubh.checkingtitlepage("Instagram");
			shubh.checkingurl("https://www.instagram.com/");
			driver.quit();
		}
	}


