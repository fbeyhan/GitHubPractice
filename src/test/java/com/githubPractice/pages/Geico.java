package com.githubPractice.pages;

import com.githubPractice.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Geico {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[text()='Yellow']/preceding-sibling::input")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Green')]/preceding-sibling::input")).isEnabled());
        driver.findElement(By.xpath("//label[contains(text(),'Green')]/preceding-sibling::input")).click();
        Thread.sleep(3000);
    }
}
