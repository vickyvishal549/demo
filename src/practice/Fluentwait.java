package practice;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()=\"Dynamic Loading\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Example 1: Element on page that is hidden\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"start\"]/button")).click();
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		WebElement  woo = w.until(new Function<WebDriver,WebElement> () {
		public WebElement apply (WebDriver driver) {
			if(driver.findElement(By.xpath("//div[@id=\"finish\"]/h4")).isDisplayed()) {
			return driver.findElement(By.xpath("//div[@id=\"finish\"]/h4"));
			}
			else {
				return null;
			}
		}
		});
		System.out.println(driver.findElement(By.xpath("//div[@id=\"finish\"]/h4")).isDisplayed());
	}

}
