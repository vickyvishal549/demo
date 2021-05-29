package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ssl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 DesiredCapabilities c = DesiredCapabilities.chrome();
		 c.acceptInsecureCerts();
		 c.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		 ChromeOptions ch = new ChromeOptions();
		 ch.merge(c);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().deleteCookieNamed("");
	}

}
