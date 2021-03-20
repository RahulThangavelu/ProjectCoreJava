package org.datadriven;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("unused")
public class BrowserStack {

  public static final String USERNAME = "rahult2";
  public static final String AUTOMATE_KEY = "bDqyofqaQxq9GX4zAxHQ";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  public static void main(String[] args) throws Exception {

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "83.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "10");
    caps.setCapability("resolution", "1024x768");
    caps.setCapability("name", "Amazon Website");
    

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("https://www.amazon.in/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
    element.sendKeys("iphone");
    WebElement btn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
    btn.click();
    driver.quit();

  }
}
