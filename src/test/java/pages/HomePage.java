package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);

    }

    public AccountPage goToAccountPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        driver.findElement(By.cssSelector(newButtonLocator)).click();
        return new AccountPage(driver);

    }

    public ContactPage goToContactPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(newButtonLocator)));
        driver.findElement(By.cssSelector(newButtonLocator)).click();
        return new ContactPage(driver);

    }


}
