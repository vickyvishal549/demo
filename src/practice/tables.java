package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 int sum=0;
		List<WebElement> count =  driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/td[4]"));
		int num = count.size();
		for(int i=0;i<num;i++) {
			sum = sum+Integer.parseInt(count.get(i).getText());
		}
		System.out.print(sum);
		int alp = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, alp);
		
		
		
	}

}
