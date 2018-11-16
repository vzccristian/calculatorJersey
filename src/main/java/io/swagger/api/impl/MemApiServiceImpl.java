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

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Random;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-10-24T19:54:08.502Z[GMT]")

public class MemApiServiceImpl extends MemApiService {
    
    @Override
    public Response storeData( @NotNull Integer value, SecurityContext securityContext) throws NotFoundException {
        System.out.println("Storing the value:" + value);
        //Sending metric
        Socket conn;
        try{            
            conn = new Socket("538fc7e2.carbon.hostedgraphite.com", 2003);
			DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
			Random rand = new Random(System.currentTimeMillis());
			float num = rand.nextFloat();
			dos.writeBytes("ca123819-c3d8-4134-80a3-0b568c23ca80.ist-calc.mem.time " + num +"\n");
			System.out.println("Métrica MEM - Tiempo ejecución: " + num);
			conn.close();
            
        }catch (Exception e){
            System.out.println("ERROR_METRIC: " + e);
        }
        
        return Response.ok().entity(true).build();
    }
    
}

