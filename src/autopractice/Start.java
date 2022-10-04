package autopractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sisin\\Downloads\\chromedriver.exe");
		// webDriverManager().chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}

	
	}


