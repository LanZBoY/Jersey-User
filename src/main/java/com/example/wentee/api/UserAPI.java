package com.example.wentee.api;

import com.example.wentee.InitApp;
import com.example.wentee.model.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@Path("/users")
@Consumes("application/json")
public class UserAPI extends InitApp {
    @GET
    public Response getUsers(){
        return Response.status(Response.Status.NOT_IMPLEMENTED).entity("").build();
    }

    @POST
    public Response createUser(User user){

        return Response.status(Response.Status.OK).entity(user).build();
    }
}
