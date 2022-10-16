package dev.vultureweb.jakarta.booty;

import jakarta.ws.rs.SeBootstrap;
import jakarta.ws.rs.core.Application;


public class Boot {
    public static void main(String[] args) throws InterruptedException {
        Application app = new App();
        SeBootstrap.Configuration configuration = SeBootstrap.Configuration.builder()
              .rootPath("booty-duke")
              .port(8081)
              .build();

        SeBootstrap
              .start(app, configuration).thenAccept( instance -> {
           instance.stopOnShutdown(stopResult -> stopResult.unwrap(Object.class));
           System.out.printf("\nApplication is running %s\n",instance.configuration().baseUri());
           System.out.println("Send sigkill to shutdown");
        });

        Thread.currentThread().join();
    }
}