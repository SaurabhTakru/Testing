package Start;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class start {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\takru\\eclipse-workspace\\Begin\\drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Selenium Folder\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		WebElement email = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Business Email*')]"));
		driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
		email.sendKeys("Hello");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.quit();
		
	}

}
