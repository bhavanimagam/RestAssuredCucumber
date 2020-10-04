package com.companyname.projectname.steps;

import static org.junit.Assert.assertTrue;

import com.companyname.projectname.utilities.TestContext;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculateSumSteps {
    @Inject
    private TestContext testContext;

    @Given("^I have (\\d+) and (\\d+)$")
    public void iHaveAnd(int a, int b) {
        testContext.setA(a);
        testContext.setB(b);
    }

    @When("^I calculate the sum$")
    public void iCalculateTheSum() {
        System.out.println("calculating sum of " + testContext.getA() + " and " + testContext.getB());
        int sum = testContext.getA() + testContext.getB();
        testContext.setSum(sum);
    }

    @Then("^I should verify that the sum is (\\d+)$")
    public void iShouldVerifyThatTheSumIs(int expectedSum) {
        System.out.println("expected sum " + expectedSum + "actual sum " + testContext.getSum());
        assertTrue("expected sum of " + testContext.getA() + " and " + testContext.getB() + " is " + expectedSum +
                   " but actual sum is " + testContext.getSum(), expectedSum == testContext.getSum());
    }


}
