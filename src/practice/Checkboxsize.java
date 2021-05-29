package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxsize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		int count = driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size();
		System.out.println(count);
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
 		Assert.assertFalse(
				driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
		Assert.assertTrue(
				driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
		String text = driver.findElement(By.xpath("//a[text()=\"Special Assistance\"]")).getText();
		Assert.assertEquals(text, "Special Assistance");
	}

}
