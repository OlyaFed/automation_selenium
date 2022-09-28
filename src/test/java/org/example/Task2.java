package org.example;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task2
{

    ServerConfig cfg = ConfigFactory.create(ServerConfig.class);

    @BeforeClass
    public void init() {
//        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.setProperty("webdriver.chrome.driver", this.cfg.pathToChromeDriver());
    }

    @Test
    public void shouldAnswerWithTrue(){
        SingletonClassExample.getInstanceOfSingletonClassExample().get(this.cfg.hostname());
    }
    @Test
    public void shouldAnswerWithTrue2(){
        SingletonClassExample.getInstanceOfSingletonClassExample().get(this.cfg.hostname());
    }

    @AfterClass
    public void exit() {
        SingletonClassExample.getInstanceOfSingletonClassExample().close();
    }


}
