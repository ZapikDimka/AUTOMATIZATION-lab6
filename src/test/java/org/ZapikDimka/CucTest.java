package org.ZapikDimka;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CucTest {
    int[] arr;

    @ParameterType("\\s*\\[(\\s*-?\\d+\\s*(,\\s*-?\\d+\\s*)*)?\\]\\s*")
    public int[] listOfIntegers(String integers) {
        if (integers.isEmpty()) {
            return new int[0];
        }
        String[] strings = integers.split(",\\s*");
        return Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
    }

    @When("I get array {listOfIntegers}")
    public void i_get_array(int[] arg) {
        arr = arg;
    }

    @Then("the mode is {int}")
    public void the_mode_is(int arg) {
        assertEquals(arg, Func.mode(arr));
    }
}
