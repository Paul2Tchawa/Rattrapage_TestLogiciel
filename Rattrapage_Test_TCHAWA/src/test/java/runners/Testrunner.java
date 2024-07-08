package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.example.PageObject.Home;
import org.example.PageObject.Login;
import org.example.PageObject.Register;
import org.example.PageObject.Logout;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html"
        },
        features = "src/test/resources/feature/account.feature",
        glue = {"stepdefinition","src/main/java/org/example/pageObject"}
)

public class Testrunner extends AbstractTestNGCucumberTests {
    Login loginPage = new Login();
    Register registerPage = new Register();
    Home homePage = new Home();
    Logout signout = new Logout();

    @Test
    public void login() throws InterruptedException {
        loginPage.login();
    }

    @Test
    public void register() throws InterruptedException {
        registerPage.signUp();
    }

    @Test
    public void homePage() throws InterruptedException {
        homePage.navigate();
    }
}
