package lk.ijse.config;

import lk.ijse.bean.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfigOne {
    public AppConfigOne(){
        System.out.println("Hee");
    }
    @Bean
    public A a(){
        return new A();
    }
}
