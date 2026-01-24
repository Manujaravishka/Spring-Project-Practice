package lk.ijse;


import lk.ijse.been.Boy;
import lk.ijse.been.SpringBean;
import lk.ijse.config.AppConfig;
import lk.ijse.di.TestOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appinitializer3 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

       TestOne testOne =context.getBean(TestOne.class);
       testOne.chatWithTestTwo();

        context.registerShutdownHook();


    }
}