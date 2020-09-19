package pages;

import elements.Input;
import elements.Select;
import elements.TextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage{

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public AccountPage createAccount() {
        new Input(driver, "Phone").write("+37544444443");
        new Input(driver, "Fax").write("+37544444443");
        new Input(driver, "Website").write("tut.by");

        new Input(driver, "Account Name").write("VSarokina");

        new Select(driver, "Type").select("Partner");
        new Select(driver, "Industry").select("Banking");

        new Input(driver, "Employees").write("12");
        new Input(driver, "Annual Revenue").write("100000$");

        new Input(driver, "Billing City").write("Minsk");
        new Input(driver, "Billing State/Province").write("***");
        new Input(driver, "Billing Zip/Postal Code").write("***");
        new Input(driver, "Billing Country").write("***");
        new Input(driver, "Shipping City").write("***");
        new Input(driver, "Shipping State/Province").write("***");
        new Input(driver, "Shipping Zip/Postal Code").write("***");
        new Input(driver, "Shipping Country").write("***");

        new TextArea(driver, "Description").write("important");
        new TextArea(driver, "Billing Street").write("***");
        new TextArea(driver, "Shipping Street").write("***");

        driver.findElement(By.cssSelector(saveButtonLocator)).click();
        return new AccountPage(driver);
    }
}
