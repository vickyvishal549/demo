package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Documents\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[6]/td[1]
		List<WebElement> num =  driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		 String beforexpath = "//*[@id=\"customers\"]/tbody/tr[";
		 String afterxpath = "]/td[1]";
		 
		 for(int i=2;i<=num.size();i++) {
			 String orginalxpath = beforexpath+i+afterxpath;
			WebElement count =  driver.findElement(By.xpath(orginalxpath));
			System.out.println(count.getText());
		 }
		 
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		 String beforexpath1 = "//*[@id=\"customers\"]/tbody/tr[";
		 String afterxpath1 = "]/td[2]";
		 for(int i=2;i<=7;i++) {
			 String actuxpath = beforexpath1+i+afterxpath1;
			WebElement seccol =  driver.findElement(By.xpath(actuxpath));
			System.out.println(seccol.getText());
		 }
		 String beforexpath2 = "//*[@id=\"customers\"]/tbody/tr[";
		 String afterxpath2 = "]/td[3]";
		 for(int i=2;i<=7;i++) {
			 String actuxpaths = beforexpath2+i+afterxpath2;
			WebElement seccoll =  driver.findElement(By.xpath(actuxpaths));
			System.out.println(seccoll.getText());	 
		 }
		String bef = "//table[@id=\"customers\"]/tbody/tr[1]/th[";
		 String aft = "]";
		List<WebElement> fir = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th"));
		 for (int i=1;i<=fir.size();i++) {
			String al = bef+i+aft;
		WebElement civ = 	driver.findElement(By.xpath(al));
		System.out.println(civ.getText());
		 }
	}

}
