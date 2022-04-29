package modelPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupTest {
	WebDriver driver;
	@BeforeMethod
	public void chromeLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\lib\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
	}
	@Test
	public void Chatboxpopup() throws InterruptedException
	{
		driver.navigate().to("https://classic.freecrm.com/index.html");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Shashi");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("S123sgsj2p");
		Thread.sleep(5000);
		driver.switchTo().frame("intercom-borderless-frame");
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//div[@class='intercom-chat-card intercom-v6hodn e1dst0fh0']"))).build().perform();
        
        driver.findElement(By.xpath("//div[@class='intercom-19gqqlk e13xul2n4']")).click();
      
     	
   
}
	@AfterMethod
	public void close()
	{
	driver.quit();	
	}
}