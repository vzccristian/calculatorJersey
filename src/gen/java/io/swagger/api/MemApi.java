package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MemApiService;
import io.swagger.api.factories.MemApiServiceFactory;

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


@Path("/mem")


@io.swagger.annotations.Api(description = "the mem API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-10-24T19:54:08.502Z[GMT]")

public class MemApi  {
   private final MemApiService delegate;

   public MemApi(@Context ServletConfig servletContext) {
      MemApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MemApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MemApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MemApiServiceFactory.getMemApi();
      }

      this.delegate = delegate;
   }


    @POST
    
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Stores a number in the memory", notes = "Stores a number in the memory", response = Boolean.class, tags={ "Basic", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response storeData(@ApiParam(value = "Value to store",required=true) @QueryParam("value") Integer value
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storeData(value,securityContext);
    }

}

