package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class dates {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.path2usa.com/travel-companions");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("travel_date")).click();
		//String month = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"]) [1]")).getText();
	while(!driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"]) [1]")).getText().contains("April 2021")) {
		driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
	}
		List<WebElement> count =driver.findElements(By.xpath("//td[@class=\"day\"]"));
	for (int i=0; i<count.size();i++) {
		String date = count.get(i).getText();
		if(date.equalsIgnoreCase("21")) {
			count.get(i).click();
		}
	}
}
}
