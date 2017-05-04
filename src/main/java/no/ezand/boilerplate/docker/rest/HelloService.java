package no.ezand.boilerplate.docker.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
    private Logger logger = LoggerFactory.getLogger(HelloService.class);

    @GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@PathParam("name") String name) {
        return "Hello " + name + "!";
    }

    @GET
    @Path("/greet/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting greeting(@PathParam("name") String name) {
        logger.debug("Sending greeting...");
        return new Greeting("Hello there, " + name + "!");
    }

    class Greeting {
        private String msg;

        public Greeting(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
