package it.inps.postel.orchestratore.acquisizione.richieste;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;
import org.apache.camel.PropertyInject;

// @Configuration
public class MyConfiguration {

    // @BindToRegistry
    public MyBean myBean(@PropertyInject("hi") String hi, @PropertyInject("bye") String bye) {
        // this will create an instance of this bean with the name of the method (eg myBean)
        return new MyBean(hi, bye);
    }

}