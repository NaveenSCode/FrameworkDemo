package seleniumpractise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TrailSelenium {
	//System.setProperty();
//	public static void main(String[] args) {
//		
//		//set driver
//		//System.setProperty("webdriver.chrome.driver", "/home/naveen/softwares/Selenium_requirements/chromedriver");
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://google.com");
//		System.out.println("success");
//	}
	
	@Test
	public void initiateBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/naveen/softwares/Selenium_requirements/chromedriver");
		System.setProperty("webdriver.chrome.allowedIps", "http://localhost:8080");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.close();
		System.out.println("success");
	}
	

}
