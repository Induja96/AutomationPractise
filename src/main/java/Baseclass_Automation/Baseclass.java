package Baseclass_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	// webdriver methods
	public static WebDriver driver;// Null

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\INDHU\\eclipse-workspace\\Automationpractise\\Driverfolder\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\INDHU\\eclipse-workspace\\selenium_project\\Driverup91\\chromedriver.exe");

			driver = new ChromeDriver();
		} else {
			System.out.println("Invalid");
		}
	//	driver.manage().window().maximize();

		return driver;
	}

	// get
	public static void openurl(String url) {
		driver.get(url);
	}

	// Close
	public static void closemethod() {
		driver.close();

	}

	// Quit
	public static void quitbrowser() {
		driver.quit();

	}

	// Navigate to
	public static void Takesto(String url) {
		driver.navigate().to(url);

	}

	// Navigate back
	public static void Takesback() {
		driver.navigate().back();

	}

	// Navigate forward
	public static void Takesforward() {
		driver.navigate().forward();

	}

	// Navigate refresh
	public static void Reload() {
		driver.navigate().refresh();
	}

	// Alert-Simple
	public static void alertaccep() {
		Alert sim = driver.switchTo().alert();
		sim.accept();
	}

	// Confirm alert
	public static void alertdismiss() {
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();

	}

	// prompt
	public static void alertsendkeys(String str) {
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys(str);
	}

	// Frames string
	public static void Framein(String str) {
		driver.switchTo().frame(str);

	}

	// Frames int
	public static void Framein(int index) {
		driver.switchTo().frame(index);

	}

	// Frames webelement
	public static void Framein(WebElement element) {
		driver.switchTo().frame(element);

	}

	// Frameout
	public static void frameout() {
		driver.switchTo().defaultContent();
	}

	// Action - Contextclick
	public static void ActionRightclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();

	}

	// Action - click
	public static void Actionclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).build().perform();

	}

	// Action - doubleclick
	public static void Actiondoubleclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();

	}

	// Action - movetoelement
	public static void Actionmovetoelement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

	}

	// Action - dragdrop
	public static void Actiondragdrop(WebElement element) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element, element).build().perform();

	}

	// Robot-down
	public static void keypressdown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// Robot-up
	public static void keypressup() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	// Robot-enter
	public static void keypressenter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// gettitlemethod
	public static void gettitlemethod() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	// getcurrenturlmethod
	public static void getcurrenturlmethod() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	// dropdown- Index

	public static void selectmethodindex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	// dropdown - string

	public static void selectmethodvalue(WebElement element, String str) {
		Select s = new Select(element);
		s.selectByValue(str);
	}
	// dropdown- text

	public static void selectmethodtext(WebElement element, String str) {
		Select s = new Select(element);
		s.selectByVisibleText(str);
	}

	// getoption
	public static void getalloption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement alloptions : options) {
			String text = alloptions.getText();
			System.out.println(text);
		}

	}
	// Get first selected options()

	public static void firstselectedoption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

	// Get all selected options()

	public static void allselected(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allselected : allSelectedOptions) {
			String text = allselected.getText();
			System.out.println(text);
		}
	}

	// ismultiple

	public static void checkmultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}

	// Window handles
	public static void windowhandlesmethod() {
		// driver.getWindowHandles();
		Set<String> alltitle = driver.getWindowHandles();
		for (String id : alltitle) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}
	}

	// Scrollup&down
	public static void scrollupdown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	// Scrollbottom
	public static void scrollbottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	// Takes screenshot
	public static void screenshot(String str) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(str);
		FileUtils.copyFile(source, destination);
	}

	// wait-Implicit
	public static void Implicitwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	// wait - Explicit
	public static void explicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	// Isenable
	public static void checkenable(WebElement element) {
		boolean text = element.isEnabled();
		System.out.println(text);

	}

	// Isdisplay
	public static void checkdisplay(WebElement element) {
		boolean text = element.isDisplayed();
		System.out.println(text);

	}

	// Isselected
	public static void checkselected(WebElement element) {
		boolean text = element.isSelected();
		System.out.println(text);

	}

	// webelement
	// click
	public static void methodforclick(WebElement element) {
		element.click();

	}

	// sendkeys
	public static void inputvalue(WebElement element, String str) {
		element.sendKeys(str);
	}

	// Gettext
	public static void gettextvalue(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

}
