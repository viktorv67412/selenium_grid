package com;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeImpl implements Browser {

    private String URL;

    public ChromeImpl(String URL) {
        this.URL = URL;
    }

    public RemoteWebDriver getDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL(URL), DesiredCapabilities.chrome());
    }
}
