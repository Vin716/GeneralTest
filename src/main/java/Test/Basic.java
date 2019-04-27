package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","Applications/Firefox.app/Contents/MacOS/firefox");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println("Title:" + driver.getTitle());
		
	}

}
