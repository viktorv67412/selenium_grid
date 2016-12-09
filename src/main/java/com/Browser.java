package com;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public interface Browser {
     RemoteWebDriver getDriver() throws MalformedURLException ;
}
