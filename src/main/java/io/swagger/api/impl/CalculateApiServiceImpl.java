package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;



import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-10-24T19:54:08.502Z[GMT]")

public class CalculateApiServiceImpl extends CalculateApiService {
    
    @Override
    public Response calculateoperation( @NotNull Integer operand1,  @NotNull String operator,  @NotNull Integer operand2, SecurityContext securityContext) throws NotFoundException {
        System.out.println("Calculating the result of:" + operand1 +" " + operator + " " + operand2);
        return Response.ok().entity("3").build();
    }
    
}

