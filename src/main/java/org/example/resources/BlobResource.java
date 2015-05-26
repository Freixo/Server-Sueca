package org.example.resources;

import java.io.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

@Path("/blob")
public class BlobResource {

    @GET
	@Path("/get")
	@Produces("application/json")
	public String getProductInJSON() {
		
		return "Worked"; 

	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createProductInJSON(Product product) {

		String result = "Product created : " + product;
		return Response.status(201).entity(result).build();
		
	}
    
}
