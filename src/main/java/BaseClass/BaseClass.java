package BaseClass;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {

	public static ChromeDriver driver;
	public static Properties prop;

	
	public void launchWebTours() throws IOException {

		// Launch Application
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:1080/WebTours/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

	}
	
	
	
	public void closeApplication() {
		driver.quit();
	}

}
