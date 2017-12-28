package com.comandor.session;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session {

    private Selenium selenium;
    String loginUrl = "https://pl.ogame.gameforge.com/";


    public Session() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
        selenium = new WebDriverBackedSelenium(new ChromeDriver(), loginUrl);
    }

    public void start() {
    }

    public void close() {

    }

}
