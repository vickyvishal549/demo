package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	 driver.findElement(By.id("autosuggest")).sendKeys("ind");
	 Thread.sleep(3000);
	List<WebElement> cou =  driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/li/a"));
	for (int i=0;i<=cou.size();i++) {
		String names = cou.get(i).getText();
		if(names.equalsIgnoreCase("India")) {
			cou.get(i).click();
		}
	}
}
}
