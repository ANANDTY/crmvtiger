package crm.vtiger.module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrameterTest {

	private static final CharSequence Password = null;

	@Test
	
	public void getDataFromCmd() {
		WebDriver driver=null;
	String browser	=System.getProperty("browser");
		String url=System.getProperty("url");
cd C:\Users\PC-1\eclipse-workspace\com.Testyantraccx		String username=System.getProperty("username");
		String password=System.getProperty("password");
		//System.out.println(Browser+Url+username+Password);
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("msedge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else{
			System.out.println("specify your browser");
		}
		driver.get(url);
		//wLib.maximizeBrowserWindow( driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
	}
}
