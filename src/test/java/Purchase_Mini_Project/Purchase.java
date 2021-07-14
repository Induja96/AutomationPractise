package Purchase_Mini_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import POMclass_Automation.purchasePOM;



public class Purchase extends Baseclass_Automation.Baseclass {

	public static WebDriver driver; // null

	public static void main(String[] args) throws InterruptedException, IOException {
		// Null driver= chrome driver
		driver = browserLaunch("Chrome");
		openurl("http://automationpractice.com/index.php");

		Thread.sleep(5000);

		purchasePOM p = new purchasePOM(driver);
		methodforclick(p.getSignin());

		Thread.sleep(8000);

		inputvalue(p.getMail(), "DemoTester196@gmail.com");

		inputvalue(p.getPass(), "induram@96");

		methodforclick(p.getSubmit());

		Actionmovetoelement(p.getWomen());

		Actionclick(p.getTshirt());

		Thread.sleep(3000);

		methodforclick(p.getViewimg());

		Thread.sleep(9000);
		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		methodforclick(p.getAddcart());

		Thread.sleep(9000);

		methodforclick(p.getProceed());

		Thread.sleep(5000);

		methodforclick(p.getSummary());

		Thread.sleep(5000);

		methodforclick(p.getAddress());

		Thread.sleep(5000);

		methodforclick(p.getCheckbox());

		Thread.sleep(5000);

		methodforclick(p.getShipping());

		Thread.sleep(5000);

		methodforclick(p.getPayment());

		Thread.sleep(7000);

		methodforclick(p.getConfirm());

		Thread.sleep(3000);

		screenshot("C:\\Users\\INDHU\\eclipse-workspace\\Automationpractise\\screenshot\\purchase automation.png");

	}

}
