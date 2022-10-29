package dev.vultureweb.jakarta.booty.greeting;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;

@Path("hello")
public class HelloResource {
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public GreetingRecord sayhello() {
      return new GreetingRecord("Hello world", LocalDate.now());
   }
}
