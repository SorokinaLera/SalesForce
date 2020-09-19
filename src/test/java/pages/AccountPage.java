package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);

    }

    public AccountPage validateTheAccountWasCreated() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title=VSarokina]")));
        Assert.assertTrue(driver.findElement(By.cssSelector("a[title=VSarokina]")).isDisplayed());
        return this;

    }
    public NewAccountModalPage goToAccountModalPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        driver.findElement(By.cssSelector("div[title=New]")).click();
        return new NewAccountModalPage(driver);

    }

}
