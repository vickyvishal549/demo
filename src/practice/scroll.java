package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
public static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,500)");
	 Thread.sleep(5000);
	 js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500;");
}
}
