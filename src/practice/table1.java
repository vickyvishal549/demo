package practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> names =  driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[3]/td"));
		int count = names.size();
		for(int i=0;i<count;i++) {
			String all = names.get(i).getText();
			System.out.println(all);
		}
	}

}
