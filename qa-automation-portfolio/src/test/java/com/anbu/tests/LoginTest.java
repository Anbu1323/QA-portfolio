
package com.anbu.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void testLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/login");
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("testpass");
        driver.findElement(By.id("loginBtn")).click();
        String expected = "Welcome";
        String actual = driver.findElement(By.id("welcomeText")).getText();
        assert actual.contains(expected) : "Login failed";
        driver.quit();
    }
}
