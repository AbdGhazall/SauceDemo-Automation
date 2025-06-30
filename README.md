# SauceDemo Automation Testing

This project is an automated testing suite for the [SauceDemo](https://www.saucedemo.com/) web application. It is developed using **Java**, **Selenium WebDriver**, and **TestNG**, and simulates user interactions such as logging in, adding/removing items from the cart, and completing the checkout process.

---

## 🛠️ Tools & Frameworks

- **TestNG** – For structuring and prioritizing test cases  
- **Selenium WebDriver** – For interacting with the web UI  
- **EdgeDriver** – Used as the default browser for this test suite  
- *(Optionally)* **WebDriverManager** – To manage drivers automatically
---
## ✅ Features & Test Scenarios

1. **Login Test**  
   - Enters valid credentials and logs into the application.

2. **Add to Cart Test**  
   - Adds two specific items to the shopping cart.

3. **Remove from Cart Test**  
   - Removes the previously added items from the cart.

4. **Re-Add Items Test**  
   - Adds the same two items again after removal.

5. **Checkout Process Test**  
   - Navigates to the cart, fills out the checkout form, and completes the purchase.

6. **Logout Test**  
   - Logs the user out via the burger menu.

---
## 📌 Notes

- `Thread.sleep()` is used for wait simulation, but in real-world scenarios, explicit or fluent waits are preferred for reliability.
- `@BeforeTest` sets up the browser, and `@AfterTest` closes it after test execution.
- Test priority ensures logical and sequential flow of the test cases.
