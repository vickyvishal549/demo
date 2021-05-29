package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.className("blinkingText")).click();
		 Set<String> windows = driver.getWindowHandles();
		Iterator<String> it =  windows.iterator();
	String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		String name = driver.findElement(By.cssSelector("p[class*=\"im-para red\"]")).getText();
		String[] splitted = name.split("with");
		String[] second = splitted[0].split("at");
		String finalname = second[1].trim();
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(finalname);
	}

}
