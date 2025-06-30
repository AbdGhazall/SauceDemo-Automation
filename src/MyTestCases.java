import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {

	WebDriver driver = new EdgeDriver(); // Edge, Chrome..

	@BeforeTest
	public void mySetup() {
		driver.get("https://www.saucedemo.com/"); // open website
		driver.manage().window().maximize(); // large, small, full screen website window
	}

	@Test(priority = 1)
	public void login() {
		// Elements
		WebElement UserNameInputField = driver.findElement(By.id("user-name"));
		WebElement PasswordInputField = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));

		// actions
		UserNameInputField.sendKeys("standard_user"); // write in the box(field)
		PasswordInputField.sendKeys("secret_sauce");
		LoginButton.click(); // click on the button
	}

	@Test(priority = 2)
	public void addToCart() throws InterruptedException {
		Thread.sleep(2000);

		// elements
		WebElement FirstItem = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		WebElement SecondItem = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));

		// actions
		FirstItem.click();
		SecondItem.click();
	}

	@Test(priority = 3)
	public void removeFromCart() throws InterruptedException {
		Thread.sleep(2000);
		// elements
		WebElement firstItem = driver.findElement(By.id("remove-sauce-labs-backpack"));
		WebElement SecondItem = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));

		// actions
		firstItem.click();
		SecondItem.click();
	}

	@Test(priority = 4)
	public void addToCartAfterTheRemove() throws InterruptedException {
		Thread.sleep(2000);

		// elements
		WebElement firstItem = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		WebElement SecondItem = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));

		// actions
		firstItem.click();
		SecondItem.click();
	}

	@Test(priority = 5)
	public void CheckoutProcess() {
		/*
		 * open the cart page directly. not by finding the id because sometimes there's
		 * no Id, but also can be accessed by class or any unique thing, but here we can
		 * open the page directly and continue working normally
		 */
		// driver.navigate().to("https://www.saucedemo.com/cart.html");
		driver.findElement(By.className("shopping_cart_link")).click(); // find the cart by class
		WebElement CheckoutButton = driver.findElement(By.id("checkout"));
		CheckoutButton.click();

		// elements
		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.id("last-name"));
		WebElement PostalCode = driver.findElement(By.id("postal-code"));

		// actions
		firstName.sendKeys("ahmad");
		lastName.sendKeys("anas");
		PostalCode.sendKeys("38237");

		WebElement ContinueButton = driver.findElement(By.name("continue"));
		ContinueButton.click();

		WebElement FinishButton = driver.findElement(By.name("finish"));
		FinishButton.click();
	}

	@Test(priority = 6)

	public void logout() throws InterruptedException { // exception for the thread
		WebElement BurgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
		BurgerMenu.click();

		Thread.sleep(1000);// wait 1s

		WebElement LogoutButton = driver.findElement(By.id("logout_sidebar_link"));
		LogoutButton.click();

	}

	@AfterTest
	public void AfterThetestIsDone() {
		driver.close(); // colse website
	}
}
/*
 * @Test(priority = , enabled = false) // enabled = false, means test case won't
 * work until I change it to true or remove it
 * 
 * Thread.sleep(3000); driver.navigate().back(); // go to back arrow
 * Thread.sleep(3000);
 * 
 * driver.navigate().forward(); // go to forward arrow
 * 
 * Thread.sleep(3000);
 * 
 * driver.navigate().refresh(); // refresh the page
 */