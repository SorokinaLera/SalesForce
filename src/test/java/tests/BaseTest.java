package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    NewAccountModalPage newAccountModal;
    NewContactModalPage newContactModal;
    LoginPage loginPage;
    AccountPage accountPage;
    ContactPage contactPage;
    HomePage homePage;


    @BeforeMethod
    public void openPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://login.salesforce.com/");
        newAccountModal = new NewAccountModalPage(driver);
        newContactModal = new NewContactModalPage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        contactPage = new ContactPage(driver);
        homePage = new HomePage(driver);
    }


    @AfterMethod(alwaysRun = true)
    public void closePage() {
        driver.quit();
    }
}
