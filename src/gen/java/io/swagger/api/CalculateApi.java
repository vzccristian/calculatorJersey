package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CalculateApiService;
import io.swagger.api.factories.CalculateApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;



import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/calculate")


@io.swagger.annotations.Api(description = "the calculate API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-10-24T19:54:08.502Z[GMT]")

public class CalculateApi  {
   private final CalculateApiService delegate;

   public CalculateApi(@Context ServletConfig servletContext) {
      CalculateApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CalculateApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CalculateApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CalculateApiServiceFactory.getCalculateApi();
      }

      this.delegate = delegate;
   }


    @GET
    
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Executes an opeation with two operands and an operator", notes = "Executes an opeation with two operands and an operator", response = String.class, tags={ "Basic", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response calculateoperation(@ApiParam(value = "First operand",required=true) @QueryParam("operand1") Integer operand1
,@ApiParam(value = "Operator to execute",required=true) @QueryParam("operator") String operator
,@ApiParam(value = "Second Operand",required=true) @QueryParam("operand2") Integer operand2
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.calculateoperation(operand1,operator,operand2,securityContext);
    }

}

