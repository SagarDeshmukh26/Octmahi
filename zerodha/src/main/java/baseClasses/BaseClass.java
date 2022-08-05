package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configurations.Configuration;

public class BaseClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configuration.appUrl);
				
		driver.manage().window().maximize();
		driver.quit();
	}

}
