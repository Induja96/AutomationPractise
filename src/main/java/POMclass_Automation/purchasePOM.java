package POMclass_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class purchasePOM {
	public static WebDriver driver;
	
	public purchasePOM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getViewimg() {
		return viewimg;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	
	
	@FindBy(xpath= "//a[@class='login']")
	private WebElement signin;
	
	
	@FindBy(xpath= "(//input[@type='text'])[3]")
			private WebElement mail;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement submit;
	
	@FindBy(xpath= "//a[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath= "(//a[@title='T-shirts'])[1]")
	private WebElement tshirt;
	
	@FindBy(xpath ="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement viewimg;
	
	@FindBy(name ="Submit")
	private WebElement addcart;
	
	@FindBy(xpath= "//a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement summary;
	
	@FindBy(name= "processAddress")
	private WebElement address;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath= "(//button[@type='submit'])[2]")
	private WebElement shipping;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirm;
	

}
