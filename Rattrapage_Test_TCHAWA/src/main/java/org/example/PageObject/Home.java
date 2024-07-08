package org.example.PageObject;

import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Page{

    @FindBy(css = "nav>div:nth-child(4)")
    private WebElement avatar;

    @FindBy(className = "style_input__dvx2f")
    private WebElement email_login;

    @FindBy(className = "style_input_password__6FtLe")
    private WebElement password_login;

    @FindBy(id = "btn_login")
    private WebElement login;

    private String URL = "https://ztrain-web.vercel.app/home";
    public void navigate() { this.get(URL); }
    public void emailfill(String email) { this.email_login.sendKeys(email); }
    public void passwordfill(String password) { this.password_login.sendKeys(password); }

    public void login(String email, String password) {

        this.emailfill(email);
        this.passwordfill(password);
        this.login.click();

    }
}
