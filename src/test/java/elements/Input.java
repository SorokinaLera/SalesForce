package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String locator = "//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input";

    public Input(WebDriver driver, String label){
        this.driver = driver;
        this.label = label;

    }

    public void write(String text){
        System.out.println(String.format("Writing text %s into input with label %s",text,label));
        driver.findElement(By.xpath(String.format(locator,label))).sendKeys(text);

    }

    public void click(){
        System.out.println(String.format("Writing text %s into input with label",label));
        driver.findElement(By.xpath(String.format(locator,label))).click();
        driver.findElements(By.cssSelector(".primaryLabel.slds-truncate.slds-lookup__result-text")).get(0).click();

    }

}

