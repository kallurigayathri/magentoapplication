package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class magento 
{
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		String url="http://www.magento.com";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
     
		Thread.sleep(3000);
      driver.findElement(By.linkText("My Account")).click();
      Thread.sleep(3000);
      driver.findElement(By.id("email")).sendKeys("nitinmanjunath1991@gmail.com");
      Thread.sleep(3000);
      driver.findElement(By.id("pass")).sendKeys("Welcome123");
      Thread.sleep(3000);
      driver.findElement(By.id("send2")).click();
      Thread.sleep(3000);
      driver.findElement(By.linkText("Log Out")).click();
      Thread.sleep(3000);
      
      driver.close();
	}
}
