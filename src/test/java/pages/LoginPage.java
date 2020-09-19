package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public LoginPage openPage() {
        driver.get("https://login.salesforce.com/");
        return this;

    }

    public HomePage logIn() {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();
        return new HomePage(driver);

    }


}
