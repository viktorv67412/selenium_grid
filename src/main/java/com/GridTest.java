package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class GridTest {

    private static final String URL = "http://localhost/wd/hub";

    private Browser firefox;
    private Browser chrome;

    public GridTest() {
        firefox = new FirefoxImpl(URL);
        chrome = new ChromeImpl(URL);
    }

    public RemoteWebDriver getFirefoxDriver() throws MalformedURLException {
        return firefox.getDriver();
    }

    public RemoteWebDriver getChromeDriver() throws MalformedURLException {
        return chrome.getDriver();
    }

    public static void main(String[] args) throws MalformedURLException {

        WebDriver firefoxDriver = new GridTest().getFirefoxDriver();
        firefoxDriver.navigate().to("http://www.google.com");
        WebElement element = firefoxDriver.findElement(By.name("q"));
        element.sendKeys("selenium grid");
        element.submit();
        firefoxDriver.close();
    }
}
