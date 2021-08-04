package automation.utils;
/**
 * @author Krishna
 * This file will get the static data like base director and project configuration variable.
 *
 */
public interface Get {

	static final String BASE_DIR = System.getProperty("user.dir").replace("\\", "/");
	static final String RESOURCE_FOLDER = "/src/test/resources/";
	
	/*** Operating system can be windows, unix-mac and linux (Default: WIN)*/
	static final String OPERATING_SYSTEM = "windows/";
	
	/*** TIER can be qa, stg, and prod (Default: QA)*/
	static final String TIER = "qa";
	
	/** * Default browser time out is 60 seconds */
	static final int TIMEOUT = 60;
	
	/*** Selenium Server can be local or remote only */
	static final String SELENIUM_SERVER =  "local";
	
	/*** Browser can be chrome, firefox, edge */
	static final String BROWSER = "chrome";
	
	/*** Contains the folders in order to get to selenium driver folder : testng\src\test\resources\selenium-driver */
	static final String SELENIUM_DRIVER_PATH = BASE_DIR + RESOURCE_FOLDER + "selenium-driver/" + OPERATING_SYSTEM;
	
	/*** Contains the folders in order to get to Screenshot path folder :testng\src\test\resources\test-report*/
	static final String SCREENSHOT_PATH = "src/test/resources/test-report";
	static final String DOCUMENT_FOLDER = BASE_DIR + RESOURCE_FOLDER +"/DocumentProof/";
	static final String SPEC_FILE_PATH = BASE_DIR + RESOURCE_FOLDER + "data/" + TIER + "/clientinformation/specs/";
	static final String SELENIUM_SERVER_HOST = BASE_DIR + "http://10.0.0.4:2495/wd/hub";
	static final boolean HEADLESS_BROWSER = false;
	static final String CROSSBROWSER="chrome,firefox";
	static final boolean TAKESCREENSHOT = true;
	
}
