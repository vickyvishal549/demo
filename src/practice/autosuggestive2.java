package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.id("autocomplete")).sendKeys("ind");
		List<WebElement> count =  driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/div"));
		for (int i=0; i<count.size();i++) {
			String value = count.get(i).getText();
			if(value.equalsIgnoreCase("India")) {
				count.get(i).click();
			}
		}
	}

}
