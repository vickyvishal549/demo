package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken {
public static void main(String[] args) throws MalformedURLException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement link =  driver.findElement(By.xpath("//a[text()=\"REST API\"]"));
	String url = link.getAttribute("href");
	HttpURLConnection h = (HttpURLConnection) new URL(url).openConnection();
	h.setRequestMethod("HEAD");
	h.connect();
int code = h.getResponseCode();
System.out.println(code);
if(code>400) {
	System.out.println("link is broken");

}
else {
	System.out.println("link is working");
}
}
}
