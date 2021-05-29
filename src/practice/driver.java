package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
 public static void main (String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
 }
}
