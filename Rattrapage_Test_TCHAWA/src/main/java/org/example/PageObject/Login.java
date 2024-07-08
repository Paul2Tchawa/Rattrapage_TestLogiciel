package org.example.PageObject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.FindBy;

public class Login extends Page{

    private By email_login = By.className("style_input__dvx2f");
    private By password_login = By.className("style_input_password__6FtLe");

    @Test()
    public void login() throws InterruptedException {
        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(By.id("style_avatar_wrapper__pEIGQ")).click();
        this.driver.findElement(email_login).sendKeys("dickens@gmail.com");
        this.driver.findElement(password_login).sendKeys("paul2dickens");
        this.driver.findElement(By.id("btn_login")).click();
        Thread.sleep(5000);
        Assert.assertTrue(this.driver.findElement(By.cssSelector(".ant_badge")).isDisplayed());
        System.out.println("Bouton Activé");

    }

}
