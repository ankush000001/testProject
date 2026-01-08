package com.pkg1.test;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumG {

	/*@DataProvider(parallel = true)

	public Object[][] senddata(){

		Object arr[][] = new Object [2][2];

		arr[0][0] = "anku";
		arr[0][1] = "chrome";
		return arr;

	}

	@SuppressWarnings("null")
	@Test(dataProvider = "senddata")
	public void login(String userName, String browserName) throws Exception
	{
		DesiredCapabilities cap = null;


		if(browserName.equalsIgnoreCase("chrome")) {
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);


			RemoteWebDriver dddd = new RemoteWebDriver(new URL("http://192.168.10.137:4444/wd/hub"), cap);

			dddd.get("https://www.facebook.com");
			dddd.findElement(By.id("email")).sendKeys(userName);


		}


	}

} */


	 @DataProvider(parallel = true)
	    public Object[][] senddata() {
	        return new Object[][] {
	            {"anku1", "chrome"},
	            {"anku2", "chrome"}
	        };
	    }

	    @Test(dataProvider = "senddata")
	    public void login(String userName, String browserName) throws Exception {

	        RemoteWebDriver driver = null;


	            if ("chrome".equalsIgnoreCase(browserName)) {

	                ChromeOptions options = new ChromeOptions();
	                options.setPlatformName("WINDOWS");

	                driver = new RemoteWebDriver(
	                        new URL("http://192.168.10.137:4444/wd/hub"),
	                        options
	                );

	                driver.get("https://www.facebook.com");
	                driver.findElement(By.id("email")).sendKeys(userName);
	            }


	            if (driver != null) {
	                driver.quit(); // ✅ VERY IMPORTANT
	            }
	        }
	    }


