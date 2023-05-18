package it.inps.postel.orchestratore.acquisizione.richieste;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */

    public void configure() {

        /**
         * Esempi vari
         */

        //Lettura da file
        /**
         * from("file:src/data?noop=true")
            .choice()
                .when(xpath("/person/city = 'London'"))
                    .log("UK message")
                    .to("file:target/messages/uk")
                .otherwise()
                    .log("Other message")
                    .to("file:target/messages/others");
        */

        //Timer su log
        // from("timer:foo?period=1000")
        //     .bean(new MyBean("hi", "bye"), "hello")
        //     .log("${body}")
        // ;
        
        getContext().getRegistry().bind("myBean", new MyBean("hi", "bye"));

    }
}

