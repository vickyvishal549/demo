package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 //s.selectByIndex(1);
		s.selectByVisibleText("USD");
		 System.out.println(s.getFirstSelectedOption().getText());
		driver.close();
	}

}
