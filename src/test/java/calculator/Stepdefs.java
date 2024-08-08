package calculator;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.Before;
import org.junit.Assert;

public class Stepdefs {
    private Calculator calculator;
    private int value1, value2, result;
    private String operator;

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

    @When("^I divide the first values by the second value$")
    public void divideTheValues(){
        result = calculator.divide(value1, value2);
        System.out.println(result);
    }

    @When("^I multiply the two values$")
    public void multiplyTheValues(){
        result = calculator.multiply(value1, value2);
        System.out.println(result);
    }

    @When("^I exponentiate the first value by the second value$")
    public void exponentiateTheValues(){
        result = calculator.exponentiate(value1, value2);
        System.out.println(result);
    }

    @Then("^I expect the result is (-?\\d+)$")
    public void theValuesAreCorrect(int arg0){
        Assert.assertEquals(arg0, result);
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+) and the operation is (.+)$")
    public void givenNumbersAndOperation(int arg0, int arg1, String operator){
        value1 = arg0;
        value2 = arg1;
        this.operator = operator;
    }

    @When("^I do some math$")
    public void iDoSomeMath(){
        switch (operator){
            case "*":
                result = calculator.multiply(value1, value2);
                break;
            case "+":
                result = calculator.add(value1, value2);
                break;
            case "/":
                result = calculator.divide(value1, value2);
                break;
            case "^":
                result = calculator.exponentiate(value1, value2);
                break;
            default:
                throw new RuntimeException("Unknown operator");
        }
    }
}
