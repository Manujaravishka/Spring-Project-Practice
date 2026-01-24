package lk.ijse;


import lk.ijse.been.SpringBeanOne;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Initializer4 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();



        context.registerShutdownHook();


    }
}
