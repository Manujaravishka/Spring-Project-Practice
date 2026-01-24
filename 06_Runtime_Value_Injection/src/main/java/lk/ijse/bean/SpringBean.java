package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    @Autowired(required = false)
    public SpringBean(@Value("Manuja")String name,@Value("22")int age){
        System.out.println(name);
        System.out.println(age);
    }
    @Autowired(required = false)
    public SpringBean(@Value("Ravishka")String nameList[],@Value("12")int number,@Value("IJSE")String address){

        System.out.println(nameList);
        System.out.println(number);
        System.out.println(address);
    }
}