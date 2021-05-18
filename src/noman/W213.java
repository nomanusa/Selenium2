package noman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W213 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noman\\Desktop\\QA Class\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://islam.net.bd/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		driver.findElement(By.partialLinkText("পুস্তক")).click();
		
		driver.findElement(By.linkText("কুরআন")).click();
		
		driver.findElement(By.linkText("আল আনফাল")).click();
		
		driver.findElement(By.linkText("হোম")).click();
		
		driver.findElement(By.xpath("//*[@class='mainlevel_homepage']")).click();
		
		
		
		driver.findElement(By.linkText("হোম")).click();
		
		driver.findElement(By.linkText("গুরুত্বপূর্ণ লিংক")).click();
		
		
		
	
		//driver.close();

	}

}
