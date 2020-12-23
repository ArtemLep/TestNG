package com.Syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void openAndNavigate() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void validAdminLogin() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement welcomeMessage = driver.findElement(By.cssSelector("a#welcome"));
        if (welcomeMessage.isDisplayed()) {
            System.out.println("Test Passed.");
        } else {
            System.out.println("Failed.");
        }
    }

    @Test
    public void titleValidation() {
        String expectedTitle = "Human Management System";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title is valid. Test pass");
        } else {
            System.out.println("Title is not matched. Test Fail");
        }
    }
    @Test
    public void LogoIsPrinted(){
        String expectedTitle = "Logo";
        String actualTitle = driver.();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title is valid. Test pass");
        } else {
            System.out.println("Title is not matched. Test Fail");
        }
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}