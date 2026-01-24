package lk.ijse;

import lk.ijse.config.AppConfig;
import lk.ijse.config.AppConfigOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
       // context.register(AppConfigOne.class);
        context.refresh();



        context.registerShutdownHook();


    }
}