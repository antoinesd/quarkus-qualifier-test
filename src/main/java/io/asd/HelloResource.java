package io.asd;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @Inject
    AppBean appBean;

    @GET
    @Path("local")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloLocal() {
        return appBean.getLocalGroup("group1").get().call();
    }


    @GET
    @Path("health")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloHealth() {
        return appBean.getHealthGroup("group1").get().call();
    }
}