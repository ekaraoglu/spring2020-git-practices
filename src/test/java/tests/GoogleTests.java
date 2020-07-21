package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class GoogleTests {

 WebDriver driver;

 @Before
 public void setup() {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.get("https://google.com");
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 }
 @Test
 public void test1() {
  Assert.assertEquals(driver.getTitle(), "Google");
 }
 @AfterMethod
 public void tearDown() {
  driver.quit();
 }

}
