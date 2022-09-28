package org.example;


import org.openqa.selenium.chrome.ChromeDriver;

class SingletonClassExample extends ChromeDriver
{
    // declaring an instance of class SingletonClassExample which is null initially means not initialized.
    private static SingletonClassExample instanceOfSingletonClassExample = null;


    // Declaring constructor as private to restrict object creation outside of class
    private SingletonClassExample()
    {
        System.out.println("Object created.");
    }

    // static method to create instance of class SingletonClassExample
    public static SingletonClassExample getInstanceOfSingletonClassExample()
    {
        if (instanceOfSingletonClassExample == null) {

            instanceOfSingletonClassExample = new SingletonClassExample();
        } else {
            System.out.println("existed object returned");
        }


        return instanceOfSingletonClassExample;
    }


}
