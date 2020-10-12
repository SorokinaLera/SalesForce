package pages;

import elements.Input;
import elements.Select;
import elements.TextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactModalPage extends BasePage {

    public NewContactModalPage(WebDriver driver) {

        super(driver);
    }

    public ContactPage createContact() {
        new Input(driver, "Phone").write("+37544444443");
        new Input(driver, "Mobile").write("+3754444443");
        new Input(driver, "Email").write("DunderMifflin@gmail.com");

        new Select(driver, "Salutation").select("Prof.");
        new Input(driver, "First Name").write("Michael");
        new Input(driver, "Last Name").write("Scott");

        new Input(driver, "Account Name").click();
        new Input(driver, "Title").write("Boss");

        new TextArea(driver, "Mailing Street").write("Test");
        new TextArea(driver, "Other Street").write("Test");

        new Input(driver, "Mailing City").write("Test");
        new Input(driver, "Mailing State/Province").write("Test");
        new Input(driver, "Mailing Zip/Postal Code").write("Test");
        new Input(driver, "Mailing Country").write("Test");
        new Input(driver, "Other City").write("Test");
        new Input(driver, "Other State/Province").write("Test");
        new Input(driver, "Other Zip/Postal Code").write("Test");
        new Input(driver, "Other Country").write("Test");

        new Input(driver, "Fax").write("+375443333333");
        new Input(driver, "Home Phone").write("+37555 5555555");
        new Input(driver, "Other Phone").write("+37555 5555555");
        new Input(driver, "Asst. Phone").write("***");
        new Input(driver, "Assistant").write("***");
        new Input(driver, "Department").write("***");
        new Select(driver, "Lead Source").select("Other");
        new Input(driver, "Birthdate").write("15/03/1964");
        new TextArea(driver, "Description").write("important");

        driver.findElement(By.cssSelector(saveButtonLocator)).click();

        return new ContactPage(driver);

    }

}
