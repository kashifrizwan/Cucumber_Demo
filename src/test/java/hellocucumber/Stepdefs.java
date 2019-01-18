package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {

    private String today;
    private String actualAnswer;

    @Given("^today is \"([^\"]*)\"$")
    public void today_is(String today) {
        this.today = today;
    }

    @Given("^today is Friday$")
    public void today_is_Friday() {
        this.today = "Friday";
    }

    @Given("^today is Sunday$")
    public void today_is_Sunday() {
        this.today = "Sunday";
    }

    @When("^I ask if it's Friday yet$")
    public void i_ask_if_it_s_Friday_yet() {
        DayIdentifier mDayIdentifier = new DayIdentifier();
        this.actualAnswer = mDayIdentifier.isItFriday(this.today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}