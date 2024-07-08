import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.id;

public class NewTest {
    private WebDriver driver;
    private By email_login = By.className("style_input__dvx2f");
    private By password = By.className("style_input_password__6FtLe");
    private By confirm_password = By.id("confirm_password_registration");
    private By inscription = By.className("style_btn__SUrW5");
    private String path = "src/test/resources/driver/chromedriver.exe";

    @BeforeTest public void setUp(){
        System.setProperty("webdriver.chrome.driver", this.path);
        this.driver = new ChromeDriver();
    }
    @Test() public void navigateToChrome() {
        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(By.id("style_avatar_wrapper__pEIGQ")).click();
    }

    @Test()
    public void SignUp(){
        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(By.id("style_avatar_wrapper__pEIGQ")).click();
        this.driver.findElement(By.cssSelector(".MuiTabs-scroller>div>button:nth-child(2)")).click();
        this.driver.findElement(email_login).sendKeys("dickens@gmail.com");
        this.driver.findElement(password).sendKeys("paul2dickens");
        this.driver.findElement(confirm_password).sendKeys("paul2dickens");
        this.driver.findElement(inscription).click();

    }

    @Test()
    public void SignIn() throws InterruptedException {
        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(By.id("style_avatar_wrapper__pEIGQ")).click();
        this.driver.findElement(email_login).sendKeys("dickens@gmail.com");
        this.driver.findElement(password).sendKeys("paul2dickens");
        this.driver.findElement(By.id("btnSignIn")).click();
        Thread.sleep(5000);
        Assert.assertTrue(this.driver.findElement(By.cssSelector(".ant-badge")).isDisplayed());
        System.out.println("Bouton activé");
    }

    @Test() public void Logout() throws InterruptedException {
        Thread.sleep(10000);
        this.driver.findElement(By.id("style_avatar_wrapper__pEIGQ")).click();
        this.driver.findElement(By.cssSelector(".ant-menu>li:nth-child(5)")).click();
    }
}


