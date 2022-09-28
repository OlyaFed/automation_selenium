package org.example;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Random;

public class Task3 {
    ServerConfig cfg = ConfigFactory.create(ServerConfig.class);
    ChromeDriver chromeDriver = SingletonClassExample.getInstanceOfSingletonClassExample();

    @BeforeClass
    public void init() {
//        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.setProperty("webdriver.chrome.driver", this.cfg.pathToChromeDriver());
    }

    @BeforeTest
    public void initBeforeEachTest() {
        this.chromeDriver.get(this.cfg.hostname());
    }

    @Test
    public void checkTitle(){
        Assert.assertTrue(this.chromeDriver.getTitle().contains("Google"));
    }

    @Test
    public void checkRandom(){
        Random rand = new Random();
        int number = rand.nextInt(10);
        Assert.assertTrue(number > 0 && number < 10);
    }

    @DataProvider(name = "data-provider", parallel = true)
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"data one"}, {"data two"}, {"data three"}};
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }

    @AfterClass
    public void exit() {
        SingletonClassExample.getInstanceOfSingletonClassExample().close();
    }
}
