package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//select[1]";
    public static final String XPATH_MONTH = "//select[2]";
    public static final String XPATH_YEAR = "//select[3]";

    public static void main(String args[]) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());

        WebElement selectComboD = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoardD = new Select(selectComboD);
        selectBoardD.selectByIndex(12);

        WebElement selectComboM = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectBoardM = new Select(selectComboM);
        selectBoardM.selectByIndex(12);

        WebElement selectComboY = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectBoardY = new Select(selectComboY);
        selectBoardY.selectByValue("2012");
    }
}
