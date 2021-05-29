package practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] nameslist = {"Cucumber" , "Carrot" ,"Beans"};
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
	int j=0;
	for(int i=0; i<products.size();i++) {
	String[] names = products.get(i).getText().split("-");
	String formattedname = names[0].trim();
	 List al = Arrays.asList(nameslist);
	if (al.contains(formattedname)) {
		driver.findElements(By.xpath("//div[@class=\"product-action\"]")).get(i).click();
		j++;
		if(j==nameslist.length) {
			break;
		}
	}
		}
	driver.findElement(By.className("cart-icon")).click();
	driver.findElement(By.xpath("//button[text()=\"PROCEED TO CHECKOUT\"]")).click();
	WebDriverWait w = new WebDriverWait(driver,5);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
	driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.className("promoBtn")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Code applied ..!\"]")));
	System.out.println(driver.findElement(By.xpath("//span[text()=\"Code applied ..!\"]")).getText());
	driver.close();
	}
	
}
