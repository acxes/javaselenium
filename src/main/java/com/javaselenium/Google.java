package com.javaselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Google {

    // Make sure to have the ChromeDriver executable in your PATH or set the property below
    // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
   
    public void testGoogleTitle(){
    
        this.driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + this.driver.getTitle());
        this.driver.quit();
    }

    public void testGoogleSearch() throws InterruptedException{
        this.driver.get("https://www.google.com");
        //*[@id="APjFqb"]
        this.driver.findElement(org.openqa.selenium.By.name("q")).sendKeys("Testing");
        TimeUnit.SECONDS.sleep(5);

    }


}
