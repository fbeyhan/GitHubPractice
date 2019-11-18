package com.githubPractice.pages;

import com.githubPractice.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class Nationwide {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        driver.get("https://www.nationwide.com/");
    }
    
    public static void gitPractice(){
        System.out.println("fatih git practice");
    }
    
}
