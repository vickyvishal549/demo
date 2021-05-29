package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textvalidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 driver.findElement(By.id("username")).sendKeys("vishal");
		 driver.findElement(By.id("password")).sendKeys("vicky");
		 driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"error\"]")).getText());
	}

}
