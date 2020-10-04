package com.companyname.projectname.utilities;

import io.cucumber.guice.ScenarioScoped;
import lombok.Data;

@Data
@ScenarioScoped
public class TestContext {
    private int a;
    private int b;
    private int sum;

}
