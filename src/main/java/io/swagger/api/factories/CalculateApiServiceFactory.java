package io.swagger.api.factories;

import io.swagger.api.CalculateApiService;
import io.swagger.api.impl.CalculateApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-10-24T19:54:08.502Z[GMT]")
public class CalculateApiServiceFactory {
    private final static CalculateApiService service = new CalculateApiServiceImpl();

    public static CalculateApiService getCalculateApi() {
        return service;
    }
}
