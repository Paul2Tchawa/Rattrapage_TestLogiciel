package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.Home;
import org.testng.annotations.Test;

public class HomeStep {
    private Home homeStep = new Home();
    @Given( "user in the page")
    public void user_in_home_page() { homeStep.navigate();}
    @When("user click avatar in navbar")
    public void user_click_avatar_in_navbar() {}

    @Then(
            "modal is open"
    )
    public void modal_is_open() {}
}
