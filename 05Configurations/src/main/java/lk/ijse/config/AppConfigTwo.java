package lk.ijse.config;

import lk.ijse.bean.A;
import lk.ijse.bean.B;
import lk.ijse.bean.C;
import lk.ijse.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigTwo {
    public AppConfigTwo() {
        System.out.println("AppConfigTwo Constructor");
    }
    @Bean
    public A a(){
        return new A();
    }
    @Bean
    public B b(){
        return new B();
    }
    @Bean
    public C c(){
        return new C();
    }
    @Bean
    public D d(){
        return new D();
    }
}
