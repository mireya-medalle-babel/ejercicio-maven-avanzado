package es.babel.interfaz;

import es.babel.interfaz.app.AppCalculadora;
import es.babel.interfaz.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class InterfazApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AppCalculadora calculadoraApp = context.getBean(AppCalculadora.class);

        calculadoraApp.run();
    }

}
