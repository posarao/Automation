package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("launching chrome browser"); 
   		System.setProperty("webdriver.chrome.driver", driverPath);
   		WebDriver driver = new ChromeDriver();
   		driver.get("https://posadevopsweb-a9eyfkh2czhphhd5.eastus-01.azurewebsites.net/webapp/");
   		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("Posarao DevOps Learning 2024"));
		driver.close();
		
	}
}
