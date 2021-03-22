package com.companyname.projectname.steps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.swing.text.html.Option;

import com.companyname.projectname.utilities.Country;
import com.companyname.projectname.utilities.GetCOuntriesTestContext;
import com.companyname.projectname.utilities.RestAssuredUtil;
import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static org.junit.Assert.assertTrue;
public class GetCountriesSteps {
    @Inject
    private GetCOuntriesTestContext getCOuntriesTestContext;

    private static final String HOST="https://restcountries-v1.p.rapidapi.com";
    private static  final String PATH="/all";

    @Given("I have API headers")
    public void iHaveAPIHeaders(DataTable dataTable) {
        Map<String,String> headers=dataTable.asMap(String.class, String.class);
        getCOuntriesTestContext.setHeaders(headers);
    }

    @When("I get countries")
    public void iGetCountries() {
       Response response= RestAssuredUtil.sendGETRequest(HOST,PATH,getCOuntriesTestContext.getHeaders());
       getCOuntriesTestContext.setHttpResponse(response);
    }

    @Then("I verify (.*) exists in the response$")
    public void iVerifyVietnamExistsInTheResponse(String countryName) {
       List<Country> countries= Arrays.asList(getCOuntriesTestContext.getCountries());
      Optional<Country> countryOptional= countries.stream().filter(country -> country.getName().equals(countryName)).findFirst();
      assertTrue("country with name "+countryName+ " doesnt exist in the list of countries returned by application", countryOptional.isPresent());
    }
}
