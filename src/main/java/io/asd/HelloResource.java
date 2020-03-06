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
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return appBean.getGroup("group1").get().call();
    }
}