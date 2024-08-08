package calculator;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.Before;
import org.junit.Assert;

public class Stepdefs {
    private Calculator calculator;
    private int value1, value2, result;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I add the two values$")
    public void addTheValues(){
        result = calculator.add(value1, value2);
        System.out.println(result);
    }

    @Then("^I expect the result is (\\d+)$")
    public void theValuesAreCorrect(int arg0){
        Assert.assertEquals(arg0, result);
    }
}
