package lk.ijse.config;


import lk.ijse.been.SpringBeanOne;
import lk.ijse.been.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.been"})
public class AppConfig {
   @Bean
   public SpringBeanOne springBeanOne(){
       return new SpringBeanOne();
        }
    @Bean
    public SpringBeanTwo springBeanTwo(){
        return new SpringBeanTwo();

} }