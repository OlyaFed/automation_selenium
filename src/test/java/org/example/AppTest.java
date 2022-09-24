package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest
{
    @BeforeClass
   public void init() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

   }

    @Test
    public void shouldAnswerWithTrue(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.close();

    }
}
