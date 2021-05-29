package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken1 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links =  driver.findElements(By.xpath("//li[@class=\"gf-li\"]/a"));
		for(int i=0;i<links.size();i++) {
		String url = links.get(i).getAttribute("href");
	HttpURLConnection ht = (HttpURLConnection) new URL(url).openConnection();
	ht.setRequestMethod("HEAD");
	ht.connect();
	int code = ht.getResponseCode();
	System.out.println(code);
	if(code>400) {
		System.out.println("The link broken is" + links.get(i).getText()+code);
	}
	else { 
		System.out.println("The links working fine are" + links.get(i).getText()+"with code"+code);
	}
	
		}
	}

}
