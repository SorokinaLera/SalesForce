package tests;

import org.testng.annotations.Test;

public class Tests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void validateNewAccount() {
        loginPage
                .openPage()
                .logIn()
                .goToAccountPage()
                .goToAccountModalPage()
                .createAccount()
                .validateTheAccountWasCreated();

    }

    @Test(retryAnalyzer = Retry.class)
    public void validateNewContact() {
        loginPage
                .openPage()
                .logIn()
                .goToContactPage()
                .goToContactModalPage()
                .createContact()
                .validateTheContactWasCreated();

    }

}
