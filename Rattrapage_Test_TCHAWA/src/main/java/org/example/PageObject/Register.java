package org.example.PageObject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends Page{

    @FindBy(className = "style_input__dvx2f")
    private WebElement email_login;

    @FindBy(className = "style_input_password__6FtLe")
    private WebElement password_login;

    @FindBy(id = "btn_login")
    private WebElement login;
    private By email = By.className("style_input__dvx2f");
    private By password = By.className("style_input_password__6FtLe");
    private By confirm_password = By.id("confirm_password_registration");
    private By inscription = By.className("style_btn__SUrW5");
    private String URL = "https://ztrain-web.vercel.app/home";

    @Test()
    public void signUp(){
        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(By.id("style_avatar_wrapper__pEIGQ")).click();
        this.driver.findElement(By.cssSelector(".MuiTabs-scroller>div>button:nth-child(2)")).click();
        this.driver.findElement(email).sendKeys("dickens@gmail.com");
        this.driver.findElement(password).sendKeys("paul2dickens");
        this.driver.findElement(confirm_password).sendKeys("paul2dickens");
        this.driver.findElement(inscription).click();
    }
}
