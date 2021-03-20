package org.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\div\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.xpath("//input[@id='myFile']"));
		upload.click();
		Thread.sleep(2000);
        Runtime.getRuntime().exec("H:\\Autoit Code\\Autoit3.exe");

	}

}
