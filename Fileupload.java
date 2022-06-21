package bharathIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jarfiles\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='uploadFile']")).click();
		
		
		
		
	}

}
