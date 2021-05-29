package practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart1 {
	
	public static void getdata(WebDriver driver, String[] nameslist ) {
		
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] nameslist = {"Cucumber" , "Carrot" ,"Beans"};
		//Cart1 c = new Cart1();
		getdata(driver,nameslist);
		
	}
	
}
