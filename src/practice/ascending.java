package practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<String> price;
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> names = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> text = names.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sort = text.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(text.equals(sort));
	do {
		List<WebElement> names1 = driver.findElements(By.xpath("//tr/td[1]"));
		 price = names1.stream().filter(s->s.getText().contains("Rice")).map(s->getveggieprice(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
		
		if(price.size()<1){
			driver.findElement(By.xpath("//a[@aria-label=\"Next\"]")).click();
		}
		} while (price.size()<1);
	}
	
	private static String getveggieprice(WebElement s) {
		// TODO Auto-generated method stub
		String pr = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pr ;
	}

}
