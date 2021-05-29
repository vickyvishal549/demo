package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[text()=\"1 Adult\"]")).click();
		 int i=1;
		 while(i<4) {
			 driver.findElement(By.id("hrefIncChd")).click(); 
			 i++;
		 }
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 driver.close();
	}

}
