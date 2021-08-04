package automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseUi extends CommonAction{
	
	private WebDriver driver;
	public BaseUi(WebDriver driver) {
		super(driver);
		driver = this.driver;
	}
	
	 protected String getPageTitle() {
		 return driver.getTitle();
	 }

     protected WebElement activeElement() {
    	 return driver.switchTo().activeElement();
     }


     protected void reloadPage() {
    	 driver.navigate().refresh();
     }


     protected void scrollToElementAction(WebElement element)
     {
         Actions hoverClick = new Actions(driver);
         hoverClick.moveToElement(element).build().perform();
     }

     protected void sendKeysUsingAction(WebElement element, String key)
     {
         Actions hoverClick = new Actions(driver);
         hoverClick.moveToElement(element).sendKeys(key).build().perform();
     }

     protected String getCurrentURL() {
    	 return driver.getCurrentUrl().toString();
     }

     protected void switchToFrame(WebElement element) {
    	 driver.switchTo().frame(element);
     }

     protected void switchToFrame(int i) {
    	 driver.switchTo().frame(i);
     }

     protected void switchToFrame(String id) {
    	 driver.switchTo().frame(id);
     }

     protected void switchToDefaultContent() {
    	 driver.switchTo().defaultContent();
     }

//     default Object executeJavascript(String script)
//     {
//         try
//         {
//             return ((JavascriptExecutor)driver).executeScript("return " + script);
//         }
//         catch (WebDriverException webDriverException)
//         {
//             return ((JavascriptExecutor)driver).executeScript(script);
//         }
//     }
//
//     default Object executeJavascript(String script, WebElement element,String replacementString) {
//         ((JavascriptExecutor)driver).executeScript(script + ", " + element + replacementString);
//     }
//
//
//     protected void ScrollPageDown(int length) => ExecuteJavascript("window.scrollTo(0," + length + ")");
//
//
//     protected void ScrollPageUp(int length) => ExecuteJavascript("window.scrollTo(" + length + ", 0" + ")");
//
//
//     protected void Hover(IWebElement element)
//     {
//         Actions hoverOver = new Actions(ngDriver);
//         hoverOver.MoveToElement(element).Build().Perform();
//     }
//
//     protected void HoverAndClick(IWebElement element)
//     {
//         Actions hoverOver = new Actions(ngDriver);
//         hoverOver.MoveToElement(element).Click().Build().Perform();
//     }
//
//     [DebuggerStepThrough]
//     protected void HardWait(int seconds) => Thread.Sleep(seconds * 1000);
//
//
//     protected void AcceptAlert() => driver.SwitchTo().Alert().Accept();
//
//
//     protected void DismissAlert() => driver.SwitchTo().Alert().Dismiss();
//
//
//     protected string GetAlertTxt() => driver.SwitchTo().Alert().Text;
//
//
//     protected void SendAlertTxt(string msg) => driver.SwitchTo().Alert().SendKeys(msg);
//
//
//     protected void ScrollDown(NgWebElement element) =>
//         ((IJavaScriptExecutor)ngDriver).ExecuteScript(
//                 "arguments[0].scrollIntoView(true);", element);
//
//
//     protected void ScrollDown(IWebElement element) =>
//         ((IJavaScriptExecutor)driver).ExecuteScript(
//                 "arguments[0].scrollIntoView(true);", element);
//
//
//     protected void HoverClick(NgWebElement element)
//     {
//         Actions hoverClick = new Actions(ngDriver);
//         hoverClick.MoveToElement(element).Click().Build().Perform();
//     }
//
//
//     protected void SelectDropDownitemByText(NgWebElement element, string option)
//     {
//         var mySelect = new SelectElement(element);
//         mySelect.SelectByText(option, true);
//     }
//
//
//     protected void SelectDropDownitemByIndex(NgWebElement element, int option)
//     {
//         var mySelect = new SelectElement(element);
//         mySelect.SelectByIndex(option);
//     }
//
//
//     protected string GetADropDownMenuItem(NgWebElement element)
//     {
//         var mySelect = new SelectElement(element);
//         var options = mySelect.SelectedOption;
//         return options.Text;
//     }
//
//
//     protected void SwitchToBrowerTab()
//     {
//         List<string> tab = new List<string>(driver.WindowHandles);
//
//         foreach (var item in tab)
//             driver.SwitchTo().Window(item);
//     }
//
//
//     protected int GetNoOfOpenedTab() => new List<string>(driver.WindowHandles).Count;


//     protected void SwitchToBrowerTab(int tabIndex)
//     {
//         List<String> tab = new List()<String>(driver.getWindowHandles());
//         driver.switchTo().window(tab[tabIndex]);
//     }


 //    protected void GoBackInBrowser() => driver.Navigate().Back();



//     protected void closeCurrentTabInBrowser() {
//    	 driver.close();
//     }

//     protected void CloseTabNo(int tabNumber)
//     {
//         SwitchToBrowerTab(tabNumber);
//         closeCurrentTabInBrowser();
 //    }
 }


