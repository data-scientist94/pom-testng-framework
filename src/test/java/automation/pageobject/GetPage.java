package automation.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GetPage extends BaseUi {
	
	ReadSpecFile readSpecFile;
	private WebDriver driver;
	public GetPage(WebDriver driver, String page_name) {
		super(driver);
		this.driver = driver;
		readSpecFile = new ReadSpecFile(page_name);
	}
	
	protected  WebElement element(String element, String replace) {
		return driver.findElement(getLocator(element, replace));
	}
	
	protected  WebElement element(String element) {
		return driver.findElement(getLocator(element));
	}

	protected By getLocator(String element, String replace) {
		return getBy(ReadSpecFile.toGetLocator(element)[1], ReadSpecFile.toGetLocator(element)[2].replaceAll("\\$\\{.+\\}", replace));
	}

	protected By getLocator(String element) {
		return getBy(ReadSpecFile.toGetLocator(element)[1], ReadSpecFile.toGetLocator(element)[2]);
	}
	
	private By getBy(String locatorType, String locatorValue) {
		switch (locatorType)
        {
            //Normal WebElement Locator.
            case "id"               : return By.id(locatorValue);
            case "xpath"            : return By.xpath(locatorValue);
            case "css"              : return By.cssSelector(locatorValue);
            case "name"             : return By.name(locatorValue);
            case "classname"        : return By.className(locatorValue);
            case "linkText"         : return By.linkText(locatorValue);
            default: return By.id(locatorValue);
        }

	}

	
	
}
