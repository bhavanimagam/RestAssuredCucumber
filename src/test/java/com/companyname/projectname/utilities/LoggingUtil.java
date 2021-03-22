package com.companyname.projectname.utilities;

import java.util.ArrayList;
import java.util.List;

import io.restassured.filter.Filter;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

public class LoggingUtil {

    private static final String LOGGING_LEVEL=System.getProperty("LOG_LEVEL");

    public static List<Filter> getLoggingFilters(){
        List<Filter> restAssuredFilters = new ArrayList<>();
        if(LOGGING_LEVEL==null || "LOW".equals(LOGGING_LEVEL)){
            restAssuredFilters.add(new ErrorLoggingFilter());
        }else{
            restAssuredFilters.add(new RequestLoggingFilter());
            restAssuredFilters.add(new ResponseLoggingFilter());
        }
        return restAssuredFilters;
    }
}
