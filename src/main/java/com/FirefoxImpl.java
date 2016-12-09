package com;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class FirefoxImpl implements Browser {

    private String URL;

    public FirefoxImpl(String URL) {
        this.URL = URL;
    }

    public RemoteWebDriver getDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL(URL), DesiredCapabilities.firefox());
    }
}
