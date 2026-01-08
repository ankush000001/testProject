package com.pkg1.test;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class testClass {

	WebDriver testone;

	@Test

	public void fb() throws Exception {
		testone = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
		testone.get("https://www.facebook.com");
		testone.quit();
	}

	@Test

	public void demoqa() throws Exception {
		testone = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
		testone.get("https://demoqa.com/browser-windows");
	}

	@Test

	public void hereq() throws Exception {
		testone = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
		testone.get("https://the-internet.herokuapp.com/");
		testone.quit();
	}

	@Test
	public void other() throws Exception {
		testone = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
		testone.get("https://jqueryui.com/menu/");
		testone.quit();
	}

	@Test
	public void first () throws Exception {
		testone = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
		testone.get("https://www.saucedemo.com/");
		testone.quit();



}
	
	
	public void testing()
	{
		System.out.println();
	}

}
