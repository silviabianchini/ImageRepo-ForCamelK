package it.inps.postel.orchestratore.acquisizione.richieste;

import org.apache.camel.main.Main;

public final class MyApplication {

    private MyApplication() {
    }

    public static void main(String[] args) throws Exception {
       
        //Caricamento Camel main e recupero configurazioni da file xml e properties
        //Classe MyApplication da dichiarare nel pom, tag <mainClass>

        //Uno dei timer definiti nel file acquisizione-richieste-service-route.xml utilizza dei metodi definiti nel bean MyBean.java
        //E' necessaria una configurazione specifica, implementata tramite annotation @Configuration nella classe MyConfiguration.java

        Main main = new Main(MyApplication.class);
        main.run(args);

    }
    
}
