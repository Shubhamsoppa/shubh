package seleniumprogram;

public class currenturlandtitlepage1 extends Codeforbrowserinitialization{
	
	public boolean checkingtitlepage(String Title) {
		String titleofpage = driver.getTitle();
		
		if(titleofpage.equals(Title))
			return true;
		else
			return false;
	}
	
		public boolean checkingurl(String Url) {
			String urlofpage = driver.getCurrentUrl();
			
			if(urlofpage.equals(Url))
			   return true;
			else
				return false;		
			}
		public static void main(String[] args) {
			browserInit("chrome");
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
			
			currenturlandtitlepage1 shubh = new currenturlandtitlepage1();
			System.out.println(shubh.checkingtitlepage("Instagram"));
		    System.out.println(shubh.checkingurl("https://www.instagram.com/"));
			driver.quit();
		}
	}


