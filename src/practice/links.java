package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 List<WebElement> count  = driver.findElements(By.tagName("a"));
		System.out.println(count.size());
		WebElement footheader = driver.findElement(By.id("gf-BIG"));
		int counter = footheader.findElements(By.tagName("a")).size();
		System.out.println(counter);
		WebElement firstcol =footheader.findElement(By.xpath("//div[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		int fircou = firstcol.findElements(By.tagName("a")).size();
		System.out.println(fircou);
		for(int i=1;i<fircou;i++) {
			firstcol.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL, Keys.ENTER);
		}
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
