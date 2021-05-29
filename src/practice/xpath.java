package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/#/index");
		 Thread.sleep(5000);
		 //driver.findElement(By.xpath("/html/body/app-root/div/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[4]/a")).click();
		 driver.findElement(By.xpath("//li[@class='current']/following-sibling::li[2]")).click();
}
}