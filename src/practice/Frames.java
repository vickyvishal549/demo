package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag =  driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		org.openqa.selenium.interactions.Actions a = new org.openqa.selenium.interactions.Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
		 
	}

}
