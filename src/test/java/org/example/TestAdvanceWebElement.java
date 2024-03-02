package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAdvanceWebElement extends DriverSetup{
    @Test
    public void AdvanceTestElement() throws InterruptedException{

//        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
//        WebElement text = browser.findElement(By.cssSelector(".ui-autocomplete-input"));
//        text.sendKeys("Locating using css selector");
//        Thread.sleep(1000);

          browser.get("https://trytestingthis.netlify.app/");
//        WebElement username = browser.findElement(By.cssSelector("#uname"));
//        username.sendKeys("Hello World css selector");
//        Thread.sleep(5000);
//        username.clear();

//        WebElement userName = browser.findElement(By.xpath("//*[@id = 'uname']"));
//        userName.sendKeys("Hello World xpath");
//        Thread.sleep(5000);

        System.out.println(browser.findElement(By.xpath("//div /h1")).getText());
        System.out.println(browser.findElement(By.cssSelector("div > h1")).getText());
        System.out.println(browser.findElement(By.xpath("//a[@class='button bar-item' and @href='/']")).getText());
        System.out.println(browser.findElement(By.cssSelector("a[class='button bar-item'][href='/']")).getText());
        System.out.println(browser.findElement(By.xpath("//button[starts-with(@onclick, \" window.open('http://google.com',\")]")).getText());
        System.out.println(browser.findElement(By.cssSelector("button[onclick^=\" window.open('http://google.com',\"]")).getText());
        System.out.println(browser.findElement(By.cssSelector("button[onclick*=\"open('http://google.com',\"]")).getText());
        System.out.println(browser.findElement(By.xpath("//button[contains(@onclick, \"open('http://google.com',\")]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[1]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[3]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[last()]")).getText());

        System.out.println(browser.findElement(By.cssSelector("tr > th:first-child")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:nth-child(3)")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:last-child")).getText());

        System.out.println(browser.findElement(By.xpath("//td[text()='Personal Shopper']")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(), 'Personal Shopper')]")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(), 'Bong')] /preceding-sibling::td")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(), 'Bong')] /following-sibling::td[last()]")).getText());




    }



}
