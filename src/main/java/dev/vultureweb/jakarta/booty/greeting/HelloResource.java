package dev.vultureweb.jakarta.booty.greeting;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;

@Path("hello")
public class HelloResource {

   private static final System.Logger LOG = System.getLogger("HelloResource");

   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public GreetingRecord sayhello() {
      LOG.log(System.Logger.Level.INFO,"Requesting Hello World");
      return new GreetingRecord("Hello World", LocalDate.now());
   }
}
