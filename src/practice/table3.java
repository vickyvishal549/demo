package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class table3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		//div[@id="innings_1"]/div[1]/div[3]/div[3]
		//div[@id="innings_1"]/div[1]/div[4]/div[3]
		int sum=0;
		List <WebElement> count = driver.findElements(By.xpath("//div[@id=\"innings_1\"]/div[1]/div"));
		String beforexpath = "//div[@id=\"innings_1\"]/div[1]/div[";
		String afterxpath = "]/div[3]";
		for(int i=3;i<=count.size()-2;i++) {
		String actual = beforexpath+i+afterxpath;
		WebElement text = driver.findElement(By.xpath(actual));
		sum=sum+Integer.parseInt(text.getText());
	}
		System.out.println(sum);
		WebElement table = driver.findElement(By.xpath("//div[@id=\"innings_1\"]/div[1]"));
		String extras = table.findElement(By.xpath("//div[text()=\"Extras\"]/following-sibling::div[1]")).getText();
	int extr = Integer.parseInt(extras);
sum=sum+extr;
System.out.println(sum);
	
	String total = table.findElement(By.xpath("//div[text()=\"Total\"]/following-sibling::div[1]")).getText();
	int tot = Integer.parseInt(total);
	Assert.assertEquals(sum, tot);
	}
	
		
			
	}


