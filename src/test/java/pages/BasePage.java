package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public static final String saveButtonLocator = "button[title='Save']";
    public static final String newButtonLocator = "[title=New]";
    public static final String username = "sorokinalera-4ghz@force.com";
    public static final String password = "Bx4$icRpU7hNF7!";


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);

    }

}
