package automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import automation.utils.Get;

public class WebDriverFactor {

	static WebDriver getDriver() {
		switch(Get.SELENIUM_SERVER) {
		case "remote" 	: return remoteServer();
		default			:  return localServer();
		}
	}

	private static WebDriver remoteServer(){
		try {
			 return new RemoteWebDriver(new URL(Get.SELENIUM_SERVER_HOST), GetDesiredCapabilities());
		}
		catch(MalformedURLException malformedURLException) {
			return null;
		}
	}

	@SuppressWarnings("static-access")
	private static DesiredCapabilities GetDesiredCapabilities() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		switch(Get.CROSSBROWSER.split(",")[new Random().nextInt(Get.CROSSBROWSER.split(",").length)]) {
		case "chrome"			: { desiredCapabilities.chrome(); 
									desiredCapabilities.setBrowserName("chrome"); 
									desiredCapabilities.setPlatform(Platform.WINDOWS);
									return desiredCapabilities;}
		case "safari"			: {	desiredCapabilities.safari();
									desiredCapabilities.setBrowserName("safari"); 
									desiredCapabilities.setPlatform(Platform.WINDOWS);
									return desiredCapabilities;}
		case "ie"				: {	desiredCapabilities.edge();
									desiredCapabilities.setBrowserName("edge"); 
									desiredCapabilities.setPlatform(Platform.WINDOWS);
									return desiredCapabilities;}
		case "edge"				: {	desiredCapabilities.edge();
									desiredCapabilities.setBrowserName("edge"); 
									desiredCapabilities.setPlatform(Platform.WINDOWS);
									return desiredCapabilities;}
		default: {					desiredCapabilities.firefox();
									desiredCapabilities.setBrowserName("firefox"); 
									desiredCapabilities.setPlatform(Platform.WINDOWS);
									return desiredCapabilities;}
		}
	}
	
	private static WebDriver localServer() {
		switch(Get.BROWSER) {
		case "chrome"			: return getChromeDriver();
		case "safari"			: return getSafariDriver();
		case "ie"				: return getEdgeDriver();
		case "edge"				: return getEdgeDriver();
		default: return getFirefox();
		}
	}

	private static WebDriver getSafariDriver() {
		return new SafariDriver();
}

	private static WebDriver getEdgeDriver() {
		System.setProperty("webdriver.edge.driver",Get.SELENIUM_DRIVER_PATH);
	    return new EdgeDriver();
    }

	private static WebDriver getFirefox() {
	System.setProperty("webdriver.gecko.driver", Get.SELENIUM_DRIVER_PATH);
	if(Get.HEADLESS_BROWSER) { 
					FirefoxOptions options = new FirefoxOptions(); 
					options.setHeadless(true); 
					return new FirefoxDriver(options);}
	else return new FirefoxDriver();
}

	private static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", Get.SELENIUM_DRIVER_PATH + "chromedriver");
		if(Get.HEADLESS_BROWSER) {
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("headless");
	        return new ChromeDriver(options);
		}else return new ChromeDriver();	
	}
}
