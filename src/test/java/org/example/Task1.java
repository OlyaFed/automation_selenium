package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task1
{
    @BeforeClass
   public void init() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

   }

    @Test
    public void shouldAnswerWithTrue(){
        SingletonClassExample.getInstanceOfSingletonClassExample().get("https://www.google.com/");
    }
    @Test
    public void shouldAnswerWithTrue2(){
        SingletonClassExample.getInstanceOfSingletonClassExample().get("https://www.google.com/");
    }

    @AfterClass
    public void exit() {
        SingletonClassExample.getInstanceOfSingletonClassExample().close();
    }


}
