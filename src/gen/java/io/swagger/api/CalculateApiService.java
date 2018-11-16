package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;



import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-10-24T19:54:08.502Z[GMT]")

public abstract class CalculateApiService {
    
    public abstract Response calculateoperation( @NotNull Integer operand1, @NotNull String operator, @NotNull Integer operand2,SecurityContext securityContext) throws NotFoundException;
    
}

