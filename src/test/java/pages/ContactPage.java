package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ContactPage extends BasePage {
    public static final String validateLocator = "a[title=VSarokina]";


    public ContactPage(WebDriver driver) {
        super(driver);

    }

    public NewContactModalPage goToContactModalPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        driver.findElement(By.cssSelector("div[title=New]")).click();
        return new NewContactModalPage(driver);

    }

    public ContactPage validateTheContactWasCreated() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(validateLocator)));
        Assert.assertTrue(driver.findElement(By.cssSelector(validateLocator)).isDisplayed());
        return this;

    }

}
