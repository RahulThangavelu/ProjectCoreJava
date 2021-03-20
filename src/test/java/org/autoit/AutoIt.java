package org.autoit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\div\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/become-an-instructor.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("JotFormIFrame-82892910187466");
		driver.findElement(By.xpath("//button[@id='jfCard-welcome-start']")).click();
		driver.findElement(By.xpath("//input[@id='first_28']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@id='last_28']")).sendKeys("Thangavel");
		driver.findElement(By.xpath("//button[@class='jfInput-button forNext u-right'][1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q12_emailAddress']")).sendKeys("str@gmail.com");
		//driver.findElement(By.xpath("//button[@class='jfInput-button forNext u-right'][2]")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//span[@class='jfYesno-label'][2]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@class='jfUpload-button'][2]")).click();
        
        Thread.sleep(4000);
        Runtime.getRuntime().exec("H:\\Autoit Code\\Autoit1.exe");
	}

}
