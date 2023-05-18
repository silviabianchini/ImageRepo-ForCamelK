package it.inps.postel.orchestratore.acquisizione.richieste;

import org.apache.camel.main.Main;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
      
        //Da utilizzare quando la route è definita via Java class (MyRouteBuilder)
        //La stessa classe viene dichiarata nel pom.xml, tag <mainClass>
        Main main = new Main();
        main.configure().addRoutesBuilder(new MyRouteBuilder());
        main.run(args);
    }

}

