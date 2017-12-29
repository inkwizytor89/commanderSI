package com.comandor.session;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.comandor.Util.pause;

public class Session {

    private final ChromeDriver chromeDriver;
    private final Selenium selenium;
    String loginUrl = "https://pl.ogame.gameforge.com/";


    public Session() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        selenium = new WebDriverBackedSelenium(chromeDriver, loginUrl);
    }

    public void start() {
        selenium.open(loginUrl);
    }

    public void close() {
        selenium.close();
        chromeDriver.quit();
        pause(25);
    }

    public void login() {
        chromeDriver.findElement(By.id("loginBtn")).click();
        chromeDriver.findElement(By.id("usernameLogin")).click();
        selenium.type("id=usernameLogin", "inkwizytor89@gmail.com");
        selenium.type("id=passwordLogin", "fiatlux89");
        selenium.type("id=serverLogin", "Cygnus");
//        chromeDriver.findElement(By.xpath("//div[@id='tabContentContainer']/div")).click();
//        chromeDriver.findElement(By.id("passwordLogin")).click();
//        chromeDriver.findElement(By.id("start")).click();
//        chromeDriver.findElement(By.id("serverLogin")).click();
        chromeDriver.findElement(By.id("loginSubmit")).click();
    }

}
