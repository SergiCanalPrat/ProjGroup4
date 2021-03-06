package edu.upc.dsa.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.glassfish.grizzly.utils.Exceptions;

@Provider
public class MyExceptionMapper implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception ex) {
        return Response.status(500).entity(edu.upc.dsa.rpghero.Exceptions.getStackTraceAsString(ex)).type("text/plain")
                .build();
    }
}